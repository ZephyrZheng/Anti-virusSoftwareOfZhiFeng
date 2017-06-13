/*
 * Created by JFormDesigner on Tue Dec 20 16:53:50 CST 2016
 */

package SubFunctionUI.OperateUI.AboutDeveloperUI;

import Func.SetImage;

import java.awt.*;
import javax.swing.*;

/**
 * @author xuanyu
 */
public class AboutDeveloper extends JPanel {
    public AboutDeveloper() {
        initComponents();
        set();
    }

    private void set(){
        loadImage();
    }

    private void loadImage(){
        SetImage.setLabelIcon("img/component/aboutDeveloperPanel/developerInformation.png",developerInformationLabel);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        developerInformationLabel = new JLabel();

        //======== this ========
        setBackground(null);
        setOpaque(false);
        setPreferredSize(new Dimension(590, 315));
        setLayout(null);
        add(developerInformationLabel);
        developerInformationLabel.setBounds(120, 70, 350, 200);

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
    private JLabel developerInformationLabel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
