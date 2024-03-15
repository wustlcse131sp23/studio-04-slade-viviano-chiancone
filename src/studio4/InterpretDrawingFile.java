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
		
		if (shape.equals("rectangle"))
		{
			int red = in.nextInt();
			int green = in.nextInt();
			int blue = in.nextInt();
			boolean isFilled = in.nextBoolean();
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			
			StdDraw.setPenColor(red, green, blue);
			if (isFilled == true)
			{
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			}
			else
			{
				StdDraw.rectangle(x, y, halfWidth, halfHeight);
			}
		}
		// if ellipse, use StdDraw.ellipse(double x, double y, double semiMajorAxis, double semiMinorAxis)
		// if triangle, use StdDraw.polygon(double[] x, double[] y) or StdDraw.filledPolygon(double[] x, double[] y) because there is no specific triangle method
		

	}
}
