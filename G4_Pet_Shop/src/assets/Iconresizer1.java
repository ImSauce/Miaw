package assets;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Iconresizer1 extends JPanel{
    
    
    
    public Iconresizer1() {
        setSize(new Dimension(100,100));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
       g2.setColor(Color.orange);
        g2.drawImage(img, 0, 0, getWidth(), getHeight(), null);
    }
    
    
    Image img = new ImageIcon(getClass().getResource("/Images/Picture1222.png")).getImage();
    
}
