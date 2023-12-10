package style;

import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Font;

public class BoldFontRenderer extends DefaultTableCellRenderer {
    public BoldFontRenderer() {
        setFont(getFont().deriveFont(Font.BOLD));
    }
}
