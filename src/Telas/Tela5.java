package Telas;

import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Tela5 extends javax.swing.JFrame {

    public static String t;
    public static long id_l = 0;
    public Tela5() {
        initComponents();
        Tela5.t = (Tela2.item);
        id_l = selectData(t);
    }
    
    private String foto;  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        voltar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        titulo_rec = new javax.swing.JLabel();
        escolher_capa = new javax.swing.JButton();
        autor_rec = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        status_rec = new javax.swing.JLabel();
        avaliacao_rec = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lancamento_rec = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        genero_rec = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        isbn_rec = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        anotacoes = new javax.swing.JButton();
        citacoes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(221, 255, 187));
        jPanel1.setPreferredSize(new java.awt.Dimension(403, 560));

        jPanel2.setBackground(new java.awt.Color(229, 234, 142));

        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar3.jpg"))); // NOI18N
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        editar.setBackground(new java.awt.Color(229, 234, 142));
        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/EDITAR.png"))); // NOI18N
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/REMOVER.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        titulo_rec.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        titulo_rec.setText("Título");

        escolher_capa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/adicionar2.jpg"))); // NOI18N
        escolher_capa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolher_capaActionPerformed(evt);
            }
        });

        autor_rec.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        autor_rec.setText("Autor");

        jLabel2.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel2.setText("Status:");

        status_rec.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        status_rec.setText("Lendo");

        avaliacao_rec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/a0.png"))); // NOI18N
        avaliacao_rec.setText("Avaliação:");

        jPanel3.setBackground(new java.awt.Color(169, 165, 117));

        jLabel3.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MAIS INFORMAÇÕES:");

        jLabel4.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lançamento: ");

        lancamento_rec.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        lancamento_rec.setForeground(new java.awt.Color(255, 255, 255));
        lancamento_rec.setText("25/12/2013");

        jLabel6.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gênero: ");

        genero_rec.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        genero_rec.setForeground(new java.awt.Color(255, 255, 255));
        genero_rec.setText("Romance");

        jLabel5.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ISBN:");

        isbn_rec.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        isbn_rec.setForeground(new java.awt.Color(255, 255, 255));
        isbn_rec.setText("0000000");

        jPanel4.setBackground(new java.awt.Color(229, 234, 142));
        jPanel4.setToolTipText("");

        anotacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ANOTAÇÕES.png"))); // NOI18N
        anotacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anotacoesActionPerformed(evt);
            }
        });

        citacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/CITAÇÕES.png"))); // NOI18N
        citacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citacoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(anotacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(citacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(citacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anotacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isbn_rec)
                            .addComponent(genero_rec)
                            .addComponent(lancamento_rec))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lancamento_rec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(genero_rec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(isbn_rec))
                .addGap(27, 27, 27)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo_rec)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(escolher_capa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(avaliacao_rec, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(autor_rec)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(status_rec)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(titulo_rec)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(autor_rec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(status_rec))
                        .addGap(18, 18, 18)
                        .addComponent(avaliacao_rec, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addComponent(escolher_capa, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void escolher_capaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolher_capaActionPerformed
        try{ 
            jFileChooser1.showOpenDialog(this);
            File arquivo = jFileChooser1.getSelectedFile();
            ImageIcon img = new ImageIcon(arquivo.getAbsolutePath());
            
            String text;
            text = arquivo.getPath();
            String newStr = text.replace('\\', '*');
            System.out.println("Tes: " + newStr);
            
            if (arquivo != null) {
                foto = (newStr);
                System.out.println(foto);
                escolher_capa.setIcon(new ImageIcon(img.getImage().getScaledInstance(escolher_capa.getWidth(),escolher_capa.getHeight(), Image.SCALE_DEFAULT))); 
                } else {
                escolher_capa.setIcon(new ImageIcon(getClass().getResource("/ViewImagens/no_photo.png")));
                foto = (escolher_capa.getIcon().toString());
                System.out.println("else:" + foto);
            }
            
                Connection conn = new Conexao().doConnection(); 
                String SQL = "UPDATE livros SET imagem = '"+foto+"' WHERE titulo= '"+t+"'";
                
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(SQL);
                
                stmt.close();
                conn.close();
           
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
      
    }//GEN-LAST:event_escolher_capaActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        Tela2 segunda = new Tela2();
        segunda.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        deletar(id_l);     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        Tela11 decima1 = new Tela11();
        decima1.setVisible(true);
        this.dispose();       
    }//GEN-LAST:event_editarActionPerformed

    private void anotacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anotacoesActionPerformed
        Tela8 oitava = new Tela8();
        oitava.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_anotacoesActionPerformed

    private void citacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citacoesActionPerformed
        Tela9 nona = new Tela9();
        nona.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_citacoesActionPerformed

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
            java.util.logging.Logger.getLogger(Tela5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela5().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anotacoes;
    private javax.swing.JLabel autor_rec;
    private javax.swing.JLabel avaliacao_rec;
    private javax.swing.JButton citacoes;
    private javax.swing.JButton editar;
    private javax.swing.JButton escolher_capa;
    private javax.swing.JLabel genero_rec;
    private javax.swing.JLabel isbn_rec;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lancamento_rec;
    private javax.swing.JLabel status_rec;
    private javax.swing.JLabel titulo_rec;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables

    private long selectData(String t){
        long id = 0;
        
        try {
            String comando          = "SELECT * FROM livros WHERE titulo = ?";
            Connection con          = new  Conexao().doConnection();
            PreparedStatement stmt  = con.prepareStatement(comando);
            stmt.setString(1, t);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
               int id_livro         = rs.getInt("id_livros");
               String isbn          = rs.getString("isbn"); 
               String titulo        = rs.getString("titulo");
               String autor         = rs.getString("autor");
               String status        = rs.getString("status");
               String lancamento    = rs.getString("lancamento");
               String genero        = rs.getString("genero");
               String avaliacao     = rs.getString("avaliacao");
               String imagem        = rs.getString("imagem");
                              
               fillLabels(titulo, autor, status, avaliacao, lancamento, genero, isbn, imagem);
               id = id_livro; 
            }
                      
        } catch (Exception e) {
            System.out.println(" errado :(");
        }
        return  id;
    }
    
    private void fillLabels(String titulo, String autor, String status, String avaliacao,
                           String lancamento, String genero, String isbn, String imagem){
               
        this.titulo_rec.setText(titulo);
        this.autor_rec.setText(autor);
        this.status_rec.setText(status);
        this.lancamento_rec.setText(lancamento);
        this.genero_rec.setText(genero);
        this.isbn_rec.setText(isbn);
                
        if(imagem == null){
            this.escolher_capa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/adicionar2.jpg")));
        }else{
            imagem = imagem.replace('*', '\\');
            ImageIcon img;
            img = new ImageIcon(imagem);
            this.escolher_capa.setIcon(new ImageIcon(img.getImage().getScaledInstance(escolher_capa.getWidth(),escolher_capa.getHeight(),Image.SCALE_DEFAULT)));
        }
        
        if(avaliacao.equals("Péssimo")){
            avaliacao_rec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/a0.png")));
        }
        else if(avaliacao.equals("Ruim")){            
            avaliacao_rec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/a1.png")));
        }
        else if(avaliacao.equals("Razoável")){
            avaliacao_rec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/a2.png")));
        }
        else if(avaliacao.equals("Bom")){           
            avaliacao_rec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/a3.png")));
        }
        else if(avaliacao.equals("Ótimo")){   
            avaliacao_rec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/a4.png")));
        }
        else if(avaliacao.equals("Perfeito")){
            avaliacao_rec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/a5.png")));
        }
    }

    private void deletar(long id) {
        int op  = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja exculir esse livro?","Excluir" ,JOptionPane.YES_NO_OPTION);
        if(op == 0){
            try {
                String comando1 = "DELETE FROM livros WHERE id_livros = ?";
                String comando2 = "DELETE FROM anotacao WHERE titulo = '"+t+"'";
                String comando3 = "DELETE FROM citacao WHERE titulo = '"+t+"'";
                Connection conn = new Conexao().doConnection();           
                PreparedStatement stmt = conn.prepareStatement(comando1);
                PreparedStatement stmm = conn.prepareStatement(comando2);
                PreparedStatement smtt = conn.prepareStatement(comando3);

                stmt.setLong(1, id);

                stmt.executeUpdate();
                stmm.executeUpdate();
                smtt.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Livro excluido com sucesso!", "", JOptionPane.PLAIN_MESSAGE);
                new Tela2().setVisible(true);
                this.dispose();
            } catch (Exception e) {
                System.out.println("Algo está eimpedindo que você exclua este livro");
            }
        }    
    }

    private void editar(long id){
        String comando = "UPDATE livros SET ";
        try {
            Connection conn = new Conexao().doConnection();
            PreparedStatement stmt = conn.prepareStatement(comando);
            stmt.executeUpdate();
        } catch (Exception e) {
        }   
    } 
}