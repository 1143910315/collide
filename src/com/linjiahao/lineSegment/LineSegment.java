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
		double left = Math.min(
		        Math.min(Math.min(getStart(), getStart() + getLength()), examiner.getStart()),
		        examiner.getStart() + examiner.getLength());
		double right = Math.max(
		        Math.max(Math.max(getStart(), getStart() + getLength()), examiner.getStart()),
		        examiner.getStart() + examiner.getLength());
		double len = right - left;
		double acLen = Math.abs(getLength()) + Math.abs(examiner.getLength());
		if (len < acLen) {
			return 1;
		} else if (getLength() == 0) {
			if (getStart() > examiner.getStart()
			        && getStart() < examiner.getStart() + examiner.getLength()) {
				return 1;
			} else if (getStart() == examiner.getStart()
			        || getStart() == examiner.getStart() + examiner.getLength()) {
				return 0;
			}
		} else if (examiner.getLength() == 0) {
			if (examiner.getStart() > getStart()
			        && examiner.getStart() < getStart() + getLength()) {
				return 1;
			} else if (examiner.getStart() == getStart()
			        || examiner.getStart() == getStart() + getLength()) {
				return 0;
			}
		} else if (len == acLen) {
			return 0;
		}
		return -1;
	}
}
