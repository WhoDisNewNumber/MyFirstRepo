/*
    Generate and print 5 distinct random numbers between 0 and 30 to the user.
 */

/*
    1. How to generate a random number? java.util.random
    2. Repeat step 1, 5 times. for loop.
    3. We need to store the results of step 2. Stored in
    4. we need to find a way to print the results that were stored along the way.

 */

import java.util.Random;

public class Day2LottoSim {
    public static void main(String[] args) {
        //initialize random class
        Random random = new Random();
        //init empty int array of 5 elements
        int[] storedNumbers = new int[5];

        for (int i = 0; i < 5; i++) {
            int rnum = random.nextInt(29) + 1; //29+1 prevents number zero possibility. 1 - 30.
            storedNumbers[i] = rnum;
            System.out.println(storedNumbers[i]);
            /*
            for (int j = 0; storedNumbers[i] != 0; j++) {

                if(storedNumbers[i] != storedNumbers[j]){

                }
                //System.out.println("test");
            }
            */
        }
    }
}
