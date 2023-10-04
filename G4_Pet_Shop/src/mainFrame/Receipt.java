
package mainFrame;


import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Receipt extends javax.swing.JFrame {

    ArrayList<Products> datas = new ArrayList<>(); 

    
    Products inf; 
    int num = 0;    
   
    public Receipt() {
        
        //REMOVE EXIT BAR
        setUndecorated(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
           
    }
    
    
    public void refresh(int num) { 
//        infoHolder1.updatePanelSize(); 
        inf.setPanelID(num);
        datas.add(inf); 
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        receiptlabel = new javax.swing.JLabel();
        subtotallabel = new javax.swing.JLabel();
        taxlabel = new javax.swing.JLabel();
        totallabel = new javax.swing.JLabel();
        paymentlabel = new javax.swing.JLabel();
        changelabel = new javax.swing.JLabel();
        subtotalre = new javax.swing.JLabel();
        taxre = new javax.swing.JLabel();
        totalre = new javax.swing.JLabel();
        paymentre = new javax.swing.JLabel();
        changere = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        receiptlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        receiptlabel.setForeground(new java.awt.Color(0, 0, 0));
        receiptlabel.setText("RECEIPT");

        subtotallabel.setForeground(new java.awt.Color(0, 0, 0));
        subtotallabel.setText("subtotal:");

        taxlabel.setForeground(new java.awt.Color(0, 0, 0));
        taxlabel.setText("tax:");

        totallabel.setForeground(new java.awt.Color(0, 0, 0));
        totallabel.setText("total:");

        paymentlabel.setForeground(new java.awt.Color(0, 0, 0));
        paymentlabel.setText("payment:");

        changelabel.setForeground(new java.awt.Color(0, 0, 0));
        changelabel.setText("change:");

        subtotalre.setForeground(new java.awt.Color(0, 0, 0));
        subtotalre.setText("0");

        taxre.setForeground(new java.awt.Color(0, 0, 0));
        taxre.setText("0");

        totalre.setForeground(new java.awt.Color(0, 0, 0));
        totalre.setText("0");

        paymentre.setForeground(new java.awt.Color(0, 0, 0));
        paymentre.setText("0");

        changere.setForeground(new java.awt.Color(0, 0, 0));
        changere.setText("0");

        exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exit.setForeground(new java.awt.Color(0, 0, 0));
        exit.setText("EXIT");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit)
                .addGap(66, 66, 66))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(subtotallabel)
                            .addComponent(taxlabel)
                            .addComponent(totallabel)
                            .addComponent(paymentlabel)
                            .addComponent(changelabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(taxre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subtotalre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paymentre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changere, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(receiptlabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(receiptlabel)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(subtotallabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taxlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totallabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paymentlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changelabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(subtotalre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taxre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paymentre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changere)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(exit)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
//    ImageIcon icon = new ImageIcon("pink.jpg"); // Replace with your icon file path
//                JLabel label = new JLabel("buy again!",icon, JLabel.CENTER);
//                label.setHorizontalTextPosition(JLabel.CENTER);
//                label.setVerticalTextPosition(JLabel.BOTTOM);
//
//                JOptionPane.showMessageDialog(
//                        null,
//                        label,
//                        "bye bye",
//                        JOptionPane.DEFAULT_OPTION);
        setVisible(false);
    }//GEN-LAST:event_exitMouseClicked

    
    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel changelabel;
    public javax.swing.JLabel changere;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel paymentlabel;
    public javax.swing.JLabel paymentre;
    private javax.swing.JLabel receiptlabel;
    private javax.swing.JLabel subtotallabel;
    public javax.swing.JLabel subtotalre;
    private javax.swing.JLabel taxlabel;
    public javax.swing.JLabel taxre;
    private javax.swing.JLabel totallabel;
    public javax.swing.JLabel totalre;
    // End of variables declaration//GEN-END:variables
}
