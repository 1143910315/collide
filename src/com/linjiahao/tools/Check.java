package com.linjiahao.tools;

import java.util.Iterator;
import java.util.Set;

import com.linjiahao.graphics.Graphics;
import com.linjiahao.line.Line;
import com.linjiahao.point.Point;
import com.linjiahao.vector.Vector;

public class Check {
	
	public static int intersect(Graphics graphics1, Graphics graphics2) {
		Set<Point> pointItem = graphics1.getSinglePointItem();
		Set<Point> pointItem2 = graphics2.getSinglePointItem();
		boolean isTouch = false;
		for (Iterator<Vector> iterator = graphics1.iterator(); iterator.hasNext();) {
			Vector vector = iterator.next();
			Vector normalVector = vector.getNormalVector();
			Line line = normalVector.vector2Line();
			Point pointMax = null, pointMin = null, pointMax1 = null, pointMin1 = null;
			for (Point point : pointItem) {
				Point linePedal = line.point2LinePedal(point);
				if (pointMax == null) {
					pointMax = linePedal;
					pointMin = linePedal;
				} else if (linePedal.compareTo(pointMax) > 0) {
					pointMax = linePedal;
				} else if (linePedal.compareTo(pointMin) < 0) {
					pointMin = linePedal;
				}
			}
			for (Point point : pointItem2) {
				Point linePedal = line.point2LinePedal(point);
				if (pointMax1 == null) {
					pointMax1 = linePedal;
					pointMin1 = linePedal;
				} else if (linePedal.compareTo(pointMax1) > 0) {
					pointMax1 = linePedal;
				} else if (linePedal.compareTo(pointMin1) < 0) {
					pointMin1 = linePedal;
				}
			}
			if (pointMax != null && pointMax1 != null) {
				if (pointMin.compareTo(pointMin1) > 0) {
					Point swap = pointMin;
					pointMin = pointMin1;
					pointMin1 = swap;
					swap = pointMax;
					pointMax = pointMax1;
					pointMax1 = swap;
				}
				int result = pointMax.compareTo(pointMax1);
				if (result < 0) {
					return -1;
				} else if (result == 0) {
					isTouch = true;
				}
			}
		}
		if (isTouch) {
			return 0;
		} else {
			return 1;
		}
		
	}
}
