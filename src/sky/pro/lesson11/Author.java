package sky.pro.lesson11;

public class Author {
    private String authorName;
    private String authorLastName;
    public Author(String authorName, String authorLastName){
        this.authorName= authorName;
        this.authorLastName= authorLastName;
    }
    public String getAuthorName(){
        return authorName;
    }

}
