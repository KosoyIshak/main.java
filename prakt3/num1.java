package prakt3;
public class num1 {
    public static void main(String[] args) {
        Double x = Double.valueOf("100");
        System.out.println("x = " + x);
        double y = Double.parseDouble("100");
        System.out.println("y = " + y);
        String str1 = "123.0000000001";
        Double z = Double.parseDouble(str1);
        byte z_bite = z.byteValue();
        short z_short = z.shortValue();
        int z_int = z.intValue();
        long z_long = z.longValue();
        float z_float = z.floatValue();
        double z_double = z.doubleValue();
        char z_char = (char)(z.doubleValue());
        boolean z_boolean = z.doubleValue() != 0.0;
        System.out.println("z_bite = " + z_bite);
        System.out.println("z_short = " + z_short);
        System.out.println("z_int = " + z_int);
        System.out.println("z_long = " + z_long);
        System.out.println("z_float = " + z_float);
        System.out.println("z_double = " + z_double);
        System.out.println("z_char = " + z_char);
        System.out.println("z_boolean = " + z_boolean);
    }
}