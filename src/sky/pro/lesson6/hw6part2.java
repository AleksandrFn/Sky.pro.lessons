package sky.pro.lesson6;

public class hw6part2 {
    public static void main(String[] args) {
        int deposit = 15_000;
        int total = 0;
        for (int i=1;total<=12_000_000;i++){
            total = total + total/100*7;
            total = total + deposit;
            if (i % 6==0) {
                System.out.println("Месяц " + i + ",ваши накопления " + total);
            }
        }
        //Задача 3
        System.out.println("Задача 3");
        int dep = 15_000;
        int ttl = 0;
        int month = 12*9;
        for (int i = 1;i<=month;i++) {
            ttl = ttl + ttl / 100 * 7;
            ttl = ttl + dep;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", ваши накопления состовляют " + ttl);
            }
        }
        //Задача 4
        System.out.println("Задача 4");
        int fr = 5;
        for (int i = 1;i<=30;i++) {
            if (fr==i){
                System.out.println("Сегодня пятница, "+fr+"-е число. Необходимо подготовить отчет.");
                fr+=7;
            }
        }
    }
}
