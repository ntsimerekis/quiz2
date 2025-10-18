import java.util.List;

public class BookShallowCopy extends Book {

    public BookShallowCopy(String title, String author, List<String> chapters) {
        super(title, author, chapters);
    }

    public BookShallowCopy clone() {
        return new BookShallowCopy(title, author, chapters);
    }
}
