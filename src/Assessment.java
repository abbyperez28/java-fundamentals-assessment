import java.lang.reflect.Array;

import static java.lang.System.out;

public class Assessment {

        public static int square (int num) {
            return num * num;
        }

        static double sum (double num1, double num2) {
            return num1 + num2;
        }

        static double average(int[] array) {
        double sum = 0;
            for (int number : array) {
                sum += number;
            }

            return sum/array.length;
        }



        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5, 6};

            out.println(square(5));
            out.println(sum(5,5));
            out.println(average(array));

    }
}

