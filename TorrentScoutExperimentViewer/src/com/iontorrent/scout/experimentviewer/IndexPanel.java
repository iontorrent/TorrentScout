/*
 * Copyright (C) 2011 Life Technologies Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * IndexPanel.java
 *
 * Created on 20.09.2011, 11:29:13
 */
package com.iontorrent.scout.experimentviewer;

import com.iontorrent.dataloading.CreateIndexTask;
import com.iontorrent.expmodel.ExperimentContext;
import com.iontorrent.guiutils.GuiUtils;
import com.iontorrent.results.scores.ScoreMask;
import com.iontorrent.sequenceloading.SequenceLoader;
import com.iontorrent.threads.TaskListener;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;

/**
 *
 * @author Chantal Roth
 */
public class IndexPanel extends javax.swing.JPanel {

    private ExperimentContext exp;
    ProgressHandle progress;
    Frame frame;
    TaskListener listener;
    ActionListener act;
    private JFrame msgframe;
    /** Creates new form IndexPanel */
    public IndexPanel(Frame frame, TaskListener listener, ExperimentContext exp, ActionListener act) {
        initComponents();
        this.exp = exp;
        this.frame = frame;
        this.listener = listener;
        this.act = act;
        if (act == null) {
            this.btnView.setVisible(false);
            this.btnView.setEnabled(false);
        }
        this.lblExp.setText("<html><b>Results directory: "+exp.getResultsDirectory()+"</b>");
        checkIndices();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        btnIndex = new javax.swing.JButton();
        boxSffIndex = new javax.swing.JCheckBox();
        boxBamIndex = new javax.swing.JCheckBox();
        boxBamHeatMaps = new javax.swing.JCheckBox();
        btnView = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblExp = new javax.swing.JLabel();

        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnIndex.setText(org.openide.util.NbBundle.getMessage(IndexPanel.class, "IndexPanel.btnIndex.text")); // NOI18N
        btnIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndexActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(btnIndex, gridBagConstraints);

        boxSffIndex.setText(org.openide.util.NbBundle.getMessage(IndexPanel.class, "IndexPanel.boxSffIndex.text")); // NOI18N
        boxSffIndex.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(boxSffIndex, gridBagConstraints);

        boxBamIndex.setText(org.openide.util.NbBundle.getMessage(IndexPanel.class, "IndexPanel.boxBamIndex.text")); // NOI18N
        boxBamIndex.setToolTipText(org.openide.util.NbBundle.getMessage(IndexPanel.class, "IndexPanel.boxBamIndex.toolTipText")); // NOI18N
        boxBamIndex.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(boxBamIndex, gridBagConstraints);

        boxBamHeatMaps.setText(org.openide.util.NbBundle.getMessage(IndexPanel.class, "IndexPanel.boxBamHeatMaps.text")); // NOI18N
        boxBamHeatMaps.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(boxBamHeatMaps, gridBagConstraints);

        btnView.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnView.setForeground(new java.awt.Color(0, 153, 51));
        btnView.setText(org.openide.util.NbBundle.getMessage(IndexPanel.class, "IndexPanel.btnView.text")); // NOI18N
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel1.add(btnView, gridBagConstraints);

        jLabel1.setText(org.openide.util.NbBundle.getMessage(IndexPanel.class, "IndexPanel.jLabel1.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        lblExp.setText(org.openide.util.NbBundle.getMessage(IndexPanel.class, "IndexPanel.lblExp.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(lblExp, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public boolean checkIndices() {
        p("Now checking all indices for "+exp.getResultsDirectory());
        
        SequenceLoader loader = SequenceLoader.getSequenceLoader(exp);
        loader.getSamUtils();

        boolean all = true;
        boolean ok = loader.hasSffIndex();
        if (!ok) {
            all = false;
        }
        else p("Got sff index");
        this.setOk(this.boxSffIndex, ok);
        ok = loader.hasGenomeToReadIndex();
        if (!ok) {
            all = false;
        }
        else p("Got genome to read index");
        this.setOk(this.boxBamIndex, ok);

        ScoreMask mask = ScoreMask.getMask(exp, exp.getWellContext());
        
        ok = mask != null && mask.hasAllBamImages();
        if (!ok) {
            all = false;
        }
        else p("Got bam heat maps index");
        setOk(this.boxBamHeatMaps, ok);

        if (all) {
            btnIndex.setText("Got all index files");
            btnIndex.setEnabled(false);
            btnView.setText("Load and View Data");
            btnView.setForeground(new Color(0, 153, 51));
        } else {
            btnIndex.setText("Create missing index files...");
            btnIndex.setForeground(new Color(0, 153, 51));
            btnIndex.setSelected(true);
            btnIndex.setEnabled(true);
            this.btnView.setText("Close");
            btnView.setToolTipText("<html>This includes files like <b>bfmkas.bin</b> and <b>1.wells</b></html>");
            btnView.setForeground(Color.black);
        }
         if (act == null) {
            this.btnView.setVisible(false);
            this.btnView.setEnabled(false);
        }
        return all;
    }

    private void setOk(JCheckBox box, boolean ok) {
        box.setSelected(ok);
        //   box.setEnabled(false);
        if (ok) {
            box.setForeground(Color.green.darker());

        } else {
            box.setForeground(Color.red.darker());
        }
    }
    private void btnIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndexActionPerformed
        progress = ProgressHandleFactory.createHandle("Creating index files...");
        JComponent comp = ProgressHandleFactory.createProgressComponent(progress);
        frame = GuiUtils.showNonModalMsg(comp, "Creating index files...");
        frame.setSize(500, 50);
        //      frame.setLocation(800, 600);
        frame.setLocationRelativeTo(this);
        //  frame.setl
        if (exp.getWellContext() == null) {
            JOptionPane.showMessageDialog(this, "Could not find the 1.wells file in "+exp.getResultsDirectory());
            return;
        }
        CreateIndexTask task = new CreateIndexTask(frame, listener, exp, progress);
        this.btnIndex.setEnabled(false);
        btnIndex.setText("Indexing is in progress...");
        task.execute();
        this.btnIndex.setSelected(false);
    }//GEN-LAST:event_btnIndexActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // load maskview component
        if (act != null) act.actionPerformed(evt);
        //createCacheFiles();
        if (msgframe != null) msgframe.dispose();
}//GEN-LAST:event_btnViewActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boxBamHeatMaps;
    private javax.swing.JCheckBox boxBamIndex;
    private javax.swing.JCheckBox boxSffIndex;
    private javax.swing.JButton btnIndex;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblExp;
    // End of variables declaration//GEN-END:variables

    private void err(String msg, Exception ex) {
        Logger.getLogger(IndexPanel.class.getName()).log(Level.SEVERE, msg, ex);
    }

    private void err(String msg) {
        Logger.getLogger(IndexPanel.class.getName()).log(Level.SEVERE, msg);
    }

    private void warn(String msg) {
        Logger.getLogger(IndexPanel.class.getName()).log(Level.WARNING, msg);
    }

    private void p(String msg) {
        //   System.out.println("ExperimentViewerTopComponent: " + msg);
        Logger.getLogger(IndexPanel.class.getName()).log(Level.INFO, msg);
    }

    void setMsgFrame(JFrame msgframe) {
        this.msgframe = msgframe;
    }
}
