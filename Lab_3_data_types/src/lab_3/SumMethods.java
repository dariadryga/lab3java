package lab_3;

import java.util.Random;


 class SumMethods {
     static int[] first;
     static int int_sum(int result, ParameterTime par, Random random, int choice) {

        first = new int[choice];
        for (int i = 0; i < first.length; i++) {
            first[i] = random.nextInt(100);
        }

        par.time = System.nanoTime();
        for (int i = 0; i < first.length; i++) {
            result += first[i];
        }
        par.time = System.nanoTime() - par.time;

        return result;
    }

     static int integer_sum(Integer[] first1, Integer result, ParameterTime par, Random random) {


        //for (Integer i = 0; i < first.length; i++) {
           // first1[i] =
        int p = 0;
        for (int value : first) {
                first1[p++] = Integer.valueOf(value);;//random.nextInt(100);
        }

        par.time = System.nanoTime();
        for (Integer i = 0; i < first.length; i++) {
            result += first[i];
        }
        par.time = System.nanoTime() - par.time;

        return result;
    }
}
