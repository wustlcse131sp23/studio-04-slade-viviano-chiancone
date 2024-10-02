package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag 
{
	public static void main(String[] args) 
	{
		// vertical light green rectangle
		StdDraw.setPenColor(204, 255, 204);
		StdDraw.filledRectangle(0.3, 0.5, 0.1, 0.2);
		
		// vertical white rectangle
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledRectangle(0.5, 0.5, 0.1, 0.2);
		
		// vertical light pink rectangle
		StdDraw.setPenColor(255, 204, 229);
		StdDraw.filledRectangle(0.7, 0.5, 0.1, 0.2);
		
		
		
		
		// yellow circle
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledCircle(0.5,  0.5, 0.1);
		
		// horizontal dark blue rectangle
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledRectangle(0.5, 0.6, 0.3, 0.1);
		
		// purple polygon (triangle)
		StdDraw.setPenColor(180, 0, 255);
		StdDraw.filledPolygon(new double[]{0.3, 0.5, 0.7}, new double[]{0.5, 0.6, 0.5});
		
		// increase pen size
		StdDraw.setPenRadius(0.005);
		
		// magenta arc
		StdDraw.setPenColor(StdDraw.MAGENTA);
		StdDraw.arc(0.2, 0.3, 0.4, 0, 90.0);
		
		// cyan arc
		StdDraw.setPenColor(StdDraw.CYAN);
		StdDraw.arc(0.8, 0.3, 0.4, 90.0, 180.0);
		
		// increase pen size
		StdDraw.setPenRadius(0.015);
		
		// black border
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.rectangle(0.5, 0.5, 0.3, 0.2);
	}
}