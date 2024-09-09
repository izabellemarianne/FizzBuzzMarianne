public class Multiples {
    public static void main(String[] args) {

        int five = 0;
        int three = 0;
        int none = 0;
        for (int num = 0; num < 1000; num++){

            boolean divByThree = num % 3 == 0;
            boolean divByFive = num % 5 == 0;

            if (divByThree){
                three += 1;
            } else if (divByFive) {
                five += 1;
            }
            else {
                none += 1;
            }

        }

        System.out.println("Number of multiples of three:" + three);
        System.out.println("Number of multiples of five:" + five);

    }
}
