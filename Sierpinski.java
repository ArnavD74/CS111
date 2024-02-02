/*************************************************************************
 *  Compilation:  javac Sierpinski.java
 *  Execution:    java Sierpinski
 *
 *  @author: Arnav Dashaputra arnav.dashaputra@rutgers.edu ad1589
 *
 *************************************************************************/

public class Sierpinski {

    // Height of an equilateral triangle whose sides are of the specified length. 
    public static double height(double length) {
        return (length * Math.sqrt(3)) / 2.0;
    }

    // Draws a filled equilateral triangle whose bottom vertex is (x, y) 
    // of the specified side length. 
    public static void filledTriangle(double x, double y, double length) {


        double height = height(length);
        double xpos = x + (length / 2);
        double ypos = y + height;

        StdDraw.filledPolygon(new double[] {x, x - (length / 2.0), xpos }, new double[] {y, ypos, ypos});

    }

    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    public static void sierpinski(int n, double x, double y, double length) {

        length /= 2;

        if (n > 0) {

            n -= 1;
            filledTriangle(x, y, length * 2);

            sierpinski(n, x, y + height(length * 2), length);
            sierpinski(n, x - length, y, length);
            sierpinski(n, x + length, y, length);
        }
	
    }

    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
    public static void main(String[] args) {

        int n;

        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        } else {
            n = 3;
        }

        double length = 1;
        double l = length / 2;
        double height = height(length);
        StdDraw.polygon(new double[] {0, l, length}, new double[] {0, height, 0});

        sierpinski(n, length/2, 0, length/2);
	 
    }
}
