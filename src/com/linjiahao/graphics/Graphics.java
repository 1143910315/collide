package com.linjiahao.graphics;

import com.linjiahao.vector.Vector;

public class Graphics {
	class Border {
		Vector	vector;
		Border	next;
	}
	
	Border head;
	
	public Graphics() {
	}
	
	public Graphics(Vector[] vectors) {
		Border next = null;
		for (Vector vector : vectors) {
			if (head == null) {
				head = new Border();
				head.vector = new Vector(vector);
				next = head;
			} else {
				next.next = new Border();
				next = next.next;
				next.vector = new Vector(vector);
			}
		}
	}
	
}
