//adminmenu
package IconResized;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class shirkomoney extends JPanel{
    
    
    
    public shirkomoney() {
        setSize(new Dimension(100,100));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
       g2.setColor(Color.orange);
        g2.drawImage(img, 0, 0, getWidth(), getHeight(), null);
    }
    
    //C:\Users\GodisGood\Documents\NetBeansProjects\LPHS_GUI 2.0\src\icons\{88BB61C8-BE7E-4A9B-A50A-33A966E77F2E}.png
    Image img = new ImageIcon(getClass().getResource("/icons/{88BB61C8-BE7E-4A9B-A50A-33A966E77F2E}.png")).getImage();
    
}