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
public class InterfaceMain extends javax.swing.JFrame {

    /**
     * Creates new form NovoJFrame
     */
    public InterfaceMain() {
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

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPalavra = new javax.swing.JTextField();
        txtPalavraDica = new javax.swing.JTextField();
        buttonPalavraCadastrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtPalavraCategoria = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPalavra1 = new javax.swing.JTextField();
        buttonPalavraCadastrar1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtPalavraCategoria1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Forca - Menu");
        setMaximumSize(new java.awt.Dimension(800, 480));
        setMinimumSize(new java.awt.Dimension(800, 480));
        setModalExclusionType(null);
        setName("interfaceMain"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Purisa", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Palavra:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(570, 230, 80, 22);

        jLabel7.setFont(new java.awt.Font("Purisa", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Dica:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(580, 270, 70, 22);

        txtPalavra.setFont(new java.awt.Font("Purisa", 0, 12)); // NOI18N
        getContentPane().add(txtPalavra);
        txtPalavra.setBounds(650, 220, 140, 32);

        txtPalavraDica.setFont(new java.awt.Font("Purisa", 0, 12)); // NOI18N
        getContentPane().add(txtPalavraDica);
        txtPalavraDica.setBounds(650, 260, 140, 32);

        buttonPalavraCadastrar.setFont(new java.awt.Font("Purisa", 0, 12)); // NOI18N
        buttonPalavraCadastrar.setText("Cadastrar");
        buttonPalavraCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPalavraCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPalavraCadastrar);
        buttonPalavraCadastrar.setBounds(650, 300, 90, 36);

        jLabel8.setFont(new java.awt.Font("Purisa", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Categoria:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(550, 190, 100, 22);

        txtPalavraCategoria.setFont(new java.awt.Font("Purisa", 0, 12)); // NOI18N
        getContentPane().add(txtPalavraCategoria);
        txtPalavraCategoria.setBounds(648, 180, 140, 32);

        jLabel1.setFont(new java.awt.Font("Purisa", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("1: player 1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(290, 200, 200, 29);

        jLabel9.setFont(new java.awt.Font("Purisa", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText(": Categoria");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(140, 240, 90, 22);

        jLabel10.setFont(new java.awt.Font("Purisa", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText(": Dificuldade");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(70, 280, 100, 22);

        txtPalavra1.setFont(new java.awt.Font("Purisa", 0, 12)); // NOI18N
        getContentPane().add(txtPalavra1);
        txtPalavra1.setBounds(0, 230, 140, 32);

        buttonPalavraCadastrar1.setFont(new java.awt.Font("Purisa", 0, 12)); // NOI18N
        buttonPalavraCadastrar1.setText("Iniciar");
        buttonPalavraCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPalavraCadastrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPalavraCadastrar1);
        buttonPalavraCadastrar1.setBounds(50, 310, 90, 36);

        jLabel11.setFont(new java.awt.Font("Purisa", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText(": Jogador");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(140, 200, 100, 22);

        txtPalavraCategoria1.setFont(new java.awt.Font("Purisa", 0, 12)); // NOI18N
        getContentPane().add(txtPalavraCategoria1);
        txtPalavraCategoria1.setBounds(0, 190, 140, 32);

        jLabel3.setFont(new java.awt.Font("Purisa", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Iniciar Novo Jogo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 160, 200, 29);

        jComboBox2.setFont(new java.awt.Font("Purisa", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(10, 270, 60, 30);

        jLabel5.setFont(new java.awt.Font("Purisa", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("RANKING");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(290, 40, 200, 43);

        jLabel2.setFont(new java.awt.Font("Purisa", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Adicionar Palavras");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(570, 150, 200, 29);

        jLabel4.setFont(new java.awt.Font("Purisa", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("1: player 1");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(290, 80, 200, 29);

        jLabel12.setFont(new java.awt.Font("Purisa", 1, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("1: player 1");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(290, 110, 200, 29);

        jLabel13.setFont(new java.awt.Font("Purisa", 1, 16)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("1: player 1");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(290, 140, 200, 29);

        jLabel14.setFont(new java.awt.Font("Purisa", 1, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("1: player 1");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(290, 170, 200, 29);

        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPalavraCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPalavraCadastrarActionPerformed
        Palavras p = new Palavras();
        p.AdicionarPalavra(txtPalavraCategoria.getText(), txtPalavra.getText(), txtPalavraDica.getText());
    }//GEN-LAST:event_buttonPalavraCadastrarActionPerformed

    private void buttonPalavraCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPalavraCadastrar1ActionPerformed
        InterfaceJogo j = new InterfaceJogo();
        j.show();
    }//GEN-LAST:event_buttonPalavraCadastrar1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPalavraCadastrar;
    private javax.swing.JButton buttonPalavraCadastrar1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtPalavra;
    private javax.swing.JTextField txtPalavra1;
    private javax.swing.JTextField txtPalavraCategoria;
    private javax.swing.JTextField txtPalavraCategoria1;
    private javax.swing.JTextField txtPalavraDica;
    // End of variables declaration//GEN-END:variables
}
