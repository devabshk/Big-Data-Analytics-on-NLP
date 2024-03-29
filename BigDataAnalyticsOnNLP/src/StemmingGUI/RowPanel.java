/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StemmingGUI;

/**
 *
 * @author Shubham
 */
public class RowPanel extends javax.swing.JPanel {

    /**
     * Creates new form PanelRow
     */
    public RowPanel() {
	initComponents();
	checkBox.setSelected(true);
    }
    
    public RowPanel(String prereq, String regex, String removeSuffix, String addSuffix) {
	this();
	textFieldPrereq.setText(prereq);
	textFieldRegex.setText(regex);
	textFieldAdd.setText(addSuffix);
	textFieldRemove.setText(removeSuffix);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkBox = new javax.swing.JCheckBox();
        buttonRemove = new javax.swing.JButton();
        textFieldRemove = new javax.swing.JTextField();
        textFieldAdd = new javax.swing.JTextField();
        buttonAdd = new javax.swing.JButton();
        textFieldRegex = new javax.swing.JTextField();
        textFieldPrereq = new javax.swing.JTextField();

        checkBox.setToolTipText("Enable / Disable");

        buttonRemove.setText("-");
        buttonRemove.setToolTipText("Remove");

        textFieldRemove.setToolTipText("Suffix to be replaced");

        textFieldAdd.setToolTipText("Suffix to replace with");

        buttonAdd.setText("+");
        buttonAdd.setToolTipText("Add new rule after this");

        textFieldRegex.setToolTipText("Regular Expression to match before applying rule");

        textFieldPrereq.setToolTipText("Prerequisite Rules");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textFieldPrereq, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldRegex, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkBox)
                .addGap(6, 6, 6)
                .addComponent(buttonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonAdd)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(checkBox)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textFieldRemove)
                                .addComponent(textFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFieldRegex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFieldPrereq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buttonRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonAdd)))
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton buttonAdd;
    public javax.swing.JButton buttonRemove;
    public javax.swing.JCheckBox checkBox;
    public javax.swing.JTextField textFieldAdd;
    public javax.swing.JTextField textFieldPrereq;
    public javax.swing.JTextField textFieldRegex;
    public javax.swing.JTextField textFieldRemove;
    // End of variables declaration//GEN-END:variables
}
