package assets;

import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.basic.*;

public class ACScrollBar extends JScrollBar {
    
    public int getTHUMB_SIZE() {
        return THUMB_SIZE;
    }
    
    public void setTHUMB_SIZE(int THUMB_SIZE) {
        this.THUMB_SIZE = THUMB_SIZE;
    }
    
    public Color getBackGround() {
        return BackGround;
    }
    
    public void setBackGround(Color BackGround) {
        this.BackGround = BackGround;
    }
    
    public Color getPrimaryForeground() {
        return primaryForeground;
    }
    
    public void setPrimaryForeground(Color primaryForeground) {
        this.primaryForeground = primaryForeground;
    }
    
    public Color getTrackColor() {
        return TrackColor;
    }
    
    public void setTrackColor(Color TrackColor) {
        this.TrackColor = TrackColor;
    }
    
    public int getArchSize() {
        return ArchSize;
    }
    
    public void setArchSize(int ArchSize) {
        this.ArchSize = ArchSize;
    }
    
    private class ModernScrollBar extends BasicScrollBarUI {
        
        private final int THUMB_SIZE = getTHUMB_SIZE();
        
        @Override
        protected Dimension getMinimumThumbSize() {
            
            if (scrollbar.getOrientation()==JScrollBar.VERTICAL) {
                
                return new Dimension(0, THUMB_SIZE);
                
            } else {
                
                return new Dimension(THUMB_SIZE,0);
                
            }
            
        }
        
        @Override
        protected Dimension getMaximumThumbSize() {
            
            if (scrollbar.getOrientation()==JScrollBar.VERTICAL) {
                
                return new Dimension(0, THUMB_SIZE);
                
            } else {
                
                return new Dimension(THUMB_SIZE,0);
                
            }
            
        }
        
        @Override
        protected JButton createIncreaseButton(int i) {
            
            return new ScrollBarButton();
            
        }

        @Override
        protected JButton createDecreaseButton(int i) {
            
            return new ScrollBarButton();
            
        }
        
        @Override
        protected void paintTrack(Graphics g, JComponent c, Rectangle rctngl) {
            
            Graphics2D g2 = (Graphics2D)g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int orientation = scrollbar.getOrientation(); int size;
            int x; int y;
            int Width; int Height;
            
            if (orientation == JScrollBar.VERTICAL) {
                
                size = rctngl.width/2;
                x = rctngl.x +((rctngl.width-size)/2);
                y = rctngl.y+10;
                Width = size;
                Height = (rctngl.height)-(10+10);
                
            } else {
                
                size = rctngl.height/2;
                y = rctngl.y +((rctngl.height-size)/2);
                x = 0;
                Width = rctngl.width;
                Height = size;
                
            }
            
            g2.setColor(getTrackColor());
            g2.fillRoundRect(x, y, Width, Height, getArchSize(), getArchSize());
            
        }
        
        @Override
        protected void paintThumb(Graphics g, JComponent c, Rectangle rctngl) {
            
            Graphics2D g2 = (Graphics2D)g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int x = rctngl.x; int y = rctngl.y;
            int Width = rctngl.width; int Height = rctngl.height;
            
            if (scrollbar.getOrientation()==JScrollBar.VERTICAL) {
                
                y += 8;
                Height -= 16;
                
            } else {
                
                x += 8;
                Width -= 16;
                
            }
            
            g2.setColor(scrollbar.getForeground());
            g2.fillRoundRect(x, y, Width, Height,10,10);
            
        }
        
        private class ScrollBarButton extends JButton {

            public ScrollBarButton() {
                setBorder(BorderFactory.createEmptyBorder());
            }
            
        }
        
    }
    
    public ACScrollBar () {
        
        ArchSize = 10;
        THUMB_SIZE = 40;
        BackGround = new Color(40,40,40);
        TrackColor = new Color(35,35,35);
        primaryForeground = new Color(50,50,50);
        
        setUI(new ModernScrollBar());
        setPreferredSize(new Dimension(8,100));
        setForeground(primaryForeground);
        setBackground(BackGround);
        setUnitIncrement(10);
        
    }
    
    private int ArchSize;
    private int THUMB_SIZE;
    private Color TrackColor;
    private Color BackGround;
    private Color primaryForeground;
    
}