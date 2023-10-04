
package mainFrame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JPanel;


public class infoHolder extends JPanel{
    
    //~variables
    
    int vertGap;
    int numOfPanels;
    
    public infoHolder() {
        setBackground(new Color(30,30,30));
        
        vertGap = 5;
        setLayout(new FlowLayout(0, 5, vertGap));
        
        numOfPanels = 1;
        updatePanelSize();
        setBackground(new Color(220, 220, 220));
    }
    
    public void setNumOfPanels(int numOfPanels) {
        this.numOfPanels = numOfPanels;
        updatePanelSize();
    }
    
    public void updatePanelSize() {
        int vGap = vertGap * 2;
        int totalPanelHeight = numOfPanels * (35 + vGap);
        int autoHeight = totalPanelHeight + vGap;
        setPreferredSize(new Dimension(450, autoHeight));
        revalidate();
    }
    
}
