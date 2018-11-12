package com.linjiahao.vector;

import com.linjiahao.line.Line;
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
	
	public Vector(Point startingPoint, double length, double radian) {
		this.startingPoint = new Point(startingPoint);
		finishingPoint = new Point(Math.cos(radian) * length + startingPoint.getX(),
				-Math.sin(radian) * length + startingPoint.getY());
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
		return new Vector(startingPoint, 1, getRadian() + Math.PI / 2);
		
	}
	
	public Line vector2Line() {
		return new Line(startingPoint, finishingPoint);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (finishingPoint == null ? 0 : finishingPoint.hashCode());
		result = prime * result + (startingPoint == null ? 0 : startingPoint.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Vector other = (Vector) obj;
		if (finishingPoint == null) {
			if (other.finishingPoint != null) {
				return false;
			}
		} else if (!finishingPoint.equals(other.finishingPoint)) {
			return false;
		}
		if (startingPoint == null) {
			if (other.startingPoint != null) {
				return false;
			}
		} else if (!startingPoint.equals(other.startingPoint)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "{" + startingPoint.toString() + "->" + finishingPoint.toString() + "}";
	}
}
