package com.linjiahao;

import java.util.Arrays;
import java.util.List;

import com.linjiahao.graphics.Graphics;
import com.linjiahao.point.Point;
import com.linjiahao.tools.Check;
import com.linjiahao.vector.Vector;

public class Main {
	
	public static void main(String[] args) {
		Point startingPoint = new Point(0, 0);
		Point middlePoint = new Point(0, 1);
		Point finishingPoint = new Point(1, 0);
		List<Vector> vectors = Arrays.asList(new Vector(startingPoint, middlePoint),
				new Vector(middlePoint, finishingPoint), new Vector(finishingPoint, startingPoint));
		Graphics graphics = new Graphics(vectors);
		Point startingPoint1 = new Point(0, 1);
		Point middlePoint1 = new Point(2, 1);
		Point finishingPoint1 = new Point(1, 2);
		List<Vector> vectors1 = Arrays.asList(new Vector(startingPoint1, middlePoint1),
				new Vector(middlePoint1, finishingPoint1),
				new Vector(finishingPoint1, startingPoint1));
		Graphics graphics1 = new Graphics(vectors1);
		System.out.println(Check.intersect(graphics, graphics1));
	}
	
}
