/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Classes.Total;

/**
 *
 * @author logonaf
 */
public class Pizzaria extends javax.swing.JInternalFrame {

    /**
     * Creates new form Pizzaria
     */
    public Pizzaria() {
        initComponents();
    }
    
     public Total getTotal(){
        Total td = new Total();
        float tota = 0.0f;
       // td.setMesa(Integer.parseInt(CbM.getSelectedValue()));
        if(B1.isSelected()){
            tota =(11);
        }
       else if(B2.isSelected()){
            tota = (18);
        }
        if(bro.isSelected()){
            tota += 3.5f;
        }
        if(esc.isSelected()){
            tota += 3.6f;
     
        }
        if(erv.isSelected()){
            tota += 1.3f;
     
        }
        if(bac.isSelected()){
            tota += 5.1f;
        }
        if(mus.isSelected()){
            tota += 5.5f;
        }
        if(cat.isSelected()){
            tota += 7;
           
        }
        if(par.isSelected()){
            tota += 4;        }
        if(tom.isSelected()){
            tota += 3.5f;
            
        }
        td.setTotal(tota);
        return td;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CbM = new javax.swing.JComboBox<>();
        B1 = new javax.swing.JRadioButton();
        B2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        bro = new javax.swing.JCheckBox();
        esc = new javax.swing.JCheckBox();
        erv = new javax.swing.JCheckBox();
        bac = new javax.swing.JCheckBox();
        mus = new javax.swing.JCheckBox();
        cat = new javax.swing.JCheckBox();
        par = new javax.swing.JCheckBox();
        tom = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        Valor = new javax.swing.JTextField();
        Calc = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Pizzaria");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("MYPizza - Monte sua Pizza");

        jLabel2.setText("Mesa");

        CbM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        buttonGroup1.add(B1);
        B1.setText("Brotinho");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(B2);
        B2.setText("Big");
        B2.setActionCommand("Big");

        jLabel3.setText("Ingredientes:");

        bro.setText("Brocolis");

        esc.setText("Escarola ");

        erv.setText("Ervilha");

        bac.setText("Bacon");

        mus.setText("Mussarela");

        cat.setText("Catupiry");

        par.setText("Parmesão");

        tom.setText("Tomate");

        jLabel4.setText("Valor:");

        Calc.setText("Calcular");
        Calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(148, 148, 148))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(Calc))
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B1)
                        .addGap(18, 18, 18)
                        .addComponent(B2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CbM, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mus)
                                    .addComponent(bro))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(esc)
                                    .addComponent(cat))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(erv)
                                    .addComponent(par))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bac)
                            .addComponent(tom))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CbM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1)
                    .addComponent(B2))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bro)
                    .addComponent(esc)
                    .addComponent(erv)
                    .addComponent(bac))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mus)
                    .addComponent(cat)
                    .addComponent(par)
                    .addComponent(tom))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B1ActionPerformed

    private void CalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcActionPerformed
        // TODO add your handling code here:
        new Bean.MensagemBean().AtualizarValor(getTotal(), Valor);
        
        
    }//GEN-LAST:event_CalcActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton B1;
    private javax.swing.JRadioButton B2;
    private javax.swing.JButton Calc;
    private javax.swing.JComboBox<String> CbM;
    private javax.swing.JTextField Valor;
    private javax.swing.JCheckBox bac;
    private javax.swing.JCheckBox bro;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cat;
    private javax.swing.JCheckBox erv;
    private javax.swing.JCheckBox esc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JCheckBox mus;
    private javax.swing.JCheckBox par;
    private javax.swing.JCheckBox tom;
    // End of variables declaration//GEN-END:variables
}
