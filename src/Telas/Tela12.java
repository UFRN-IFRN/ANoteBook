package Telas;

import static Telas.Tela10.id;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Tela12 extends javax.swing.JFrame {

    public Tela12() {
        initComponents();
        
        setando();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        voltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pagina = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        citacao = new javax.swing.JTextArea();
        salvar_citacao = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(221, 255, 187));

        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar5.png"))); // NOI18N
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

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

        salvar_citacao.setBackground(new java.awt.Color(221, 255, 187));
        salvar_citacao.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        salvar_citacao.setText("Salvar");
        salvar_citacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_citacaoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Aardvark Cafe", 0, 48)); // NOI18N
        jLabel3.setText(" Editar Citação");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(pagina, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(salvar_citacao)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagina, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(salvar_citacao)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        String varpage = pagina.getText();
        String vartexto = citacao.getText();
        String vartitulo = Tela5.t = (Tela2.item);
        String comando = "UPDATE citacao SET num_page = '"+varpage+"', texto = '"+vartexto+"' WHERE id_citacao ="+id;

        try {
            Connection conn = new Conexao().doConnection();
            Statement stmt = conn.createStatement();
            int retorno = stmt.executeUpdate(comando);

            if (retorno == 1){
                JOptionPane.showMessageDialog(rootPane, "Citação adicionada com sucesso!");
                Tela9 nona = new Tela9();
                nona.setVisible(true);
                this.dispose();
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro ao adicionar citação. Tente novamente mais tarde!");
                Tela9 nona = new Tela9();
                nona.setVisible(true);
                this.dispose();
            }

            stmt.close();
            conn.close();

        } catch (Exception ex) {
            Logger.getLogger(Tela7.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_salvar_citacaoActionPerformed

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
            java.util.logging.Logger.getLogger(Tela12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea citacao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pagina;
    private javax.swing.JButton salvar_citacao;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
    public void setando(){
        ResultSet rs;
        String comando = "SELECT num_page FROM citacao WHERE id_citacao = "+id;
        
        ArrayList<String> lista_page = new ArrayList<>();
        try {
            Connection conn = new Conexao().doConnection();
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(comando);
             
            
            while (rs.next()){
                String t = rs.getString("num_page");         
                lista_page.add(t);
            }
            
            pegandoCitacao(lista_page);
            
            stmt.close();
            rs.close();
            conn.close();
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }  
    }
    
    public void pegandoCitacao(ArrayList <String> lista_page){
        ResultSet rs;
        String comando = "SELECT texto FROM citacao WHERE id_citacao = "+id;
        ArrayList<String> lista_texto = new ArrayList<>();
        
        try {
            Connection conn = new Conexao().doConnection();
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(comando);
             
            while (rs.next()){
                String t = rs.getString("texto");         
                lista_texto.add(t);
            }
            
            pagina.setText(lista_page.get(0));
            citacao.setText(lista_texto.get(0));
            citacao.setLineWrap(true);  

            stmt.close();
            rs.close();
            conn.close();
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }  
    }
}