package sky.pro.lesson7;

public class HW7 {
    public static void main(String[] args) {
        int [] arrFirst = new int[] {1,2,3};
        double [] arrSecond = new double[] {2.2,3.3,4.4};
        String [] arrThird = {"Привет","Пока","Как дела"};
        for(int i=arrFirst.length-1;i < arrFirst.length;i--){
            if (i==0){
                System.out.println(arrFirst[i]);
                break;
            }
            System.out.print(arrFirst[i]+", ");

        }
        System.out.println();
        for(int i=arrSecond.length-1;i<arrSecond.length;i--){
            if (i==0){
                System.out.println(arrSecond[i]);
                break;
            }
            System.out.print(arrSecond[i]+", ");
        }
        System.out.println();
        for(int i=arrThird.length-1;i<arrThird.length;i--){
            if (i==0){
                System.out.println(arrThird[i]);
                break;
            }
            System.out.print(arrThird[i]+", ");
        }
        System.out.println();
        for (int i = 0;i<arrFirst.length;i++){
            if (arrFirst[i]%2!=0){
                arrFirst[i]++;
                System.out.println(arrFirst[i]);
                continue;
            }
            System.out.println(arrFirst[i]);
        }
    }
}
