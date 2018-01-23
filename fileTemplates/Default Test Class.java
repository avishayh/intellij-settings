#parse("File Header.java")
package ${PACKAGE_NAME};

import junit.framework.*;
#if (${TESTED_CLASS_PACKAGE_NAME} != "" && ${TESTED_CLASS_NAME} != "")
import ${TESTED_CLASS_PACKAGE_NAME}.${TESTED_CLASS_NAME};
#end

#parse("Type description javadoc.java")
public class ${NAME} extends TestCase {
#if (${TESTED_CLASS_NAME} != "")
   ${TESTED_CLASS_NAME} ${TESTED_CLASS_VARIABLE_NAME};
#end
}