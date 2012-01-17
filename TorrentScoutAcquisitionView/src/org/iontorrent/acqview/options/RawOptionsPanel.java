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
package org.iontorrent.acqview.options;

import com.iontorrent.main.startup.TorrentScoutStartupTopComponent;
import java.util.prefs.Preferences;
import org.openide.windows.WindowManager;

public final class RawOptionsPanel extends javax.swing.JPanel {

    private final RawOptionsOptionsPanelController controller;

    RawOptionsPanel(RawOptionsOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
        // TODO listen to changes in form fields and call controller.changed()
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupFlags = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        radioEmpty = new javax.swing.JRadioButton();
        radioDead = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        spinSpan = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(RawOptionsPanel.class, "RawOptionsPanel.jPanel1.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(RawOptionsPanel.class, "RawOptionsPanel.jLabel1.text")); // NOI18N

        groupFlags.add(radioEmpty);
        org.openide.awt.Mnemonics.setLocalizedText(radioEmpty, org.openide.util.NbBundle.getMessage(RawOptionsPanel.class, "RawOptionsPanel.radioEmpty.text")); // NOI18N
        radioEmpty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEmptyActionPerformed(evt);
            }
        });

        groupFlags.add(radioDead);
        org.openide.awt.Mnemonics.setLocalizedText(radioDead, org.openide.util.NbBundle.getMessage(RawOptionsPanel.class, "RawOptionsPanel.radioDead.text")); // NOI18N
        radioDead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDeadActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(RawOptionsPanel.class, "RawOptionsPanel.jLabel2.text")); // NOI18N

        spinSpan.setModel(new javax.swing.SpinnerNumberModel(5, 4, 20, 1));
        spinSpan.setToolTipText(org.openide.util.NbBundle.getMessage(RawOptionsPanel.class, "RawOptionsPanel.spinSpan.toolTipText")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jButton1, org.openide.util.NbBundle.getMessage(RawOptionsPanel.class, "RawOptionsPanel.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(radioEmpty)
                    .addComponent(radioDead)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(spinSpan, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioEmpty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioDead)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinSpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void radioEmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEmptyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioEmptyActionPerformed

    private void radioDeadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDeadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioDeadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         TorrentScoutStartupTopComponent tc = (TorrentScoutStartupTopComponent)WindowManager.getDefault().findTopComponent("TorrentScoutStartupTopComponent");
          tc.checkAndMaybeConvertFiles();
    }//GEN-LAST:event_jButton1ActionPerformed

    void load() {
        // TODO read settings and initialize GUI
        // Example:        
        // someCheckBox.setSelected(Preferences.userNodeForPackage(RawOptionsPanel.class).getBoolean("someFlag", false));
        // or for org.openide.util with API spec. version >= 7.4:
        // someCheckBox.setSelected(NbPreferences.forModule(RawOptionsPanel.class).getBoolean("someFlag", false));
        // or:
        // someTextField.setText(SomeSystemOption.getDefault().getSomeStringProperty());
         Preferences p =  Preferences.userNodeForPackage(RawOptionsPanel.class);
         String bg_wells = p.get("background_wells", "empty_wells");
         if (bg_wells != null && bg_wells.equalsIgnoreCase("empty_wells")) {
             radioEmpty.setSelected(true);
         }
         else radioDead.setSelected(true);
       
         int span = p.getInt("nn_span", 5);
         this.spinSpan.setValue(span);
    }

    void store() {
        // TODO store modified settings
        // Example:
        // Preferences.userNodeForPackage(RawOptionsPanel.class).putBoolean("someFlag", someCheckBox.isSelected());
        // or for org.openide.util with API spec. version >= 7.4:
        // NbPreferences.forModule(RawOptionsPanel.class).putBoolean("someFlag", someCheckBox.isSelected());
        // or:
        // SomeSystemOption.getDefault().setSomeStringProperty(someTextField.getText());
        Preferences p = Preferences.userNodeForPackage(RawOptionsPanel.class);
        String bg_wells = "empty_wells";
        if (radioDead.isSelected()) bg_wells = "dead_wells";
        p.put("background_wells", bg_wells);
        int span = (Integer)spinSpan.getValue();
        span = Math.max(4, span);
        span = Math.min(span, 30);
        p.put("nn_span", ""+span);
    }

    boolean valid() {
        // TODO check whether form is consistent and complete
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup groupFlags;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radioDead;
    private javax.swing.JRadioButton radioEmpty;
    private javax.swing.JSpinner spinSpan;
    // End of variables declaration//GEN-END:variables
}
