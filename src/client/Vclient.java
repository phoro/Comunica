/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author r0b
 */
public class Vclient extends javax.swing.JFrame {
    
Client cliente =null;
    /**
     * Creates new form Vclient
     */
    public Vclient(Client client) {
        initComponents();
       cliente = client;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldnom = new javax.swing.JTextField();
        jLabelnom = new javax.swing.JLabel();
        jLabelsaldo = new javax.swing.JLabel();
        jTextFieldsaldo = new javax.swing.JTextField();
        jButtoncomprova = new javax.swing.JButton();
        jLabelpass = new javax.swing.JLabel();
        jTextFieldpass = new javax.swing.JTextField();
        jButtonsurt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreainfo = new javax.swing.JTextArea();
        jLabelinfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Client");
        setLocation(new java.awt.Point(50, 0));

        jTextFieldnom.setText("escriu el nom");

        jLabelnom.setText("nom");

        jLabelsaldo.setText("Saldo");

        jTextFieldsaldo.setText("0");

        jButtoncomprova.setText("Consulta");
        jButtoncomprova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncomprovaActionPerformed(evt);
            }
        });

        jLabelpass.setText("Password");

        jTextFieldpass.setText("password");

        jButtonsurt.setText("Surt");
        jButtonsurt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsurtActionPerformed(evt);
            }
        });

        jTextAreainfo.setEditable(false);
        jTextAreainfo.setColumns(20);
        jTextAreainfo.setRows(5);
        jScrollPane1.setViewportView(jTextAreainfo);

        jLabelinfo.setText("info");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonsurt)
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldpass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelnom, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldnom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelsaldo)
                            .addComponent(jTextFieldsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(118, 118, 118))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButtoncomprova))
                            .addComponent(jLabelpass)
                            .addComponent(jLabelinfo))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonsurt)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelnom)
                            .addComponent(jLabelsaldo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelpass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtoncomprova)
                        .addGap(9, 9, 9)
                        .addComponent(jLabelinfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtoncomprovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncomprovaActionPerformed
        // TODO provar amb text buit
       Client.missatge =(jTextFieldnom.getText());
       cliente.engega();
       
        
    }//GEN-LAST:event_jButtoncomprovaActionPerformed

    private void jButtonsurtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsurtActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonsurtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Vclient().setVisible(true);
            }
        });
    }
    
    public void infotext(String info){
        jTextAreainfo.setText(jTextAreainfo.getText()+"\n"+info);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtoncomprova;
    private javax.swing.JButton jButtonsurt;
    private javax.swing.JLabel jLabelinfo;
    private javax.swing.JLabel jLabelnom;
    private javax.swing.JLabel jLabelpass;
    private javax.swing.JLabel jLabelsaldo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreainfo;
    private javax.swing.JTextField jTextFieldnom;
    private javax.swing.JTextField jTextFieldpass;
    public javax.swing.JTextField jTextFieldsaldo;
    // End of variables declaration//GEN-END:variables
}
