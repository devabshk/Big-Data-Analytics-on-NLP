/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SummarizationGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.text.BadLocationException;

/**

 @author Shubham
 */
public class SummarizationPanel extends javax.swing.JPanel implements ActionListener {

    /**
     Creates new form SummarizerPanel
     */
    public SummarizationPanel() {
	initComponents();
	setAttributes();
    }

    /**
     This method is called from within the constructor to
     initialize the form.
     WARNING: Do NOT modify this code. The content of this method is
     always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaInput = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaOutput = new javax.swing.JTextArea();
        jCheckBox = new javax.swing.JCheckBox();
        jComboBox = new javax.swing.JComboBox();

        jTextAreaInput.setColumns(20);
        jTextAreaInput.setRows(5);
        jTextAreaInput.setToolTipText("Enter or Paste text for Summarization");
        jTextAreaInput.setEnabled(false);
        jScrollPane2.setViewportView(jTextAreaInput);

        jTextAreaOutput.setColumns(20);
        jTextAreaOutput.setRows(5);
        jTextAreaOutput.setToolTipText("Summary of the text appears here");
        jTextAreaOutput.setEnabled(false);
        jScrollPane3.setViewportView(jTextAreaOutput);

        jCheckBox.setText("Use Editor");
        jCheckBox.setToolTipText("Summarize Editor text");

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%" }));
        jComboBox.setToolTipText("Summarization Ratio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(jCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String[] args) {
	SummarizationPanel summarizerPanel;
	JFrame jFrame;
	
	summarizerPanel = new SummarizationPanel();
	jFrame = new JFrame("Summarization Panel");
	
	summarizerPanel.addListeners();
	jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jFrame.getContentPane().add(summarizerPanel);
	jFrame.pack();
	jFrame.setVisible(true);
	
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox;
    private javax.swing.JComboBox jComboBox;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextAreaInput;
    private javax.swing.JTextArea jTextAreaOutput;
    // End of variables declaration//GEN-END:variables

    private void toggleTextArea(boolean state) {
	jTextAreaInput.setEnabled(state);
	jTextAreaOutput.setEnabled(state);
    }
    
    public void toggleEditing(boolean state) {
	jTextAreaOutput.setEditable(state);
    }
    
    private void setAttributes() {
	jTextAreaInput.setLineWrap(true);
	jTextAreaOutput.setLineWrap(true);
	toggleTextArea(false);
	//toggleEditing(false);
	addListeners();
    }
    
    private void addListeners() {
	jCheckBox.addActionListener(this);
    }
    
    public int getPercentage() {
	return (jComboBox.getSelectedIndex() + 1) * 10;
    }
    
    public String getEditorText() {
	try {
	    return jTextAreaInput.getDocument().getText(0, jTextAreaInput.getDocument().getLength());
	} catch (BadLocationException ex) {
	    System.out.println("Exception while parsing editor text:\t" + ex.toString());
	    return null;
	}
    }
    
    public void setEditorText(String summary) {
	jTextAreaOutput.setText(summary);
    }
    
    public boolean useEditor() {
	return jCheckBox.isSelected();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
	toggleTextArea(jCheckBox.isSelected());
    }
    
}
