import java.awt.print.Book;
import java.util.Arrays;

public class Books {

    private String name;
    private PublishingHouse ph;
    private int year;
    private String[] authors;

    public Books(String name, int year, PublishingHouse ph) {
       setName(name);
        setYear(year);
        setPh(ph);
    }

    public Books(String name, String author, int year, PublishingHouse ph) {
        setName(name);
        setAuthor(author);
        setYear(year);
        setPh(ph);
    }

    public Books(String name, String[] authors, int year, PublishingHouse ph) {
        setName(name);
        setAuthors(authors);
        setYear(year);
        setPh(ph);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException("!!! Пустая ссылка !!!");
        this.name = name;
    }

    public PublishingHouse getPh() {
        return ph;
    }

    public void setPh(PublishingHouse ph) {
        if (ph == null)
            throw new IllegalArgumentException("!!! Пустая ссылка !!!");
        this.ph = ph;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 0)
            throw new IllegalArgumentException("!!! Год должен быть больше ноля !!!");
        this.year = year;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        if (authors != null) {
            for (String author : authors) {
                if (author == null)
                    throw new IllegalArgumentException("!!! Пустая ссылка в перечне авторов !!!");
            }
        }
        this.authors = authors;
    }

    public void setAuthor(String author) {
        if (author == null)
            throw new IllegalArgumentException("!!! Пустая ссылка !!!");
        this.authors = new String[1];
        authors[0] = author;
    }

    public int authorsCount() {
        return authors.length;
    }

    public String getAuthorByIndex(int index) {
        if (index < 0)
            throw new IllegalArgumentException("!!! Индекс должен быть положительным !!!");
        if (index >= authors.length)
            throw new IllegalArgumentException("!!! Индекс не может превышать длину массива !!!");
        return authors[index];
    }

    public void print() {
        if (authors != null)
        System.out.println(getName() + "; "
                + Arrays.toString(authors) + "; "
                + getPh().getName() + "; "
                + getPh().getCity() + "; "
                + getYear());
        else
            System.out.println(getName() + "; "
                    + getPh().getName() + "; "
                    + getYear());
    }

    public static void printAll(Books[] books) {
        for (Books book : books) {
            book.print();
        }
    }
}
