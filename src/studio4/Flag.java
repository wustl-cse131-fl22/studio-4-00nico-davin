package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.5, 0.5, .3, .2);
		
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(0.4, 0.4, .05);
		StdDraw.filledCircle(0.6, 0.6, .05);
		StdDraw.filledCircle(0.6, 0.4, .05);
		StdDraw.filledCircle(0.4, 0.6, .05);
	}
}