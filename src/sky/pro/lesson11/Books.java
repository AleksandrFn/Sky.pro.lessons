package sky.pro.lesson11;

public class Books {
   private String bookName;
   private Author author;
   private int yearPublication;

   public Books(String name , Author author, int yearPublication){
      this.bookName=name;
      this.author=author;
      this.yearPublication=yearPublication;
   }
   public String getName(){
      return bookName;
   }
   public Author getAuthor(){
      return author;
   }
   public int getYearPublication(){
      return yearPublication;
   }
   public void setYearPublication(int yearPublication){
      this.yearPublication=yearPublication;
   }
}
