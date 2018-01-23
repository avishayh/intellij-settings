#parse("File Header.java")

package ${PACKAGE_NAME};

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

#parse("Type description javadoc.java")
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ${NAME} {

}