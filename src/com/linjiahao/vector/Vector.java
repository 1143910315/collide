package com.linjiahao.vector;

import com.linjiahao.point.Point;

public class Vector {
	public Point	startingPoint;
	public Point	finishingPoint;

	public Vector() {
		startingPoint = new Point(0, 0);
		finishingPoint = new Point(0, 0);
	}

	public Vector(Point startingPoint, Point finishingPoint) {
		this.startingPoint = new Point(startingPoint);
		this.finishingPoint = new Point(finishingPoint);
	}

	public Vector(Vector vector) {
		startingPoint = new Point(vector.startingPoint);
		finishingPoint = new Point(vector.finishingPoint);
	}

	public Point getStartingPoint() {
		return new Point(startingPoint);
	}

	public void setStartingPoint(Point startingPoint) {
		this.startingPoint = new Point(startingPoint);
	}

	public Point getFinishingPoint() {
		return new Point(finishingPoint);
	}

	public void setFinishingPoint(Point finishingPoint) {
		this.finishingPoint = new Point(finishingPoint);
	}

	public double getAngle() {
		return Math.atan2(startingPoint.getY() - finishingPoint.getY(),
		        finishingPoint.getX() - startingPoint.getX()) * 180 / Math.PI;
	}

	public double getRadian() {
		return Math.atan2(startingPoint.getY() - finishingPoint.getY(),
		        finishingPoint.getX() - startingPoint.getX());
	}

	public Vector getNormalVector() {
		return new Vector(new Point(startingPoint), new Point(1, 0));

	}
}
