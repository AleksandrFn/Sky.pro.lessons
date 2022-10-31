package sky.pro.lesson11;

import java.util.Objects;

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
   public String toString() {
      return "Название книги "+ bookName+" Автор "+ author.toString()+" Год публикации "+yearPublication;
   }

   public boolean equals(Object obj) {
      Books books = (Books) obj;
      return Objects.equals(bookName,books.bookName)&&Objects.equals(author,books.author)&&yearPublication==books.yearPublication;
   }

   public int hashCode() {
      return Objects.hash(bookName,author,yearPublication);
   }
}
