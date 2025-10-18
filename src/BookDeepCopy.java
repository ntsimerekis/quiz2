import java.util.ArrayList;
import java.util.List;

public class BookDeepCopy extends Book implements Cloneable {
    public BookDeepCopy(String title, String author, List<String> chapters) {
        super(title, author, chapters);
    }

    @Override
    public BookDeepCopy clone() {
        try {
            final BookDeepCopy copy = (BookDeepCopy) super.clone();
            copy.setChapters(new ArrayList<String>(this.getChapters()));
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
