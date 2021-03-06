/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author pc-click
 */
public class FicheSalle extends javax.swing.JFrame {

    /**
     * Creates new form FicheSalle
     */
    public FicheSalle() {
        setUndecorated(true);
        setResizable(false);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        NumSalle = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Categorie = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        prix = new javax.swing.JTextField();
        BConfirmer = new javax.swing.JButton();
        BAnnuler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(2, 5, 8));

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 236, 228));
        jLabel1.setText("Fiche Salle");

        jButton1.setBackground(new java.awt.Color(2, 5, 8,0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelPackage/exitpng.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1174, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 60));

        jPanel2.setBackground(new java.awt.Color(250, 249, 248));

        jLabel17.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(2, 5, 8));
        jLabel17.setText("N?? de salle");

        NumSalle.setBackground(new java.awt.Color(250, 249, 248));
        NumSalle.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        NumSalle.setForeground(new java.awt.Color(2, 5, 8));

        jLabel20.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(2, 5, 8));
        jLabel20.setText("Cat??gorie");

        Categorie.setBackground(new java.awt.Color(250, 249, 248));
        Categorie.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        Categorie.setForeground(new java.awt.Color(2, 5, 8));

        jLabel22.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(2, 5, 8));
        jLabel22.setText("Prix de salle");

        prix.setBackground(new java.awt.Color(250, 249, 248));
        prix.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        prix.setForeground(new java.awt.Color(2, 5, 8));

        BConfirmer.setBackground(new java.awt.Color(0, 0, 0));
        BConfirmer.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        BConfirmer.setForeground(new java.awt.Color(250, 249, 248));
        BConfirmer.setText("Confirmer");
        BConfirmer.setPreferredSize(new java.awt.Dimension(150, 52));
        BConfirmer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BConfirmerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BConfirmerFocusLost(evt);
            }
        });
        BConfirmer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BConfirmerMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BConfirmerMousePressed(evt);
            }
        });
        BConfirmer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BConfirmerActionPerformed(evt);
            }
        });

        BAnnuler.setBackground(new java.awt.Color(0, 0, 0));
        BAnnuler.setFont(new java.awt.Font("Bell MT", 0, 22)); // NOI18N
        BAnnuler.setForeground(new java.awt.Color(250, 249, 248));
        BAnnuler.setText("Annuler");
        BAnnuler.setPreferredSize(new java.awt.Dimension(150, 52));
        BAnnuler.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BAnnulerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BAnnulerFocusLost(evt);
            }
        });
        BAnnuler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BAnnulerMousePressed(evt);
            }
        });
        BAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAnnulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BConfirmer, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prix, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(NumSalle, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(113, 113, 113)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(Categorie, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(Categorie, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(NumSalle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(prix, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BConfirmer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(305, 305, 305))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1460, 960));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        new Salle().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void BAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAnnulerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BAnnulerActionPerformed

    private void BAnnulerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BAnnulerFocusLost
        BAnnuler.setBackground(new java.awt.Color(0,0,0));
        BAnnuler.setForeground(new java.awt.Color(250,249,248));
    }//GEN-LAST:event_BAnnulerFocusLost

    private void BAnnulerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BAnnulerFocusGained
        BAnnuler.setBackground(new java.awt.Color(250,249,248));
        BAnnuler.setForeground(new java.awt.Color(2, 5, 8));
    }//GEN-LAST:event_BAnnulerFocusGained

    private void BConfirmerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BConfirmerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BConfirmerActionPerformed

    private void BConfirmerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BConfirmerMousePressed
    // conditions sur les champs 
      int k=0;
      String cat??gorie= Categorie.getText().toString(); 
      try{
        Integer.parseInt(NumSalle.getText());
        k++;
    }catch(Exception e){JOptionPane.showMessageDialog(null, "la N?? de salle doit etre un nombre entier !!");;} 
      
       try{
        Integer.parseInt(prix.getText());
        k++;
    }catch(Exception e){JOptionPane.showMessageDialog(null, "le prix de salle doit etre un nombre  !!");}  
       
         
      //remplir BD 
      if(k==2){
      try{
           Class.forName("com.mysql.jdbc.Driver");
            System.err.println("connected");
            Connection cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellagazelle","root","");
            Statement st =cnx.createStatement();
            //requete
            String SQL ="insert into salle(NumSalle,PrixSalle,CategorieSalle,DisponibilteSalle)"+
              "values("+NumSalle.getText().toString()+","+prix.getText().toString()+","+"\""+Categorie.getText().toString()+"\"" +","+"\""+1+"\""+");";
            
            st.executeUpdate(SQL); 
            JOptionPane.showMessageDialog(null, "Opr??ration r??ussie");
            this.dispose();
            new Salle().setVisible(true);
           
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);}}
    }//GEN-LAST:event_BConfirmerMousePressed

    private void BConfirmerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BConfirmerMouseClicked
        
    }//GEN-LAST:event_BConfirmerMouseClicked

    private void BConfirmerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BConfirmerFocusLost
        BConfirmer.setBackground(new java.awt.Color(0,0,0));
        BConfirmer.setForeground(new java.awt.Color(250,249,248));
    }//GEN-LAST:event_BConfirmerFocusLost

    private void BConfirmerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BConfirmerFocusGained
        BConfirmer.setBackground(new java.awt.Color(250,249,248));
        BConfirmer.setForeground(new java.awt.Color(2, 5, 8));
    }//GEN-LAST:event_BConfirmerFocusGained

    private void BAnnulerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BAnnulerMousePressed
        new Salle().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BAnnulerMousePressed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FicheSalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FicheSalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FicheSalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FicheSalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FicheSalle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAnnuler;
    private javax.swing.JButton BConfirmer;
    private javax.swing.JTextField Categorie;
    private javax.swing.JTextField NumSalle;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField prix;
    // End of variables declaration//GEN-END:variables
}
