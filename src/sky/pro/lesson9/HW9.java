package sky.pro.lesson9;

public class HW9 {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

        //Задача 2
        System.out.println("Задача 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //Задача 3
        System.out.println("Задача 3");
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}
