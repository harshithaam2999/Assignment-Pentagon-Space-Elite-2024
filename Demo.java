import java.util.Scanner;
public class Demo {

	            public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Byte
		        System.out.print("Enter a byte value: ");
		        byte num1 = scanner.nextByte();
		        System.out.println("Byte value is: " + num1);

		        // Short
		        System.out.print("Enter a short value: ");
		        short num2 = scanner.nextShort();
		        System.out.println("Short value is: " + num2);

		        // Int
		        System.out.print("Enter an int value: ");
		        int num3 = scanner.nextInt();
		        System.out.println("Int value is: " + num3);

		        // Long
		        System.out.print("Enter a long value: ");
		        long num4 = scanner.nextLong();
		        System.out.println("Long value is: " + num4);

		        // Double
		        System.out.print("Enter a double value: ");
		        double num5 = scanner.nextDouble();
		        System.out.println("Double value is: " + num5);

		        // Float
		        System.out.print("Enter a float value: ");
		        float num6 = scanner.nextFloat();
		        System.out.println("Float value is: " + num6);

		        // Char (reading the first character of input)
		        System.out.print("Enter a character: ");
		        char char1 = scanner.next().charAt(0);
		        System.out.println("Character value is: " + char1);

		        // String
		        System.out.print("Enter a string: ");
		        String str = scanner.next();
		        System.out.println("String value is: " + str);

		        // Boolean (reading a boolean value)
		        System.out.print("Enter a boolean value (true/false): ");
		        boolean bool = scanner.nextBoolean();
		        System.out.println("Boolean value is: " + bool);

		        scanner.close();
		    }
		}
