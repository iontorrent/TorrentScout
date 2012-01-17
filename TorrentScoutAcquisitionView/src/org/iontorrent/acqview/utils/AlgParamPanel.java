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
 * AlgParamPanel.java
 *
 * Created on 11.05.2011, 10:32:33
 */
package org.iontorrent.acqview.utils;

/**
 *
 * @author Chantal Roth
 */
public class AlgParamPanel extends javax.swing.JPanel {

   
    private ParamChangeListener list;
    /** Creates new form AlgParamPanel */
    public AlgParamPanel(ParamChangeListener list) {
        initComponents();
        this.list = list;
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

        jLabel1 = new javax.swing.JLabel();
        spinBulk = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        spinEmpty = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        spinStart = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        spinEnd = new javax.swing.JSpinner();

        setOpaque(false);
        setLayout(new java.awt.GridBagLayout());

        jLabel1.setText(org.openide.util.NbBundle.getMessage(AlgParamPanel.class, "AlgParamPanel.jLabel1.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        add(jLabel1, gridBagConstraints);

        spinBulk.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(10.0f), Float.valueOf(0.0f), Float.valueOf(100.0f), Float.valueOf(1.0f)));
        spinBulk.setToolTipText("<html>\nfor (int f = start ; f < end ; f++) {<br>            \n&nbsp;&nbsp;&nbsp;&nbsp;\t int dt = (int) (tt[f] - tt[f-1]);  <br>\n&nbsp;&nbsp;&nbsp;&nbsp;\t int dempty = (emptydata[f]-emptydata[0]);<br>\n&nbsp;&nbsp;&nbsp;&nbsp;\tzeromerdata[f] = (dempty * (<b>tauEmpty</b> + dt) + cdelta[f-1]) / (<b>tauBulk</b> + dt);             <br>\n&nbsp;&nbsp;&nbsp;&nbsp;\tidelta[f] =(dempty - zeromerdata[f])*dt;<br>\n&nbsp;&nbsp;&nbsp;&nbsp;\tcdelta[f] = cdelta[f-1] + idelta[f];<br>\n }\n </html>"); // NOI18N
        spinBulk.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinBulkStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 0, 0);
        add(spinBulk, gridBagConstraints);

        jLabel2.setText(org.openide.util.NbBundle.getMessage(AlgParamPanel.class, "AlgParamPanel.jLabel2.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 1, 0, 0);
        add(jLabel2, gridBagConstraints);

        spinEmpty.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(4.0f), Float.valueOf(0.0f), Float.valueOf(100.0f), Float.valueOf(1.0f)));
        spinEmpty.setToolTipText("<html>\nfor (int f = start ; f < end ; f++) {<br>            \n&nbsp;&nbsp;&nbsp;&nbsp;\t int dt = (int) (tt[f] - tt[f-1]);  <br>\n&nbsp;&nbsp;&nbsp;&nbsp;\t int dempty = (emptydata[f]-emptydata[0]);<br>\n&nbsp;&nbsp;&nbsp;&nbsp;\tzeromerdata[f] = (dempty * (<b>tauEmpty</b> + dt) + cdelta[f-1]) / (<b>tauBulk</b> + dt);             <br>\n&nbsp;&nbsp;&nbsp;&nbsp;\tidelta[f] =(dempty - zeromerdata[f])*dt;<br>\n&nbsp;&nbsp;&nbsp;&nbsp;\tcdelta[f] = cdelta[f-1] + idelta[f];<br>\n }\n </html>"); // NOI18N
        spinEmpty.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinEmptyStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 0, 0);
        add(spinEmpty, gridBagConstraints);

        jLabel3.setText(org.openide.util.NbBundle.getMessage(AlgParamPanel.class, "AlgParamPanel.jLabel3.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        add(jLabel3, gridBagConstraints);

        spinStart.setModel(new javax.swing.SpinnerNumberModel(0, 0, 220, 1));
        spinStart.setToolTipText("<html>The frame start and end where you think the signal is most likely to occur\n </html>"); // NOI18N
        spinStart.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinStartStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 0, 0);
        add(spinStart, gridBagConstraints);

        jLabel4.setText(org.openide.util.NbBundle.getMessage(AlgParamPanel.class, "AlgParamPanel.jLabel4.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 1, 0, 0);
        add(jLabel4, gridBagConstraints);

        spinEnd.setModel(new javax.swing.SpinnerNumberModel(100, 0, 220, 1));
        spinEnd.setToolTipText("<html>The frame start and end where you think the signal is most likely to occur\n </html>"); // NOI18N
        spinEnd.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinEndStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 0, 0);
        add(spinEnd, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void spinEndStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinEndStateChanged
        list.parameterChanged(this, "frameEnd", this.getFrameEnd());
    }//GEN-LAST:event_spinEndStateChanged

    private void spinEmptyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinEmptyStateChanged
        list.parameterChanged(this, "tauEmpty", this.getTauEmpty());
    }//GEN-LAST:event_spinEmptyStateChanged

    private void spinStartStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinStartStateChanged
         list.parameterChanged(this, "frameStart", this.getFrameStart());
    }//GEN-LAST:event_spinStartStateChanged

    private void spinBulkStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinBulkStateChanged
       list.parameterChanged(this, "tauBulk", this.getTauBulk());
    }//GEN-LAST:event_spinBulkStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSpinner spinBulk;
    private javax.swing.JSpinner spinEmpty;
    private javax.swing.JSpinner spinEnd;
    private javax.swing.JSpinner spinStart;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the tauEmpty
     */
    public float getTauEmpty() {
        return (Float)spinEmpty.getValue();
    }

    /**
     * @param tauEmpty the tauEmpty to set
     */
    public void setTauEmpty(float tauEmpty) {
       spinEmpty.setValue(tauEmpty);
    }

    /**
     * @return the tauBulk
     */
    public float getTauBulk() {
        return (Float)spinBulk.getValue();
    }

    /**
     * @param tauBulk the tauBulk to set
     */
    public void setTauBulk(float tauBulk) {
        spinBulk.setValue(tauBulk);
    }

    /**
     * @return the frameStart
     */
    public int getFrameStart() {
        return  (Integer)spinStart.getValue();
    }

    /**
     * @param frameStart the frameStart to set
     */
    public void setFrameStart(int frameStart) {
         spinStart.setValue(frameStart);
    }

    /**
     * @return the frameEnd
     */
    public int getFrameEnd() {
        return  (Integer)spinEnd.getValue();
    }

    /**
     * @param frameEnd the frameEnd to set
     */
    public void setFrameEnd(int frameEnd) {
         spinEnd.setValue(frameEnd);
    }
}
