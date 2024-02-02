/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author: Arnav Dashaputra ad1589 arnav.dashaputra@rutgers.edu
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes(String original, int n) {

        if (n > 0) {
            original += appendNTimes(original, n - 1);
        }

        return original;
    }

    public static void main(String[] args) {

        System.out.println(appendNTimes("cat", 0));
        System.out.println(appendNTimes("cat", 1));
        System.out.println(appendNTimes("cat", 2));
    }
}