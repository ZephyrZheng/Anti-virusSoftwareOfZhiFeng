/*
 * Created by JFormDesigner on Tue Dec 20 16:55:12 CST 2016
 */

package SubFunctionUI.OperateUI.UpdateSettingUI;

import java.awt.*;
import javax.swing.*;

/**
 * @author xuanyu
 */
public class UpdateSetting extends JPanel {
    public UpdateSetting() {
        initComponents();
        set();
    }

    private void set(){
        ButtonGroup group = new ButtonGroup();// 创建单选按钮组
        group.add(radioButton1);
        group.add(radioButton2);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        checkBox1 = new JCheckBox();
        checkBox2 = new JCheckBox();
        checkBox3 = new JCheckBox();
        checkBox4 = new JCheckBox();

        //======== this ========
        setBackground(null);
        setOpaque(false);
        setPreferredSize(new Dimension(590, 315));
        setLayout(null);

        //---- radioButton1 ----
        radioButton1.setText("\u81ea\u52a8\u5347\u7ea7\u536b\u58eb\u548c\u5907\u7528\u6728\u9a6c\u5e93\u5230\u6700\u65b0\u7248");
        radioButton1.setOpaque(false);
        radioButton1.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
        radioButton1.setForeground(new Color(102, 102, 102));
        radioButton1.setSelected(true);
        add(radioButton1);
        radioButton1.setBounds(new Rectangle(new Point(100, 60), radioButton1.getPreferredSize()));

        //---- radioButton2 ----
        radioButton2.setText("\u4e0d\u81ea\u52a8\u5347\u7ea7\uff0c\u4f46\u4ecd\u5347\u7ea7\u5907\u7528\u6728\u9a6c\u5e93");
        radioButton2.setOpaque(false);
        radioButton2.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
        radioButton2.setForeground(new Color(102, 102, 102));
        add(radioButton2);
        radioButton2.setBounds(new Rectangle(new Point(100, 100), radioButton2.getPreferredSize()));

        //---- checkBox1 ----
        checkBox1.setText("\u73a9\u6e38\u620f\u65f6\u4e0d\u5347\u7ea7");
        checkBox1.setOpaque(false);
        checkBox1.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
        checkBox1.setForeground(new Color(102, 102, 102));
        checkBox1.setSelected(true);
        add(checkBox1);
        checkBox1.setBounds(new Rectangle(new Point(98, 140), checkBox1.getPreferredSize()));

        //---- checkBox2 ----
        checkBox2.setText("\u4f7f\u75283G\u4e0a\u7f51\u65f6\u4e0d\u5347\u7ea7");
        checkBox2.setOpaque(false);
        checkBox2.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
        checkBox2.setForeground(new Color(102, 102, 102));
        checkBox2.setSelected(true);
        add(checkBox2);
        checkBox2.setBounds(new Rectangle(new Point(330, 140), checkBox2.getPreferredSize()));

        //---- checkBox3 ----
        checkBox3.setText("\u4f7f\u7528P2P/P2S\u6280\u672f\u52a0\u901f\u5347\u7ea7");
        checkBox3.setOpaque(false);
        checkBox3.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
        checkBox3.setForeground(new Color(102, 102, 102));
        checkBox3.setSelected(true);
        add(checkBox3);
        checkBox3.setBounds(new Rectangle(new Point(98, 180), checkBox3.getPreferredSize()));

        //---- checkBox4 ----
        checkBox4.setText("\u4f7f\u7528\u529f\u80fd\u65f6\u68c0\u67e5\u529f\u80fd\u66f4\u65b0");
        checkBox4.setOpaque(false);
        checkBox4.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
        checkBox4.setForeground(new Color(102, 102, 102));
        checkBox4.setSelected(true);
        add(checkBox4);
        checkBox4.setBounds(new Rectangle(new Point(330, 180), checkBox4.getPreferredSize()));

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < getComponentCount(); i++) {
                Rectangle bounds = getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            setMinimumSize(preferredSize);
            setPreferredSize(preferredSize);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
