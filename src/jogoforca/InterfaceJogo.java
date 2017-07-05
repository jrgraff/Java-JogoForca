package jogoforca;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class InterfaceJogo extends javax.swing.JFrame {

    private Ranking ranking;
    private Jogo jogo;
    private Palavra palavra;
    
    public InterfaceJogo(Jogo j, Palavra p) throws FileNotFoundException {
        ranking = new Ranking();
        
        this.jogo = j;
        this.palavra = p;
        
        initComponents();
        
        this.setVida(jogo.getVida());
        this.txtJogoPalavra.setText(jogo.getPalavraOculta());
        this.txtJogoDica.setText(j.getDica());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jogoVerificar = new javax.swing.JButton();
        txtJogoPalavra = new javax.swing.JLabel();
        txtJogoDica = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        inputJogoLetra = new javax.swing.JTextField();
        txtJogoErros = new javax.swing.JLabel();
        life1 = new javax.swing.JLabel();
        life2 = new javax.swing.JLabel();
        life3 = new javax.swing.JLabel();
        life4 = new javax.swing.JLabel();
        life5 = new javax.swing.JLabel();
        life6 = new javax.swing.JLabel();
        life7 = new javax.swing.JLabel();
        life8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(450, 400));
        setMinimumSize(new java.awt.Dimension(450, 400));
        setPreferredSize(new java.awt.Dimension(450, 401));
        setResizable(false);
        getContentPane().setLayout(null);

        jogoVerificar.setText("Verificar");
        jogoVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogoVerificarActionPerformed(evt);
            }
        });
        getContentPane().add(jogoVerificar);
        jogoVerificar.setBounds(340, 360, 100, 31);

        txtJogoPalavra.setFont(new java.awt.Font("Purisa", 1, 20)); // NOI18N
        txtJogoPalavra.setForeground(new java.awt.Color(254, 254, 254));
        txtJogoPalavra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtJogoPalavra.setText("-- -----");
        getContentPane().add(txtJogoPalavra);
        txtJogoPalavra.setBounds(0, 250, 420, 80);

        txtJogoDica.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        txtJogoDica.setText("Label dica");
        getContentPane().add(txtJogoDica);
        txtJogoDica.setBounds(50, 360, 180, 30);

        jLabel13.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel13.setText("Dica:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 360, 34, 30);

        inputJogoLetra.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        getContentPane().add(inputJogoLetra);
        inputJogoLetra.setBounds(280, 360, 50, 30);

        txtJogoErros.setFont(new java.awt.Font("Purisa", 1, 16)); // NOI18N
        txtJogoErros.setForeground(new java.awt.Color(244, 244, 244));
        txtJogoErros.setText(".");
        getContentPane().add(txtJogoErros);
        txtJogoErros.setBounds(0, 10, 160, 40);

        life1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoforca/img/life.png"))); // NOI18N
        getContentPane().add(life1);
        life1.setBounds(310, 40, 20, 20);

        life2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoforca/img/life.png"))); // NOI18N
        getContentPane().add(life2);
        life2.setBounds(320, 20, 20, 20);

        life3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoforca/img/life.png"))); // NOI18N
        getContentPane().add(life3);
        life3.setBounds(340, 40, 20, 20);

        life4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoforca/img/life.png"))); // NOI18N
        getContentPane().add(life4);
        life4.setBounds(350, 20, 20, 20);

        life5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoforca/img/life.png"))); // NOI18N
        getContentPane().add(life5);
        life5.setBounds(370, 40, 20, 20);

        life6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoforca/img/life.png"))); // NOI18N
        getContentPane().add(life6);
        life6.setBounds(380, 20, 20, 20);

        life7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoforca/img/life.png"))); // NOI18N
        getContentPane().add(life7);
        life7.setBounds(400, 40, 20, 20);

        life8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoforca/img/life.png"))); // NOI18N
        getContentPane().add(life8);
        life8.setBounds(410, 20, 20, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoforca/img/bg.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 425, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setVida(int vida)
    {
        ArrayList<JLabel> life = new ArrayList<>();
        
        life.add(this.life1);
        life.add(this.life2);
        life.add(this.life3);
        life.add(this.life4);
        life.add(this.life5);
        life.add(this.life6);
        life.add(this.life7);
        life.add(this.life8);
        
        for(int i = 0; i < 8; i++){
            if(vida > i)
                life.get(i).setVisible(true);
            else
                life.get(i).setVisible(false);
        }
        
    }
    
    private void jogoVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogoVerificarActionPerformed
        try{
            if(palavra.contemEmPalavra(this.inputJogoLetra.getText().toUpperCase(), jogo.getPalavra())){
                palavra.atualizaPalavraOculta(jogo, this.inputJogoLetra.getText().toUpperCase().charAt(0));
                this.txtJogoPalavra.setText(jogo.getPalavraOculta());
                this.inputJogoLetra.setText("");
                if(jogo.getPalavraOculta().equals(jogo.getPalavra())){
                    jogo.setPontuacao();
                    ranking.atualizaRanking(jogo);
                    JOptionPane.showMessageDialog(null, "Weee! Voce ganhou :)\nSua pontuação foi: " + jogo.getPontuacao(), "Vitória", WIDTH);
                    this.setVisible(false);
                }
            } else{
                this.txtJogoErros.setText(this.txtJogoErros.getText() + this.inputJogoLetra.getText().toUpperCase() + "-");
                this.inputJogoLetra.setText("");
                jogo.setVida(jogo.getVida()-1);
                this.setVida(jogo.getVida());
                if(jogo.getVida() <= 0){
                    JOptionPane.showMessageDialog(null, "Oh! Voce perdeu :(\nA palavra era " + jogo.getPalavra(), "Derrota", WIDTH);
                    this.setVisible(false);
                }
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Digite uma letra válida", "Erro", WIDTH);
        }
    }//GEN-LAST:event_jogoVerificarActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputJogoLetra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JButton jogoVerificar;
    private javax.swing.JLabel life1;
    private javax.swing.JLabel life2;
    private javax.swing.JLabel life3;
    private javax.swing.JLabel life4;
    private javax.swing.JLabel life5;
    private javax.swing.JLabel life6;
    private javax.swing.JLabel life7;
    private javax.swing.JLabel life8;
    private javax.swing.JLabel txtJogoDica;
    private javax.swing.JLabel txtJogoErros;
    private javax.swing.JLabel txtJogoPalavra;
    // End of variables declaration//GEN-END:variables
}
