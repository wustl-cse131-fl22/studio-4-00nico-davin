package studio4;

import java.awt.Color;
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
		Scanner in = new Scanner(f); // making Scanner with a File

		String shapeType = in.next();
		System.out.println(shapeType);

		int redComponent = in.nextInt();
		System.out.println(redComponent);

		int greenComponent = in.nextInt();
		System.out.println(greenComponent);

		int blueComponent = in.nextInt();
		System.out.println(blueComponent);
		boolean isFilled = in.nextBoolean();
		System.out.println(isFilled);

		Color color = new Color(redComponent, greenComponent, blueComponent);

		if (shapeType == "rectangle") {
			double parameterOne = in.nextDouble();
			double parameterTwo = in.nextDouble();
			double parameterThree = in.nextDouble();
			double parameterFour = in.nextDouble();

			StdDraw.setPenColor(color);
			if (isFilled) {
				StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			} else {
				StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
		}
		
		if (shapeType =="triangle") {
			double one = in.nextDouble();
			double two = in.nextDouble();
			double three = in.nextDouble();
			double four = in.nextDouble();
			double five = in.nextDouble();
			double six = in.nextDouble();
			
			double[] v1 = new double[2];
			v1[0] = one;
			v1[1] = two;
			
			double[] v2 = new double[2];
			v2[0] = three;
			v2[1] = four;
			
			double[] v3 = new double[2];
			v3[0] = five;
			v3[1] = six;
			
			StdDraw.setPenColor(color);
			if (isFilled) {
				StdDraw.filledPolygon(v1, v2);
			} else {
				StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
			
			
		}

		// rectangle 255 109 182 true 0.5 0.5 0.2 0.2

	}
}
