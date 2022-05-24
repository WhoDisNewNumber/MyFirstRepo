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
    public static void main(String[] args){
        Random random = new Random();
        //int rnum = random.nextInt(30);
        int[] storedNumbers = new int[5];

        for(int i = 0; i < 5;i++){
            int rnum = random.nextInt(30);
            //System.out.println(rnum);
            storedNumbers[i] = rnum;
            System.out.println(storedNumbers[i]);
        }

    }

}
