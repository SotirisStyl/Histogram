/*
 * Author: Sotiris Stylianou (G20967429)
 * Email: sstylianou2@uclan.ac.uk
 * Description: User gives as many numbers as he/she wants bigger than 0 and less than 10 to the program and the program prints the frequency of the numbers which are at the input more than 0 times and makes a histogram with the numbers.
 * To compile the program: javac Histogram.java
 * To run the program: java Histogram 1 2 2 3 3 3 4 4 4 4
 */

public class Histogram {
    public static void main(String[] args) {


        int Array_Length = args.length;
        int[] digits = new int[Array_Length];                                                                           /* Array that will convert strings from args to numbers.*/
        int[] c = new int[Array_Length+10];                                                                             /* Array that will keep a count of the digits */
        int i,j,max=0;
        boolean check = true;



        for(i=0; i<Array_Length; i++){

            digits[i] = Integer.parseInt(args[i]);                                                                      /* Program converts string array to integer array.*/

            if(digits[i] > 9 || digits[i] < 0) {
                check= false;
            }
        }

        if(check) {
            for (i = 0; i < Array_Length; i++) {

                switch(digits[i]) {                                                                                     /* Program counts each digit of what the user gave */
                    case 0:
                        c[0]++;
                        break;
                    case 1:
                        c[1]++;
                        break;
                    case 2:
                        c[2]++;
                        break;
                    case 3:
                        c[3]++;
                        break;
                    case 4:
                        c[4]++;
                        break;
                    case 5:
                        c[5]++;
                        break;
                    case 6:
                        c[6]++;
                        break;
                    case 7:
                        c[7]++;
                        break;
                    case 8:
                        c[8]++;
                        break;
                    case 9:
                        c[9]++;
                        break;
                }
            }

            System.out.println("DIGIT | FREQUENCY");                                                                    /* Program outputs all the digits' frequency that are bigger than 0*/
            System.out.println("--------------------");
            for (i = 0; i < 10; i++) {

                if (c[i] > 0) {
                    System.out.println(" " + i + " -> " + c[i]);
                }
            }
            System.out.println("--------------------");

            for (i = 0; i <= 9; i++) {                                                                                  /* Program finds the maximum number of the counters */
                if (c[i] > max) {
                    max = c[i];
                }
            }
            System.out.println("The most frequent digit appears " + max + " times.");

            for (j = max; j > 0; j--) {                                                                                 /* Program outputs the histogram */
                for (i = 0; i <= 9; i++) {
                    if (c[i]>=j) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

            System.out.println("-------------------");
            System.out.println("0 1 2 3 4 5 6 7 8 9");

        }else {
            System.out.print("There is a number bigger less than 0 or bigger than 9. ");
        }
    }
}