/*
 * Created by JFormDesigner on Mon Dec 12 23:03:59 CST 2016
 */

package MainInterface.CheckPanelUI;

import java.awt.event.*;
import Func.SetImage;
import MainInterface.SectionUI.SectionPanel;

import java.awt.*;
import javax.swing.*;

/**
 * @author xuanyu
 */
public class CheckPanel extends JPanel {

    SectionPanel secsionPanel;
    private JFrame jFrame;

    public CheckPanel(JFrame jFrame) {
        initComponents();
        this.jFrame=jFrame;
        set();
    }

    private void set(){
        secsionPanel=new SectionPanel(jFrame,
                "img/component/mainJFrame/checkUpIcon.png",
                "img/component/mainJFrame/checkRemind.png",
                "img/component/sectionPanel/beginButtonDefault.png",
                "img/component/sectionPanel/beginButtonChoose.png");
        this.add(secsionPanel);
        secsionPanel.setBounds(100,25,710,70);
        secsionPanel.setVisible(true);
        //设置图片
        SetImage.setLabelIcon("img/component/checkUpPanel/checkRemind2.png",chooseRemindLabel);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        chooseRemindLabel = new JLabel();
        checkBox1 = new JCheckBox();
        checkBox2 = new JCheckBox();
        checkBox3 = new JCheckBox();
        checkBox4 = new JCheckBox();
        checkBox5 = new JCheckBox();
        checkBox6 = new JCheckBox();
        checkBox7 = new JCheckBox();
        checkBox8 = new JCheckBox();
        checkBox9 = new JCheckBox();
        checkBox10 = new JCheckBox();
        checkBox11 = new JCheckBox();
        checkBox12 = new JCheckBox();
        checkBox13 = new JCheckBox();
        checkBox14 = new JCheckBox();
        checkBox15 = new JCheckBox();
        checkBox16 = new JCheckBox();
        checkBox17 = new JCheckBox();
        checkBox18 = new JCheckBox();
        checkBox19 = new JCheckBox();
        checkBox20 = new JCheckBox();

        //======== this ========
        setOpaque(false);
        setPreferredSize(new Dimension(920, 465));
        setLayout(null);
        add(chooseRemindLabel);
        chooseRemindLabel.setBounds(357, 160, 200, 40);

        //---- checkBox1 ----
        checkBox1.setText("\u5e38\u7528\u8f6f\u4ef6\u5783\u573e");
        checkBox1.setBackground(null);
        checkBox1.setSelected(true);
        checkBox1.setOpaque(false);
        checkBox1.setForeground(new Color(102, 102, 102));
        add(checkBox1);
        checkBox1.setBounds(115, 240, 110, 20);

        //---- checkBox2 ----
        checkBox2.setText("\u7cfb\u7edf\u5783\u573e");
        checkBox2.setSelected(true);
        checkBox2.setBackground(null);
        checkBox2.setOpaque(false);
        checkBox2.setForeground(new Color(102, 102, 102));
        add(checkBox2);
        checkBox2.setBounds(265, 240, 100, 20);

        //---- checkBox3 ----
        checkBox3.setText("Cookies\u4fe1\u606f");
        checkBox3.setSelected(true);
        checkBox3.setBackground(null);
        checkBox3.setOpaque(false);
        checkBox3.setForeground(new Color(102, 102, 102));
        add(checkBox3);
        checkBox3.setBounds(415, 240, 100, 20);

        //---- checkBox4 ----
        checkBox4.setText("\u6ce8\u518c\u8868");
        checkBox4.setSelected(true);
        checkBox4.setBackground(null);
        checkBox4.setOpaque(false);
        checkBox4.setForeground(new Color(102, 102, 102));
        add(checkBox4);
        checkBox4.setBounds(565, 240, 100, 20);

        //---- checkBox5 ----
        checkBox5.setText("\u75d5\u8ff9\u4fe1\u606f");
        checkBox5.setSelected(true);
        checkBox5.setBackground(null);
        checkBox5.setOpaque(false);
        checkBox5.setForeground(new Color(102, 102, 102));
        add(checkBox5);
        checkBox5.setBounds(715, 240, 100, 20);

        //---- checkBox6 ----
        checkBox6.setText("\u6d4f\u89c8\u5668\u9632\u62a4");
        checkBox6.setSelected(true);
        checkBox6.setBackground(null);
        checkBox6.setOpaque(false);
        checkBox6.setForeground(new Color(102, 102, 102));
        add(checkBox6);
        checkBox6.setBounds(115, 270, 100, 20);

        //---- checkBox7 ----
        checkBox7.setText("\u7cfb\u7edf\u9632\u62a4");
        checkBox7.setSelected(true);
        checkBox7.setBackground(null);
        checkBox7.setOpaque(false);
        checkBox7.setForeground(new Color(102, 102, 102));
        add(checkBox7);
        checkBox7.setBounds(265, 270, 100, 20);

        //---- checkBox8 ----
        checkBox8.setText("\u5165\u53e3\u9632\u62a4");
        checkBox8.setSelected(true);
        checkBox8.setBackground(null);
        checkBox8.setOpaque(false);
        checkBox8.setForeground(new Color(102, 102, 102));
        add(checkBox8);
        checkBox8.setBounds(415, 270, 100, 20);

        //---- checkBox9 ----
        checkBox9.setText("IE\u76f8\u5173\u8bbe\u7f6e");
        checkBox9.setSelected(true);
        checkBox9.setBackground(null);
        checkBox9.setOpaque(false);
        checkBox9.setForeground(new Color(102, 102, 102));
        add(checkBox9);
        checkBox9.setBounds(565, 270, 100, 20);

        //---- checkBox10 ----
        checkBox10.setText("\u684c\u9762\u8bbe\u7f6e");
        checkBox10.setSelected(true);
        checkBox10.setBackground(null);
        checkBox10.setOpaque(false);
        checkBox10.setForeground(new Color(102, 102, 102));
        add(checkBox10);
        checkBox10.setBounds(715, 270, 100, 20);

        //---- checkBox11 ----
        checkBox11.setText("\u5173\u8054\u9879\u8bbe\u7f6e");
        checkBox11.setBackground(null);
        checkBox11.setSelected(true);
        checkBox11.setOpaque(false);
        checkBox11.setForeground(new Color(102, 102, 102));
        add(checkBox11);
        checkBox11.setBounds(115, 300, 100, 20);

        //---- checkBox12 ----
        checkBox12.setText("\u5e38\u89c4\u626b\u63cf");
        checkBox12.setBackground(null);
        checkBox12.setSelected(true);
        checkBox12.setOpaque(false);
        checkBox12.setForeground(new Color(102, 102, 102));
        add(checkBox12);
        checkBox12.setBounds(265, 300, 100, 20);

        //---- checkBox13 ----
        checkBox13.setText("\u5feb\u6377\u65b9\u5f0f");
        checkBox13.setBackground(null);
        checkBox13.setSelected(true);
        checkBox13.setOpaque(false);
        checkBox13.setForeground(new Color(102, 102, 102));
        add(checkBox13);
        checkBox13.setBounds(415, 300, 100, 20);

        //---- checkBox14 ----
        checkBox14.setText("\u7cfb\u7edf\u8bbe\u7f6e");
        checkBox14.setBackground(null);
        checkBox14.setSelected(true);
        checkBox14.setOpaque(false);
        checkBox14.setForeground(new Color(102, 102, 102));
        add(checkBox14);
        checkBox14.setBounds(565, 300, 100, 20);

        //---- checkBox15 ----
        checkBox15.setText("\u6e05\u7406\u63d2\u4ef6");
        checkBox15.setBackground(null);
        checkBox15.setSelected(true);
        checkBox15.setOpaque(false);
        checkBox15.setForeground(new Color(102, 102, 102));
        add(checkBox15);
        checkBox15.setBounds(715, 300, 100, 20);

        //---- checkBox16 ----
        checkBox16.setText("\u6e05\u7406\u8f6f\u4ef6");
        checkBox16.setBackground(null);
        checkBox16.setSelected(true);
        checkBox16.setOpaque(false);
        checkBox16.setForeground(new Color(102, 102, 102));
        add(checkBox16);
        checkBox16.setBounds(115, 330, 100, 20);

        //---- checkBox17 ----
        checkBox17.setText("\u7cfb\u7edf\u5173\u952e\u4f4d\u7f6e");
        checkBox17.setBackground(null);
        checkBox17.setSelected(true);
        checkBox17.setOpaque(false);
        checkBox17.setForeground(new Color(102, 102, 102));
        add(checkBox17);
        checkBox17.setBounds(265, 330, 110, 20);

        //---- checkBox18 ----
        checkBox18.setText("\u5b89\u5168\u9632\u62a4");
        checkBox18.setBackground(null);
        checkBox18.setSelected(true);
        checkBox18.setOpaque(false);
        checkBox18.setForeground(new Color(102, 102, 102));
        add(checkBox18);
        checkBox18.setBounds(415, 330, 100, 20);

        //---- checkBox19 ----
        checkBox19.setText("\u9ad8\u5371\u6f0f\u6d1e");
        checkBox19.setBackground(null);
        checkBox19.setSelected(true);
        checkBox19.setOpaque(false);
        checkBox19.setForeground(new Color(102, 102, 102));
        add(checkBox19);
        checkBox19.setBounds(565, 330, 100, 20);

        //---- checkBox20 ----
        checkBox20.setText("\u7f51\u8d2d\u9632\u62a4");
        checkBox20.setBackground(null);
        checkBox20.setSelected(true);
        checkBox20.setOpaque(false);
        checkBox20.setForeground(new Color(102, 102, 102));
        add(checkBox20);
        checkBox20.setBounds(715, 330, 100, 20);

        setPreferredSize(new Dimension(920, 465));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel chooseRemindLabel;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JCheckBox checkBox5;
    private JCheckBox checkBox6;
    private JCheckBox checkBox7;
    private JCheckBox checkBox8;
    private JCheckBox checkBox9;
    private JCheckBox checkBox10;
    private JCheckBox checkBox11;
    private JCheckBox checkBox12;
    private JCheckBox checkBox13;
    private JCheckBox checkBox14;
    private JCheckBox checkBox15;
    private JCheckBox checkBox16;
    private JCheckBox checkBox17;
    private JCheckBox checkBox18;
    private JCheckBox checkBox19;
    private JCheckBox checkBox20;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
