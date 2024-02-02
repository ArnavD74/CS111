/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author: Arnav Dashaputra arnav.dashaputra@rutgers.edu ad1589
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {

        int steps = Integer.parseInt(args[0]);
        double distance = 0;
        int xpos = 0;
        int ypos = 0;

        System.out.println("(" + xpos + "," + ypos + ")");

        for (var i = 0; i < steps; i++) {
            double randomVal = Math.random();
            if (randomVal < 0.25)
                ypos++; //north
            else if (randomVal > 0.25 && randomVal < 0.5)
                xpos++; //east
            else if (randomVal > 0.5 && randomVal < 0.75)
                ypos--; //south
            else
                xpos--; //west

            System.out.println("(" + xpos + "," + ypos + ")");
        }

        distance = (Math.pow((Math.abs(xpos)), 2) + Math.pow((Math.abs(ypos)), 2));

        System.out.println("Squared distance = " + distance);
    }
}