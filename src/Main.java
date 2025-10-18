import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<String> myChapters = new ArrayList<String>();
        myChapters.add("Chapter 1");
        myChapters.add("Chapter 2");
        myChapters.add("Chapter 3");

        System.out.println("Shallow Copy Tests");
        final BookShallowCopy bookShallow1 = new BookShallowCopy("My First Shallow Life", "Nicholas Tsimerekis", new ArrayList<>(myChapters));
        System.out.println("1st BookShallowCopy Chapters: ");
        System.out.println(bookShallow1);
        System.out.println();

        System.out.println("2nd BookShallowCopy Chapters: ");
        final BookShallowCopy bookShallow2 = bookShallow1.clone();
        bookShallow2.setTitle("My Second Shallow Life");
        System.out.println(bookShallow2);

        System.out.println();

        System.out.println("Changing 2nd BookShallowCopy 'Chapter 1' to 'Chapter One': ");
        bookShallow2.getChapters().set(0, "Chapter One");
        System.out.println(bookShallow2);
        System.out.println();

        System.out.println("Change is persisted in the first book.");
        System.out.println(bookShallow1);

        System.out.println();

        System.out.println("Deep Copy Tests");
        System.out.println("1st BookDeepCopy Chapters: ");
        final BookDeepCopy bookDeep1 = new BookDeepCopy("My First Deep Life", "Nicholas Tsimerekis", new ArrayList<>(myChapters));
        System.out.println(bookDeep1);

        System.out.println("2nd BookDeepCopy Chapters: ");
        final BookDeepCopy bookDeep2 = bookDeep1.clone();
        bookDeep2.setTitle("My Second Deep Life");
        System.out.println(bookDeep2);

        System.out.println("Changing 2nd BookDeepCopy 'Chapter 2' to 'Chapter Two': ");
        bookDeep2.getChapters().set(1, "Chapter Two");
        System.out.println(bookDeep2);

        System.out.println();
        System.out.println("Change NOT persisted in the first deep copy book.");
        System.out.println(bookDeep1);

    }
}