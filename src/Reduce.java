public class Reduce {
    public static void main(String[] args) {
        int num = 100;
        int steps = 0;

        while (num > 0){
            if (num % 2 == 0){
                num = num / 2;
                steps += 1;
            }

            else{
                num -= 1;
                steps += 1;
            }

        }
        System.out.println(steps);
    }
}
