package sky.pro.lesson5;

public class HW5part3 {
    public static void main(String[] args) {
    //Задача 1
        System.out.println("Задача 1");
        int vklad = 29_000;
        int total = 0;
        for (int i = 1;i<=12;i++){
            total=total+total/100;
            total= total+vklad;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
}
