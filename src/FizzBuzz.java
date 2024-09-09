/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main() {

        for (int i = 1; i < 100; i++) {
             // Find out which numbers divide i.
            doFizzBuzz(i);
        }

        System.out.println("BREAK!!!!");

        int j = 1;
        while (j < 100){
            j = doFizzBuzzWhile(j);
        }
    }

    private static int doFizzBuzzWhile(int j) {
        boolean divisibleBy3 = j % 3 == 0;
        boolean divisibleBy5 = j % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(j);

        }
        j++;
        return j;
    }

    public static void doFizzBuzz(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
    }
}
