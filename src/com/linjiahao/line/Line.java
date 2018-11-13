package com.linjiahao.line;

import java.text.DecimalFormat;

import com.linjiahao.exception.NonstandardException;
import com.linjiahao.point.Point;

public class Line {
	private double	A;
	private double	B;
	private double	C;
	
	public Line(double a, double b, double c) {
		A = a;
		B = b;
		C = c;
		if (A == 0 && B == 0) {
			throw new NonstandardException("直线方程的A和B不能同时为0。");
		}
	}
	
	public Line(Point a, Point b) {
		double x1 = a.getX();
		double y1 = a.getY();
		double x2 = b.getX();
		double y2 = b.getY();
		A = y2 - y1;
		B = -(x2 - x1);
		C = -x1 * (y2 - y1) + y1 * (x2 - x1);
	}
	
	public double getA() {
		return A;
	}
	
	public void setA(double a) {
		A = a;
	}
	
	public double getB() {
		return B;
	}
	
	public void setB(double b) {
		B = b;
	}
	
	public double getC() {
		return C;
	}
	
	public void setC(double c) {
		C = c;
	}
	
	public Point point2LinePedal(Point point) {
		double A2addB2 = A * A + B * B;
		return new Point((B * B * point.getX() - A * B * point.getY() - A * C) / A2addB2,
				(A * A * point.getY() - A * B * point.getX() - B * C) / A2addB2);
	}
	
	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("#.######");
		return format.format(A) + "x" + (B < 0 ? format.format(B) : "+" + format.format(B)) + "y"
				+ (C < 0 ? format.format(C) : "+" + format.format(C)) + "=0";
	}
}
