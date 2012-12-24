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
			return;
		}
		Point point = currentRoute.getPoint(currentPointIndex);
		moveTowardsPoint(point);
		if(isAtPoint(point)) {
			currentPointIndex++;
			if(currentPointIndex == currentRoute.getNumPoints()) {
				currentRoute = currentRoute.getRandomNextRoute();
				currentPointIndex = 0;
			}
		}
	}

	public void moveTowardsPoint(Point point) {
		turnTowards(point.getX(), point.getY());
		move(speed);
	}

	public boolean isAtPoint(Point point) {
		int xDiff = Math.abs(point.getX() - getX());
		int yDiff = Math.abs(point.getY() - getY());
		int totalDiff = xDiff + yDiff;
		return totalDiff < speed;
	}
}
