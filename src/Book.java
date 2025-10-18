import java.util.List;

public abstract class Book {
    protected String title;
    protected String author;
    protected List<String> chapters;

    public Book(String title, String author, List<String> chapters) {
        this.title = title;
        this.author = author;
        this.chapters = chapters;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return "";
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String> getChapters() {
        return this.chapters;
    }

    public void setChapters(List<String> chapters) {
        this.chapters = chapters;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Title: ").append(title).append(" by Author: ").append(author).append(System.lineSeparator());
        chapters.forEach(chapter -> {sb.append(chapter).append(System.lineSeparator());});

        return sb.toString();
    }
}
