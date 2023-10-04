/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mainFrame;

/**
 *
 * @author GodisGood
 */
public class Products extends javax.swing.JPanel {

    /**
     * Creates new form Products
     */
    public Products() {
        initComponents();
    }

   public void setPanelID(int ID) {
        PanelID.setText(Integer.toString(ID));
    }
   
   public void setPanelName(String Name) {
        ProductName.setText(Name);
    }
   
   public void setPanelPrice(String Name) {
        ProductPrice.setText(Name);
    }
   
   public void setPanelTotal(String Name) {
        TotalProductPrice.setText(Name);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Homepanel = new javax.swing.JPanel();
        ProductName = new javax.swing.JLabel();
        TotalProductPrice = new javax.swing.JLabel();
        ProductPrice = new javax.swing.JLabel();
        ProductIcon = new javax.swing.JLabel();
        PanelID = new javax.swing.JLabel();

        Homepanel.setBackground(new java.awt.Color(255, 255, 255));

        ProductName.setForeground(new java.awt.Color(0, 0, 0));
        ProductName.setText("Name");

        TotalProductPrice.setForeground(new java.awt.Color(0, 0, 0));
        TotalProductPrice.setText("Total");

        ProductPrice.setForeground(new java.awt.Color(0, 0, 0));
        ProductPrice.setText("Price");

        ProductIcon.setForeground(new java.awt.Color(0, 0, 0));
        ProductIcon.setText("icon");

        PanelID.setForeground(new java.awt.Color(0, 0, 0));
        PanelID.setText("0");

        javax.swing.GroupLayout HomepanelLayout = new javax.swing.GroupLayout(Homepanel);
        Homepanel.setLayout(HomepanelLayout);
        HomepanelLayout.setHorizontalGroup(
            HomepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelID, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProductIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProductName)
                .addGap(47, 47, 47)
                .addComponent(ProductPrice)
                .addGap(33, 33, 33)
                .addComponent(TotalProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HomepanelLayout.setVerticalGroup(
            HomepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomepanelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(HomepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProductIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(PanelID)
                    .addGroup(HomepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ProductName)
                        .addComponent(TotalProductPrice)
                        .addComponent(ProductPrice)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Homepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Homepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Homepanel;
    private javax.swing.JLabel PanelID;
    private javax.swing.JLabel ProductIcon;
    private javax.swing.JLabel ProductName;
    private javax.swing.JLabel ProductPrice;
    private javax.swing.JLabel TotalProductPrice;
    // End of variables declaration//GEN-END:variables
}
