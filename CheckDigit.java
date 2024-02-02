/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author: Arnav Dashaputra arnav.dashaputra@rutgers.edu ad1589
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main(String[] args) {

        long number = Long.parseLong(args[0]);

        long temp = number;
        int sum1 = 0;
        int sum2 = 0;
        int totalsum = 0;
        while (temp > 0) {
            sum1 += temp % 10;
            temp /= 100;
        }
        sum1 = sum1 % 10;
        number = number / 10;
        temp = number;
        while (temp > 0) {
            sum2 += temp % 10;
            temp /= 100;
        }
        sum2 = sum2 % 10;
        sum2 *= 3;
        sum2 = sum2 % 10;
        totalsum = sum1 + sum2;
        totalsum = totalsum % 10;
        System.out.println(totalsum);



    }
}