
package assets;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class iconresizer2 extends JPanel {

    int x;
    Timer tm;
    int duration = 500; // Total animation duration in milliseconds
    long startTime;

    public iconresizer2() {
        setSize(new Dimension(100, 100));
    }

    public void StartTimer() {
        x = 0;
        System.out.println("X: " + x);
        startTime = System.currentTimeMillis();
        
        tm = new Timer(16, new ActionListener() { // 60 frames per second
            @Override
            public void actionPerformed(ActionEvent e) {
                long currentTime = System.currentTimeMillis();
                long elapsedTime = currentTime - startTime;

                if (elapsedTime >= duration) {
                    x = 100; // Set the final position
                    tm.stop(); // Stop the timer when the animation is complete
                } else {
                    // Calculate the eased value for x using an ease-in-out function
                    double t = (double) elapsedTime / duration;
                    double easedT = easeInOut(t);
                    
                    // Calculate the position of x
                    x = (int) (easedT * 100); // 100 is the final position
                }
                
                repaint();
                setLocation(x, 0);
                System.out.println("X: " + x);
            }
        });
        tm.start();
    }
    
    // Easing function (ease-in-out)
    private double easeInOut(double t) {
        return t < 0.5 ? 2 * t * t : 1 - Math.pow(-2 * t + 2, 2) / 2;
    }
}

