#parse("File Header.java")

package ${PACKAGE_NAME};
import com.alphacsp.common.log.Log;
import com.alphacsp.common.log.LogService;
import com.idi.framework.gui.client.dseview.IDIBasicView;
import com.idi.framework.gui.client.dseview.ViewModelClass;
import com.idi.framework.gui.client.uimanager.IDIUIManagerHelper;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

#parse("Type description javadoc.java")
@ViewModelClass(${NAME}Model.class)
public class ${NAME} extends IDIBasicView {
    private static final Log log = LogService.getLog(${NAME}.class);

    private static final String TITLE = "כותרת למסך";
    private static final String VIEW_TITLE = "עוד כותרת למסך";
    private static final int VIEW_WIDTH = 250;
    private static final int VIEW_HEIGHT = 250;

    @Override
    protected IDIUIManagerHelper.ViewTypeEnum createViewType() {
        return IDIUIManagerHelper.;
    }

    @Override
    protected Dimension createViewSize() {
        return new Dimension(VIEW_WIDTH, VIEW_HEIGHT);
    }

    @Override
    protected void buildUI() {
        setTitle(TITLE);
        setViewTitle(VIEW_TITLE);
    }

    public static void main(String[] args) throws Exception {
        Map<String, Object> map = new HashMap();
        openView(${NAME}.class, map);
    }
}