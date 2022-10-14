package sky.pro.lesson6;

import java.sql.SQLOutput;

public class hw6 {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int vklad = 15_000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total=total+total/100;
            total = total + vklad;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

        //Задача 2
        System.out.println("Задача 2");
        int J = 1;
        while (J <= 10){
            System.out.printf(J+" ");
            J++;
        }
        System.out.println();
        int j=10;
        for (;j>0;){
            System.out.printf(j+" ");
            j--;
        }
        //Задача3
        System.out.println("Задача 3");
        int yPopulation = 12_000_000;
        int birthOn1000 = 17;
        int diesOn1000 = 8;
        for (int t = 1;t<=10;t++){
            yPopulation=yPopulation+(birthOn1000-diesOn1000)*12_000;
            System.out.println("Год " + t + ", численность населения состовляет " + yPopulation);
        }

    }
}
