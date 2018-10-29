package com.linjiahao.vector;

import com.linjiahao.point.Point;

public class Vector {
public Point startingPoint;
public Point finishingPoint;
public Point getStartingPoint() {
	return startingPoint;
}

public void setStartingPoint(Point startingPoint) {
	this.startingPoint = startingPoint;
}

public Point getFinishingPoint() {
	return finishingPoint;
}

public void setFinishingPoint(Point finishingPoint) {
	this.finishingPoint = finishingPoint;
}
public double getAngle() {
	return Math.atan2(finishingPoint.y-startingPoint.y, finishingPoint.x-startingPoint.x)*180/Math.PI;
}
public double getRadian() {
	return Math.atan2(finishingPoint.y-startingPoint.y, finishingPoint.x-startingPoint.x);
}
}
