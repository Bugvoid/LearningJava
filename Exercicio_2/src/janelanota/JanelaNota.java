/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelanota;

import javax.swing.JOptionPane;

/**
 *
 * @author logonaf
 */
public class JanelaNota extends javax.swing.JFrame {
        
   
    public JanelaNota() {
        initComponents();
        setSize(400,350);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTR = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        txtPP = new javax.swing.JTextField();
        txtPR = new javax.swing.JTextField();
        txtPJ = new javax.swing.JTextField();
        Nota = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnLimp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NOTAS DOS ALUNOS");
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(500, 200, 0, 0));
        getContentPane().setLayout(null);

        jlabel1.setText("Nota Trabalho:");
        getContentPane().add(jlabel1);
        jlabel1.setBounds(30, 210, 80, 30);

        jLabel2.setText("Nome do Aluno:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 0, 100, 30);

        jLabel3.setText("Nota PP:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 70, 80, 30);

        jLabel4.setText("Nota PR:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 120, 80, 30);

        jLabel5.setText("Nota PJ:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 170, 80, 30);

        txtTR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTRActionPerformed(evt);
            }
        });
        getContentPane().add(txtTR);
        txtTR.setBounds(40, 240, 60, 30);

        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtnome);
        txtnome.setBounds(20, 30, 190, 30);
        getContentPane().add(txtPP);
        txtPP.setBounds(60, 70, 60, 30);
        getContentPane().add(txtPR);
        txtPR.setBounds(60, 120, 60, 30);
        getContentPane().add(txtPJ);
        txtPJ.setBounds(60, 170, 60, 30);

        Nota.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        Nota.setToolTipText("");
        getContentPane().add(Nota);
        Nota.setBounds(220, 100, 170, 60);

        jLabel1.setText("Nota do aluno:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 80, 100, 14);

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular);
        btnCalcular.setBounds(170, 220, 90, 40);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 180, 240, 30);

        btnLimp.setText("LIMPAR");
        btnLimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimp);
        btnLimp.setBounds(270, 220, 100, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed

    }//GEN-LAST:event_txtnomeActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        float pp=0,pr=0,tr=0,pj=0;
        if(txtPP.getText().equals("")|| txtTR.getText().equals("") || txtPR.getText().equals("") || txtPJ.getText().equals("") || txtnome.getText().equals("")){
            jLabel6.setText("UM ou MAIS campos vazios, preecher por favor");
        }else{
            pp =  Float.parseFloat(txtPP.getText());
            tr =  Float.parseFloat(txtTR.getText());
            pj =  Float.parseFloat(txtPJ.getText());
            pr =  Float.parseFloat(txtPR.getText());
        }
        
        
        float media =  (float) ((0.2*pp) + (0.4*pr) + (0.2*pj) + (0.2*tr));
        if(media>=6){
            Nota.setText(media +"\n Aprovado");
        }else if (media<3){
            Nota.setText(media +"\n DP");
        }else
            Nota.setText(media +"\n Exame");

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpActionPerformed
        txtPP.setText("");
        txtnome.setText("");
        txtPJ.setText("");
        txtPR.setText("");
        txtTR.setText("");
             
    }//GEN-LAST:event_btnLimpActionPerformed

    private void txtTRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTRActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaNota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nota;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JTextField txtPJ;
    private javax.swing.JTextField txtPP;
    private javax.swing.JTextField txtPR;
    private javax.swing.JTextField txtTR;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables
}
