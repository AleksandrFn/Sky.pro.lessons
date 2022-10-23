package sky.pro.lesson10;

import java.time.LocalDate;

public class HW10 {

    public static void main(String[] args) {
        task1();

        task2();

        task3();
    }
    public static void task1(){
        int yourYear = 16;
        checkYear(yourYear);
    }
    public static void checkYear(int year){
        if (year % 4 == 0 && year % 100 !=0 || year % 400 ==0){
            System.out.println(year+"г. Является выосоксным годом");
        } else {
            System.out.println(year+"г. Не является высокосным годом");
        }
    }
    public static void task2(){
        int currentYear = 2012;
        int clientOS = 3;
        checkOS(currentYear, clientOS);
    }
    public static void checkOS(int a, int b){
        if (a >= 2015 && b == 0) {
            System.out.println("Вот ваша ссылка для Ios");
        } else if (a >= 2015 && b ==1) {
            System.out.println("Вот ваша ссылка для Android");
        } else if (a < 2015 && b == 0) {
            System.out.println("Установите облегченную версию для вашего IOS");
        } else if (a < 2015 && b == 1) {
            System.out.println("Установите облегченную версию для вашего Android");
        } else {
            System.out.println("Ваша ОС не подходит");
        }

    }
    public static void task3(){
        int deliveryDistance =666;
        checkDeliveryDistance(deliveryDistance);
    }
    public static void checkDeliveryDistance(int distance){
        if (distance <= 20) {
            System.out.println("Доставка займет сутки");
        } else if (distance > 20 && distance <= 60) {
            System.out.println("Доставка займет двое суток");
        } else if (distance > 60 && distance <= 100) {
            System.out.println("Доставка займет трое суток");
        } else {
            System.out.println("Мы не знаем где это");
        }
    }
}
