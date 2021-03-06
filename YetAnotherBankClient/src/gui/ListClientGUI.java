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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import beans.Agence;
import test.Client;
import beans.Customer;
import test.DataService;
import test.ServiceLocator;

/**
 *
 * @author pacheikh
 */
public class ListClientGUI extends javax.swing.JFrame {

    DataService dataService;

    /**
     * Creates new form ListClientGUI
     */
    public ListClientGUI() {


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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

//        agenceComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        listeClientButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClient = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        agenceComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                agenceComboBoxItemStateChanged(evt);
            }
        });

        jLabel1.setText("Choix agence");

        listeClientButton.setText("lister");
        listeClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listeClientButtonActionPerformed(evt);
            }
        });

        model = new DefaultTableModel();
        tableClient.setModel(model = new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom", "Prenom"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableClient);

        jButton1.setText("Retour");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLabel1)
                            .addGap(39, 39, 39)
                            .addComponent(agenceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(listeClientButton))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agenceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(listeClientButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listeClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listeClientButtonActionPerformed
        int j = 0;
        while (j < model.getRowCount()) {
            model.removeRow(j);
        }

//            Client.oos.writeObject("getClient");
//            Client.oos.flush();

        ArrayList<Customer> listeCustomer = (ArrayList<Customer>) ServiceLocator.getService("clientService",
                agenceComboBox.getSelectedIndex() + 1, "");
        System.out.println("taille : " + listeCustomer.size());

//            Client.oos.writeObject("dataService");
//            Client.oos.flush();

//            Client.oos.writeObject(agenceComboBox.getSelectedIndex()+1);
//            Client.oos.flush();
//            
//            Client.oos.writeObject("");
//            Client.oos.flush();

//            ArrayList<Customer> listeCustomer = (ArrayList<Customer>) Client.ois.readObject();

        String[][] nomClient = new String[listeCustomer.size() * 2][listeCustomer.size() * 2];
        int i = 0;
        int k = 0;

        while (k < listeCustomer.size()) {
            nomClient[k][0] = listeCustomer.get(i).getNomCli();
            nomClient[k][1] = listeCustomer.get(i++).getPrenomCli();

            model.addRow(nomClient[k++]);
        }


    }//GEN-LAST:event_listeClientButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        YABGUI yabGUI = new YABGUI();
        yabGUI.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void agenceComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {
    }
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
//            java.util.logging.Logger.getLogger(ListClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ListClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ListClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ListClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ListClientGUI().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox agenceComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listeClientButton;
    private javax.swing.JTable tableClient;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel model;
}
