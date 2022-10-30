package sky.pro.lesson11;

public class Hw11 {
    public static void main(String[] args) {
        Author alexandrPyshkin = new Author("Александр ", "Пушкин");
        Author levTolstoi = new Author("Лев","Толстой");
        Books book1 = new Books("Маугeли",alexandrPyshkin,1969);
        Books book2 = new Books("Маугли",alexandrPyshkin,1969);
      //book2.setYearPublication(2012);
        System.out.println(book1.equals(book2));
    }

}
