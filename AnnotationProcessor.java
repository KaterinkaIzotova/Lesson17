/*
Создайте класс AnnotationProcessor, который будет анализировать классы и выводить информацию
из аннотации RuntimeAnnotation во время выполнения.
Используйте рефлексию для получения доступа к аннотации и извлечения значений ее элементов.
Тестирование:
 */

public class AnnotationProcessor {
    public static void processAnnotation(Object obj) {
        Class<?> clazz = obj.getClass();
        if (clazz.isAnnotationPresent(RuntimeAnnotation.class)) {
            RuntimeAnnotation annotation = clazz.getAnnotation(RuntimeAnnotation.class);
            System.out.println("Author: " + annotation.author());
            System.out.println("Description: " + annotation.description());
        } else {
            System.out.println("Annotation not found on class.");
        }
    }
}
