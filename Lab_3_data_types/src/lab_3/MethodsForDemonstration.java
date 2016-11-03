package lab_3;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;


public class MethodsForDemonstration {

    public static void ShowByte(Byte byte_value)
    {
        Byte byte_val = new Byte(String.valueOf(110));
        System.out.println("byte_value  " + byte_value);
        System.out.println("byte_value.byteValue() = " + byte_value.byteValue());
        System.out.println("byte_value.compareTo(110) = " + byte_value.compareTo(byte_val));
        System.out.println("byte_value.doubleValue() = " + byte_value.doubleValue());
        System.out.println("byte_value.equals(110) = " + byte_value.equals(byte_val));
        System.out.println("byte_value.floatValue() = " + byte_value.floatValue());
        System.out.println("byte_value.hashCode() = " + byte_value.hashCode());
        System.out.println("byte_value.intValue() = " + byte_value.intValue());
        System.out.println("byte_value.longValue() = " + byte_value.longValue());
        System.out.println("byte_value.shortValue() = " + byte_value.shortValue());
        System.out.println("byte_value.toString() = " + byte_value.toString());
        System.out.println("byte_value.getClass() = " + byte_value.getClass());
        System.out.println();

    }

    public static void ShowDouble(Double double_value, Random rnd)
    {
        System.out.println("double_value  " + double_value);
        System.out.println("double_value.byteValue() = " + double_value.byteValue());
        System.out.println("double_value.compareTo(rnd.nextDouble()) = " + double_value.compareTo(rnd.nextDouble()));
        System.out.println("double_value.doubleValue() = " + double_value.doubleValue());
        System.out.println("double_value.equals(new Short(rnd.nextDouble())) = " + double_value.equals(new Double(rnd.nextDouble())));
        System.out.println("double_value.floatValue() = " + double_value.floatValue());
        System.out.println("double_value.hashCode() = " + double_value.hashCode());
        System.out.println("double_value.intValue() = " + double_value.intValue());
        System.out.println("double_value.longValue() = " + double_value.longValue());
        System.out.println("double_value.shortValue() = " + double_value.shortValue());
        System.out.println("double_value.toString() = " + double_value.toString());
        System.out.println("double_value.getClass() = " + double_value.getClass());
        System.out.println();
    }
    public static void ShowFloat(Float float_value, Random rnd)
    {
        System.out.println("float_value  " + float_value);
        System.out.println("float_value.byteValue() = " + float_value.byteValue());
        System.out.println("float_value.compareTo(rnd.nextFloat()) = " + float_value.compareTo(rnd.nextFloat()));
        System.out.println("float_value.doubleValue() " + float_value.doubleValue());
        System.out.println("float_value.equals(new Short(rnd.nextFloat())) = " + float_value.equals(new Float(rnd.nextFloat())));
        System.out.println("float_value.floatValue() = " + float_value.floatValue());
        System.out.println("float_value.hashCode() = " + float_value.hashCode());
        System.out.println("float_value.intValue() = " + float_value.intValue());
        System.out.println("float_value.longValue() = " + float_value.longValue());
        System.out.println("float_value.shortValue() = " + float_value.shortValue());
        System.out.println("float_value.toString() = " + float_value.toString());
        System.out.println("float_value.getClass() = " + float_value.getClass());
        System.out.println();
    }

    public static void ShowInteger(Integer integer_value, Random rnd)
    {
        System.out.println("integer_value  = " + integer_value);
        System.out.println("integer_value.byteValue() = " + integer_value.byteValue());
        System.out.println("integer_value.compareTo(rnd.nextInt()) = " + integer_value.compareTo(rnd.nextInt()));
        System.out.println("integer_value.doubleValue() = " + integer_value.doubleValue());
        System.out.println("integer_value.equals(new Short(rnd.nextInt())) = " + integer_value.equals(new Integer(rnd.nextInt())));
        System.out.println("integer_value.floatValue() = " + integer_value.floatValue());
        System.out.println("integer_value.hashCode() = " + integer_value.hashCode());
        System.out.println("integer_value.intValue() = " + integer_value.intValue());
        System.out.println("integer_value.longValue() = " + integer_value.longValue());
        System.out.println("integer_value.shortValue() = " + integer_value.shortValue());
        System.out.println("integer_value.toString() = " + integer_value.toString());
        System.out.println("integer_value.getClass() = " + integer_value.getClass());
        System.out.println();
    }

    public static void ShowLong(Long long_value, Random rnd)
    {
        System.out.println("long_value  = " + long_value);
        System.out.println("long_value.byteValue() = " + long_value.byteValue());
        System.out.println("long_value.compareTo(rnd.nextLong()) = " + long_value.compareTo(rnd.nextLong()));
        System.out.println("long_value.doubleValue() = " + long_value.doubleValue());
        System.out.println("long_value.equals(new Short(rnd.nextLong())) = " + long_value.equals(new Long(rnd.nextLong())));
        System.out.println("long_value.floatValue() = " + long_value.floatValue());
        System.out.println("long_value.hashCode() = " + long_value.hashCode());
        System.out.println("long_value.intValue() = " + long_value.intValue());
        System.out.println("long_value.longValue() = " + long_value.longValue());
        System.out.println("long_value.shortValue() = " + long_value.shortValue());
        System.out.println("long_value.toString() = " + long_value.toString());
        System.out.println("long_value.getClass() = " + long_value.getClass());
        System.out.println();
    }

     static void ShowShort(Short short_value)
    {
        Short short_val = new Short(String.valueOf(30000));
        System.out.println("short_value  " + short_value);
        System.out.println("short_value.byteValue() = " + short_value.byteValue());
        System.out.println("short_value.compareTo(30000) = " + short_value.compareTo(short_val));
        System.out.println("short_value.doubleValue() = " + short_value.doubleValue());
        System.out.println("short_value.equals(30000) = " + short_value.equals(short_val));
        System.out.println("short_value.floatValue() = " + short_value.floatValue());
        System.out.println("short_value.hashCode() = " + short_value.hashCode());
        System.out.println("short_value.intValue() = " + short_value.intValue());
        System.out.println("short_value.longValue() = " + short_value.longValue());
        System.out.println("short_value.shortValue() = " + short_value.shortValue());
        System.out.println("short_value.toString() = " + short_value.toString());
        System.out.println("short_value.getClass() = " + short_value.getClass());
        System.out.println();
    }

     static void ShowBigInteger(BigInteger bigInteger_value, Random rnd)
    {
        BigInteger newBigInteger_value = new BigInteger(150, rnd);
        System.out.println("bigInteger_value  " + bigInteger_value);
        System.out.println("newBigInteger_value = " + newBigInteger_value);
        System.out.println("Bit in bigInteger_value = " + bigInteger_value.bitLength());
        System.out.println("Bit in newBigInteger_value = " + newBigInteger_value.bitLength());
        System.out.println("bigInteger_value / newBigInteger_value = " + bigInteger_value.divide(newBigInteger_value));
        System.out.println("bigInteger_value mod newBigInteger_value = " + bigInteger_value.mod(newBigInteger_value));
        System.out.println("bigInteger_value * newBigInteger_value = " + bigInteger_value.multiply(newBigInteger_value));
        System.out.println("bigInteger_value % newBigInteger_value = " + bigInteger_value.remainder(newBigInteger_value));
        System.out.println();
    }

    public static void ShowBigDecimal(BigDecimal bigDecimal_value, Random rnd)
    {
        BigDecimal newBigDecimal_value = new BigDecimal(rnd.nextDouble());
        System.out.println("bigDecimal_value  = " + bigDecimal_value);
        System.out.println("newBigDecimal_value = " + newBigDecimal_value);
        System.out.println("bigDecimal_value + newBigDecimal_value = " + bigDecimal_value.add(newBigDecimal_value));
        System.out.println("bigDecimal_value * newBigDecimal_value = " + bigDecimal_value.multiply(newBigDecimal_value));
        System.out.println("mantissa of newBigDecimal_value = " + bigDecimal_value.unscaledValue());
        System.out.println("scale of bigDecimal_value = " + bigDecimal_value.scale());
        //System.out.println("increase scale of bigDecimal_value to 50 = " + bigDecimal_value.setScale(40, BigDecimal.ROUND_HALF_UP));
        //System.out.println("decrease scale of bigDecimal_value to 20 = " + bigDecimal_value.setScale(20, BigDecimal.ROUND_HALF_UP));
        System.out.println();
    }

}
























