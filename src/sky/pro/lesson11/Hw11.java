package sky.pro.lesson11;

public class Hw11 {
    public static void main(String[] args) {
        Author alexandrPyshkin = new Author("Alexandr ", "Pyshkin");
        Author levTolstoi = new Author("Lev","Tolstoi");
        Books book1 = new Books("Maygli",alexandrPyshkin,1969);
        Books book2 = new Books("Shantaram",levTolstoi,2003);
        book2.setYearPublication(2012);
        System.out.println(book2.getYearPublication());
    }

}
