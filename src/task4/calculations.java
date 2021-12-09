package task4;

public class calculations {

        public static void add(final double num1, final double num2){
            System.out.println("Addition started: " + num1 + " + " + num2);
            try {
                Thread.sleep(2000);
            } catch (final InterruptedException e){
                System.out.println("Interrupted exception");
                Thread.currentThread().interrupt();
            }
            System.out.println("Addition finished: " + (num1 + num2));
        }

        public static void sub(final double num1, final double num2){
            System.out.println("Subtraction started: " + num1 + " - " + num2);
            try {
                Thread.sleep(2000);
            } catch (final InterruptedException e){
                System.out.println("Interrupted exception");
            }
            System.out.println("Subtraction finished: " + (num1 - num2));
        }

        public static void multi(final double num1, final double num2){
            System.out.println("Multiplication started: " + num1 + " * " + num2);
            try {
                Thread.sleep(2000);
            } catch (final InterruptedException e){
                System.out.println("Interrupted exception");
            }
            System.out.println("Multiplication finished: " + (num1 * num2));
        }

        public static void divide(final double num1, final double num2){
            System.out.println("Division started: " + num1 + " / " + num2);
            try {
                Thread.sleep(2000);
            } catch (final InterruptedException e){
                System.out.println("Interrupted exception");
            }
            System.out.println("Division finished: " + (num1 / num2));
        }
}
