package sky.pro.lesson6;

public class hw6part3 {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int year = 1;
        for (int i = 1;i<2100;i++) {
            year++;
            if (year % 79 == 0 && year > 1822) {
                System.out.println(year);
            }
        }
        //Задача 2
        System.out.println("Задача 2");
        int sum1 = 1;
        int sum2 = 2;
        for (int i=1;i<=10;i++){
            System.out.println(sum2+"*"+sum1+"="+(sum1*sum2));
            sum1++;
        }
    }
}
