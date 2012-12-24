import greenfoot.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
public class RouteCreator extends World {
    Color drawingColor = null;
    List<Point> points = new ArrayList<Point>();
    
    public RouteCreator() {
        super(600, 400, 1);
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
    }
    
    public void act() {
        if(drawingColor == null) {
            if(Greenfoot.mousePressed(null)) {
                drawingColor = Util.getRandomColor().brighter();
                getBackground().setColor(drawingColor);
            }
        } else if(Greenfoot.mouseClicked(null)) {
            StringBuilder s = new StringBuilder("new RouteSegment(new Point[] {\n");
            for(int i = 0; i < points.size(); i++) {
                Point point = points.get(i);
                s.append("\tnew Point(" + point.getX() + ", " + point.getY() + ")");
                if(i < points.size() - 1) s.append(",\n");
            }
            s.append("}),");
            System.out.println(s);
            points = new ArrayList<Point>();
            drawingColor = null;
        }
        
        if(drawingColor != null) {
            MouseInfo m = Greenfoot.getMouseInfo();
            if(m != null) {
                Point prevPoint = (points.isEmpty() ? null : points.get(points.size() - 1));
                Point newPoint = new Point(m.getX(), m.getY());
                if(prevPoint != null) {
                    int xDiff = Math.abs(prevPoint.getX() - newPoint.getX());
                    int yDiff = Math.abs(prevPoint.getY() - newPoint.getY());
                    int totalDiff = xDiff + yDiff;
                    if(totalDiff > 3) {
                        getBackground().drawLine(
                            prevPoint.getX(), prevPoint.getY(),
                            newPoint.getX(), newPoint.getY());
                        points.add(newPoint);
                    }
                } else {
                    points.add(newPoint);
                }
            }
        }
    }
}
