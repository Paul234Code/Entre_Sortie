package com.test_package;

import java.util.ArrayList;

public class Polyline {
	//attribut liste
	private ArrayList<Point> points;
	
	public Polyline() {
		points = new ArrayList<Point>();
	}
	public Polyline(ArrayList<Point> liste) {
		points= liste;
	}
	public void addPoint(int x,int y) {
		points.add(new Point(x,y));
	}
	public void addPoint(Point p) {
		points.add(p);
	}
	public String toString() {
		String res =" ";
		for(Point p : points)
		res += p.toString() + "\n";
		return res;
	}
	

}
