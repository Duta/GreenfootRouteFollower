import greenfoot.*;
class RouteFollower extends Actor {
    private int currentPointIndex;
    private RouteSegment currentRoute;
    private int speed = 3;

    public RouteFollower(RouteSegment routeToFollow) {
        currentRoute = routeToFollow;
        currentPointIndex = 0;
    }

    public void act() {
        if(currentRoute == null) {
            getWorld().removeObject(this);
            return;
        }
        Point point = currentRoute.getPoint(currentPointIndex);
        Point nextPoint = currentRoute.getPoint(currentPointIndex + 1);
        moveTowardsPoint(point, nextPoint);
        if(isAtPoint(point)) {
            currentPointIndex++;
            if(currentPointIndex == currentRoute.getNumPoints()) {
                currentRoute = currentRoute.getRandomNextRoute();
                currentPointIndex = 0;
            }
        }
    }

    public void moveTowardsPoint(Point point, Point nextPoint) {
        turnTowards(point.getX(), point.getY());
        move(speed);
        // To try and reduce visual juddering, point towards the next point.
        if(nextPoint != null) turnTowards(nextPoint.getX(), nextPoint.getY());
    }

    public boolean isAtPoint(Point point) {
        int xDiff = Math.abs(point.getX() - getX());
        int yDiff = Math.abs(point.getY() - getY());
        int totalDiff = xDiff + yDiff;
        return totalDiff < speed;
    }
}