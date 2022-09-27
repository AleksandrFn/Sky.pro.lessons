package sky.pro.lesson3;

public class HW3 {
    public static void main(String[] args) {
        //Задача 1.1
        System.out.println("Задача 1.1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием.");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать.");
        }

        //Задача 1.2
        System.out.println("Задача 1.2");
        int personAge = 25;
        if (personAge >= 24)
        {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        if (personAge >= 18)
        {
            System.out.println("Человек закончил школу, пора в университет");
        }
        if (personAge >= 7)
        {
            System.out.println("Ребенок ходит в школу");
        }

        //Задача 1.3
        System.out.println("Задача 1.3");
        int passengers = 61;
        int oneCarriage = 102;
        int sittingsPlace = 60;
        if (passengers <= sittingsPlace) {
            System.out.println("Есть свободные сидячие места.");
        }
        if (passengers > sittingsPlace && passengers < oneCarriage ) {
            System.out.println("Сидячих мест нет, остались только стоячие.");
        }
        if (passengers > oneCarriage) {
            System.out.println("Свободных мест - нет.");
        }

        //Задача 2.1
        System.out.println("Задача 2.1");
        int age2 = 19;
        if (age2 >= 18) {
            System.out.println("Поздравляем с совершеннолетием.");
        }
        else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать.");
        }

        //Задача 2.2
        System.out.println("Задача 2.2");
        int personAge2 = 24;
        if (personAge2 >= 24)
        {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        else {
            if (personAge2 >= 18) {
                System.out.println("Человек закончил школу, пора в университет");
            } else if (personAge2 >= 7) {
                System.out.println("Ребенок ходит в школу");
            }
        }
        //Задача 2.3
        System.out.println("Задача 2.3");
        int passengers2 = 122;
        int oneCarriage2 = 102;
        int sittingsPlace2 = 60;
        if (passengers2 <= sittingsPlace2) {
            System.out.println("Есть свободные сидячие места.");
        }
        else if (passengers2 > sittingsPlace2 && passengers2 < oneCarriage2 ) {
            System.out.println("Сидячих мест нет, остались только стоячие.");
        }
        else  {
            System.out.println("Свободных мест - нет.");
        }

        //Задача 3.1
        System.out.println("Задача 3.1");
        int personeAge = 114;
        if (personeAge >= 2 && personeAge <= 6) {
            System.out.println("Если возраст человека равен " + personeAge + ", то ему нужно ходить в десткий сад");
        } else if (personeAge >= 7 && personeAge <= 18) {
            System.out.println("Если возраст человека равен " + personeAge + ", то ему нужно ходить в школу");
        }
        else if (personeAge >= 18 && personeAge <= 24) {
            System.out.println("Если возраст человека равен " + personeAge + ", то ему нужно ходить в университет");
        } else  {
            System.out.println("Если возраст человека равен " + personeAge + ", то ему нужно ходить на работу");
        }

        //Задача 3.2
        System.out.println("Задача 3.2");
        int childAge = 3;
        if (childAge < 5) {
            System.out.println("Если возраст вашего ребенка " + childAge + ", то он не может кататься на аттракционе");
        } else if (childAge >= 5 && childAge < 14){
            System.out.println("Если возраст вашего ребенка " + childAge + ", то он не может кататься на аттракционе без сопровождения взрослого");
        } else {
            System.out.println("Если возраст вашего ребенка " + childAge + ", то он может кататься самостоятельно аттракционе");
        }

        //Задача 3.3
        System.out.println("Задача 3.3");
        int one = 3;
        int two = 145;
        int free = 35;
        if (one > two && one >free) {
            System.out.println(one);
        } else if (two > one && two > free){
            System.out.println(two);
        } else {
            System.out.println(free);
        }
    }
}
