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

/*
 * RulePanel.java
 *
 * Created on 11.04.2011, 10:42:41
 */
package com.iontorrent.main.options;

import com.iontorrent.expmodel.ExperimentContext;
import com.iontorrent.expmodel.FolderConfig;
import com.iontorrent.expmodel.FolderManager;
import com.iontorrent.expmodel.GlobalContext;
import com.iontorrent.utils.io.FileTools;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Chantal Roth
 */
public class RulePanel extends javax.swing.JPanel {

    FolderConfig config;
    boolean DOACTIONS;

  
    /** Creates new form RulePanel */
    public RulePanel(FolderConfig config) {
        initComponents();
        update(config);
    }

    public void update(FolderConfig config) {
        this.config = config;
        txtServer.setText(config.getServer());
        txtRaw.setText(config.getRawRule());
        txtResults.setText(config.getResultsRule());
        txtRaw.setText(config.getRawRule());
        txtName.setText(config.getName());
        txtCache.setText(config.getCacheRule());
        if (GlobalContext.getContext().getExperimentContext() != null) {
         //   ExperimentContext ex = GlobalContext.getContext().getExperimentContext();
            GlobalContext g = GlobalContext.getContext();
            txtCache.setToolTipText(g.getCacheDir());
            txtRaw.setToolTipText(g.getRawRule());
            txtResults.setToolTipText(g.getResultsRule());
            
        }
        String s = config.getBaseDirsString();
      
        txtBasedirs.setText(s);
        DOACTIONS = false;
        boxDefault.setSelected(config.isDefault());
        DOACTIONS = true;

    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnCache = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtServer = new javax.swing.JTextField();
        txtResults = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCache = new javax.swing.JTextField();
        btnResults = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtRaw = new javax.swing.JTextField();
        btnRaw = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBasedirs = new javax.swing.JTextArea();
        btnFstab = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        boxDefault = new javax.swing.JCheckBox();

        jLabel7.setText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.jLabel7.text")); // NOI18N

        setLayout(new java.awt.BorderLayout());

        jLabel3.setText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.jLabel3.text")); // NOI18N

        btnCache.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iontorrent/main/options/document-open-2.png"))); // NOI18N
        btnCache.setText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.btnCache.text")); // NOI18N
        btnCache.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCacheActionPerformed(evt);
            }
        });

        jLabel4.setText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.jLabel4.text")); // NOI18N

        txtServer.setText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.txtServer.text")); // NOI18N
        txtServer.setToolTipText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.txtServer.toolTipText")); // NOI18N
        txtServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServerActionPerformed(evt);
            }
        });
        txtServer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtServerFocusLost(evt);
            }
        });

        txtResults.setText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.txtResults.text")); // NOI18N
        txtResults.setToolTipText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.txtResults.toolTipText")); // NOI18N
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

        jLabel1.setText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.jLabel1.text")); // NOI18N

        txtCache.setText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.txtCache.text")); // NOI18N
        txtCache.setToolTipText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.txtCache.toolTipText")); // NOI18N
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

        btnResults.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iontorrent/main/options/document-open-2.png"))); // NOI18N
        btnResults.setText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.btnResults.text")); // NOI18N
        btnResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultsActionPerformed(evt);
            }
        });

        jLabel10.setText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.jLabel10.text")); // NOI18N

        txtRaw.setText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.txtRaw.text")); // NOI18N
        txtRaw.setToolTipText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.txtRaw.toolTipText")); // NOI18N
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

        btnRaw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iontorrent/main/options/document-open-2.png"))); // NOI18N
        btnRaw.setText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.btnRaw.text")); // NOI18N
        btnRaw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRawActionPerformed(evt);
            }
        });

        jLabel13.setText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.jLabel13.text")); // NOI18N

        txtBasedirs.setColumns(20);
        txtBasedirs.setRows(5);
        txtBasedirs.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBasedirsFocusLost(evt);
            }
        });
        txtBasedirs.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtBasedirsPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(txtBasedirs);

        btnFstab.setText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.btnFstab.text")); // NOI18N
        btnFstab.setToolTipText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.btnFstab.toolTipText")); // NOI18N
        btnFstab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFstabActionPerformed(evt);
            }
        });

        jLabel2.setText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.jLabel2.text")); // NOI18N

        btnInfo.setText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.btnInfo.text")); // NOI18N
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        jLabel5.setText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.jLabel5.text")); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.jLabel6.text")); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel8.setText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.jLabel8.text")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCache, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtServer, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE))
                                    .addComponent(txtResults, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                                    .addComponent(txtRaw, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(btnFstab))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                                    .addComponent(jLabel5))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRaw, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnResults, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCache, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnInfo)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRaw, 0, 0, Short.MAX_VALUE)
                            .addComponent(txtRaw))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResults, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnResults, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(txtCache)
                    .addComponent(btnCache, 0, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFstab)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInfo)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);

        jLabel11.setText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.jLabel11.text")); // NOI18N

        txtName.setText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.txtName.text")); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });

        boxDefault.setText(org.openide.util.NbBundle.getMessage(RulePanel.class, "RulePanel.boxDefault.text")); // NOI18N
        boxDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxDefaultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxDefault)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxDefault)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel3, java.awt.BorderLayout.NORTH);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCacheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCacheActionPerformed
        // TODO use properties or use of course select experiment
        String dir = config.getCacheRule();
        dir = FileTools.getDir("Please select a directory for storing cached data", new File(dir));
        config.setCacheRule(dir);
        this.txtCache.setText(dir);
}//GEN-LAST:event_btnCacheActionPerformed

    private void btnRawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRawActionPerformed

        String dir = config.getRawRule();
        dir = FileTools.getDir("Please select a directory for default raw data", new File(dir));
        config.setRawRule(dir);
        this.txtRaw.setText(dir);
}//GEN-LAST:event_btnRawActionPerformed

    private void btnResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultsActionPerformed
        String dir = config.getResultsRule();
        dir = FileTools.getDir("Please select a directory for default results data", new File(dir));
        this.txtResults.setText(dir);
        config.setResultsRule(dir);
}//GEN-LAST:event_btnResultsActionPerformed

    private void txtServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServerActionPerformed
        updateServer();
    }

    private void updateName() {
        config.setName(txtName.getText());
    }
    private void updateDirs() {
        config.setBaseDirs(this.txtBasedirs.getText());
        config.checkForUrl();
       
    }
    private void updateServer() {
        config.setServer(txtServer.getText());
    }//GEN-LAST:event_txtServerActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        if (!DOACTIONS) {
            return;
        }
        updateName();
    }//GEN-LAST:event_txtNameActionPerformed

    private void boxDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxDefaultActionPerformed
        if (!DOACTIONS) {
            return;
        }
        config.setDefault(this.boxDefault.isSelected());
        if (config.isDefault()) {
            FolderManager manager = FolderManager.getManager();       
            for (String key : manager.getKeys()) {
                FolderConfig check = manager.getConfig(key);
                if (check.isDefault()) {
                    if (!config.getKey().equalsIgnoreCase(key)){
                        check.setDefault(false);                        
                    }
                }
            }
        }
        // also uncheck any other
        
    }//GEN-LAST:event_boxDefaultActionPerformed

    private void txtRawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRawActionPerformed
        updateRaw();
    }//GEN-LAST:event_txtRawActionPerformed

    private void txtResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultsActionPerformed
        updateResults();
    }//GEN-LAST:event_txtResultsActionPerformed

    private void updateResults() {
        config.setResultsRule(txtResults.getText());
    }

    private void txtCacheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCacheActionPerformed
        updateCache();        
       
    }//GEN-LAST:event_txtCacheActionPerformed

    private void txtRawFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRawFocusLost
         updateRaw();          
    }

    private void updateRaw() {
        config.setRawRule(txtRaw.getText());
    }//GEN-LAST:event_txtRawFocusLost

    private void txtResultsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtResultsFocusLost
         updateResults();
         
    }//GEN-LAST:event_txtResultsFocusLost

    private void txtCacheFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCacheFocusLost
        updateCache();
    }

    private void updateCache() {
        config.setCacheRule(txtCache.getText());         
    }//GEN-LAST:event_txtCacheFocusLost

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
       updateName();
    }//GEN-LAST:event_txtNameFocusLost

    private void txtServerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtServerFocusLost
        updateServer();
    }//GEN-LAST:event_txtServerFocusLost

    private void txtBasedirsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBasedirsFocusLost
        updateDirs();
        
    }//GEN-LAST:event_txtBasedirsFocusLost

    private void txtBasedirsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtBasedirsPropertyChange
       updateDirs();
       
    }//GEN-LAST:event_txtBasedirsPropertyChange

    private void btnFstabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFstabActionPerformed
        JTextArea area = new JTextArea(20, 50);
        area.setText(config.getFstab());
        int ans = JOptionPane.showConfirmDialog(this, area, "Enter the fstab info", JOptionPane.OK_CANCEL_OPTION);
        if (ans != JOptionPane.CANCEL_OPTION) {
            String fs = area.getText();
            config.setFstab(fs);
        }
    }//GEN-LAST:event_btnFstabActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        InfoPanel info = new InfoPanel();
        JOptionPane.showMessageDialog(this, info);
    }//GEN-LAST:event_btnInfoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boxDefault;
    private javax.swing.JButton btnCache;
    private javax.swing.JButton btnFstab;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnRaw;
    private javax.swing.JButton btnResults;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtBasedirs;
    private javax.swing.JTextField txtCache;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRaw;
    private javax.swing.JTextField txtResults;
    private javax.swing.JTextField txtServer;
    // End of variables declaration//GEN-END:variables
}
