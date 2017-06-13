/*
 * Created by JFormDesigner on Tue Dec 06 19:08:11 CST 2016
 */

package MainInterface.SystemRepairPanelUI;

import java.awt.event.*;
import Func.SetImage;
import MainInterface.SectionUI.SectionPanel;

import java.awt.*;
import javax.swing.*;

/**
 * @author xuanyu
 */
public class SystemRepairPanel extends JPanel {

    SectionPanel secsionPanel;
    private JFrame jFrame;

    public SystemRepairPanel(JFrame jFrame) {
        initComponents();
        this.jFrame=jFrame;
        set();
    }

    private void set(){
        loadImage();
        secsionPanel=new SectionPanel(jFrame,
                "img/component/mainJFrame/systemRepairIcon.png",
                "img/component/mainJFrame/systemRepairRemind.png",
                "img/component/sectionPanel/beginButtonDefault.png",
                "img/component/sectionPanel/beginButtonChoose.png");
        this.add(secsionPanel);
        secsionPanel.setBounds(100,25,710,70);
        secsionPanel.setVisible(true);
    }

    private void loadImage(){
        SetImage.setLabelIcon("img/component/systemRepairPanel/systemRepairFuc1_Default.png",fuc1Label);
        SetImage.setLabelIcon("img/component/systemRepairPanel/systemRepairFuc2_Default.png",fuc2Label);
        SetImage.setLabelIcon("img/component/systemRepairPanel/systemRepairFuc3_Default.png",fuc3Label);
        SetImage.setLabelIcon("img/component/systemRepairPanel/systemRepairFuc4_Default.png",fuc4Label);
    }

    private void fuc1LabelMouseEntered(MouseEvent e) {
        SetImage.setLabelIcon("img/component/systemRepairPanel/systemRepairFuc1_Choose.png",fuc1Label);
    }

    private void fuc1LabelMouseExited(MouseEvent e) {
        SetImage.setLabelIcon("img/component/systemRepairPanel/systemRepairFuc1_Default.png",fuc1Label);
    }

    private void fuc2LabelMouseEntered(MouseEvent e) {
        SetImage.setLabelIcon("img/component/systemRepairPanel/systemRepairFuc2_Choose.png",fuc2Label);
    }

    private void fuc2LabelMouseExited(MouseEvent e) {
        SetImage.setLabelIcon("img/component/systemRepairPanel/systemRepairFuc2_Default.png",fuc2Label);
    }

    private void fuc3LabelMouseEntered(MouseEvent e) {
        SetImage.setLabelIcon("img/component/systemRepairPanel/systemRepairFuc3_Choose.png",fuc3Label);
    }

    private void fuc3LabelMouseExited(MouseEvent e) {
        SetImage.setLabelIcon("img/component/systemRepairPanel/systemRepairFuc3_Default.png",fuc3Label);
    }

    private void fuc4LabelMouseEntered(MouseEvent e) {
        SetImage.setLabelIcon("img/component/systemRepairPanel/systemRepairFuc4_Choose.png",fuc4Label);
    }

    private void fuc4LabelMouseExited(MouseEvent e) {
        SetImage.setLabelIcon("img/component/systemRepairPanel/systemRepairFuc4_Default.png",fuc4Label);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        fuc1Label = new JLabel();
        fuc2Label = new JLabel();
        fuc3Label = new JLabel();
        fuc4Label = new JLabel();
        checkBox1 = new JCheckBox();
        checkBox2 = new JCheckBox();
        checkBox3 = new JCheckBox();
        checkBox4 = new JCheckBox();

        //======== this ========
        setOpaque(false);
        setPreferredSize(new Dimension(920, 465));
        setLayout(null);

        //---- fuc1Label ----
        fuc1Label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                fuc1LabelMouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                fuc1LabelMouseExited(e);
            }
        });
        add(fuc1Label);
        fuc1Label.setBounds(160, 135, 230, 85);

        //---- fuc2Label ----
        fuc2Label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                fuc2LabelMouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                fuc2LabelMouseExited(e);
            }
        });
        add(fuc2Label);
        fuc2Label.setBounds(530, 135, 230, 85);

        //---- fuc3Label ----
        fuc3Label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                fuc3LabelMouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                fuc3LabelMouseExited(e);
            }
        });
        add(fuc3Label);
        fuc3Label.setBounds(160, 260, 230, 85);

        //---- fuc4Label ----
        fuc4Label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                fuc4LabelMouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                fuc4LabelMouseExited(e);
            }
        });
        add(fuc4Label);
        fuc4Label.setBounds(530, 260, 230, 85);

        //---- checkBox1 ----
        checkBox1.setOpaque(false);
        checkBox1.setSelected(true);
        add(checkBox1);
        checkBox1.setBounds(new Rectangle(new Point(320, 155), checkBox1.getPreferredSize()));

        //---- checkBox2 ----
        checkBox2.setOpaque(false);
        checkBox2.setSelected(true);
        add(checkBox2);
        checkBox2.setBounds(new Rectangle(new Point(690, 155), checkBox2.getPreferredSize()));

        //---- checkBox3 ----
        checkBox3.setOpaque(false);
        checkBox3.setSelected(true);
        add(checkBox3);
        checkBox3.setBounds(new Rectangle(new Point(320, 280), checkBox3.getPreferredSize()));

        //---- checkBox4 ----
        checkBox4.setOpaque(false);
        checkBox4.setSelected(true);
        add(checkBox4);
        checkBox4.setBounds(new Rectangle(new Point(690, 280), checkBox4.getPreferredSize()));

        setPreferredSize(new Dimension(920, 465));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel fuc1Label;
    private JLabel fuc2Label;
    private JLabel fuc3Label;
    private JLabel fuc4Label;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
