public class DefaultValues {
    public static void main(String[] args) {
        // Declare variables of different data types
        byte byteValue = 0;
        short shortValue = 0;
        int intValue = 0;
        long longValue = 0L;
        float floatValue = 0.0f;
        double doubleValue = 0.0;
        char charValue = '\u0000'; // default is null character
        boolean booleanValue = false;
        String stringValue = null; // default for reference types is null

        // Display the default values
        System.out.println("Default values in Java:");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: '" + charValue + "'");
        System.out.println("boolean: " + booleanValue);
        System.out.println("String: " + stringValue);
    }
}