import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) //доступна во время работы прогарммы
public @interface RuntimeAnnotation {
    String author() default "Екатерина";
    String description() default "тыктык";
}
