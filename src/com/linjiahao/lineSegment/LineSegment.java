package com.linjiahao.lineSegment;

public class LineSegment {
	private double	start;
	private double	length;

	public LineSegment(double start, double length) {
		this.start = start;
		this.length = length;
	}

	public double getStart() {
		return start;
	}

	public void setStart(double start) {
		this.start = start;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	/********
	 * 检查是否重叠
	 *
	 * @param examiner 被检查的线段
	 * @return 1为重叠，0为接触，-1为不重叠
	 */
	public int overlap(LineSegment examiner) {
		double s, l, s1, l1;
		if (getLength() < 0) {
			l = -getLength();
			s = getStart() + getLength();
		} else {
			s = getStart();
			l = getLength();
		}
		if (examiner.getLength() < 0) {
			l1 = -examiner.getLength();
			s1 = examiner.getStart() + examiner.getLength();
		} else {
			s1 = examiner.getStart();
			l1 = examiner.getLength();
		}
		if (s + l < s1 || s > s1 + l1) {
			return -1;
		} else if (s + l == s1 || s == s1 + l1) {
			return 0;
		} else {
			return 1;
		}
	}
}
