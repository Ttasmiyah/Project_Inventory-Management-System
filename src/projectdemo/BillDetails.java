/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Hp
 */
public class BillDetails extends javax.swing.JFrame {

    /**
     * Creates new form BillDetails
     */
    public BillDetails() {
        initComponents();
      show_user();
    }

       public ArrayList<billtable>billList()
    {
        ArrayList<billtable>billsList = new ArrayList<>();
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=inventory_management_system;selectMethod=cursor", "sa", "123456");
            String query1 = "SELECT * FROM BILLDETAILS";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query1);
             billtable bills;
            while(rs.next()){
                bills = new billtable(rs.getInt("BillId"),rs.getInt("CustomerId"),rs.getInt("ProductId"),
                        rs.getInt("Quantity"),rs.getInt("Amount"),rs.getString("OrderDate"));
                billsList.add(bills);       
                System.out.println(bills);  
            }  
         }
         catch (Exception e) {
            JOptionPane.showMessageDialog(null,"e");
            
        }
         return billsList;
    }

    public void show_user()
    {
        ArrayList<billtable>list=billList();
        DefaultTableModel model = (DefaultTableModel)billtable.getModel();
        
        Object[] row = new Object[6];
        for(int i= 0 ;i<list.size();i++)
        {
            row[0]=list.get(i).getBillId();            
            row[1]=list.get(i).getCustomerId();
            row[2]=list.get(i).getProductId();
            row[3]=list.get(i).getQuantity();
            row[4]=list.get(i).getAmount();
            row[5]=list.get(i).getOrderDate();
            
            model.addRow(row);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        billtable = new javax.swing.JTable();
        Searchfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 500));

        jPanel1.setMinimumSize(new java.awt.Dimension(900, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(166, 214, 230));

        billtable.setBackground(new java.awt.Color(166, 214, 230));
        billtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BillId", "CustomerId", "ProductId", "Quantity", "Amount", "OrderDate"
            }
        ));
        billtable.setPreferredSize(new java.awt.Dimension(452, 402));
        jScrollPane1.setViewportView(billtable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 650, 140));

        Searchfield.setBackground(new java.awt.Color(166, 214, 230));
        Searchfield.setForeground(new java.awt.Color(153, 153, 153));
        Searchfield.setText("search BillId");
        Searchfield.setToolTipText("");
        Searchfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchfieldMouseClicked(evt);
            }
        });
        Searchfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchfieldActionPerformed(evt);
            }
        });
        Searchfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchfieldKeyReleased(evt);
            }
        });
        jPanel1.add(Searchfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 450, 30));

        jButton1.setBackground(new java.awt.Color(166, 214, 230));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, -1, -1));

        jButton4.setBackground(new java.awt.Color(166, 214, 230));
        jButton4.setForeground(new java.awt.Color(0, 51, 51));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/refresh.JPG"))); // NOI18N
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 60, 60));

        jButton2.setBackground(new java.awt.Color(166, 214, 230));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/remove.png"))); // NOI18N
        jButton2.setText("Remove billdetails");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 170, 40));

        jButtonBack.setBackground(new java.awt.Color(118, 23, 118));
        jButtonBack.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.png"))); // NOI18N
        jButtonBack.setText(" Back");
        jButtonBack.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonBack.setIconTextGap(2);
        jButtonBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBackMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 460, 90, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("  REFRESH");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 102));
        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(176, 31, 176));
        jLabel3.setText("        BillDetails");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 410, 60));

        jLabel2.setBackground(new java.awt.Color(102, 102, 255));
        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bck.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

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

    private void SearchfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchfieldActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       

       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBackMouseClicked
        HomePage cLR = new HomePage();
        cLR.setVisible(true);
        cLR.pack();
        cLR.setLocationRelativeTo(null);
        cLR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonBackMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        RemoveBill remove = new RemoveBill();
        remove.setVisible(true);
        remove.pack();
        remove.setLocationRelativeTo(null);
        this.dispose();
       // remove.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton2MouseClicked

    private void SearchfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchfieldMouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_SearchfieldMouseClicked

    private void SearchfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchfieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchfieldKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          String BillId = Searchfield.getText();
           if(Searchfield.getText().isEmpty())
        {
        
                JOptionPane.showMessageDialog(null,"Field is empty!");      
        }
           else{
                
        String searchQuery = "SELECT * FROM BILLDETAILS WHERE BillId ='"+BillId+"'";
        try {
            ConnectMSSQL conn  = new ConnectMSSQL();
            Connection connection = conn.connectDB();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(searchQuery);
            billtable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(BillDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
           }
       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(BillDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Searchfield;
    private javax.swing.JTable billtable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
