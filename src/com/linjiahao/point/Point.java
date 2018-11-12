package com.linjiahao.point;

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
		if (o.x != x) {
			return (int) (x - o.x);
		} else if (o.y != y) {
			return (int) (y - o.y);
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
