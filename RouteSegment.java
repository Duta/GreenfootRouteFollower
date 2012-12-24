import greenfoot.*;
import java.util.ArrayList;
import java.util.List;

class RouteSegment {
	private Point[] points;
	private List<RouteSegment> nextPossibleRoutes;
	
	public RouteSegment(Point[] points) {
		this.points = points;
		nextPossibleRoutes = new ArrayList<RouteSegment>();
	}

	public void addNextRoute(RouteSegment routeSegment) {
		nextPossibleRoutes.add(routeSegment);
	}

	public void removeNextRoute(RouteSegment routeSegment) {
		nextPossibleRoutes.remove(routeSegment);
	}

	public void setPoints(Point[] points) {
		this.points = points;
	}

	public Point[] getPoints() {
		return points;
	}

	public Point getPoint(int pointIndex) {
		return points[pointIndex];
	}

	public RouteSegment getRandomNextRoute() {
		if(nextPossibleRoutes.isEmpty()) {
			return null;
		}
		int randomIndex = Greenfoot.getRandomNumber(nextPossibleRoutes.size());
		return nextPossibleRoutes.get(randomIndex);
	}
}
