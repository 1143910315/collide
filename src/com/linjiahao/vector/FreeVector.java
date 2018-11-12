package com.linjiahao.vector;

import com.linjiahao.point.Point;

public class FreeVector {
	public Point finishingPoint;
	
	public FreeVector(Point finishingPoint) {
		this.finishingPoint = new Point(finishingPoint);
	}
	
	public FreeVector(Point startingPoint, Point finishingPoint) {
		this.finishingPoint = new Point(finishingPoint.getX() - startingPoint.getX(),
				finishingPoint.getY() - startingPoint.getY());
	}
	
}
