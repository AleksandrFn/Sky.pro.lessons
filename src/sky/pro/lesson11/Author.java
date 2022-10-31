package sky.pro.lesson11;

import java.util.Objects;

public class Author {
    private String authorName;
    private String authorLastName;
    public Author(String authorName, String authorLastName){
        this.authorName= authorName;
        this.authorLastName= authorLastName;
    }
    public String getAuthorName(){ return authorName; }

    public String getAuthorLastName() { return authorLastName; }

    public String toString() {
        return this.authorName+" "+this.authorLastName;
    }
    public boolean equals(Object obj) {
        Author author = (Author) obj;
        return Objects.equals(authorName,author.authorName) && Objects.equals(authorLastName,author.authorLastName);
    }

    public int hashCode() {
        return Objects.hash(authorName,authorLastName);
    }

}
