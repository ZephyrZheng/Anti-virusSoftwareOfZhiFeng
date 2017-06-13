/*
 * Created by JFormDesigner on Tue Dec 13 20:40:29 CST 2016
 */

package MainInterface.SectionUI;

import Func.SetImage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import SubFunctionUI.UndoneUI.Undone;

/**
 * @author xuanyu
 */
public class SectionPanel extends JPanel {

    private String icon;
    private String remind;
    private String buttonImageDefault;
    private String buttonImageChoose;
    private JFrame jFrame;
    private Undone undone;

    public SectionPanel(JFrame jFrame,String icon,String remind,String buttonImageDefault,String buttonImageChoose) {
        initComponents();
        this.jFrame=jFrame;
        this.icon=icon;
        this.remind=remind;
        this.buttonImageDefault=buttonImageDefault;
        this.buttonImageChoose=buttonImageChoose;
        set();
    }

    private void set(){
        loadImage();
    }

    private void loadImage(){

        SetImage.setLabelIcon(icon,iconLabel);
        SetImage.setLabelIcon(remind,remindLabel);
        SetImage.setLabelIcon(buttonImageDefault,buttonLabel);
    }

    private void buttonLabelMouseEntered(MouseEvent e) {
        // TODO add your code here
        SetImage.setLabelIcon(buttonImageChoose,buttonLabel);
    }

    private void buttonLabelMouseExited(MouseEvent e) {
        // TODO add your code here
        SetImage.setLabelIcon(buttonImageDefault,buttonLabel);
    }

    private void buttonLabelMousePressed(MouseEvent e) {
        // TODO add your code here
        SetImage.setLabelIcon(buttonImageChoose,buttonLabel);
    }

    private void buttonLabelMouseReleased(MouseEvent e) {
        // TODO add your code here
        SetImage.setLabelIcon(buttonImageDefault,buttonLabel);
    }

    private void buttonLabelMouseClicked(MouseEvent e) {
        // TODO add your code here
        undone=new Undone(jFrame);
        undone.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        iconLabel = new JLabel();
        remindLabel = new JLabel();
        buttonLabel = new JLabel();

        //======== this ========
        setOpaque(false);
        setPreferredSize(new Dimension(710, 70));
        setBackground(null);
        setVisible(false);
        setLayout(null);

        //---- iconLabel ----
        iconLabel.setBackground(null);
        add(iconLabel);
        iconLabel.setBounds(10, 10, 50, 50);

        //---- remindLabel ----
        remindLabel.setBackground(null);
        add(remindLabel);
        remindLabel.setBounds(80, 15, 450, 40);

        //---- buttonLabel ----
        buttonLabel.setBackground(null);
        buttonLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                buttonLabelMouseClicked(e);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                buttonLabelMouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                buttonLabelMouseExited(e);
            }
            @Override
            public void mousePressed(MouseEvent e) {
                buttonLabelMousePressed(e);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                buttonLabelMouseReleased(e);
            }
        });
        add(buttonLabel);
        buttonLabel.setBounds(550, 15, 160, 40);

        setPreferredSize(new Dimension(710, 70));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel iconLabel;
    private JLabel remindLabel;
    private JLabel buttonLabel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
