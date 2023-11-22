public class Main {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.setNameBook("Огонь");

        Book2 myBook2 = new Book2();
        myBook2.setNameBook("Воздух");

        AnnotationProcessor myAnnotationProcessor = new AnnotationProcessor();
        myAnnotationProcessor.processAnnotation(myBook);
        Book.printLn(myBook.getNameBook());

        myAnnotationProcessor.processAnnotation(myBook2);
        Book.printLn(myBook2.getNameBook());
    }
}