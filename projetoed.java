package projeto.de.ed;

import javax.swing.JOptionPane;


public class projetoed extends javax.swing.JFrame {
    
    Methods methods = new Methods();
    
    public projetoed() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexo = new javax.swing.ButtonGroup();
        lblNomeAtleta = new javax.swing.JLabel();
        lblPais = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        txtNomeAtleta = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnListarCadastro = new javax.swing.JButton();
        btnMediaGeral = new javax.swing.JButton();
        btnMulherMaiorAltura = new javax.swing.JButton();
        btnMediaHomensBrasileiros = new javax.swing.JButton();
        btnAutores = new javax.swing.JButton();
        btnMostrarPilha = new javax.swing.JButton();
        btnMostrarFila = new javax.swing.JButton();
        btnRetirarPilha = new javax.swing.JButton();
        btnRetirarDaFila = new javax.swing.JButton();
        spPrincipal = new javax.swing.JScrollPane();
        spPrincipaltxt = new javax.swing.JTextArea();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Campeonato Atletismo");

        lblNomeAtleta.setText("Nome do atleta:");

        lblPais.setText("Pais:");

        lblSexo.setText("Sexo:");

        lblAltura.setText("Altura:");

        txtNomeAtleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeAtletaActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnListarCadastro.setText("Listar Cadastro");
        btnListarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarCadastroActionPerformed(evt);
            }
        });

        btnMediaGeral.setText("Média Geral");
        btnMediaGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMediaGeralActionPerformed(evt);
            }
        });

        btnMulherMaiorAltura.setText("Mulher Maior Altura");
        btnMulherMaiorAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulherMaiorAlturaActionPerformed(evt);
            }
        });

        btnMediaHomensBrasileiros.setText("Média Homens Brasileiros");
        btnMediaHomensBrasileiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMediaHomensBrasileirosActionPerformed(evt);
            }
        });

        btnAutores.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAutores.setText("Autores");
        btnAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoresActionPerformed(evt);
            }
        });

        btnMostrarPilha.setText("Mostrar Pilha");
        btnMostrarPilha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPilhaActionPerformed(evt);
            }
        });

        btnMostrarFila.setText("Mostrar Fila");
        btnMostrarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarFilaActionPerformed(evt);
            }
        });

        btnRetirarPilha.setText("Retirar da pilha");
        btnRetirarPilha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarPilhaActionPerformed(evt);
            }
        });

        btnRetirarDaFila.setText("Retirar da Fila");
        btnRetirarDaFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarDaFilaActionPerformed(evt);
            }
        });

        spPrincipaltxt.setColumns(20);
        spPrincipaltxt.setRows(5);
        spPrincipal.setViewportView(spPrincipaltxt);

        bgSexo.add(rbMasculino);
        rbMasculino.setText("Masculino");

        bgSexo.add(rbFeminino);
        rbFeminino.setText("Feminino");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAltura)
                        .addGap(56, 56, 56)
                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnMostrarPilha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnListarCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMostrarFila, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMediaGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRetirarPilha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMulherMaiorAltura)
                                .addGap(18, 18, 18)
                                .addComponent(btnMediaHomensBrasileiros)
                                .addGap(18, 18, 18)
                                .addComponent(btnAutores))
                            .addComponent(btnRetirarDaFila)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblNomeAtleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbFeminino)
                            .addComponent(rbMasculino)
                            .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(spPrincipal))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeAtleta)
                    .addComponent(txtNomeAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPais, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(rbMasculino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbFeminino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAltura))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnListarCadastro)
                    .addComponent(btnMediaGeral)
                    .addComponent(btnMulherMaiorAltura)
                    .addComponent(btnMediaHomensBrasileiros)
                    .addComponent(btnAutores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarPilha)
                    .addComponent(btnMostrarFila)
                    .addComponent(btnRetirarPilha)
                    .addComponent(btnRetirarDaFila))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(spPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        setSize(new java.awt.Dimension(881, 566));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        String NomeAtleta = null;
        String Pais = null;
        char Sexo = 0;
        double Altura = 0;
        
// * Verificar se todos os campos estão preenchidos.
        
        //NOME 
        if (!txtNomeAtleta.getText().equals("")) {

            // Salva o nome do atleta numa váriavel
            NomeAtleta = txtNomeAtleta.getText();

        } else {
            
            String mensagemErro = "Erro: o campo nome do atleta não pode estar vazio..";
            JOptionPane.showMessageDialog(null, mensagemErro, "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
 //
 
        if (!txtPais.getText().equals("")) {

            // Salva o pais origem numa váriavel
            Pais = txtPais.getText();

        } else {
            String mensagemErro = "Erro: o campo país não pode estar vazio.";
            JOptionPane.showMessageDialog(null, mensagemErro, "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        if (bgSexo.getSelection() != null) {
           

            if (rbMasculino.isSelected()){
                Sexo = 'M';
            } else {
                Sexo = 'F';
            }     
       
        } else {
            
            JOptionPane.showMessageDialog(null, "Por favor, selecione o sexo.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        if (!txtAltura.getText().equals("")) {

            String alturatxt = txtAltura.getText();
            
            Altura = Double.parseDouble(alturatxt.replace(",", "."));
            
            //System.out.println(Altura);

        } else {
            
            String mensagemErro = "Erro: o campo altura não pode estar vazio.";
            JOptionPane.showMessageDialog(null, mensagemErro, "Erro", JOptionPane.ERROR_MESSAGE);
        } 
        
        methods.cadastrarAtleta(NomeAtleta, Sexo, Pais, Altura);

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoresActionPerformed
       Sobre sobre = new Sobre(this, true);
        sobre.setVisible(true);
       
    }//GEN-LAST:event_btnAutoresActionPerformed

    private void btnListarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarCadastroActionPerformed
        spPrincipaltxt.setText(methods.listarDados());
    }//GEN-LAST:event_btnListarCadastroActionPerformed

    private void txtNomeAtletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeAtletaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeAtletaActionPerformed

    private void btnMediaGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMediaGeralActionPerformed
        double Magneto = methods.calcularMedia();
        
        if (Magneto == 0){
            
        } else {
            JOptionPane.showMessageDialog(null, "A média geral dos atletas cadastrados é de: " + Magneto, "Média Geral", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnMediaGeralActionPerformed

    private void btnMulherMaiorAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulherMaiorAlturaActionPerformed

        spPrincipaltxt.setText(methods.encontrarMulherAltura());  
      
    }//GEN-LAST:event_btnMulherMaiorAlturaActionPerformed

    private void btnMediaHomensBrasileirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMediaHomensBrasileirosActionPerformed
        double Magneto = methods.calcularMediaBrasileiros();
        
        if (Magneto == 0){
            
        } else {
            JOptionPane.showMessageDialog(null, "A média geral dos atletas brasileiros é de: " + Magneto, "Média Geral", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnMediaHomensBrasileirosActionPerformed

    private void btnRetirarPilhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarPilhaActionPerformed
        spPrincipaltxt.setText("");
        
        methods.retirarPilhaMulheres();
    }//GEN-LAST:event_btnRetirarPilhaActionPerformed

    private void btnMostrarPilhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPilhaActionPerformed
        spPrincipaltxt.setText(methods.listarPilha());
    }//GEN-LAST:event_btnMostrarPilhaActionPerformed

    private void btnMostrarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarFilaActionPerformed
        spPrincipaltxt.setText(methods.listarHomens());
    }//GEN-LAST:event_btnMostrarFilaActionPerformed

    private void btnRetirarDaFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarDaFilaActionPerformed
        spPrincipaltxt.setText("");
        methods.retirarFilaHomens();
    }//GEN-LAST:event_btnRetirarDaFilaActionPerformed

    
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(projetoed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(projetoed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(projetoed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(projetoed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new projetoed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JButton btnAutores;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnListarCadastro;
    private javax.swing.JButton btnMediaGeral;
    private javax.swing.JButton btnMediaHomensBrasileiros;
    private javax.swing.JButton btnMostrarFila;
    private javax.swing.JButton btnMostrarPilha;
    private javax.swing.JButton btnMulherMaiorAltura;
    private javax.swing.JButton btnRetirarDaFila;
    private javax.swing.JButton btnRetirarPilha;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblNomeAtleta;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JScrollPane spPrincipal;
    private javax.swing.JTextArea spPrincipaltxt;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtNomeAtleta;
    private javax.swing.JTextField txtPais;
    // End of variables declaration//GEN-END:variables
}
