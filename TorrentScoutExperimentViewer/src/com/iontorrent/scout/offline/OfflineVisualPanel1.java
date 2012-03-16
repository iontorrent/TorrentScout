/*
*	Copyright (C) 2011 Life Technologies Inc.
*
*   This program is free software: you can redistribute it and/or modify
*   it under the terms of the GNU General Public License as published by
*   the Free Software Foundation, either version 2 of the License, or
*   (at your option) any later version.
*
*   This program is distributed in the hope that it will be useful,
*   but WITHOUT ANY WARRANTY; without even the implied warranty of
*   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*   GNU General Public License for more details.
*
*   You should have received a copy of the GNU General Public License
*   along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iontorrent.scout.offline;

import com.iontorrent.expmodel.ExperimentContext;
import com.iontorrent.utils.io.FileTools;
import com.iontorrent.utils.io.FileUtils;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public final class OfflineVisualPanel1 extends JPanel implements WizPanel {

    private String lastmsg;
    private ExperimentContext exp;

    /** Creates new form OfflineVisualPanel1 */
    public OfflineVisualPanel1(ExperimentContext exp) {
        initComponents();
        this.exp = exp;
        updateExpGui();
    }

    @Override
    public String getName() {
        return "Step #1 (Folders)";
    }

    @Override
    public boolean doBeforeEntering() {
       return  updateExpGui();        
    }

    private boolean updateExpGui() {
        if (getExp() == null) {
            p("Got no exp");
            return false;
        }
        txtRaw.setText(getExp().getRawDir());
        String cache = exp.getCacheDir();
        if (cache != null && cache.length() > 0) {
            File f = new File(cache);
            cache = f.getParent();
        }
        if (cache == null) cache = "";
        txtCache.setText(cache);
        txtResults.setText(getExp().getResultsDirectory());
        return true;
    }

    private void p(String msg) {
        //   System.out.println("ExperimentViewerTopComponent: " + msg);
        Logger.getLogger(OfflineTopComponent.class.getName()).log(Level.INFO, msg);
    }

    private void updateExp() {
        exp.setResultsDirectory(txtResults.getText());
        exp.setRawDir(txtRaw.getText());

        if (exp.isThumbnails()) {
            exp.setThumbnailsRaw();
            
        }
        //exp.setCacheDir(txtCache.getText());
        exp.expandCacheDir(txtCache.getText());
        exp.createWellContext();
        exp.setChipType("");
        exp.setFlowOrder("");
        exp.setNrcols(0);
        exp.setNrrows(0);
    }

    private void checkCache(String cache) {
        if (cache == null || cache.length()<1) {
            return;
        }
        p("Checking cache: "+cache);
        File f = new File(cache);

        String msg = "\nNote that all indices are written to the cache directory, and also the indexed .dat files.\n"
                + "If I cannot write to the cache directory, you won't be able to see much of the data...";
        if (!f.exists()) {
            msg = "I can't find the cache directory " + f + msg;
            if (lastmsg == null || !lastmsg.equalsIgnoreCase(msg)) JOptionPane.showMessageDialog(this, msg);
        } else if (!f.canWrite()) {
            msg =  "I can't write to the cache directory " + f + msg;
            if (lastmsg == null || !lastmsg.equalsIgnoreCase(msg)) JOptionPane.showMessageDialog(this,msg);
        }
        lastmsg = msg;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtRaw = new javax.swing.JTextField();
        txtResults = new javax.swing.JTextField();
        txtCache = new javax.swing.JTextField();
        btnRaw = new javax.swing.JButton();
        btnResults = new javax.swing.JButton();
        btnCache = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(500, 100));
        setOpaque(false);
        setLayout(new java.awt.GridBagLayout());

        org.openide.awt.Mnemonics.setLocalizedText(jLabel10, org.openide.util.NbBundle.getMessage(OfflineVisualPanel1.class, "OfflineVisualPanel1.jLabel10.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        add(jLabel10, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel11, org.openide.util.NbBundle.getMessage(OfflineVisualPanel1.class, "OfflineVisualPanel1.jLabel11.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        add(jLabel11, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel12, org.openide.util.NbBundle.getMessage(OfflineVisualPanel1.class, "OfflineVisualPanel1.jLabel12.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        add(jLabel12, gridBagConstraints);

        txtRaw.setColumns(40);
        txtRaw.setText(org.openide.util.NbBundle.getMessage(OfflineVisualPanel1.class, "OfflineVisualPanel1.txtRaw.text")); // NOI18N
        txtRaw.setToolTipText(org.openide.util.NbBundle.getMessage(OfflineVisualPanel1.class, "OfflineVisualPanel1.txtRaw.toolTipText")); // NOI18N
        txtRaw.setMaximumSize(new java.awt.Dimension(250, 30));
        txtRaw.setPreferredSize(new java.awt.Dimension(250, 20));
        txtRaw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRawActionPerformed(evt);
            }
        });
        txtRaw.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRawFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 250;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        add(txtRaw, gridBagConstraints);

        txtResults.setColumns(40);
        txtResults.setText(org.openide.util.NbBundle.getMessage(OfflineVisualPanel1.class, "OfflineVisualPanel1.txtResults.text")); // NOI18N
        txtResults.setToolTipText(org.openide.util.NbBundle.getMessage(OfflineVisualPanel1.class, "OfflineVisualPanel1.txtResults.toolTipText")); // NOI18N
        txtResults.setMaximumSize(new java.awt.Dimension(250, 30));
        txtResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultsActionPerformed(evt);
            }
        });
        txtResults.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtResultsFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        add(txtResults, gridBagConstraints);

        txtCache.setColumns(40);
        txtCache.setText(org.openide.util.NbBundle.getMessage(OfflineVisualPanel1.class, "OfflineVisualPanel1.txtCache.text")); // NOI18N
        txtCache.setToolTipText(org.openide.util.NbBundle.getMessage(OfflineVisualPanel1.class, "OfflineVisualPanel1.txtCache.toolTipText")); // NOI18N
        txtCache.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCacheActionPerformed(evt);
            }
        });
        txtCache.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCacheFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        add(txtCache, gridBagConstraints);

        btnRaw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iontorrent/main/options/document-open-2.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(btnRaw, org.openide.util.NbBundle.getMessage(OfflineVisualPanel1.class, "OfflineVisualPanel1.btnRaw.text")); // NOI18N
        btnRaw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRawActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(btnRaw, gridBagConstraints);

        btnResults.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iontorrent/main/options/document-open-2.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(btnResults, org.openide.util.NbBundle.getMessage(OfflineVisualPanel1.class, "OfflineVisualPanel1.btnResults.text")); // NOI18N
        btnResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(btnResults, gridBagConstraints);

        btnCache.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iontorrent/main/options/document-open-2.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(btnCache, org.openide.util.NbBundle.getMessage(OfflineVisualPanel1.class, "OfflineVisualPanel1.btnCache.text")); // NOI18N
        btnCache.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCacheActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(btnCache, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void txtRawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRawActionPerformed
        // TODO add your handling code here:
        updateExp();
}//GEN-LAST:event_txtRawActionPerformed

    private void txtRawFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRawFocusLost
        // TODO add your handling code here:
        updateExp();
}//GEN-LAST:event_txtRawFocusLost

    private void txtResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultsActionPerformed
        // TODO add your handling code here:
        updateExp();
}//GEN-LAST:event_txtResultsActionPerformed

    private void txtResultsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtResultsFocusLost
        updateExp();
}//GEN-LAST:event_txtResultsFocusLost

    private void txtCacheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCacheActionPerformed
        checkCache(txtCache.getText());
        updateExp();
        
}//GEN-LAST:event_txtCacheActionPerformed

    private void txtCacheFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCacheFocusLost
        if (evt.getOppositeComponent() == null || evt.getOppositeComponent() != this.btnCache )  checkCache(txtCache.getText());
        updateExp();
        
}//GEN-LAST:event_txtCacheFocusLost

    private void btnRawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRawActionPerformed
        String dir = txtRaw.getText();
        if (dir == null || dir.length() < 1) {
            dir = ".";
        }
        dir = FileTools.getDir("Please select a directory for default raw data", new File(dir));
        this.txtRaw.setText(dir);
        if (getExp().getCacheDir() == null || getExp().getCacheDir().length()<1 || !FileUtils.exists(getExp().getCacheDir())) {
            txtCache.setText(dir);
        }
        updateExp();
}//GEN-LAST:event_btnRawActionPerformed

    private void btnResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultsActionPerformed
        String dir = txtResults.getText();
        if (dir == null || dir.length() < 1) {
            dir = ".";
        }
        dir = FileTools.getDir("Please select a directory for default results data", new File(dir));
        this.txtResults.setText(dir);
        if (getExp().getCacheDir() == null || getExp().getCacheDir().length()<1 || !FileUtils.exists(getExp().getCacheDir())) {
            txtCache.setText(dir);
        }
        updateExp();
}//GEN-LAST:event_btnResultsActionPerformed

    private void btnCacheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCacheActionPerformed
        // TODO use properties or use of course select experiment
        String dir = txtCache.getText();
        if (dir == null || dir.length() < 1) {
            dir = ".";
        }
        dir = FileTools.getDir("Please select a directory for storing cached data", new File(dir));

        this.txtCache.setText(dir);
        checkCache(dir);
        updateExp();
        
}//GEN-LAST:event_btnCacheActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCache;
    private javax.swing.JButton btnRaw;
    private javax.swing.JButton btnResults;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JTextField txtCache;
    private javax.swing.JTextField txtRaw;
    private javax.swing.JTextField txtResults;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the exp
     */
    public ExperimentContext getExp() {
        return exp;
    }

    /**
     * @param exp the exp to set
     */
    public void setExp(ExperimentContext exp) {
        this.exp = exp;
    }
}
