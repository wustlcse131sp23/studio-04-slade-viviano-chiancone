package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag 
{
	public static void main(String[] args) 
	{
		StdDraw.setPenColor(204, 255, 204);
		StdDraw.filledRectangle(0.3, 0.5, 0.1, 0.2);
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledRectangle(0.5, 0.5, 0.1, 0.2);
		StdDraw.setPenColor(255, 204, 229);
		StdDraw.filledRectangle(0.7, 0.5, 0.1, 0.2);
	}
}