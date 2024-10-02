package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean isFilled = in.nextBoolean();
		
		if (shape.equals("rectangle"))
		{
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			
			StdDraw.setPenColor(red, green, blue);
			if (isFilled)
			{
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			}
			else
			{
				StdDraw.rectangle(x, y, halfWidth, halfHeight);
			}
		}
		
		else if (shape.equals("ellipse")) {
			double x = in.nextDouble();
			double y = in.nextDouble();
			double semiMajorAxis = in.nextDouble();
			double semiMinorAxis = in.nextDouble();
			
			StdDraw.setPenColor(red, green, blue);
			if (isFilled)
			{
				StdDraw.filledEllipse(x, y, semiMajorAxis, semiMinorAxis);
			}
			else
			{
				StdDraw.ellipse(x, y, semiMajorAxis, semiMinorAxis);
			}
		}
		
		else if (shape.equals("triangle")) {
			double x1 = in.nextDouble();
			double y1 = in.nextDouble();
			double x2 = in.nextDouble();
			double y2 = in.nextDouble();
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			
			double[] xs = {x1, x2, x3};
			double[] ys = {y1, y2, y3};
			
			StdDraw.setPenColor(red, green, blue);
			if (isFilled)
			{
				StdDraw.filledPolygon(xs, ys);
			}
			else
			{
				StdDraw.polygon(xs, ys);
			}
		}
		
		// if ellipse, use StdDraw.ellipse(double x, double y, double semiMajorAxis, double semiMinorAxis)
		// if triangle, use StdDraw.polygon(double[] x, double[] y) or StdDraw.filledPolygon(double[] x, double[] y) because there is no specific triangle method
		

	}
}
