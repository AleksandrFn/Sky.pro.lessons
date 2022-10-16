package sky.pro.lesson8;

import java.util.Arrays;

public class HM8 {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        //Задача 1
        System.out.println("Задача 1");
        int sum = 0;
        for (int i =0;i<30;i++){
           sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum +" рублей.");
        //Задача 2
        System.out.println("Задача 2");
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (min>arr[i]){
                min=arr[i];
            }else if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Минимальная трата за месяц "+min+" рублей.");
        System.out.println("Максимальная трата за месяц "+max+" рублей.");

        //Задача 3
        System.out.println("Задача 3");
        float average = 0;
        for (int i = 0; i < arr.length; i++) {
            average+=arr[i];
        }
        average/=30;
        System.out.println(average);

        //Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
