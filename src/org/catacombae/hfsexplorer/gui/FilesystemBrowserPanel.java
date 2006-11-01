/*
 * FilesystemBrowserPanel.java
 *
 * Created on den 24 oktober 2006, 15:31
 */

package org.catacombae.hfsexplorer.gui;

/**
 *
 * @author  Erik
 */
public class FilesystemBrowserPanel extends javax.swing.JPanel {
    
    /** Creates new form FilesystemBrowserPanel */
    public FilesystemBrowserPanel() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        treeTableSplit = new javax.swing.JSplitPane();
        dirTreeScroller = new javax.swing.JScrollPane();
        dirTree = new javax.swing.JTree();
        fileTableScroller = new javax.swing.JScrollPane();
        fileTable = new javax.swing.JTable();
        addressField = new javax.swing.JTextField();
        pathLabel = new javax.swing.JLabel();
        goButton = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();
        extractButton = new javax.swing.JButton();

        treeTableSplit.setDividerLocation(150);
        treeTableSplit.setContinuousLayout(true);
        dirTreeScroller.setViewportView(dirTree);

        treeTableSplit.setLeftComponent(dirTreeScroller);

        fileTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"yada.txt", "1 KiB", "Textdokument", "2006-06-11 14:34"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Namn", "Storlek", "Typ", "Senast �ndrad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        fileTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        fileTable.setShowHorizontalLines(false);
        fileTable.setShowVerticalLines(false);
        fileTableScroller.setViewportView(fileTable);

        treeTableSplit.setRightComponent(fileTableScroller);

        pathLabel.setText("Path:");

        goButton.setText("Go");

        statusLabel.setText("Status text goes here");
        statusLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        extractButton.setText("Extract");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(pathLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(addressField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(goButton)
                .addContainerGap())
            .add(statusLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
            .add(treeTableSplit, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(extractButton)
                .addContainerGap(527, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(extractButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(pathLabel)
                    .add(goButton)
                    .add(addressField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(treeTableSplit, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(statusLabel))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField addressField;
    public javax.swing.JTree dirTree;
    private javax.swing.JScrollPane dirTreeScroller;
    public javax.swing.JButton extractButton;
    public javax.swing.JTable fileTable;
    private javax.swing.JScrollPane fileTableScroller;
    public javax.swing.JButton goButton;
    private javax.swing.JLabel pathLabel;
    public javax.swing.JLabel statusLabel;
    private javax.swing.JSplitPane treeTableSplit;
    // End of variables declaration//GEN-END:variables
    
}