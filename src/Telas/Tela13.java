package Telas;

import static Telas.Tela8.posicaoyanot;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Tela13 extends javax.swing.JFrame {

    public static String idAnot;
    public static ArrayList<String> idsAnot = new ArrayList<>();
    public Tela13() {
        initComponents();
        pegandoIds();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        editar_citacao = new javax.swing.JButton();
        remover_citacao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        anotacao_completa = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(221, 255, 187));

        jPanel2.setBackground(new java.awt.Color(229, 234, 142));

        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar3.jpg"))); // NOI18N
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Aardvark Cafe", 0, 48)); // NOI18N
        jLabel1.setText("Anotação");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(229, 234, 142));

        editar_citacao.setBackground(new java.awt.Color(207, 208, 210));
        editar_citacao.setFont(new java.awt.Font("Footlight MT Light", 0, 14)); // NOI18N
        editar_citacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/EDITAR.png"))); // NOI18N
        editar_citacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_citacaoActionPerformed(evt);
            }
        });

        remover_citacao.setFont(new java.awt.Font("Footlight MT Light", 0, 14)); // NOI18N
        remover_citacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/REMOVER.png"))); // NOI18N
        remover_citacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remover_citacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editar_citacao, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(remover_citacao, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editar_citacao, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remover_citacao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        anotacao_completa.setBackground(new java.awt.Color(229, 230, 232));
        anotacao_completa.setColumns(20);
        anotacao_completa.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        anotacao_completa.setRows(5);
        jScrollPane1.setViewportView(anotacao_completa);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        Tela8 nona = new Tela8();
        nona.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void editar_citacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_citacaoActionPerformed
        Tela14 nona = new Tela14();
        nona.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editar_citacaoActionPerformed

    private void remover_citacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remover_citacaoActionPerformed
        String comando = "DELETE FROM anotacao WHERE id_anotacao = '"+idAnot+"'";
        int op  = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja exculir essa anotação?","Excluir" ,JOptionPane.YES_NO_OPTION);
        
        if(op == 0){
        
        try {
            Connection conn = new Conexao().doConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(comando);
            
            Tela8 nona = new Tela8();
            nona.setVisible(true);
            this.dispose();
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        }
    }//GEN-LAST:event_remover_citacaoActionPerformed
    public void pegandoIds(){
        
        
        String vartitulo = Tela5.t = (Tela2.item);
        ResultSet rs;        
        String comando1 = "SELECT id_anotacao FROM anotacao WHERE titulo = '"+vartitulo+"'";
        
        try {
            Connection conn = new Conexao().doConnection();
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(comando1);
        
            while(rs.next()){
                String t = rs.getString("id_anotacao");         
                idsAnot.add(t);
            }
            
            pegandoCitacao();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private void pegandoCitacao() {
        String vartitulo = Tela5.t = (Tela2.item);
        ResultSet rs;      
        ArrayList<String> anotacoes = new ArrayList<>();       
        String comando = "SELECT texto FROM anotacao WHERE titulo = '"+vartitulo+"'";
        
        try {
            Connection conn = new Conexao().doConnection();
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(comando);
        
            while(rs.next()){
                String t = rs.getString("texto");         
                anotacoes.add(t);
            } 
            
            setar(anotacoes);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void setar(ArrayList<String> anotacoes) {
        
        int y = posicaoyanot;
        
        int pinicial = -50;
        int pfinal = 0;
        
        for (int i=0; i<anotacoes.size(); i++){
            pinicial+= 100;
            pfinal = pinicial+100;
            
            if (y > pinicial && y < pfinal){   
                anotacao_completa.setText("''"+anotacoes.get(i)+"''");
                anotacao_completa.setLineWrap(true);
                
                idAnot = idsAnot.get(i);
                System.out.println(idAnot);
            }
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Tela13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela13().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea anotacao_completa;
    private javax.swing.JButton editar_citacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton remover_citacao;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
