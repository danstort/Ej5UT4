package ej5ut4;
import java.util.Scanner;
/**
 *
 * @author daniel
 */
public class Ej5UT4 {

    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int c = 0;
        
        Scanner sc = new Scanner (System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        
        if (a > b) {

            if (a > c) {
                System.out.println(a);
            }
        }

        if (b > a) {

            if (b > c) {
                System.out.println(b);
            }
        }

        if (c > b) {

            if (c > a) {
                System.out.println(c);
            }
        }
    }

}
