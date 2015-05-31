package Telas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Tela11 extends javax.swing.JFrame {

    private long id = Tela5.id_l; 
    
    public Tela11() {
        initComponents();
        fillFields(id); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        voltar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        genero = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        isbn = new javax.swing.JTextField();
        autor = new javax.swing.JTextField();
        avaliacao = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        adicionar = new javax.swing.JButton();
        lancamento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 0));

        jPanel1.setBackground(new java.awt.Color(221, 255, 187));
        jPanel1.setPreferredSize(new java.awt.Dimension(403, 560));

        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar5.png"))); // NOI18N
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel7.setText("Avaliação:");

        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lendo", "Lido", "Abandonado", "Relendo", "Pretendo ler" }));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel4.setText("Status:");

        genero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Romance", "Ficção cientifica", "Suspense", "Aventura ", "Drama" }));
        genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel5.setText("Gênero:");

        jLabel3.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel3.setText("Autor:");

        avaliacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Péssimo", "Ruim", "Razoável", "Bom", "Ótimo" }));
        avaliacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avaliacaoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel8.setText("ISBN:");

        adicionar.setBackground(new java.awt.Color(221, 255, 187));
        adicionar.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        adicionar.setText("Salvar");
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel2.setText("Título:");

        jLabel6.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel6.setText("Lançamento:");

        jLabel9.setFont(new java.awt.Font("Aardvark Cafe", 0, 48)); // NOI18N
        jLabel9.setText("Editar Livro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(adicionar)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel8)
                                        .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(58, 58, 58)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel7)
                                        .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)
                                        .addComponent(avaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(82, 82, 82)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(avaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(4, 4, 4)
                .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adicionar)
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoActionPerformed

    }//GEN-LAST:event_generoActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed

    }//GEN-LAST:event_statusActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        Tela5 quinta = new Tela5();
        quinta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed
        Tela5 quinta = new Tela5();
        quinta.setVisible(true);
        this.dispose();
        
        String isbn = this.isbn.getText();
        String titulo = this.titulo.getText();
        String autor = this.autor.getText();
        String lancamento = this.lancamento.getText();
        String status = this.status.getSelectedItem().toString();
        String genero = this.genero.getSelectedItem().toString();
        String avaliacao = this.avaliacao.getSelectedItem().toString();
        
        alterar(isbn, titulo, autor, lancamento, status, genero, avaliacao);
    }//GEN-LAST:event_adicionarActionPerformed
       
    private void avaliacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avaliacaoActionPerformed

    }//GEN-LAST:event_avaliacaoActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Tela11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionar;
    private javax.swing.JTextField autor;
    private javax.swing.JComboBox avaliacao;
    private javax.swing.JComboBox genero;
    private javax.swing.JTextField isbn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lancamento;
    private javax.swing.JComboBox status;
    private javax.swing.JTextField titulo;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables

    private void fillFields(long id){        
        try {
            ResultSet rs;
            String comando = "SELECT * FROM livros WHERE id_livros = ?";
            Connection conn = new Conexao().doConnection();
            PreparedStatement stmt = conn.prepareStatement(comando);
            stmt.setLong(1, id);
            rs = stmt.executeQuery(); 
            
            while(rs.next()){
                titulo.setText(rs.getString("titulo"));
                autor.setText(rs.getString("autor"));
                lancamento.setText(rs.getString("lancamento"));
                isbn.setText(rs.getString("isbn"));
                status.setSelectedItem(rs.getString("status"));
                genero.setSelectedItem(rs.getString("genero"));
                avaliacao.setSelectedItem(rs.getString("avaliacao"));            
            }
           
        } catch (SQLException e) {
            System.out.println("ERRO ai "+ e.getMessage());          
        }
    }
    
    private void alterar(String isbn, String titulo, String autor, String lancamento, 
                         String status, String genero, String avaliacao){
        try {
            String comando = "UPDATE livros SET isbn = ?, titulo = ?, autor = ?, lancamento = ?"
                                            + ", status = ?, genero = ?, avaliacao = ? WHERE id_livros = ?";
            Connection conn = new Conexao().doConnection();
            PreparedStatement stmt = conn.prepareStatement(comando);
                       
            stmt.setString(1, isbn);
            stmt.setString(2, titulo);
            stmt.setString(3, autor);
            stmt.setString(4, lancamento);
            stmt.setString(5, status);
            stmt.setString(6, genero);
            stmt.setString(7, avaliacao);
            stmt.setLong  (8, id);
            
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Frescura: "+e.getMessage());
        }
    }
}