package work_10;

import java.util.Objects;

public class Book {

    private final String title;
    private int DataPublication;
    private final Author author;

    public Book(String title, int dataPublication, Author author) {
        this.title = title;
        this.DataPublication = dataPublication;
        this.author = author;
    }

    public void setDataPublication(int dataPublication) {
        this.DataPublication = dataPublication;
    }

    public String getTitle() {
        return title;
    }

    public int getDataPublication() {
        return DataPublication;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "книга - " + title + "  ( " + DataPublication + " год )";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return DataPublication == book.DataPublication && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
