/*************************************************************************
 *  Compilation:  javac OrderCheck.java
 *  Execution:    java OrderCheck 5 10 15 2
 *
 *  @author: Arnav Dashaputra, arnav.dashaputra@rutgers.edu, ad1589
 *
 *  Prints true if the four integer inputs are in strictly ascending
 *  or descending order, false otherwise
 *
 *  % java OrderCheck 5 10 15 2
 *  false
 *
 *  % java OrderCheck 15 11 9 4
 *  true
 *
 *************************************************************************/

public class OrderCheck {

    public static void main(String[] args) {

        int w = Integer.parseInt(args[0]);
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[0]);
        int z = Integer.parseInt(args[0]);

        boolean check = false;

        if((w < x && x < y && y < z) || (w > x && x > y && y > z)) {
            check = true;
        }

        System.out.println(check);


    }
}
