package com.linjiahao.point;

public class Point {
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

}
