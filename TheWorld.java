import greenfoot.*;
import java.awt.Color;
public class TheWorld extends World {
    int counter = 0;
    
    public TheWorld() {
        super(600, 400, 1, false);
        drawBackground();
    }
    
    public void act() {
        if(counter % 100 == 0) {
            RouteFollower routeFollower = new RouteFollower(RouteSegmentDB.segments[0]);
            addObject(routeFollower, 0, getHeight() - 1);
        }
        counter++;
    }
    
    private void drawBackground() {
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        getBackground().setColor(Color.GRAY);
        for(RouteSegment rs : RouteSegmentDB.segments) {
            if(rs.getNumPoints() == 0) continue;
            Point prevPoint = rs.getPoint(0);
            for(int i = 1; i < rs.getNumPoints(); i++) {
                Point newPoint = rs.getPoint(i);
                getBackground().drawLine(prevPoint.getX(), prevPoint.getY(), newPoint.getX(), newPoint.getY());
                prevPoint = newPoint;
            }
        }
    }
}
