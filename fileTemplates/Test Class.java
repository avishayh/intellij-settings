#parse("File Header.java")

package ${PACKAGE_NAME};

import com.alphacsp.common.log.Log;
import com.alphacsp.common.log.LogService;
import com.ibm.dse.base.DSEOperation;
import com.idi.framework.test.client.WSBCCImprovedTestcase;

import java.io.IOException;

#parse("Type description javadoc.java")
public class ${NAME} extends WSBCCImprovedTestcase {
    /**
	 * Constructor for <tt>${NAME}</tt>.
	 * @param arg0
	 */
	public ${NAME}(String arg0) {
		super(arg0);
	}

	public void test_${NAME}() {
		BasicCSOperation op = null;
		String opName = "";
		String expected = "";
		String result = null;
		try {

			op = (BasicCSOperation) getOperationByName(opName);
            //op.setInParam("","");
			
			op.execute();
			
			//result = (String) op.getOutParam("");
			doAssert(expected, result);
			
		} catch (Exception e) {
			assertTrue(false);
		} finally {
			closeOp(op);
		}
		
	}
}
