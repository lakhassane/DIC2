/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import beans.Agence;
import test.Client;
import beans.Customer;
import test.ServiceLocator;

/**
 *
 * @author pacheikh
 */
public class AjoutClientGUI extends javax.swing.JFrame {

    /**
     * Creates new form AjoutClientGUI
     */
    public AjoutClientGUI() {

        ArrayList<Agence> listeAgence = (ArrayList<Agence>) ServiceLocator.getService("agenceService", -1, "");
//            Client.oos.writeObject("getAgence");
//            Client.oos.flush();
//            ArrayList<Agence> listeAgence = (ArrayList<Agence>) Client.ois.readObject();

        String[] nomAgence = new String[listeAgence.size()];
        for (int i = 0; i < listeAgence.size(); i++) {
            nomAgence[i] = listeAgence.get(i).getNomag();
        }

        agenceComboBox = new JComboBox(nomAgence);

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomClientField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        prenomClientField = new javax.swing.JTextField();
        // agenceComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        ajouterClientButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Welcome To Yet Another Bank");

        jLabel2.setText("Nom");

        jLabel3.setText("Prénom");

        prenomClientField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomClientFieldActionPerformed(evt);
            }
        });

        agenceComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agenceComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setText("Agence");

        ajouterClientButton.setText("Ajouter");
        ajouterClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterClientButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Retour");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel1))
                .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2)
                .addComponent(jLabel4))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addComponent(nomClientField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jLabel3)
                .addGap(47, 47, 47)
                .addComponent(prenomClientField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(agenceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                .addComponent(ajouterClientButton)
                .addGap(40, 40, 40)
                .addComponent(jButton2)))))
                .addContainerGap(94, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(nomClientField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3)
                .addComponent(prenomClientField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(agenceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(ajouterClientButton)
                .addComponent(jButton2))
                .addContainerGap(111, Short.MAX_VALUE)));

        pack();
    }

    private void prenomClientFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomClientFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomClientFieldActionPerformed

    private void agenceComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agenceComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agenceComboBoxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new YABGUI().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ajouterClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterClientButtonActionPerformed
//        try {
            /* We get the fields content*/
//            Client.oos.writeObject("ajoutClient");
//            Client.oos.flush();
            
            String nomClient = nomClientField.getText();
            String prenomClient = prenomClientField.getText();
            int numAgence = agenceComboBox.getSelectedIndex() + 1;

            Customer customer = new Customer();
            customer.setNomCli(nomClient);
            customer.setPrenomCli(prenomClient);
            customer.setNumag(numAgence);

            ServiceLocator.params[0] = customer;
            
            Object ob = ServiceLocator.getService("ajoutService", -1, "");
            
            /* We write the object in the output stream to send via the network */
//            Client.oos.writeObject(customer);
//            Client.oos.flush();

            /* Reset fields content */
            nomClientField.setText("");
            prenomClientField.setText("");
//
//        } catch (IOException ex) {
//            Logger.getLogger(AjoutClientGUI.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_ajouterClientButtonActionPerformed
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AjoutClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AjoutClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AjoutClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AjoutClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AjoutClientGUI().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox agenceComboBox;
    private javax.swing.JButton ajouterClientButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nomClientField;
    private javax.swing.JTextField prenomClientField;
    // End of variables declaration//GEN-END:variables
}
