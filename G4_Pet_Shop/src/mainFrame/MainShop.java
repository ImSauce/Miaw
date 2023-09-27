
package mainFrame;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MainShop extends javax.swing.JFrame {

       
        
   ImageIcon image = new ImageIcon("383850299_3499726930288990_7050840815053135250_n.png");
   ImageIcon image2 = new ImageIcon("kufufu.jpg");
   ImageIcon image4 = new ImageIcon("addnew.png");
   ImageIcon shiroko = new ImageIcon("shiroko.jpg");
   ImageIcon hibiki = new ImageIcon("hibiki.jpg");
   ImageIcon wakamo = new ImageIcon("wakamo.jpg");
   ImageIcon cat = new ImageIcon("catto.jpg");
   // ImageIcon background = new ImageIcon("shoppp.jpg");
   
   
   public MainShop() {
        initComponents();
        
        
        setIconImage(image.getImage());
        

        setTitle("Slave shop");
        
           Image img4 = image4.getImage();
           Image imgScale4 = img4.getScaledInstance(CharacterImage.getWidth(), CharacterImage.getHeight(),CharacterImage.getWidth());
           ImageIcon scaledIcon4 = new ImageIcon(imgScale4);
           CharacterImage.setIcon(scaledIcon4);
        
           Image img = image.getImage();
           Image img2 = image2.getImage();
           Image img5 = shiroko.getImage();
           Image img6 = hibiki.getImage();
           Image img7 = wakamo.getImage();
           Image img8 = cat.getImage();
          // Image img9 = background.getImage();
           
//           Image imgScale = img.getScaledInstance(CharacterImage.getWidth(), CharacterImage.getHeight(),CharacterImage.getWidth());
//           ImageIcon scaledIcon = new ImageIcon(imgScale);
//           CharacterImage.setIcon(scaledIcon);
           //backround
           
        //   Image imgScale9 = img9.getScaledInstance(back.getWidth(), back.getHeight(),back.getWidth());
         //  ImageIcon scaledIcon9 = new ImageIcon(imgScale9);
          // back.setIcon(scaledIcon9);
           
           ////CHARACTERICONS
           Image imgScale2 = img.getScaledInstance(HareIcon.getWidth(), HareIcon.getHeight(),HareIcon.getWidth());
           ImageIcon scaledIcon2 = new ImageIcon(imgScale2);
           HareIcon.setIcon(scaledIcon2);
           
           
           Image imgScale3 = img2.getScaledInstance(MutsukiIcon.getWidth(), MutsukiIcon.getHeight(),MutsukiIcon.getWidth());
           ImageIcon scaledIcon3 = new ImageIcon(imgScale3);
           MutsukiIcon.setIcon(scaledIcon3);
           
           Image imgScale5 = img5.getScaledInstance(shirokoIcon.getWidth(), shirokoIcon.getHeight(),shirokoIcon.getWidth());
           ImageIcon scaledIcon5 = new ImageIcon(imgScale5);
           shirokoIcon.setIcon(scaledIcon5);
           
           Image imgScale6 = img6.getScaledInstance(hibikiIcon.getWidth(), hibikiIcon.getHeight(),hibikiIcon.getWidth());
           ImageIcon scaledIcon6 = new ImageIcon(imgScale6);
           hibikiIcon.setIcon(scaledIcon6);
           
           Image imgScale7 = img7.getScaledInstance(WakamoIcon.getWidth(), WakamoIcon.getHeight(),WakamoIcon.getWidth());
           ImageIcon scaledIcon7 = new ImageIcon(imgScale7);
           WakamoIcon.setIcon(scaledIcon7);
           
           Image imgScale8 = img8.getScaledInstance(cattoIcon.getWidth(), cattoIcon.getHeight(),cattoIcon.getWidth());
           ImageIcon scaledIcon8 = new ImageIcon(imgScale8);
           cattoIcon.setIcon(scaledIcon8);
           
          
        //Image.setIcon(image);  
        
           
        setResizable(false);
           
           
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProductPanel = new javax.swing.JPanel();
        SelectPet = new javax.swing.JScrollPane();
        selectpanel = new javax.swing.JPanel();
        hare = new javax.swing.JRadioButton();
        hareQN = new javax.swing.JTextField();
        quantitylabel = new javax.swing.JLabel();
        HareIcon = new javax.swing.JLabel();
        mutsuki = new javax.swing.JRadioButton();
        demonQN = new javax.swing.JTextField();
        quantitylabel1 = new javax.swing.JLabel();
        MutsukiIcon = new javax.swing.JLabel();
        shirokoIcon = new javax.swing.JLabel();
        hibikiIcon = new javax.swing.JLabel();
        WakamoIcon = new javax.swing.JLabel();
        cattoIcon = new javax.swing.JLabel();
        shirokobutton = new javax.swing.JRadioButton();
        HibikiButton = new javax.swing.JRadioButton();
        WakamoButton = new javax.swing.JRadioButton();
        KazusaButton = new javax.swing.JRadioButton();
        quantitylabel2 = new javax.swing.JLabel();
        ShirokoQN = new javax.swing.JTextField();
        quantitylabel3 = new javax.swing.JLabel();
        HibikiQN = new javax.swing.JTextField();
        quantitylabel4 = new javax.swing.JLabel();
        WakamoQN = new javax.swing.JTextField();
        quantitylabel5 = new javax.swing.JLabel();
        KazusaQN = new javax.swing.JTextField();
        harecost = new javax.swing.JLabel();
        mutsukicost = new javax.swing.JLabel();
        shirokocost = new javax.swing.JLabel();
        wakamocost = new javax.swing.JLabel();
        hibikicost = new javax.swing.JLabel();
        kazusacost = new javax.swing.JLabel();
        CompanionAvailable = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        clear1 = new javax.swing.JButton();
        InfoPanel = new javax.swing.JPanel();
        CharacterImage = new javax.swing.JLabel();
        CharacterName = new javax.swing.JLabel();
        CharacterRace = new javax.swing.JLabel();
        CharacterLevel = new javax.swing.JLabel();
        info = new javax.swing.JPanel();
        descriptionText = new javax.swing.JLabel();
        desk = new javax.swing.JLabel();
        statsPanel = new javax.swing.JPanel();
        STR = new javax.swing.JLabel();
        SPD = new javax.swing.JLabel();
        INT = new javax.swing.JLabel();
        CRIT = new javax.swing.JLabel();
        HP = new javax.swing.JLabel();
        MP = new javax.swing.JLabel();
        DEF = new javax.swing.JLabel();
        STA = new javax.swing.JLabel();
        costlabel = new javax.swing.JLabel();
        purchase = new javax.swing.JButton();
        money = new javax.swing.JTextField();
        enteramount = new javax.swing.JLabel();
        change = new javax.swing.JTextField();
        changelabel = new javax.swing.JLabel();
        subtotal = new javax.swing.JTextField();
        tax = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        sublabel = new javax.swing.JLabel();
        taxlabel = new javax.swing.JLabel();
        totallabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout());

        ProductPanel.setBackground(new java.awt.Color(189, 215, 240));
        ProductPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SelectPet.setBackground(new java.awt.Color(153, 153, 153));
        SelectPet.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        selectpanel.setBackground(new java.awt.Color(255, 255, 255));
        selectpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hare.setBackground(new java.awt.Color(255, 255, 255));
        hare.setForeground(new java.awt.Color(0, 0, 0));
        hare.setText("Hare");
        hare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hareActionPerformed(evt);
            }
        });
        selectpanel.add(hare, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 21, -1, -1));

        hareQN.setEditable(false);
        hareQN.setBackground(new java.awt.Color(204, 204, 204));
        hareQN.setForeground(new java.awt.Color(0, 0, 0));
        hareQN.setText("1");
        hareQN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hareQNActionPerformed(evt);
            }
        });
        selectpanel.add(hareQN, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 18, 89, -1));

        quantitylabel.setBackground(new java.awt.Color(0, 0, 0));
        quantitylabel.setForeground(new java.awt.Color(0, 0, 0));
        quantitylabel.setText("quantity:");
        selectpanel.add(quantitylabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 23, -1, -1));

        HareIcon.setForeground(new java.awt.Color(0, 0, 0));
        HareIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HareIconMouseClicked(evt);
            }
        });
        selectpanel.add(HareIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 6, 54, 48));

        mutsuki.setBackground(new java.awt.Color(255, 255, 255));
        mutsuki.setForeground(new java.awt.Color(0, 0, 0));
        mutsuki.setText("Mutsuki");
        mutsuki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mutsukiActionPerformed(evt);
            }
        });
        selectpanel.add(mutsuki, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 86, -1, -1));

        demonQN.setEditable(false);
        demonQN.setBackground(new java.awt.Color(204, 204, 204));
        demonQN.setForeground(new java.awt.Color(0, 0, 0));
        demonQN.setText("1");
        selectpanel.add(demonQN, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 83, 89, -1));

        quantitylabel1.setBackground(new java.awt.Color(0, 0, 0));
        quantitylabel1.setForeground(new java.awt.Color(0, 0, 0));
        quantitylabel1.setText("quantity:");
        selectpanel.add(quantitylabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 88, -1, -1));

        MutsukiIcon.setForeground(new java.awt.Color(0, 0, 0));
        MutsukiIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MutsukiIconMouseClicked(evt);
            }
        });
        selectpanel.add(MutsukiIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 72, 54, 48));

        shirokoIcon.setForeground(new java.awt.Color(0, 0, 0));
        shirokoIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shirokoIconMouseClicked(evt);
            }
        });
        selectpanel.add(shirokoIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 138, 54, 48));

        hibikiIcon.setForeground(new java.awt.Color(0, 0, 0));
        hibikiIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hibikiIconMouseClicked(evt);
            }
        });
        selectpanel.add(hibikiIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 204, 54, 48));

        WakamoIcon.setForeground(new java.awt.Color(0, 0, 0));
        WakamoIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WakamoIconMouseClicked(evt);
            }
        });
        selectpanel.add(WakamoIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 270, 54, 48));

        cattoIcon.setForeground(new java.awt.Color(0, 0, 0));
        cattoIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cattoIconMouseClicked(evt);
            }
        });
        selectpanel.add(cattoIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 336, 54, 48));

        shirokobutton.setBackground(new java.awt.Color(255, 255, 255));
        shirokobutton.setForeground(new java.awt.Color(0, 0, 0));
        shirokobutton.setText("Shiroko");
        shirokobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shirokobuttonActionPerformed(evt);
            }
        });
        selectpanel.add(shirokobutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 155, -1, -1));

        HibikiButton.setBackground(new java.awt.Color(255, 255, 255));
        HibikiButton.setForeground(new java.awt.Color(0, 0, 0));
        HibikiButton.setText("Hibiki");
        HibikiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HibikiButtonActionPerformed(evt);
            }
        });
        selectpanel.add(HibikiButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 220, -1, -1));

        WakamoButton.setBackground(new java.awt.Color(255, 255, 255));
        WakamoButton.setForeground(new java.awt.Color(0, 0, 0));
        WakamoButton.setText("Wakamo");
        WakamoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WakamoButtonActionPerformed(evt);
            }
        });
        selectpanel.add(WakamoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 284, -1, -1));

        KazusaButton.setBackground(new java.awt.Color(255, 255, 255));
        KazusaButton.setForeground(new java.awt.Color(0, 0, 0));
        KazusaButton.setText("Kazusa");
        KazusaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KazusaButtonActionPerformed(evt);
            }
        });
        selectpanel.add(KazusaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 352, -1, -1));

        quantitylabel2.setBackground(new java.awt.Color(0, 0, 0));
        quantitylabel2.setForeground(new java.awt.Color(0, 0, 0));
        quantitylabel2.setText("quantity:");
        selectpanel.add(quantitylabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 157, -1, -1));

        ShirokoQN.setEditable(false);
        ShirokoQN.setBackground(new java.awt.Color(204, 204, 204));
        ShirokoQN.setForeground(new java.awt.Color(0, 0, 0));
        ShirokoQN.setText("1");
        selectpanel.add(ShirokoQN, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 152, 89, -1));

        quantitylabel3.setBackground(new java.awt.Color(0, 0, 0));
        quantitylabel3.setForeground(new java.awt.Color(0, 0, 0));
        quantitylabel3.setText("quantity:");
        selectpanel.add(quantitylabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 222, -1, -1));

        HibikiQN.setEditable(false);
        HibikiQN.setBackground(new java.awt.Color(204, 204, 204));
        HibikiQN.setForeground(new java.awt.Color(0, 0, 0));
        HibikiQN.setText("1");
        selectpanel.add(HibikiQN, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 217, 89, -1));

        quantitylabel4.setBackground(new java.awt.Color(0, 0, 0));
        quantitylabel4.setForeground(new java.awt.Color(0, 0, 0));
        quantitylabel4.setText("quantity:");
        selectpanel.add(quantitylabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 286, -1, -1));

        WakamoQN.setEditable(false);
        WakamoQN.setBackground(new java.awt.Color(204, 204, 204));
        WakamoQN.setForeground(new java.awt.Color(0, 0, 0));
        WakamoQN.setText("1");
        selectpanel.add(WakamoQN, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 281, 89, -1));

        quantitylabel5.setBackground(new java.awt.Color(0, 0, 0));
        quantitylabel5.setForeground(new java.awt.Color(0, 0, 0));
        quantitylabel5.setText("quantity:");
        selectpanel.add(quantitylabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 354, -1, -1));

        KazusaQN.setEditable(false);
        KazusaQN.setBackground(new java.awt.Color(204, 204, 204));
        KazusaQN.setForeground(new java.awt.Color(0, 0, 0));
        KazusaQN.setText("1");
        selectpanel.add(KazusaQN, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 349, 89, -1));

        harecost.setForeground(new java.awt.Color(55, 179, 55));
        harecost.setText("100");
        selectpanel.add(harecost, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 23, -1, -1));

        mutsukicost.setForeground(new java.awt.Color(55, 179, 55));
        mutsukicost.setText("120");
        selectpanel.add(mutsukicost, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 88, -1, -1));

        shirokocost.setForeground(new java.awt.Color(55, 179, 55));
        shirokocost.setText("140");
        selectpanel.add(shirokocost, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 157, -1, -1));

        wakamocost.setForeground(new java.awt.Color(55, 179, 55));
        wakamocost.setText("200");
        selectpanel.add(wakamocost, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 286, -1, -1));

        hibikicost.setForeground(new java.awt.Color(55, 179, 55));
        hibikicost.setText("130");
        selectpanel.add(hibikicost, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 222, -1, -1));

        kazusacost.setForeground(new java.awt.Color(55, 179, 55));
        kazusacost.setText("90");
        selectpanel.add(kazusacost, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 354, -1, -1));

        SelectPet.setViewportView(selectpanel);

        ProductPanel.add(SelectPet, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 20, 380, 361));

        CompanionAvailable.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        CompanionAvailable.setForeground(new java.awt.Color(0, 0, 0));
        CompanionAvailable.setText("Pets Available: ");
        ProductPanel.add(CompanionAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 0, 208, -1));

        confirm.setText("CONFIRM");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        ProductPanel.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 93, -1));

        clear1.setText("CLEAR ALL");
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });
        ProductPanel.add(clear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 93, -1));

        getContentPane().add(ProductPanel);

        InfoPanel.setBackground(new java.awt.Color(255, 255, 255));
        InfoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CharacterImage.setBackground(new java.awt.Color(51, 51, 51));
        CharacterImage.setForeground(new java.awt.Color(0, 0, 0));
        InfoPanel.add(CharacterImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 131, 130));

        CharacterName.setForeground(new java.awt.Color(0, 0, 0));
        CharacterName.setText("Name:");
        InfoPanel.add(CharacterName, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 15, 195, -1));

        CharacterRace.setForeground(new java.awt.Color(0, 0, 0));
        CharacterRace.setText("Race:");
        InfoPanel.add(CharacterRace, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 37, 195, -1));

        CharacterLevel.setForeground(new java.awt.Color(0, 0, 0));
        CharacterLevel.setText("Level: ");
        InfoPanel.add(CharacterLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 59, 195, -1));

        info.setBackground(new java.awt.Color(255, 255, 255));

        descriptionText.setForeground(new java.awt.Color(0, 0, 0));
        descriptionText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        desk.setForeground(new java.awt.Color(0, 0, 0));
        desk.setText("Information:");

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info);
        info.setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionText, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addGroup(infoLayout.createSequentialGroup()
                        .addComponent(desk)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionText, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );

        InfoPanel.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 177, -1, 150));

        statsPanel.setBackground(new java.awt.Color(255, 255, 255));

        STR.setForeground(new java.awt.Color(0, 0, 0));
        STR.setText("STR:");

        SPD.setForeground(new java.awt.Color(0, 0, 0));
        SPD.setText("SPD:");

        INT.setForeground(new java.awt.Color(0, 0, 0));
        INT.setText("INT:");

        CRIT.setForeground(new java.awt.Color(0, 0, 0));
        CRIT.setText("CRIT:");

        HP.setForeground(new java.awt.Color(0, 0, 0));
        HP.setText("HP:");

        MP.setForeground(new java.awt.Color(0, 0, 0));
        MP.setText("MP:");

        DEF.setForeground(new java.awt.Color(0, 0, 0));
        DEF.setText("DEF:");

        STA.setForeground(new java.awt.Color(0, 0, 0));
        STA.setText("STA:");

        javax.swing.GroupLayout statsPanelLayout = new javax.swing.GroupLayout(statsPanel);
        statsPanel.setLayout(statsPanelLayout);
        statsPanelLayout.setHorizontalGroup(
            statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(statsPanelLayout.createSequentialGroup()
                            .addComponent(INT, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                            .addComponent(DEF, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(statsPanelLayout.createSequentialGroup()
                            .addComponent(SPD, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MP, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(statsPanelLayout.createSequentialGroup()
                            .addComponent(STR, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HP, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(statsPanelLayout.createSequentialGroup()
                        .addComponent(CRIT, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(STA, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        statsPanelLayout.setVerticalGroup(
            statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(STR)
                    .addComponent(HP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SPD)
                    .addComponent(MP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INT)
                    .addComponent(DEF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CRIT)
                    .addComponent(STA))
                .addContainerGap())
        );

        InfoPanel.add(statsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 77, 195, -1));

        costlabel.setForeground(new java.awt.Color(55, 179, 55));
        costlabel.setText("COST:");
        InfoPanel.add(costlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 142, 154, -1));

        purchase.setText("PURCHASE");
        purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseActionPerformed(evt);
            }
        });
        InfoPanel.add(purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 406, -1, -1));

        money.setBackground(new java.awt.Color(255, 255, 255));
        money.setText("0");
        money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moneyActionPerformed(evt);
            }
        });
        InfoPanel.add(money, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 342, 93, -1));

        enteramount.setForeground(new java.awt.Color(0, 0, 0));
        enteramount.setText("enter amount:");
        InfoPanel.add(enteramount, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 347, -1, -1));

        change.setEditable(false);
        change.setBackground(new java.awt.Color(255, 255, 255));
        change.setText("0");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });
        InfoPanel.add(change, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 374, 93, -1));

        changelabel.setForeground(new java.awt.Color(0, 0, 0));
        changelabel.setText("change:");
        InfoPanel.add(changelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 379, -1, -1));

        subtotal.setEditable(false);
        subtotal.setBackground(new java.awt.Color(255, 255, 255));
        subtotal.setText("0");
        subtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtotalActionPerformed(evt);
            }
        });
        InfoPanel.add(subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 342, 93, -1));

        tax.setEditable(false);
        tax.setBackground(new java.awt.Color(255, 255, 255));
        tax.setText("0");
        tax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxActionPerformed(evt);
            }
        });
        InfoPanel.add(tax, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 374, 93, -1));

        total.setEditable(false);
        total.setBackground(new java.awt.Color(255, 255, 255));
        total.setText("0");
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        InfoPanel.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 406, 93, -1));

        sublabel.setForeground(new java.awt.Color(0, 0, 0));
        sublabel.setText("subtotal:");
        InfoPanel.add(sublabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 347, -1, -1));

        taxlabel.setForeground(new java.awt.Color(0, 0, 0));
        taxlabel.setText("tax:");
        InfoPanel.add(taxlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 379, -1, -1));

        totallabel.setForeground(new java.awt.Color(0, 0, 0));
        totallabel.setText("total:");
        InfoPanel.add(totallabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 411, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/download.jpg"))); // NOI18N
        InfoPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -20, 420, 520));

        getContentPane().add(InfoPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseActionPerformed
       
        
         double sub_total = 0;
        double taxs = 0.3;
        double totals= 0;
        double totaltax = 0;
        double gold = 0 ;
        double changes = 0;
        
       
        
        if (hare.isSelected())
        {
        double hareQUAN = Integer.parseInt(hareQN.getText());    
        sub_total= sub_total + (100 * hareQUAN);
        double cost = 100 * hareQUAN;
        harecost.setText(Double.toString(cost));
        
        }
        
        if (mutsuki.isSelected())
        {
        double mutsukiQUAN = Integer.parseInt(demonQN.getText());
        sub_total= sub_total + (120 * mutsukiQUAN);
        double cost = 120 * mutsukiQUAN;
        mutsukicost.setText(Double.toString(cost));
        }
        if (shirokobutton.isSelected())
        {
        double shirokoQUAN = Integer.parseInt(ShirokoQN.getText());
        sub_total= sub_total + (140 * shirokoQUAN);
        double cost = 140 * shirokoQUAN;
        shirokocost.setText(Double.toString(cost));
        
        }
        if (HibikiButton.isSelected())
        {
        double hibikiQUAN = Integer.parseInt(HibikiQN.getText());
        sub_total= sub_total + (130 * hibikiQUAN);
        double cost = 130 * hibikiQUAN;
        hibikicost.setText(Double.toString(cost));
        
        }
        if (WakamoButton.isSelected())
        {
        double foxQUAN = Integer.parseInt(WakamoQN.getText());
        sub_total= sub_total + (200 * foxQUAN);
        double cost = 200 * foxQUAN;
        wakamocost.setText(Double.toString(cost));
        ;
        }
        if (KazusaButton.isSelected())
        {
        double catQUAN = Integer.parseInt(KazusaQN.getText());
        sub_total= sub_total + (90 * catQUAN);
        double cost = 90 * catQUAN;
        kazusacost.setText(Double.toString(cost));
        

        }
        
        
        //////////////////////////////////
           
        subtotal.setText(Double.toString(sub_total));
        sub_total = Double.parseDouble(subtotal.getText());
        
        totaltax = sub_total * taxs;
        
        
        tax.setText(Double.toString(totaltax));
        
       
      
       totals = sub_total + totaltax;
        total.setText(Double.toString(totals));
        totals = Double.parseDouble(total.getText());
        
        gold = Double.parseDouble(money.getText());
        changes = gold - totals ;
        
        money.setText(Double.toString(gold));
        change.setText(Double.toString(changes));
        
        
//        if (total.equals("0"))
//        {
//        JOptionPane.showMessageDialog(this,"INVALID INPUT");  
//        }
        if (gold < totals)
        {
           ImageIcon icon = new ImageIcon("pink.jpg"); // Replace with your icon file path
                JLabel label = new JLabel("INSUFFICIENT BALANCE",icon, JLabel.CENTER);
                label.setHorizontalTextPosition(JLabel.CENTER);
                label.setVerticalTextPosition(JLabel.BOTTOM);

                JOptionPane.showMessageDialog(
                        null,
                        label,
                        "Error",
                        JOptionPane.DEFAULT_OPTION);
        }
        
        else if (gold > totals) 
        {
        ImageIcon icon = new ImageIcon("yuuka.jpg"); // Replace with your icon file path
                JLabel label = new JLabel("THANKS FOR THE PURCHASE!",icon, JLabel.CENTER);
                label.setHorizontalTextPosition(JLabel.CENTER);
                label.setVerticalTextPosition(JLabel.BOTTOM);

                JOptionPane.showMessageDialog(
                        null,
                        label,
                        "Success",
                        JOptionPane.DEFAULT_OPTION);
        
       
        
        //activate clear all button
        clear1ActionPerformed(evt);
        }
        
      
       
       
      
    }//GEN-LAST:event_purchaseActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        
        
        double sub_total = 0;
        double taxs = 0.3;
        double totals= 0;
        double totaltax = 0;
        double gold = 0 ;
        double changes = 0;
        
       if (hare.isSelected())
        {
        double hareQUAN = Integer.parseInt(hareQN.getText());    
        sub_total= sub_total + (100 * hareQUAN);
        double cost = 100 * hareQUAN;
        harecost.setText(Double.toString(cost));
        
        }
        
        if (mutsuki.isSelected())
        {
        double mutsukiQUAN = Integer.parseInt(demonQN.getText());
        sub_total= sub_total + (120 * mutsukiQUAN);
        double cost = 120 * mutsukiQUAN;
        mutsukicost.setText(Double.toString(cost));
        }
        if (shirokobutton.isSelected())
        {
        double shirokoQUAN = Integer.parseInt(ShirokoQN.getText());
        sub_total= sub_total + (140 * shirokoQUAN);
        double cost = 140 * shirokoQUAN;
        shirokocost.setText(Double.toString(cost));
        
        }
        if (HibikiButton.isSelected())
        {
        double hibikiQUAN = Integer.parseInt(HibikiQN.getText());
        sub_total= sub_total + (130 * hibikiQUAN);
        double cost = 130 * hibikiQUAN;
        hibikicost.setText(Double.toString(cost));
        
        }
        if (WakamoButton.isSelected())
        {
        double foxQUAN = Integer.parseInt(WakamoQN.getText());
        sub_total= sub_total + (200 * foxQUAN);
        double cost = 200 * foxQUAN;
        wakamocost.setText(Double.toString(cost));
        ;
        }
        if (KazusaButton.isSelected())
        {
        double catQUAN = Integer.parseInt(KazusaQN.getText());
        sub_total= sub_total + (90 * catQUAN);
        double cost = 90 * catQUAN;
        kazusacost.setText(Double.toString(cost));

        }
        
        
        
        //////////////////////////////////
           
        subtotal.setText(Double.toString(sub_total));
        sub_total = Double.parseDouble(subtotal.getText());
        
        totaltax = sub_total * taxs;
        
        
        tax.setText(Double.toString(totaltax));
        
       
      
       totals = sub_total + totaltax;
        total.setText(Double.toString(totals));
        totals = Double.parseDouble(total.getText());
        
        gold = Double.parseDouble(money.getText());
        changes = gold - totals ;
        
        money.setText(Double.toString(gold));
        change.setText(Double.toString(changes));
        
   
    }//GEN-LAST:event_confirmActionPerformed

    private void moneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moneyActionPerformed

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeActionPerformed

    private void subtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtotalActionPerformed

    private void taxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taxActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void hareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hareActionPerformed
        if (hare.isSelected()) 
       { 
           hareQN.setEditable(true);
          ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
          HareIconMouseClicked(null);
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       }
        if (!hare.isSelected()) 
       { 
           hareQN.setEditable(false);
           hareQN.setText("1");
       }

    }//GEN-LAST:event_hareActionPerformed

    private void mutsukiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mutsukiActionPerformed
        if (mutsuki.isSelected()) 
       { 
           demonQN.setEditable(true);
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           MutsukiIconMouseClicked(null);
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       }
        
         if (!mutsuki.isSelected()) 
       { 
           demonQN.setEditable(false);
           demonQN.setText("1");
       }
        
       
    }//GEN-LAST:event_mutsukiActionPerformed
   
    
    
    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
        hare.setSelected(false);
        mutsuki.setSelected(false);
        shirokobutton.setSelected(false);
        HibikiButton.setSelected(false);
        WakamoButton.setSelected(false);
        KazusaButton.setSelected(false);
        
        hareQN.setText("1");
        demonQN.setText("1");
        ShirokoQN.setText("1");
        HibikiQN.setText("1");
        WakamoQN.setText("1");
        KazusaQN.setText("1");
        
        
        
        
        
        subtotal.setText("0");
        tax.setText("0");
        total.setText("0");
        money.setText("0");
        change.setText("0");

        
        harecost.setText("100");
        mutsukicost.setText("120");
        shirokocost.setText("140");
        hibikicost.setText("130");
        wakamocost.setText("200");
        kazusacost.setText("90");
        
       //////
        costlabel.setText("COST: ");       
        CharacterName.setText("Name: ");
        CharacterRace.setText("Race: ");
        CharacterLevel.setText("Level: ");  
        STR.setText("STR:");
        SPD.setText("SPD: ");
        INT.setText("INT: ");
        CRIT.setText("CRIT: ");
        HP.setText("HP: ");
        MP.setText("MP: ");
        DEF.setText("DEF: ");
        STA.setText("STA: ");
        descriptionText.setText("");
        CharacterImage.setText("");
        
        
        
        
        Image img4 = image4.getImage();
        Image imgScale4 = img4.getScaledInstance(CharacterImage.getWidth(), CharacterImage.getHeight(),CharacterImage.getWidth());
        ImageIcon scaledIcon4 = new ImageIcon(imgScale4);
        CharacterImage.setIcon(scaledIcon4);
    }//GEN-LAST:event_clear1ActionPerformed

    private void hareQNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hareQNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hareQNActionPerformed

    private void HareIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HareIconMouseClicked
        // miaw
           Image img = image.getImage();
           Image imgScale = img.getScaledInstance(CharacterImage.getWidth(), CharacterImage.getHeight(),CharacterImage.getWidth());
           ImageIcon scaledIcon = new ImageIcon(imgScale);
           CharacterImage.setIcon(scaledIcon);
           
           costlabel.setText("COST: 100");
           
           
           ///////
           CharacterName.setText("Name: Hare");
           CharacterRace.setText("Race: Rabbit");
           CharacterLevel.setText("Level: 17");  
           STR.setText("STR: 8");
           SPD.setText("SPD: 6");
           INT.setText("INT: 10");
           CRIT.setText("CRIT: 5");
           HP.setText("HP: 9");
           MP.setText("MP: 20");
           DEF.setText("DEF: 14");
           STA.setText("STA: 9");
           descriptionText.setText("<html>Miaw miaw miaw miaw miaw miaw miaw miaw miaw miaw miaw miaw"
                   + "<br> Miaw miaw miaw miaw miaw miaw miaw miaw miaw miaw miaw miaw<br>Miaw miaw miaw miaw miaw miaw miaw miaw miaw miaw miaw miaw<br>Miaw miaw miaw miaw miaw miaw miaw miaw miaw miaw miaw miaw<br> "
                   + "</html>");
           
    }//GEN-LAST:event_HareIconMouseClicked

    private void MutsukiIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MutsukiIconMouseClicked
           Image img = image2.getImage();
           Image imgScale = img.getScaledInstance(CharacterImage.getWidth(), CharacterImage.getHeight(),CharacterImage.getWidth());
           ImageIcon scaledIcon = new ImageIcon(imgScale);
           CharacterImage.setIcon(scaledIcon);
           costlabel.setText("COST: 120");
           
           //////////
           CharacterName.setText("Name: Mutsuki");
           CharacterRace.setText("Race: Troll");
           CharacterLevel.setText("Level: 16");  
           STR.setText("STR: 13");
           SPD.setText("SPD: 5");
           INT.setText("INT: 6");
           CRIT.setText("CRIT: 10");
           HP.setText("HP: 7");
           MP.setText("MP: 15");
           DEF.setText("DEF: 3");
           STA.setText("STA: 5");
           descriptionText.setText("kufufu");
    }//GEN-LAST:event_MutsukiIconMouseClicked

    private void shirokoIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shirokoIconMouseClicked
           Image img = shiroko.getImage();
           Image imgScale = img.getScaledInstance(CharacterImage.getWidth(), CharacterImage.getHeight(),CharacterImage.getWidth());
           ImageIcon scaledIcon = new ImageIcon(imgScale);
           CharacterImage.setIcon(scaledIcon);
           costlabel.setText("COST: 140");
           
           
           //////////
           CharacterName.setText("Name: Shiroko");
           CharacterRace.setText("Race: Wolf");
           CharacterLevel.setText("Level: 16");  
           STR.setText("STR: 20");
           SPD.setText("SPD: 16");
           INT.setText("INT: 5");
           CRIT.setText("CRIT: 15");
           HP.setText("HP: 10");
           MP.setText("MP: 4");
           DEF.setText("DEF: 9");
           STA.setText("STA: 9");
           descriptionText.setText("Woof Woof");
    }//GEN-LAST:event_shirokoIconMouseClicked

    private void hibikiIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hibikiIconMouseClicked
            Image img = hibiki.getImage();
           Image imgScale = img.getScaledInstance(CharacterImage.getWidth(), CharacterImage.getHeight(),CharacterImage.getWidth());
           ImageIcon scaledIcon = new ImageIcon(imgScale);
           CharacterImage.setIcon(scaledIcon);
           costlabel.setText("COST: 130");
           
           
           //////////
           CharacterName.setText("Name: Hibiki");
           CharacterRace.setText("Race: Dog");
           CharacterLevel.setText("Level: 15");  
           STR.setText("STR: 16");
           SPD.setText("SPD: 15");
           INT.setText("INT: 9");
           CRIT.setText("CRIT: 8");
           HP.setText("HP: 10");
           MP.setText("MP: 6");
           DEF.setText("DEF: 8");
           STA.setText("STA: 8");
           descriptionText.setText("ugh ugh uarf arf");
    }//GEN-LAST:event_hibikiIconMouseClicked

    private void WakamoIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WakamoIconMouseClicked
       Image img = wakamo.getImage();
           Image imgScale = img.getScaledInstance(CharacterImage.getWidth(), CharacterImage.getHeight(),CharacterImage.getWidth());
           ImageIcon scaledIcon = new ImageIcon(imgScale);
           CharacterImage.setIcon(scaledIcon);
           costlabel.setText("COST: 200");
           
           
           //////////
           CharacterName.setText("Name: Wakamo");
           CharacterRace.setText("Race: Fox");
           CharacterLevel.setText("Level: 18");  
           STR.setText("STR: 20");
           SPD.setText("SPD: 15");
           INT.setText("INT: 14");
           CRIT.setText("CRIT: 12");
           HP.setText("HP: 13");
           MP.setText("MP: 4");
           DEF.setText("DEF: 9");
           STA.setText("STA: 10");
           descriptionText.setText("ehahahahahaha");
    }//GEN-LAST:event_WakamoIconMouseClicked

    private void cattoIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cattoIconMouseClicked
           Image img = cat.getImage();
           Image imgScale = img.getScaledInstance(CharacterImage.getWidth(), CharacterImage.getHeight(),CharacterImage.getWidth());
           ImageIcon scaledIcon = new ImageIcon(imgScale);
           CharacterImage.setIcon(scaledIcon);
           costlabel.setText("COST: 90");
           
           
           //////////
           CharacterName.setText("Name: Kazusa");
           CharacterRace.setText("Race: Cat");
           CharacterLevel.setText("Level: 15");  
           STR.setText("STR: 7");
           SPD.setText("SPD: 20");
           INT.setText("INT: 10");
           CRIT.setText("CRIT: 14");
           HP.setText("HP: 9");
           MP.setText("MP: 3");
           DEF.setText("DEF: 3");
           STA.setText("STA: 15");
           descriptionText.setText("mew moew meow");
    }//GEN-LAST:event_cattoIconMouseClicked

    private void shirokobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shirokobuttonActionPerformed
         if (shirokobutton.isSelected()) 
       { 
           ShirokoQN.setEditable(true);
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           shirokoIconMouseClicked(null);
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       }
        
         if (!shirokobutton.isSelected()) 
       { 
           ShirokoQN.setEditable(false);
           ShirokoQN.setText("1");
       }
    }//GEN-LAST:event_shirokobuttonActionPerformed

    private void HibikiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HibikiButtonActionPerformed
        if (HibikiButton.isSelected()) 
       { 
           HibikiQN.setEditable(true);
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           hibikiIconMouseClicked(null);
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       }
        
         if (!HibikiButton.isSelected()) 
       { 
           HibikiQN.setEditable(false);
           HibikiQN.setText("1");
       }
    }//GEN-LAST:event_HibikiButtonActionPerformed

    private void WakamoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WakamoButtonActionPerformed
        if (WakamoButton.isSelected()) 
       { 
           WakamoQN.setEditable(true);
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           WakamoIconMouseClicked(null);
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       }
        
         if (!WakamoButton.isSelected()) 
       { 
           WakamoQN.setEditable(false);
           WakamoQN.setText("1");
       }
    }//GEN-LAST:event_WakamoButtonActionPerformed

    private void KazusaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KazusaButtonActionPerformed
        if (KazusaButton.isSelected()) 
       { 
           KazusaQN.setEditable(true);
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           cattoIconMouseClicked(null);
           ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       }
        
         if (!KazusaButton.isSelected()) 
       { 
           KazusaQN.setEditable(false);
           KazusaQN.setText("1");
       }
    }//GEN-LAST:event_KazusaButtonActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainShop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CRIT;
    private javax.swing.JLabel CharacterImage;
    private javax.swing.JLabel CharacterLevel;
    private javax.swing.JLabel CharacterName;
    private javax.swing.JLabel CharacterRace;
    private javax.swing.JLabel CompanionAvailable;
    private javax.swing.JLabel DEF;
    private javax.swing.JLabel HP;
    private javax.swing.JLabel HareIcon;
    private javax.swing.JRadioButton HibikiButton;
    private javax.swing.JTextField HibikiQN;
    private javax.swing.JLabel INT;
    private javax.swing.JPanel InfoPanel;
    private javax.swing.JRadioButton KazusaButton;
    private javax.swing.JTextField KazusaQN;
    private javax.swing.JLabel MP;
    private javax.swing.JLabel MutsukiIcon;
    private javax.swing.JPanel ProductPanel;
    private javax.swing.JLabel SPD;
    private javax.swing.JLabel STA;
    private javax.swing.JLabel STR;
    private javax.swing.JScrollPane SelectPet;
    private javax.swing.JTextField ShirokoQN;
    private javax.swing.JRadioButton WakamoButton;
    private javax.swing.JLabel WakamoIcon;
    private javax.swing.JTextField WakamoQN;
    private javax.swing.JLabel cattoIcon;
    private javax.swing.JTextField change;
    private javax.swing.JLabel changelabel;
    private javax.swing.JButton clear1;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel costlabel;
    private javax.swing.JTextField demonQN;
    private javax.swing.JLabel descriptionText;
    private javax.swing.JLabel desk;
    private javax.swing.JLabel enteramount;
    private javax.swing.JRadioButton hare;
    private javax.swing.JTextField hareQN;
    private javax.swing.JLabel harecost;
    private javax.swing.JLabel hibikiIcon;
    private javax.swing.JLabel hibikicost;
    private javax.swing.JPanel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel kazusacost;
    private javax.swing.JTextField money;
    private javax.swing.JRadioButton mutsuki;
    private javax.swing.JLabel mutsukicost;
    private javax.swing.JButton purchase;
    private javax.swing.JLabel quantitylabel;
    private javax.swing.JLabel quantitylabel1;
    private javax.swing.JLabel quantitylabel2;
    private javax.swing.JLabel quantitylabel3;
    private javax.swing.JLabel quantitylabel4;
    private javax.swing.JLabel quantitylabel5;
    private javax.swing.JPanel selectpanel;
    private javax.swing.JLabel shirokoIcon;
    private javax.swing.JRadioButton shirokobutton;
    private javax.swing.JLabel shirokocost;
    private javax.swing.JPanel statsPanel;
    private javax.swing.JLabel sublabel;
    private javax.swing.JTextField subtotal;
    private javax.swing.JTextField tax;
    private javax.swing.JLabel taxlabel;
    private javax.swing.JTextField total;
    private javax.swing.JLabel totallabel;
    private javax.swing.JLabel wakamocost;
    // End of variables declaration//GEN-END:variables
}
