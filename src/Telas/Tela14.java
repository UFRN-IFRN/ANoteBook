package Telas;

import static Telas.Tela13.idAnot;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Tela14 extends javax.swing.JFrame {

    public Tela14() {
        initComponents();
        setando();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pagina = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        citacao = new javax.swing.JTextArea();
        salvar_citacao = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        voltar1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        data = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        anotacao = new javax.swing.JTextArea();
        salvar_citacao1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(198, 222, 160));

        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar1.jpg"))); // NOI18N
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/nova_c1.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel2.setText("Página: ");

        pagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paginaActionPerformed(evt);
            }
        });

        citacao.setColumns(20);
        citacao.setRows(5);
        jScrollPane1.setViewportView(citacao);

        salvar_citacao.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        salvar_citacao.setText("Salvar");
        salvar_citacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_citacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(pagina, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(salvar_citacao)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 42, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagina, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salvar_citacao)
                .addGap(29, 29, 29))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(221, 255, 187));

        voltar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar5.png"))); // NOI18N
        voltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel4.setText("Data");

        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });

        anotacao.setColumns(20);
        anotacao.setRows(5);
        jScrollPane2.setViewportView(anotacao);

        salvar_citacao1.setBackground(new java.awt.Color(221, 255, 187));
        salvar_citacao1.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        salvar_citacao1.setText("Salvar");
        salvar_citacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_citacao1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Aardvark Cafe", 0, 48)); // NOI18N
        jLabel3.setText("Editar Anotação");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(salvar_citacao1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 45, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(voltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(voltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(91, 91, 91)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(salvar_citacao1)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        Tela9 nona = new Tela9();
        nona.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void paginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paginaActionPerformed

    }//GEN-LAST:event_paginaActionPerformed

    private void salvar_citacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_citacaoActionPerformed
        
    }//GEN-LAST:event_salvar_citacaoActionPerformed

    private void voltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar1ActionPerformed
        Tela8 oitava = new Tela8();
        oitava.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltar1ActionPerformed

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed

    }//GEN-LAST:event_dataActionPerformed

    private void salvar_citacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_citacao1ActionPerformed
        String varData = data.getText();
        String vartexto = anotacao.getText();
        String vartitulo = Tela5.t = (Tela2.item);
        String comando = "UPDATE anotacao SET data = '"+varData+"', texto = '"+vartexto+"' WHERE id_anotacao ="+idAnot;

        try {
            Connection conn = new Conexao().doConnection();
            Statement stmt = conn.createStatement();
            int retorno = stmt.executeUpdate(comando);

            if (retorno == 1){
                JOptionPane.showMessageDialog(rootPane, "Anotação atualizada com sucesso!");
                Tela8 nona = new Tela8();
                nona.setVisible(true);
                this.dispose();
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro ao atualizar anotação. Tente novamente mais tarde!");
                Tela8 nona = new Tela8();
                nona.setVisible(true);
                this.dispose();
            }

            stmt.close();
            conn.close();

        } catch (Exception ex) {
            Logger.getLogger(Tela7.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_salvar_citacao1ActionPerformed

    public void setando(){
        ResultSet rs;
        String comando = "SELECT data FROM anotacao WHERE id_anotacao = "+idAnot;
        
        ArrayList<String> lista_data = new ArrayList<>();
        try {
            Connection conn = new Conexao().doConnection();
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(comando);

            while (rs.next()){
                String t = rs.getString("data");         
                lista_data.add(t);
            }
            
            pegandoCitacao(lista_data);
            
            stmt.close();
            rs.close();
            conn.close();
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }  
    }
    
    public void pegandoCitacao(ArrayList <String> lista_data){
        ResultSet rs;
        String comando = "SELECT texto FROM anotacao WHERE id_anotacao = "+idAnot;
        ArrayList<String> lista_texto = new ArrayList<>();
        
        try {
            Connection conn = new Conexao().doConnection();
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(comando);
             
            while (rs.next()){
                String t = rs.getString("texto");         
                lista_texto.add(t);
            }
            
            data.setText(lista_data.get(0));
            anotacao.setText(lista_texto.get(0));
            anotacao.setLineWrap(true);
            
            stmt.close();
            rs.close();
            conn.close();
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }  
    }
    
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
            java.util.logging.Logger.getLogger(Tela14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela14().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea anotacao;
    private javax.swing.JTextArea citacao;
    private javax.swing.JTextField data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField pagina;
    private javax.swing.JButton salvar_citacao;
    private javax.swing.JButton salvar_citacao1;
    private javax.swing.JButton voltar;
    private javax.swing.JButton voltar1;
    // End of variables declaration//GEN-END:variables
}
