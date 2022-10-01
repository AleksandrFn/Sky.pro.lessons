package sky.pro.lesson4;

public class HW4 {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0){
            System.out.println("Вот ваша ссылка для IOS");
        } else if (clientOS == 1) {
            System.out.println("Вот ваша ссылка для Android");
        } else {
            System.out.println("У вас не подходящая ОС");
        }

        //Задача 2
        System.out.println("Задача 2");
        int clientDeviseYear = 2012;
        if (clientDeviseYear >= 2015 && clientOS == 0) {
            System.out.println("Вот ваша ссылка для Ios");
        } else if (clientDeviseYear >= 2015 && clientOS ==1) {
            System.out.println("Вот ваша ссылка для Android");
        } else if (clientDeviseYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию для вашего IOS");
        } else if (clientDeviseYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию для вашего Android");
        } else {
            System.out.println("Ваша ОС не подходит");
        }

        //Задача 3
        System.out.println("Задача 3");
        int year = 12;
        if (year % 4 == 0 && year % 100 !=0 || year % 400 ==0) {
            System.out.println("Год является высокосным");
        } else {
            System.out.println("Год не является высокосным");
        }

        //Задача 4
        System.out.println("Задача 4");
        int deliveryDistance = 25;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка займет сутки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка займет двое суток");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка займет трое суток");
        } else {
            System.out.println("Мы не знаем где это");
        }

        //Задача 5
        System.out.println("Задача 5");
        int monthNumber =6;
        switch (monthNumber) {
            case 1:
            case 2:
            case 3:
                System.out.println("Зимний месяц");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Весенний месяц");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Летний месяц");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

        //Задача 6
        System.out.println("Задача 6");
        int agePerson = 24;
        int salary = 60_000;
        /*if (agePerson >= 23 && salary < 50_000) {
            salary*=3;
        }else if (agePerson < 23 && salary < 50_000) {
            salary*=2;
        }else if (agePerson >=23 && salary >= 50_000 && salary < 80_000) {
            salary=(int)(salary*3*1.2);
        }else if (agePerson >=23 && salary >= 50_000 && salary >= 80_000) {
            salary=(int)(salary*3*1.5);
        }else if (agePerson < 23 &&salary < 80_000 ){
            salary=(int)(salary*2*1.2);
        }else if (agePerson < 23 &&salary >= 80_000 ) {
            salary = (int) (salary * 2 * 1.5);
        }
        System.out.println("Вам дотупен лимит на сумму " + salary + " рублей.");*/

        //Задача 7
        System.out.println("Задача 7");
        int wantedSum = 330_000;
        int maxPay = salary/2;
        float kef = 1.1f;
        if (agePerson<23){
           kef+=0.1;
        }else if (agePerson<30){
            kef+=0.05;
        }if (salary>80_000){
            kef-=0.07;
        }
        float payPerMonth = (maxPay*kef)/12;
        if (maxPay<payPerMonth){
            System.out.println("Максимальный платеж при ЗП: " + salary + " рублей равен " + maxPay + " рублей. " +
                    "Платеж по кредиту  " + payPerMonth + " рублей. Отказанно.");
        }else {
            System.out.println("Максимальный платеж при ЗП: " + salary + " рублей равен " + maxPay + " рублей. " +
                    "Платеж по кредиту  " + payPerMonth + " рублей. Одобренно.");
        }
    }
}
