package Func;

import javax.swing.*;
import java.awt.*;

/**
 * Created by xuanyu on 2016/12/13.
 */
public class SetImage {
    public static void setLabelIcon(String file, JLabel iconLabel) {
        ImageIcon icon = new ImageIcon(System.getProperty("user.dir")+"/src/"+file);
        Image temp = icon.getImage().getScaledInstance(iconLabel.getWidth(),
                iconLabel.getHeight(), icon.getImage().SCALE_DEFAULT);
        icon = new ImageIcon(temp);
        iconLabel.setIcon(icon);
    }
}
