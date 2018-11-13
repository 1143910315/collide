package com.linjiahao.point;

import java.text.DecimalFormat;

public class Point implements Comparable<Point> {
	private double	x;
	private double	y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(Point p) {
		x = p.x;
		y = p.y;
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double point2PointDistance(Point point) {
		double x = point.x - this.x;
		double y = point.y - this.y;
		return Math.sqrt(x * x + y * y);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ temp >>> 32);
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ temp >>> 32);
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
		Point other = (Point) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x)) {
			return false;
		}
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y)) {
			return false;
		}
		return true;
	}
	
	@Override
	public int compareTo(Point o) {
		int xCut = (int) (x * 100000 - o.x * 100000);
		int yCut = (int) (y * 100000 - o.y * 100000);
		if (xCut != 0) {
			return xCut;
		} else if (yCut != 0) {
			return yCut;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("#.######");
		return "(" + format.format(x) + "," + format.format(y) + ")";
	}
}
