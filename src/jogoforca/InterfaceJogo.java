/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoforca;
/**
 *
 * @author jgrasis
 */
public class InterfaceJogo extends javax.swing.JFrame {

    /**
     * Creates new form NovoJFrame
     */
    public InterfaceJogo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtJogoPalavra = new javax.swing.JLabel();
        life8 = new javax.swing.JLabel();
        life3 = new javax.swing.JLabel();
        life6 = new javax.swing.JLabel();
        life1 = new javax.swing.JLabel();
        life5 = new javax.swing.JLabel();
        life4 = new javax.swing.JLabel();
        life2 = new javax.swing.JLabel();
        life7 = new javax.swing.JLabel();
        buttonVerificar = new javax.swing.JButton();
        txtJogoLetra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtJogoDica = new javax.swing.JLabel();

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoforca/img/bg.gif"))); // NOI18N

        setTitle("Jogo da Forca - Jogo");
        setPreferredSize(new java.awt.Dimension(423, 389));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 120, 0, 0);

        txtJogoPalavra.setFont(new java.awt.Font("Purisa", 1, 24)); // NOI18N
        txtJogoPalavra.setForeground(new java.awt.Color(254, 254, 254));
        txtJogoPalavra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtJogoPalavra.setText("-- -----");
        getContentPane().add(txtJogoPalavra);
        txtJogoPalavra.setBounds(0, 250, 420, 80);

        life8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoforca/img/life.png"))); // NOI18N
        getContentPane().add(life8);
        life8.setBounds(390, 10, 20, 20);

        life3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoforca/img/life.png"))); // NOI18N
        getContentPane().add(life3);
        life3.setBounds(320, 30, 20, 20);

        life6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoforca/img/life.png"))); // NOI18N
        getContentPane().add(life6);
        life6.setBounds(360, 10, 20, 20);

        life1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoforca/img/life.png"))); // NOI18N
        getContentPane().add(life1);
        life1.setBounds(290, 30, 20, 20);

        life5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoforca/img/life.png"))); // NOI18N
        getContentPane().add(life5);
        life5.setBounds(350, 30, 20, 20);

        life4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoforca/img/life.png"))); // NOI18N
        getContentPane().add(life4);
        life4.setBounds(330, 10, 20, 20);

        life2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoforca/img/life.png"))); // NOI18N
        getContentPane().add(life2);
        life2.setBounds(300, 10, 20, 20);

        life7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoforca/img/life.png"))); // NOI18N
        getContentPane().add(life7);
        life7.setBounds(380, 30, 20, 20);

        buttonVerificar.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        buttonVerificar.setText("Verificar");
        buttonVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVerificarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonVerificar);
        buttonVerificar.setBounds(330, 350, 90, 30);

        txtJogoLetra.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        getContentPane().add(txtJogoLetra);
        txtJogoLetra.setBounds(280, 350, 50, 30);

        jLabel2.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(244, 244, 244));
        jLabel2.setText("A-B-C-D-E-F-G");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 10, 160, 40);

        jLabel13.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel13.setText("Dica:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 350, 34, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoforca/img/bg.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 420, 340);

        txtJogoDica.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        txtJogoDica.setText("Label dica");
        getContentPane().add(txtJogoDica);
        txtJogoDica.setBounds(50, 350, 120, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVerificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonVerificarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel life1;
    private javax.swing.JLabel life2;
    private javax.swing.JLabel life3;
    private javax.swing.JLabel life4;
    private javax.swing.JLabel life5;
    private javax.swing.JLabel life6;
    private javax.swing.JLabel life7;
    private javax.swing.JLabel life8;
    private javax.swing.JLabel txtJogoDica;
    private javax.swing.JTextField txtJogoLetra;
    private javax.swing.JLabel txtJogoPalavra;
    // End of variables declaration//GEN-END:variables
}
