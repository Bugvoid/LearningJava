package view;

import bean.Bean;
import dao.consultas;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.UIManager;

public class Login extends javax.swing.JFrame {

    Bean b = new Bean();
  
    /**
     * Fecha o JInternalFrame a partir da chamada do botão fechar
     
    private void closeInternalFrame() {
        this.setDefaultCloseOperation(Login.DISPOSE_ON_CLOSE);
    }*/
    public Login() {
        initComponents();
        
    
        /*thisClass.setUndecorated(true);
    thisClass.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);*/
        
           // this.setUndecorated(true);  
    //Login.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);  
         btnEntrar.setFocusPainted(false);
        this.setIconImage(new ImageIcon(getClass().getResource("/icones/logosuperior.jpg")).getImage());

        //setDefaultCloseOperation(0);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                if(b.SairPrograma() == true){
                    System.exit(0);
                }else{
                
                }
                //pede para a janela fechar
            }
        });}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSen = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sistema de Votação");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(3000, 3000, 3000, 3000));
        setLocation(new java.awt.Point(0, 0));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Bem vindo!");

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel3.setText("Usuario:");

        txtUsu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUsu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuActionPerformed(evt);
            }
        });
        txtUsu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel2.setText("Senha:");

        txtSen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtSen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSenMouseClicked(evt);
            }
        });
        txtSen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenActionPerformed(evt);
            }
        });
        txtSen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenKeyPressed(evt);
            }
        });

        btnEntrar.setBackground(new java.awt.Color(0, 102, 204));
        btnEntrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Login");
        btnEntrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 1, true));
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        btnEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnEntrarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSen, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(txtUsu))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsu))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSen, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped

        if (evt.getKeyChar() == 10) {
            String usu = txtUsu.getText();
            String senha = new String(txtSen.getPassword());
            b.entrar(usu, senha);
        }
    }//GEN-LAST:event_formKeyTyped

    private void btnEntrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEntrarKeyTyped
        //Verificação por botão entrar

        if (evt.getKeyChar() == 10) {
            String usu = txtUsu.getText();
            String senha = new String(txtSen.getPassword());
            b.entrar(usu, senha);
            btnEntrar.setFocusPainted(false);
        }
    }//GEN-LAST:event_btnEntrarKeyTyped

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        //Vericação do botão entrar
        String usu = txtUsu.getText();
        String senha = new String(txtSen.getPassword());
       
        
       b.entrar(usu, senha);
        //Tirar marcação do botão
        btnEntrar.setFocusPainted(false);
        
        
        /*Pesquisa p = new Pesquisa();
        p.setLocation(50, 50);
         p.setVisible(true);
          p.setLocationRelativeTo(null);*/
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtSenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenActionPerformed

    }//GEN-LAST:event_txtSenActionPerformed

    private void txtSenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSenMouseClicked

    }//GEN-LAST:event_txtSenMouseClicked

    private void txtUsuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuKeyPressed
        if(evt.getKeyChar() == 10){
            txtSen.requestFocus();
        }
    }//GEN-LAST:event_txtUsuKeyPressed

    private void txtUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuActionPerformed

    private void txtSenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenKeyPressed
      if(evt.getKeyChar() == 10){
            btnEntrar.doClick();
        }        
// TODO add your handling code here:
    }//GEN-LAST:event_txtSenKeyPressed
    public static void main(String args[]) {
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtSen;
    private javax.swing.JTextField txtUsu;
    // End of variables declaration//GEN-END:variables

}
