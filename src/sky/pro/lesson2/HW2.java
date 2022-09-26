package sky.pro.lesson2;

public class HW2 {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int a1 = 1554544;
        System.out.println(a1);
        byte b2 = 22;
        System.out.println(b2);
        short c3 = 4353;
        System.out.println(c3);
        long d4 = 4434435535353L;
        System.out.println(d4);
        float e5 = 5.5F;
        System.out.println(e5);
        double f6 = 6.53535533553D;
        System.out.println(f6);

        //Задача 2
        System.out.println("Задача 2");
        float aA = 27.12F;
        System.out.println(aA);
        long bB = 987_678_965_549L;
        System.out.println(bB);
        double cC = 2.786;
        System.out.println(cC);
        boolean dD = false;
        System.out.println(dD);
        short eE = 569;
        System.out.println(eE);
        short fF = -159;
        System.out.println(fF);
        int gG = 27897;
        System.out.println(gG);
        byte hH = 67;
        System.out.println(hH);

        //Задача 3
        System.out.println("Задача 3");
        int lydmilaPavlovna = 23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int paper = 480;
        int paperOnOnePerson = paper/(lydmilaPavlovna+annaSergeevna+ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + paperOnOnePerson + " листов бумаги");

        //Задача 4
        System.out.println("Задача 4");
        byte bottlePerMin = 8;
        int a = 20;
        int b = 24*60;
        int c = 3*24*60;
        int d = 30*24*60;
        int bottlePer20Min = bottlePerMin*a;
        int bottlePerDay = bottlePerMin*b;
        int bottlePer3Days = bottlePerMin*c;
        int bottlePer30Days = bottlePerMin*d;
        System.out.println("За 20 минут машина произвела бутылок " + bottlePer20Min + " штук");
        System.out.println("За сутки машина произвела бутылок " + bottlePerDay + " штук");
        System.out.println("За 3 дня машина произвела бутылок " + bottlePer3Days + " штук");
        System.out.println("За 1 месяц машина произвела бутылок " + bottlePer30Days + " штук");

        //Задача 5
        System.out.println("Задача 5");
        byte paints = 120;
        byte Class = 6;
        int Classes = paints/Class;
        int whitePaints = 2*Classes;
        int brownPaints = 4*Classes;
        System.out.println("В школе, где " + Classes + " классов, нужно " + whitePaints + " банок белой краски и " + brownPaints + " банок коричневой краски");

        //Задача 6
        System.out.println("Задача 6");
        int bananas = 5*80;
        int milk = 200/100*105;
        int iceCream = 2*100;
        int eggs = 4*70;
        int grams = bananas+milk+iceCream+eggs;
        double kilos = grams/1000d;
        System.out.println("Завтрак нашего спортсмена состовлят " + grams + " Грамм или " + kilos + " Кг" );

        //Задача 7
        System.out.println("Задача 7");
        int excessWeight = 7*1000;
        short minWeightLoss = 250;
        short maxWeightLoss = 500;
        int middleWeightLoss = (minWeightLoss+maxWeightLoss)/2;
        int resultMinExcess = excessWeight/minWeightLoss;
        int resultMaxExcess = excessWeight/maxWeightLoss;
        int resultMiddleExcess = excessWeight/middleWeightLoss;
        System.out.println("Максимум на похудение уйдет " + resultMinExcess + " дней.");
        System.out.println("Минимум зна похудение уйдет " + resultMaxExcess + " дней.");
        System.out.println("В среднем на похудение уйдет " + resultMiddleExcess + " дней.");

        //Задача 8
        System.out.println("Задача 8");
        int masha = 67_760;
        int newMasha = masha*10/100+masha;
        int diffMasha = newMasha*12;
        System.out.println("Маша теперь получает " + newMasha + " рублей. Годовой доход вырос на " + diffMasha + " рублей.");
        int denis = 83_690;
        int newDenis = denis*10/100+denis;
        int diffDenis = newDenis*12;
        System.out.println("Денис теперь получает " + newDenis + " рублей. Годовой доход вырос на " + diffDenis + " рублей.");
        int kristina = 76_230;
        int newKristina = kristina*10/100+kristina;
        int diffKristina = newKristina*12;
        System.out.println("Кристина теперь получает " + newKristina + " рублей. Годовой доход вырос на " + diffKristina + " рублей.");

    }
}
