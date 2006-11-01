/*
 * SelectWindowsDevicePanel.java
 *
 * Created on den 26 oktober 2006, 10:18
 */

package org.catacombae.hfsexplorer.gui;

/**
 *
 * @author  Erik
 */
public class SelectWindowsDevicePanel extends javax.swing.JPanel {
    
    /** Creates new form SelectWindowsDevicePanel */
    public SelectWindowsDevicePanel() {
        initComponents();
        selectSpecifyGroup.add(selectDeviceButton);
        selectSpecifyGroup.add(specifyDeviceNameButton);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        selectSpecifyGroup = new javax.swing.ButtonGroup();
        partitionGroup = new javax.swing.ButtonGroup();
        selectDeviceButton = new javax.swing.JRadioButton();
        specifyDeviceNameButton = new javax.swing.JRadioButton();
        specifyDeviceNameField = new javax.swing.JTextField();
        detectedDevicesCombo = new javax.swing.JComboBox();
        detectedDevicesLabel = new javax.swing.JLabel();
        loadButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        selectDeviceButton.setSelected(true);
        selectDeviceButton.setText("Select a device");
        selectDeviceButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        selectDeviceButton.setMargin(new java.awt.Insets(0, 0, 0, 0));

        specifyDeviceNameButton.setText("Specify device name (example: \\\\?\\GLOBALROOT\\Device\\Harddisk0\\Partition1)");
        specifyDeviceNameButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        specifyDeviceNameButton.setMargin(new java.awt.Insets(0, 0, 0, 0));

        specifyDeviceNameField.setText("\\\\?\\");
            specifyDeviceNameField.setEnabled(false);

            detectedDevicesCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Harddisk0\\Partition1", "Harddisk0\\Partition2", "Harddisk1\\Partition1", "CdRom0", "CdRom1" }));

            detectedDevicesLabel.setText("Detected devices:");

            loadButton.setText("Load");

            cancelButton.setText("Cancel");

            jLabel1.setText("(CD-ROMs probably won't work)");

            org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup()
                            .add(detectedDevicesLabel)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(detectedDevicesCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(jLabel1))
                        .add(selectDeviceButton)
                        .add(specifyDeviceNameButton)
                        .add(layout.createSequentialGroup()
                            .addContainerGap()
                            .add(loadButton)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(cancelButton))
                        .add(layout.createSequentialGroup()
                            .addContainerGap()
                            .add(specifyDeviceNameField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)))
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(selectDeviceButton)
                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(detectedDevicesLabel)
                        .add(detectedDevicesCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jLabel1))
                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                    .add(specifyDeviceNameButton)
                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                    .add(specifyDeviceNameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(loadButton)
                        .add(cancelButton)))
            );
        }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton cancelButton;
    public javax.swing.JComboBox detectedDevicesCombo;
    private javax.swing.JLabel detectedDevicesLabel;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JButton loadButton;
    private javax.swing.ButtonGroup partitionGroup;
    public javax.swing.JRadioButton selectDeviceButton;
    private javax.swing.ButtonGroup selectSpecifyGroup;
    public javax.swing.JRadioButton specifyDeviceNameButton;
    public javax.swing.JTextField specifyDeviceNameField;
    // End of variables declaration//GEN-END:variables
    
}