@RuntimeAnnotation(author="Tom", description = "пунь")
public class Book2 {
    private String nameBook;

    public static void printLn(String name) {
        System.out.println("Название книги: " + name);
    }
    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }
}
