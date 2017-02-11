import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
     /**
     * 
     */
    private static final long serialVersionUID = 7057541440811488699L;
    
    public void paintComponent(Graphics g) {
         super.paintComponent(g);
         
         //Compute interior coordinates
         Insets myInsets = this.getInsets();
         int x1 = myInsets.left;
         int y1 = myInsets.top;
         int x2 = getWidth() - myInsets.right - 1;
         int y2 = getHeight() - myInsets.bottom - 1;
         int width = x2 - x1;
         int height = y2 - y1;

         //Paint the background
         g.setColor(Color.GRAY);
         g.fillRect(x1, y1, width + 1, height + 1);
         
         //Draw a border
         g.setColor(Color.BLACK);
         g.drawRect(x1, y1, width, height);
         
         
         //Draw first red line.
         Polygon line1 = new Polygon();
         g.setColor(Color.RED);
         line1.addPoint(x1, height / 5);
         line1.addPoint(x2, height / 5);
         line1.addPoint(x2, y1);
         line1.addPoint(x1, y1);
         g.fillPolygon(line1);
         
       //Draw first white line.
         Polygon line2 = new Polygon();
         g.setColor(Color.WHITE);
         line2.addPoint(x1, (height / 5) * 2);
         line2.addPoint(x2, (height / 5) * 2);
         line2.addPoint(x2, height / 5);
         line2.addPoint(x1, height / 5);
         g.fillPolygon(line2);
         
       //Draw second red line.
         Polygon line3 = new Polygon();
         g.setColor(Color.RED);
         line3.addPoint(x2, (height / 5) * 3);
         line3.addPoint(x2, (height / 5) * 2);
         line3.addPoint(x1, (height / 5) * 2);
         line3.addPoint(x1, (height / 5) * 3);
         g.fillPolygon(line3);
         
       //Draw second white line.
         Polygon line4 = new Polygon();
         g.setColor(Color.WHITE);
         line4.addPoint(x1, (height / 5) * 4);
         line4.addPoint(x2, (height / 5) * 4);
         line4.addPoint(x2, (height / 5) * 3);
         line4.addPoint(x1, (height / 5) * 3);
         g.fillPolygon(line4);
         
         //Draw third red line.
         Polygon line5 = new Polygon();
         g.setColor(Color.RED);
         line5.addPoint(x1, (height / 5) * 5);
         line5.addPoint(x2, (height / 5) * 5);
         line5.addPoint(x2, (height / 5) * 4);
         line5.addPoint(x1, (height / 5) * 4);
         g.fillPolygon(line5);
         
                  
         // Draw triangle of the flag.
         Polygon p = new Polygon();
         g.setColor(Color.BLUE);
         p.addPoint(x1, y1);
         p.addPoint(width / 2, height / 2);
         p.addPoint(x1, y2);
         g.fillPolygon(p);

         // Draw star
         Polygon p2 = new Polygon();
         p2.addPoint(x1 + 25, y1 + 73);
         p2.addPoint(x1 + 41, y1 + 73);
         p2.addPoint(x1 + 47, y1 + 58);
         p2.addPoint(x1 + 53, y1 + 73);
         p2.addPoint(x1 + 69, y1 + 73);
         p2.addPoint(x1 + 56, y1 + 83);
         p2.addPoint(x1 + 61, y1 + 98);
         p2.addPoint(x1 + 47, y1 + 88);
         p2.addPoint(x1 + 34, y1 + 98);
         p2.addPoint(x1 + 38, y1 + 83);
         g.setColor(Color.WHITE);
         g.fillPolygon(p2);
         
     }

}