package com.linjiahao.graphics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import com.linjiahao.point.Point;
import com.linjiahao.vector.Vector;

public class Graphics {
	
	ArrayList<Vector>	head		= new ArrayList<>();
	int					operation	= 0;
	
	public Graphics() {
	}
	
	public Graphics(Vector[] vectors) {
		for (Vector vector : vectors) {
			head.add(new Vector(vector));
		}
	}
	
	public Graphics(List<Vector> vectors) {
		vectors.forEach((e) -> {
			head.add(new Vector(e));
		});
		
	}
	
	public ArrayList<Point> getAllPointItem() {
		ArrayList<Point> data = new ArrayList<>();
		head.forEach((e) -> {
			data.add(new Point(e.startingPoint));
			data.add(new Point(e.finishingPoint));
		});
		return data;
	}
	
	public HashSet<Point> getSinglePointItem() {
		HashSet<Point> data = new HashSet<Point>();
		head.forEach((e) -> {
			data.add(new Point(e.startingPoint));
			data.add(new Point(e.finishingPoint));
		});
		return data;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (head == null ? 0 : head.hashCode());
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
		Graphics other = (Graphics) obj;
		if (head == null) {
			if (other.head != null) {
				return false;
			}
		} else if (!head.equals(other.head)) {
			return false;
		}
		return true;
	}
	
	public Iterator<Vector> iterator() {
		return head.iterator();
	}
}
