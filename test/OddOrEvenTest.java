package oddoreven.test;

import java.util.Scanner;
import oddoreven.base.OddOrEven;

public class OddOrEvenTest {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        OddOrEven test = new OddOrEven();

        System.out.print("Ever a number and i'll tell you if it's odd or even :): "); 
        int num = reader.nextInt();


        test.printOddOrEven(num);





    }


}
