package jogoforca;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class InterfaceMain extends javax.swing.JFrame {
    private Jogo jogo;
    private Palavra palavra;
    private Jogador jogador;
    
    public InterfaceMain() {
        initComponents();
        palavra = new Palavra();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inputPalavra = new javax.swing.JTextField();
        inputPalavraDica = new javax.swing.JTextField();
        buttonPalavraCadastrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        inputPalavraCategoria = new javax.swing.JTextField();
        txtRanking5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        inputMainCategoria = new javax.swing.JTextField();
        buttonPalavraCadastrar1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        inputMainJogador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRanking1 = new javax.swing.JLabel();
        txtRanking2 = new javax.swing.JLabel();
        txtRanking3 = new javax.swing.JLabel();
        txtRanking4 = new javax.swing.JLabel();
        txtMainAtualizar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Forca - Menu");
        setMaximumSize(new java.awt.Dimension(800, 480));
        setMinimumSize(new java.awt.Dimension(800, 480));
        setModalExclusionType(null);
        setName("interfaceMain"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 481));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Purisa", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(181, 82, 11));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Palavra:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(570, 190, 80, 20);

        jLabel7.setFont(new java.awt.Font("Purisa", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(181, 82, 11));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Dica:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(580, 230, 70, 20);

        inputPalavra.setFont(new java.awt.Font("Purisa", 0, 11)); // NOI18N
        inputPalavra.setForeground(new java.awt.Color(72, 84, 101));
        getContentPane().add(inputPalavra);
        inputPalavra.setBounds(650, 180, 140, 30);

        inputPalavraDica.setFont(new java.awt.Font("Purisa", 0, 11)); // NOI18N
        inputPalavraDica.setForeground(new java.awt.Color(72, 84, 101));
        getContentPane().add(inputPalavraDica);
        inputPalavraDica.setBounds(650, 220, 140, 30);

        buttonPalavraCadastrar.setFont(new java.awt.Font("Purisa", 0, 11)); // NOI18N
        buttonPalavraCadastrar.setForeground(new java.awt.Color(72, 84, 101));
        buttonPalavraCadastrar.setText("Cadastrar");
        buttonPalavraCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPalavraCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPalavraCadastrar);
        buttonPalavraCadastrar.setBounds(650, 260, 110, 34);

        jLabel8.setFont(new java.awt.Font("Purisa", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(181, 82, 11));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Categoria:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(550, 150, 100, 20);

        inputPalavraCategoria.setFont(new java.awt.Font("Purisa", 0, 11)); // NOI18N
        inputPalavraCategoria.setForeground(new java.awt.Color(72, 84, 101));
        getContentPane().add(inputPalavraCategoria);
        inputPalavraCategoria.setBounds(650, 140, 140, 30);

        txtRanking5.setFont(new java.awt.Font("Purisa", 1, 13)); // NOI18N
        txtRanking5.setForeground(new java.awt.Color(181, 82, 11));
        txtRanking5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRanking5.setText("5. player 2");
        getContentPane().add(txtRanking5);
        txtRanking5.setBounds(220, 200, 360, 24);

        jLabel9.setFont(new java.awt.Font("Purisa", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(181, 82, 11));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText(": Categoria");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(150, 200, 90, 20);

        jLabel10.setFont(new java.awt.Font("Purisa", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(181, 82, 11));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText(": Dificuldade");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(80, 240, 100, 20);

        inputMainCategoria.setFont(new java.awt.Font("Purisa", 0, 11)); // NOI18N
        inputMainCategoria.setForeground(new java.awt.Color(72, 84, 101));
        inputMainCategoria.setText("Geral");
        getContentPane().add(inputMainCategoria);
        inputMainCategoria.setBounds(10, 190, 140, 30);

        buttonPalavraCadastrar1.setFont(new java.awt.Font("Purisa", 0, 11)); // NOI18N
        buttonPalavraCadastrar1.setForeground(new java.awt.Color(72, 84, 101));
        buttonPalavraCadastrar1.setText("Iniciar");
        buttonPalavraCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPalavraCadastrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPalavraCadastrar1);
        buttonPalavraCadastrar1.setBounds(60, 270, 90, 34);

        jLabel11.setFont(new java.awt.Font("Purisa", 0, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(181, 82, 11));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText(": Jogador");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(150, 160, 100, 20);

        inputMainJogador.setFont(new java.awt.Font("Purisa", 0, 11)); // NOI18N
        inputMainJogador.setForeground(new java.awt.Color(72, 84, 101));
        inputMainJogador.setText("Player 1");
        getContentPane().add(inputMainJogador);
        inputMainJogador.setBounds(10, 150, 140, 30);

        jLabel3.setFont(new java.awt.Font("Purisa", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(73, 32, 2));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Iniciar Novo Jogo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 120, 200, 29);

        jComboBox2.setFont(new java.awt.Font("Purisa", 0, 11)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(72, 84, 101));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(20, 230, 60, 30);

        jLabel5.setFont(new java.awt.Font("Purisa", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(73, 32, 2));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("RANKING");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(300, 40, 200, 43);

        jLabel2.setFont(new java.awt.Font("Purisa", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(73, 32, 2));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Adicionar Palavras");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(570, 110, 200, 29);

        txtRanking1.setFont(new java.awt.Font("Purisa", 1, 13)); // NOI18N
        txtRanking1.setForeground(new java.awt.Color(181, 82, 11));
        txtRanking1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRanking1.setText("1. player 1");
        getContentPane().add(txtRanking1);
        txtRanking1.setBounds(220, 80, 360, 24);

        txtRanking2.setFont(new java.awt.Font("Purisa", 1, 13)); // NOI18N
        txtRanking2.setForeground(new java.awt.Color(181, 82, 11));
        txtRanking2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRanking2.setText("2. player 2");
        getContentPane().add(txtRanking2);
        txtRanking2.setBounds(220, 110, 360, 24);

        txtRanking3.setFont(new java.awt.Font("Purisa", 1, 13)); // NOI18N
        txtRanking3.setForeground(new java.awt.Color(181, 82, 11));
        txtRanking3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRanking3.setText("3. player 1");
        getContentPane().add(txtRanking3);
        txtRanking3.setBounds(220, 140, 360, 24);

        txtRanking4.setFont(new java.awt.Font("Purisa", 1, 13)); // NOI18N
        txtRanking4.setForeground(new java.awt.Color(181, 82, 11));
        txtRanking4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRanking4.setText("4. player 5");
        getContentPane().add(txtRanking4);
        txtRanking4.setBounds(220, 170, 360, 24);

        txtMainAtualizar.setFont(new java.awt.Font("Noto Sans", 0, 10)); // NOI18N
        txtMainAtualizar.setForeground(new java.awt.Color(72, 50, 77));
        txtMainAtualizar.setText("Atualizar");
        txtMainAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMainAtualizarMouseClicked(evt);
            }
        });
        getContentPane().add(txtMainAtualizar);
        txtMainAtualizar.setBounds(340, 20, 60, 14);

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(72, 50, 77));
        jLabel4.setText("Resetar");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(420, 20, 50, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoforca/img/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 480);

        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[])
    {
        // <editor-fold defaultstate="collapsed" desc="Generated Main">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceMain().setVisible(true);
            }
        });
    }

    private void buttonPalavraCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPalavraCadastrarActionPerformed
        String mensagem;
        String titulo;
        if(!inputPalavraCategoria.getText().isEmpty() && !inputPalavra.getText().isEmpty() && !inputPalavraDica.getText().isEmpty()){
            palavra.adicionarPalavra(inputPalavraCategoria.getText(), inputPalavra.getText(), inputPalavraDica.getText());
            this.inputPalavraCategoria.setText("");
            this.inputPalavra.setText("");
            this.inputPalavraDica.setText("");
            
            
            mensagem = "Palavra Adicionada";
            titulo = "Sucesso";
        } else{
            titulo = "Erro";
            mensagem = "Verifique se todas as caixas estão preenchidas corretamente";
        }
        JOptionPane.showMessageDialog(null, mensagem, titulo, WIDTH);
    }//GEN-LAST:event_buttonPalavraCadastrarActionPerformed

    private void buttonPalavraCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPalavraCadastrar1ActionPerformed
        if(this.inputMainJogador.getText().length() > 0){
            try {
                jogador = new Jogador(this.inputMainJogador.getText());
                jogo = new Jogo(jogador, this.inputMainCategoria.getText(), this.jComboBox2.getSelectedIndex()+1);
                
                InterfaceJogo iJogo = new InterfaceJogo(jogo, palavra);
                iJogo.setVisible(true);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Um erro aconteceu", "Erro", WIDTH);
                System.out.println(ex);
            }
        } else
            JOptionPane.showMessageDialog(null, "Digite um nome para o jogador", "Erro", WIDTH);
    }//GEN-LAST:event_buttonPalavraCadastrar1ActionPerformed

    private void txtMainAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMainAtualizarMouseClicked
        Ranking r = new Ranking();
        ArrayList<JLabel> txtRanking = new ArrayList<>();
        txtRanking.add(this.txtRanking1);
        txtRanking.add(this.txtRanking2);
        txtRanking.add(this.txtRanking3);
        txtRanking.add(this.txtRanking4);
        txtRanking.add(this.txtRanking5);
        
        for(int i = 1; i<6; i++){
            if(!r.getRanking(i).contains("null")){
                txtRanking.get(i-1).setText(r.getRanking(i) + " pts\n");
                txtRanking.get(i-1).setVisible(true);
            }else
                txtRanking.get(i-1).setVisible(false);
        }
    }//GEN-LAST:event_txtMainAtualizarMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        txtMainAtualizarMouseClicked(null);
    }//GEN-LAST:event_formWindowActivated

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Ranking r = new Ranking();
        try {
            r.resetRanking();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Um erro aconteceu", "Erro", WIDTH);
            System.out.println(ex);
        }
        txtMainAtualizarMouseClicked(null);
    }//GEN-LAST:event_jLabel4MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPalavraCadastrar;
    private javax.swing.JButton buttonPalavraCadastrar1;
    private javax.swing.JTextField inputMainCategoria;
    private javax.swing.JTextField inputMainJogador;
    private javax.swing.JTextField inputPalavra;
    private javax.swing.JTextField inputPalavraCategoria;
    private javax.swing.JTextField inputPalavraDica;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel txtMainAtualizar;
    private javax.swing.JLabel txtRanking1;
    private javax.swing.JLabel txtRanking2;
    private javax.swing.JLabel txtRanking3;
    private javax.swing.JLabel txtRanking4;
    private javax.swing.JLabel txtRanking5;
    // End of variables declaration//GEN-END:variables
}
