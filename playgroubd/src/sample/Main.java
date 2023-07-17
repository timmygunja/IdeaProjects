package sample;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        int[] hours = {10, 0, 12, 0, 8, 12, 4};

        int salary = 0;
        int counter = 1;

        for (int i: hours) {

            if (counter <= 5) {
                salary += calc(i);
            }
            else {
                salary += calc(i) * 2;
            }

            counter++;
        }

        System.out.println(salary);
        System.out.println();
    }

    public static int calc(int hours) {
        int sum = 0;

        if (hours <= 8) {
            sum = hours * 10;
        }
        else if (hours > 8) {
            sum = 80 + (hours - 8) * 15;
        }

        return sum;
    }
}
