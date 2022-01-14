package fieldAnnotation;

import java.lang.reflect.Field;
import java.util.Date;

public class AnnotationExample {
    public static void main(String[] args) throws Exception {
        System.out.println("Annotation Example");
        User usr = new User();
        usr.setEmail("sontd@gmail.com");
        usr.setName("Son");
        usr.setId(112);
        usr.setCreated(new Date());

        for (Field field: usr.getClass().getDeclaredFields()){
            DBField dbField = field.getAnnotation(DBField.class);
            System.out.println("Field name: "+dbField.name());

            field.setAccessible(true);
            Object value = field.get(usr);
            System.out.println("field value: "+dbField.type());
            System.out.println("Is primary key: "+dbField.isPrimaryKey());
        }
    }
}
