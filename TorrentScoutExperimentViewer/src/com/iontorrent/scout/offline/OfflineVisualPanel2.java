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
import com.iontorrent.sequenceloading.SequenceLoader;
import com.iontorrent.utils.io.FileTools;
import com.iontorrent.wellmodel.WellContext;
import java.awt.Color;
import java.io.File;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public final class OfflineVisualPanel2 extends JPanel implements WizPanel {
    
    private boolean ACTION = true;
    private ExperimentContext exp;
    private String lastmsg;
    /** Creates new form OfflineVisualPanel2 */
    public OfflineVisualPanel2(ExperimentContext exp) {
        initComponents();
        this.exp = exp;
     //   disableBoxes();
        updateExpGui();
    }

     @Override
    public boolean doBeforeEntering() {
         boolean ok= scan();
         if (!ok) return false;
         updateExpGui();           
         this.btnScan.setSelected(true);
         return true;
    }
    @Override
    public String getName() {
        return "Step #2 (Files)";
    }


    public boolean scan() {
        // check dirs and files, get info, then update info part, then enable info part
        if (getExp() == null) {
            return false;
        }
        this.btnScan.setSelected(false);
        boolean ok = scanFolders();
        if (!ok) return false;
        showExpContextContent();
        return true;
    }

     private void updateExpGui() {
        if (getExp() == null) {
            return;
        }
       
     //   disableBoxes();
        String type = getExp().getChipType();
        if (type == null) {
            type = "";
        }
        type = type.replace("\"", "");
        txtType.setText(type);
        this.spinCols.setValue(getExp().getNrcols());
        this.spinRows.setValue(getExp().getNrrows());
        this.txtRunName.setText(getExp().getResultsName());
        if (getExp().getResultsDirectory() == null || getExp().getBamFileName() == null) {
            txtBam.setText("");
        } else {
            this.txtBam.setText(getExp().getResultsDirectory() + getExp().getBamFileName());
        }
        if (getExp().getResultsDirectory() == null || getExp().getBamFileName() == null) {
            txtSff.setText("");
        } else {
            this.txtSff.setText(getExp().getResultsDirectory() + getExp().getSffFileName());
        }

        this.btnScan.setSelected(true);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtBam = new javax.swing.JTextField();
        txtSff = new javax.swing.JTextField();
        spinCols = new javax.swing.JSpinner();
        spinRows = new javax.swing.JSpinner();
        txtType = new javax.swing.JTextField();
        btnLoadSff = new javax.swing.JButton();
        btnLoadBam = new javax.swing.JButton();
        boxMask = new javax.swing.JCheckBox();
        boxWells = new javax.swing.JCheckBox();
        boxHasBam = new javax.swing.JCheckBox();
        boxHasSff = new javax.swing.JCheckBox();
        btnScan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtRunName = new javax.swing.JTextField();
        boxHasBai = new javax.swing.JCheckBox();

        setLayout(new java.awt.GridBagLayout());

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(OfflineVisualPanel2.class, "OfflineVisualPanel2.jLabel2.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(jLabel2, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(OfflineVisualPanel2.class, "OfflineVisualPanel2.jLabel5.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(jLabel5, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(OfflineVisualPanel2.class, "OfflineVisualPanel2.jLabel6.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(jLabel6, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, org.openide.util.NbBundle.getMessage(OfflineVisualPanel2.class, "OfflineVisualPanel2.jLabel8.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(jLabel8, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel7, org.openide.util.NbBundle.getMessage(OfflineVisualPanel2.class, "OfflineVisualPanel2.jLabel7.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(jLabel7, gridBagConstraints);

        txtBam.setColumns(40);
        txtBam.setText(org.openide.util.NbBundle.getMessage(OfflineVisualPanel2.class, "OfflineVisualPanel2.txtBam.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(txtBam, gridBagConstraints);

        txtSff.setColumns(40);
        txtSff.setText(org.openide.util.NbBundle.getMessage(OfflineVisualPanel2.class, "OfflineVisualPanel2.txtSff.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(txtSff, gridBagConstraints);

        spinCols.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinColsStateChanged(evt);
            }
        });
        spinCols.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                spinColsFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(spinCols, gridBagConstraints);

        spinRows.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinRowsStateChanged(evt);
            }
        });
        spinRows.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                spinRowsFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(spinRows, gridBagConstraints);

        txtType.setColumns(10);
        txtType.setText(org.openide.util.NbBundle.getMessage(OfflineVisualPanel2.class, "OfflineVisualPanel2.txtType.text")); // NOI18N
        txtType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeActionPerformed(evt);
            }
        });
        txtType.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTypeFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(txtType, gridBagConstraints);

        btnLoadSff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iontorrent/scout/offline/document-open-2.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(btnLoadSff, org.openide.util.NbBundle.getMessage(OfflineVisualPanel2.class, "OfflineVisualPanel2.btnLoadSff.text")); // NOI18N
        btnLoadSff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadSffActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(btnLoadSff, gridBagConstraints);

        btnLoadBam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iontorrent/scout/offline/document-open-2.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(btnLoadBam, org.openide.util.NbBundle.getMessage(OfflineVisualPanel2.class, "OfflineVisualPanel2.btnLoadBam.text")); // NOI18N
        btnLoadBam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadBamActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(btnLoadBam, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(boxMask, org.openide.util.NbBundle.getMessage(OfflineVisualPanel2.class, "OfflineVisualPanel2.boxMask.text")); // NOI18N
        boxMask.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(boxMask, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(boxWells, org.openide.util.NbBundle.getMessage(OfflineVisualPanel2.class, "OfflineVisualPanel2.boxWells.text")); // NOI18N
        boxWells.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(boxWells, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(boxHasBam, org.openide.util.NbBundle.getMessage(OfflineVisualPanel2.class, "OfflineVisualPanel2.boxHasBam.text")); // NOI18N
        boxHasBam.setToolTipText(org.openide.util.NbBundle.getMessage(OfflineVisualPanel2.class, "OfflineVisualPanel2.boxHasBam.toolTipText")); // NOI18N
        boxHasBam.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(boxHasBam, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(boxHasSff, org.openide.util.NbBundle.getMessage(OfflineVisualPanel2.class, "OfflineVisualPanel2.boxHasSff.text")); // NOI18N
        boxHasSff.setToolTipText(org.openide.util.NbBundle.getMessage(OfflineVisualPanel2.class, "OfflineVisualPanel2.boxHasSff.toolTipText")); // NOI18N
        boxHasSff.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(boxHasSff, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(btnScan, org.openide.util.NbBundle.getMessage(OfflineVisualPanel2.class, "OfflineVisualPanel2.btnScan.text")); // NOI18N
        btnScan.setOpaque(false);
        btnScan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(btnScan, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(OfflineVisualPanel2.class, "OfflineVisualPanel2.jLabel1.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        add(jLabel1, gridBagConstraints);

        txtRunName.setColumns(40);
        txtRunName.setText(org.openide.util.NbBundle.getMessage(OfflineVisualPanel2.class, "OfflineVisualPanel2.txtRunName.text")); // NOI18N
        txtRunName.setToolTipText(org.openide.util.NbBundle.getMessage(OfflineVisualPanel2.class, "OfflineVisualPanel2.txtRunName.toolTipText")); // NOI18N
        txtRunName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRunNameActionPerformed(evt);
            }
        });
        txtRunName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRunNameFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        add(txtRunName, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(boxHasBai, org.openide.util.NbBundle.getMessage(OfflineVisualPanel2.class, "OfflineVisualPanel2.boxHasBai.text")); // NOI18N
        boxHasBai.setToolTipText(org.openide.util.NbBundle.getMessage(OfflineVisualPanel2.class, "OfflineVisualPanel2.boxHasBai.toolTipText")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(boxHasBai, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadSffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadSffActionPerformed
        String file = txtSff.getText();
        file = FileTools.getFile("Please select the SFF file", "*.sff", file, false);
        if (file != null && file.length() > 0) {
            this.txtSff.setText(file);
        }
        setExpContextFromGui();
}//GEN-LAST:event_btnLoadSffActionPerformed

    

    private void btnLoadBamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadBamActionPerformed
        String file = txtBam.getText();
        file = FileTools.getFile("Please select the BAM file", "*.bam", file, false);
        if (file != null && file.length() > 0) {
            this.txtBam.setText(file);
        }
        setExpContextFromGui();
}//GEN-LAST:event_btnLoadBamActionPerformed

    private void btnScanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScanActionPerformed
        scan();
        
    }//GEN-LAST:event_btnScanActionPerformed

    private void txtTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeActionPerformed
        updateExp();
    }//GEN-LAST:event_txtTypeActionPerformed

    private void spinRowsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinRowsStateChanged
        updateExp();
    }//GEN-LAST:event_spinRowsStateChanged

    private void spinColsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinColsStateChanged
        updateExp();
    }//GEN-LAST:event_spinColsStateChanged

    private void txtTypeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTypeFocusLost
        updateExp();
    }//GEN-LAST:event_txtTypeFocusLost

    private void spinColsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_spinColsFocusLost
        updateExp();
    }//GEN-LAST:event_spinColsFocusLost

    private void spinRowsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_spinRowsFocusLost
        updateExp();
    }//GEN-LAST:event_spinRowsFocusLost

    private void txtRunNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRunNameActionPerformed
         updateExp();
    }//GEN-LAST:event_txtRunNameActionPerformed

    private void txtRunNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRunNameFocusLost
        updateExp();
    }//GEN-LAST:event_txtRunNameFocusLost

    private void updateExp() {
        if (!ACTION) return;
        exp.setChipType(txtType.getText());
        exp.setNrcols(((Integer)(this.spinCols.getValue())).intValue());
        exp.setNrrows(((Integer)(this.spinRows.getValue())).intValue());
        exp.setResultsName(txtRunName.getText());
    }
     private void showExpContextContent() {
         ACTION = false;
        this.txtType.setText(getExp().getChipType());
        this.spinCols.setValue(getExp().getNrcols());
        this.txtRunName.setText(getExp().getResultsName());
        this.spinRows.setValue(getExp().getNrrows());
        this.txtSff.setText(getExp().getResultsDirectory() + getExp().getSffFileName());
        this.txtBam.setText(getExp().getResultsDirectory() + getExp().getBamFileName());
        ACTION = true;

        setOk(this.boxMask, false);
        setOk(this.boxWells, false);
      //  setOk(this.boxFoundStats, false);
        boolean ok = true;
        WellContext well= getExp().getWellContext();
        if (well != null) {
            if (well.getMask() != null) {
                setOk(this.boxMask, true);
            } else {
                ok = false;
            }
            if (well.getWellsfile().exists()) {
                setOk(this.boxWells, true);
            } else {
                ok = false;
            }
        } else {
            ok = false;
        }

     //   File f = new File(getExp().getResultsDirectory() + "wellStats.txt");
      //  setOk(this.boxFoundStats, f.exists());

        SequenceLoader loader = SequenceLoader.getSequenceLoader(getExp()) ;
       // this.btnCacheDatFiles.setEnabled(true);
        setOk(boxHasBam, loader.foundBamFile());
        setOk(boxHasSff, loader.foundSffFile());
        setOk(boxHasBai, loader.foundBai());
        //  if (!loader.foundSffFile()) ok = false;


    }

    private void setOk(JCheckBox box, boolean ok) {
        box.setSelected(ok);
       // box.setEnabled(false);
        if (ok) {
            box.setForeground(Color.green.darker());

        } else {
            box.setForeground(Color.red.darker());
        }
    }
     private boolean show(String msg) {
        if (msg == null || msg.length() < 1) {
            return false;
        }
       // if (lastmsg != null && msg.equalsIgnoreCase(msg)) return true;
        JOptionPane.showMessageDialog(this, "<html>" + msg + "</html>");
        lastmsg = msg;
        return true;
    }

   
    private boolean scanFolders() {
        // check results
        p("scanFolders");
        String msg = getExp().verify();
        if (show(msg)) {
            return false;
        }
        else p("No problems with folders");
        // folders exist
        String cache = exp.getCacheDir();
        if (cache != null && cache.length() > 0) {
            File f = new File(cache);
            cache = f.getParent();
        }
        OfflineTopComponent.parseLogFiles(cache, getExp());
        
        getExp().createWellContext();

        // bam and sff file
        p("Creating sequence loader");
        SequenceLoader loader = SequenceLoader.getSequenceLoader(getExp(), false, true);

        if (loader.getBamFile() != null) getExp().setBamFilename(loader.getBamFile().toString());
        if (loader.getSffFile() != null) {
            getExp().setSffFilename(loader.getSffFile().toString());
            getExp().setFlowOrder(loader.getFlowOrder());
        }
        if (loader.getSfftfFile() != null) getExp().setSfftffilename(loader.getSfftfFile().toString());
        return true;
    }
    private void setExpContextFromGui() {
        if (getExp() == null) {
            return;
        }
        getExp().setSffFilename(txtSff.getText());
        //getExp().setSfftffilename(txtSff.getText());
        getExp().setBamFilename(txtBam.getText());
        getExp().setChipType(this.txtType.getText());
        getExp().setNrcols((Integer) spinCols.getValue());
        getExp().setNrrows((Integer) spinRows.getValue());
        getExp().setResultsName(txtRunName.getText());

        SequenceLoader loader = SequenceLoader.getSequenceLoader(getExp(), false, true);
        if (loader.getBamFile() != null) getExp().setBamFilename(loader.getBamFile().toString());
        if (loader.getSffFile() != null) getExp().setSffFilename(loader.getSffFile().toString());
        if (loader.getSfftfFile() != null) getExp().setSfftffilename(loader.getSfftfFile().toString());
        txtSff.setText(getExp().getResultsDirectory() + getExp().getSffFileName());
        txtBam.setText(getExp().getResultsDirectory() + getExp().getBamFileName());

        setOk(boxHasSff, loader.foundSffFile());
        setOk(boxHasBam, loader.foundBamFile());
        setOk(boxHasBai, loader.foundBai());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boxHasBai;
    private javax.swing.JCheckBox boxHasBam;
    private javax.swing.JCheckBox boxHasSff;
    private javax.swing.JCheckBox boxMask;
    private javax.swing.JCheckBox boxWells;
    private javax.swing.JButton btnLoadBam;
    private javax.swing.JButton btnLoadSff;
    private javax.swing.JButton btnScan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSpinner spinCols;
    private javax.swing.JSpinner spinRows;
    private javax.swing.JTextField txtBam;
    private javax.swing.JTextField txtRunName;
    private javax.swing.JTextField txtSff;
    private javax.swing.JTextField txtType;
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
         updateExpGui();
    }

    private void p(String string) {
       System.out.println("Offline2: "+string);
    }
}
