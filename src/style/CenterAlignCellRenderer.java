package style;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.SwingConstants;

public class CenterAlignCellRenderer extends DefaultTableCellRenderer {
    public CenterAlignCellRenderer() {
        setHorizontalAlignment(SwingConstants.CENTER);
    }
}
