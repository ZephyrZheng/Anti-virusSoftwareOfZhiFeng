/*
 * Created by JFormDesigner on Mon Dec 05 14:44:21 CST 2016
 */

package MainInterface.FunctionPanelUI;

import MainInterface.SectionUI.SectionPanel;

import java.awt.*;
import javax.swing.*;

/**
 * @author xuanyu
 */
public class FunctionPanel extends JPanel {

    SectionPanel secsionPanel;
    private JFrame jFrame;

    public FunctionPanel(JFrame jFrame) {
        initComponents();
        this.jFrame=jFrame;
        set();
    }

    private void set(){

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();

        //======== this ========
        setPreferredSize(new Dimension(920, 465));
        setOpaque(false);
        setLayout(null);

        //---- label1 ----
        label1.setText("( * _ * ) \u8be5\u529f\u80fd\u672a\u5b9e\u73b0!");
        label1.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 30));
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setForeground(new Color(102, 102, 102));
        add(label1);
        label1.setBounds(195, 190, 500, 50);

        setPreferredSize(new Dimension(920, 465));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
