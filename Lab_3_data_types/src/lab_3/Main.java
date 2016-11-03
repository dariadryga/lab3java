package lab_3;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        int repeat;
        do {
            Scanner in = new Scanner(System.in);
            ParameterTime par = new ParameterTime();
            final Random rnd = new Random();
            try {
                System.out.println("Enter the size of the array:");
                int choice = Integer.parseInt(in.nextLine());
                int[] int_1 = new int[choice];
                Integer[] integer_1 = new Integer[choice];

                int result_int = 0;
                Integer result_Integer = 0;

                result_int = SumMethods.int_sum(/*int_1,*/result_int, par, rnd, choice);
                System.out.format("int[]: %,8d%n", result_int);
                System.out.format("was obtained in %,8d%n", par.time);
                System.out.printf("nanoseconds");

                par.clear();
                System.out.println();

                result_Integer = SumMethods.integer_sum(integer_1, result_Integer, par, rnd);
                System.out.printf("Integer[]: %,8d%n", result_Integer);
                System.out.format("was obtained in %,8d%n", par.time);
                System.out.printf("nanoseconds");
                par.clear();
                System.out.println();

                System.out.println("\nMethods for demonstration:\n");

                Byte byte_value = new Byte(String.valueOf(120));
                Double double_value = rnd.nextDouble();
                Float float_value = rnd.nextFloat();
                Integer integer_value = rnd.nextInt();
                Long long_value = rnd.nextLong();
                Short short_value = new Short(String.valueOf(32000));

                BigInteger bigInteger_value = new BigInteger(150, rnd);
                BigDecimal bigDecimal_value = new BigDecimal(rnd.nextDouble());


                MethodsForDemonstration.ShowByte(byte_value);
                MethodsForDemonstration.ShowDouble(double_value, rnd);
                MethodsForDemonstration.ShowFloat(float_value, rnd);
                MethodsForDemonstration.ShowInteger(integer_value, rnd);
                MethodsForDemonstration.ShowLong(long_value, rnd);
                MethodsForDemonstration.ShowShort(short_value);
                MethodsForDemonstration.ShowBigInteger(bigInteger_value, rnd);
                MethodsForDemonstration.ShowBigDecimal(bigDecimal_value, rnd);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("Continue? (1/0)");
            repeat = in.nextInt();
        } while (repeat == 1);
    }
}
