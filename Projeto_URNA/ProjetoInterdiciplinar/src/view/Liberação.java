package view;

import bean.Bean;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

public class Liberação extends javax.swing.JInternalFrame {

    public Liberação() {
        initComponents();
          btnConf.setFocusPainted(false);
        //   setFrameIcon( new javax.swing.ImageIcon( getClass().getResource("/img/icon-urna.png") ) );
        // this.setIconImage(new ImageIcon(getClass().getResource("/img/icon-urna.png")).getImage());
     //   setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameClosing(InternalFrameEvent ife) {
                if(b.SairPrograma() == true){
                    dispose();
                b.libera();
                }else{}
                
            }
        });
    }
    Bean b = new Bean();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        btnConf = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Titulo de eleitor");
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Digite seu titulo de eleitor");

        txtTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTituloKeyPressed(evt);
            }
        });

        btnConf.setBackground(new java.awt.Color(0, 102, 204));
        btnConf.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnConf.setForeground(new java.awt.Color(255, 255, 255));
        btnConf.setText("Confirmar");
        btnConf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfActionPerformed(evt);
            }
        });
        btnConf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnConfKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTitulo)
                    .addComponent(btnConf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfActionPerformed
        btnConf.setFocusPainted(false);
       if (b.liberar(txtTitulo) == true) {
           //String[] valores;
          // valores = new String[1000000000];
          // valores = String["z"];
            this.dispose();
        }
    }//GEN-LAST:event_btnConfActionPerformed

    private void btnConfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnConfKeyTyped
        if (evt.getKeyChar() == 10) {
             btnConf.doClick();
        }
    }//GEN-LAST:event_btnConfKeyTyped

    private void txtTituloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTituloKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar() == 10){
            btnConf.doClick();
        }      
    }//GEN-LAST:event_txtTituloKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

}
