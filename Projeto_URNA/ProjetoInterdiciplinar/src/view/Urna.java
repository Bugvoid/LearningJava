package view;

import bean.Bean;
import dao.consultas;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Urna extends javax.swing.JFrame {

    Liberação libe = new Liberação();
    consultas c = new consultas();
    Bean b = new Bean();
    String val = "";
    int dado = 1;

    public Urna() {
        //Verifica se a liberação esta ok
        //Inicia a urna com o presidente e separa as caixas
        libe.setVisible(true);
        this.add(libe);
        try {
            libe.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Urna.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/icones/logosuperior.jpg")).getImage());
        Candidato.setText("Presidente");
        cx3.setVisible(false);
        cx4.setVisible(false);
        cx5.setVisible(false);
        //Mensagem para sair
        this.addWindowListener(new WindowAdapter() {
    @Override
    public void windowClosing(WindowEvent evt) {
        if(b.SairPrograma() == true){
                    dispose();
                    //finaliza a tela e abre o libera
            b.libera();
                }else{} 
    }
    });
    }

    public void Cargo() {
       //verifica em qual voto esta
        if (dado == 5) {
            //verifica se esta no ultimo voto
            dado = 1;
            val = "";
            JOptionPane.showMessageDialog(null, "Fim");
            libe.setVisible(true);
            alterCargo();
            cx1.setText("");
            cx2.setText("");
            cx3.setText("");
            cx4.setText("");
          } else {
            //Passa para o proximo candidato
            Urna voto = new Urna();
            dado++;
            val = "";
            voto.initComponents();
            alterCargo();
            cx1.setText("");
            cx2.setText("");
            cx3.setText("");
            cx4.setText("");
            cx5.setText("");
        }  }

    public void alterCargo() {
        //Mostra quantas caixas são de acordo com o camdidato
        switch (dado) {
            case 1:
                Candidato.setText("Presidente");
                cx3.setVisible(false);
                cx4.setVisible(false);
                cx5.setVisible(false);
                break;
            case 2:
                Candidato.setText("Governador");
                cx3.setVisible(false);
                cx4.setVisible(false);
                cx5.setVisible(false);
                break;
            case 3:
                Candidato.setText("Senador");
                cx3.setVisible(true);
                cx4.setVisible(false);
                cx5.setVisible(false);
                break;
            case 4:
                Candidato.setText("Deputado Federal");
                cx3.setVisible(true);
                cx4.setVisible(true);
                cx5.setVisible(false);
                break;
            case 5:
                Candidato.setText("Deputado Estadual");
                cx3.setVisible(true);
                cx4.setVisible(true);
                cx5.setVisible(true);
                break;
            default:
                Candidato.setText("Problema");
                break;
        }
    }

    public void setarCaixa() {
        //coloca os valores em cada caixa separando os por char
        char vai[] = val.toCharArray();
        if (val.length() == 1) {
            cx1.setText(Character.toString(vai[0]));
            cx2.setText("");
            cx3.setText("");
            cx4.setText("");
            cx5.setText("");
        }
        if (val.length() == 2) {
            cx1.setText(Character.toString(vai[0]));
            cx2.setText(Character.toString(vai[1]));
            cx3.setText("");
            cx4.setText("");
            cx5.setText("");
        }
        if (val.length() == 3) {
            cx1.setText(Character.toString(vai[0]));
            cx2.setText(Character.toString(vai[1]));
            cx3.setText(Character.toString(vai[2]));
            cx4.setText("");
            cx5.setText("");
        }
        if (val.length() == 4) {
            cx1.setText(Character.toString(vai[0]));
            cx2.setText(Character.toString(vai[1]));
            cx3.setText(Character.toString(vai[2]));
            cx4.setText(Character.toString(vai[3]));
            cx5.setText("");
        }
        if (val.length() == 5) {
            cx1.setText(Character.toString(vai[0]));
            cx2.setText(Character.toString(vai[1]));
            cx3.setText(Character.toString(vai[2]));
            cx4.setText(Character.toString(vai[3]));
            cx5.setText(Character.toString(vai[4]));
        } }

    public void presidente() {
        if (val.length() < 3) {
           setarCaixa();
            if (val.length() == 2) {
                b.pesquisa(val, txt_nome, imagem,1,Partido);
            }
        } else {
            val = val.substring(0, val.length() - 1);
        }
    }

    public void governador() {
        if (val.length() < 3) {
           setarCaixa();
            if (val.length() == 2) {
                b.pesquisa(val, txt_nome, imagem,3,Partido);
            }
        } else {
            val = val.substring(0, val.length() - 1);
        }    }

    public void senador() {
        if (val.length() < 4) {
            setarCaixa();
            if (val.length() == 3) {
                b.pesquisa(val, txt_nome, imagem,4,Partido);
            }
        } else {
            val = val.substring(0, val.length() - 1);
        }    }

    public void deputadofederal() {
        if (val.length() < 5) {
            setarCaixa();
           if (val.length() == 4) {
                b.pesquisa(val, txt_nome, imagem,5,Partido);
            }
        } else {
            val = val.substring(0, val.length() - 1);
        }
    }

    public void deputadoestadual() {
        if (val.length() < 6) {
            setarCaixa();
            if (val.length() == 5) {
                b.pesquisa(val, txt_nome, imagem,6,Partido);
            }
        } else {
            val = val.substring(0, val.length() - 1);
        }
    }

    public void selecionar() {
        //int Candidato = dado;
        //chama metodo para cada camdidato diferente
        switch (dado) {
            case 1:
                presidente();
                break;
            case 2:
                governador();
                break;
            case 3:
                senador();
                break;
            case 4:
                deputadofederal();
                break;
            case 5:
                deputadoestadual();
                break;
            default:
                System.out.println("Error");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Candidato = new javax.swing.JLabel();
        Votar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        imagem = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JLabel();
        Partido = new javax.swing.JLabel();
        cx1 = new javax.swing.JTextField();
        cx2 = new javax.swing.JTextField();
        cx3 = new javax.swing.JTextField();
        cx4 = new javax.swing.JTextField();
        cx5 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btnBranco = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnCorrige = new javax.swing.JButton();
        btnConfima = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("VOTE PRA NADA");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Candidato.setText("Cargo");

        Votar.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Votar.setText("SEU VOTO PARA");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Número");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nome ");

        imagem.setBackground(new java.awt.Color(153, 153, 255));
        imagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Partido");

        cx1.setEditable(false);
        cx1.setBackground(new java.awt.Color(255, 255, 255));
        cx1.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        cx1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cx1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cx1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cx1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        cx1.setMaximumSize(new java.awt.Dimension(50, 50));
        cx1.setMinimumSize(new java.awt.Dimension(50, 50));
        cx1.setPreferredSize(new java.awt.Dimension(70, 20));

        cx2.setEditable(false);
        cx2.setBackground(new java.awt.Color(255, 255, 255));
        cx2.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        cx2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cx2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cx2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cx2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        cx2.setMaximumSize(new java.awt.Dimension(50, 50));
        cx2.setMinimumSize(new java.awt.Dimension(50, 50));
        cx2.setPreferredSize(new java.awt.Dimension(70, 20));

        cx3.setEditable(false);
        cx3.setBackground(new java.awt.Color(255, 255, 255));
        cx3.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        cx3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cx3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cx3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cx3.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        cx3.setMaximumSize(new java.awt.Dimension(50, 50));
        cx3.setMinimumSize(new java.awt.Dimension(50, 50));
        cx3.setPreferredSize(new java.awt.Dimension(70, 20));
        cx3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cx3ActionPerformed(evt);
            }
        });

        cx4.setEditable(false);
        cx4.setBackground(new java.awt.Color(255, 255, 255));
        cx4.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        cx4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cx4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cx4.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        cx4.setMaximumSize(new java.awt.Dimension(50, 50));
        cx4.setMinimumSize(new java.awt.Dimension(50, 50));
        cx4.setPreferredSize(new java.awt.Dimension(70, 20));

        cx5.setEditable(false);
        cx5.setBackground(new java.awt.Color(255, 255, 255));
        cx5.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        cx5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cx5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cx5.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        cx5.setMaximumSize(new java.awt.Dimension(50, 50));
        cx5.setMinimumSize(new java.awt.Dimension(50, 50));
        cx5.setPreferredSize(new java.awt.Dimension(70, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Votar)
                            .addComponent(Candidato)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cx1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cx2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cx3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cx4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cx5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addComponent(imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Partido)
                            .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Votar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Candidato)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cx1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cx5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cx4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cx3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cx2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2))
                    .addComponent(imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addComponent(Partido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        btn1.setBackground(new java.awt.Color(0, 0, 0));
        btn1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1.jpg"))); // NOI18N
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btnBranco.setBackground(new java.awt.Color(255, 255, 255));
        btnBranco.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnBranco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/branco.jpg"))); // NOI18N
        btnBranco.setBorder(null);
        btnBranco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBranco.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnBranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrancoActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(0, 0, 0));
        btn7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/7.jpg"))); // NOI18N
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(0, 0, 0));
        btn4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/4.jpg"))); // NOI18N
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(0, 0, 0));
        btn2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/2.jpg"))); // NOI18N
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(0, 0, 0));
        btn3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/3.jpg"))); // NOI18N
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(0, 0, 0));
        btn6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/6.jpg"))); // NOI18N
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(0, 0, 0));
        btn5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/5.jpg"))); // NOI18N
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(0, 0, 0));
        btn8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/8.jpg"))); // NOI18N
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(0, 0, 0));
        btn9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/9.jpg"))); // NOI18N
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(0, 0, 0));
        btn0.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/0.jpg"))); // NOI18N
        btn0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnCorrige.setBackground(new java.awt.Color(204, 0, 0));
        btnCorrige.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnCorrige.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/corrige.jpg"))); // NOI18N
        btnCorrige.setBorder(null);
        btnCorrige.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCorrige.setMaximumSize(new java.awt.Dimension(93, 29));
        btnCorrige.setMinimumSize(new java.awt.Dimension(93, 29));
        btnCorrige.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnCorrige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrigeActionPerformed(evt);
            }
        });

        btnConfima.setBackground(new java.awt.Color(51, 255, 51));
        btnConfima.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnConfima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/confirma.jpg"))); // NOI18N
        btnConfima.setBorder(null);
        btnConfima.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfima.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConfima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfimaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfima))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfima)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        val += "1";
        btn1.setFocusPainted(false);
        selecionar();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        val += "2";
        btn2.setFocusPainted(false);
        selecionar();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        val += "3";
        btn3.setFocusPainted(false);
        selecionar();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        val += "4";
        btn4.setFocusPainted(false);
        selecionar();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        val += "5";
        btn5.setFocusPainted(false);
        selecionar();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        val += "6";
        btn6.setFocusPainted(false);
        selecionar();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        val += "7";
        btn7.setFocusPainted(false);
        selecionar();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        val += "8";
        btn8.setFocusPainted(false);
        selecionar();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        val += "9";
        btn9.setFocusPainted(false);
        selecionar();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        val += "0";
        btn0.setFocusPainted(false);
        selecionar();
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnCorrigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrigeActionPerformed
        val = "";
        txt_nome.setText("");
        imagem.setIcon(null);
        cx1.setText("");
        cx2.setText("");
        cx3.setText("");
        cx4.setText("");
        cx5.setText("");
        Partido.setText("");
       
        //zera todos os campos
        btnCorrige.setFocusPainted(false);
    }//GEN-LAST:event_btnCorrigeActionPerformed

    private void btnConfimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfimaActionPerformed
       //Atualiza os campos verifica o voto
       consultas c = new consultas();
       btnConfima.setFocusPainted(false);
        if (txt_nome.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Digito invalido");
            val = "";
            cx1.setText("");
            cx2.setText("");
            cx3.setText("");
            cx4.setText("");
            cx5.setText("");
            Partido.setText("");
            imagem.setIcon(null); 
            
        } else {
            val = "";
            txt_nome.setText("");
            cx1.setText("");
            cx2.setText("");
            cx3.setText("");
            cx4.setText("");
            cx5.setText("");
            Partido.setText("");
            imagem.setIcon(null);
            Cargo();
            c.voto();
            //som de fim
            b.Som("fim.wav");
        }
    }//GEN-LAST:event_btnConfimaActionPerformed

    private void btnBrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrancoActionPerformed
        btnBranco.setFocusPainted(false);
        cx1.setText("");
        cx2.setText("");
        cx3.setText("");
        cx4.setText("");
        cx5.setText("");
        txt_nome.setText("");
        Cargo();
        imagem.setIcon(null);
    }//GEN-LAST:event_btnBrancoActionPerformed

    private void cx3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cx3ActionPerformed
    }//GEN-LAST:event_cx3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Candidato;
    private javax.swing.JLabel Partido;
    private javax.swing.JLabel Votar;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBranco;
    private javax.swing.JButton btnConfima;
    private javax.swing.JButton btnCorrige;
    private javax.swing.JTextField cx1;
    private javax.swing.JTextField cx2;
    private javax.swing.JTextField cx3;
    private javax.swing.JTextField cx4;
    private javax.swing.JTextField cx5;
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txt_nome;
    // End of variables declaration//GEN-END:variables
}
