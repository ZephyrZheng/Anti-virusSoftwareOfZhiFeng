/*
 * Created by JFormDesigner on Mon Dec 05 14:43:40 CST 2016
 */

package MainInterface.CleanUpPanelUI;

import java.awt.event.*;

import Func.SetImage;
import MainInterface.SectionUI.SectionPanel;
import SubFunctionUI.UndoneUI.Undone;

import java.awt.*;
import javax.swing.*;

/**
 * @author xuanyu
 */
public class CleanUpPanel extends JPanel {

    private SectionPanel secsionPanel;
    private JFrame jFrame;
    private Undone undone;

    public CleanUpPanel(JFrame jFrame) {
        initComponents();
        this.jFrame=jFrame;
        set();
        loadImage();
    }

    private void set(){
        secsionPanel=new SectionPanel(jFrame,
                "img/component/mainJFrame/cleanUpIcon.png",
                "img/component/mainJFrame/cleanUpRemind.png",
                "img/component/sectionPanel/beginButtonDefault.png",
                "img/component/sectionPanel/beginButtonChoose.png");
        this.add(secsionPanel);
        secsionPanel.setBounds(100,25,710,70);
        secsionPanel.setVisible(true);
    }

    private void loadImage(){
        //设置图片
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p1_default.png",p1Label);
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p2_default.png",p2Label);
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p3_default.png",p3Label);
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p4_default.png",p4Label);
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p5_default.png",p5Label);
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p6_default.png",p6Label);
    }

    private void p1LabelMouseEntered(MouseEvent e) {
        //设置图片
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p1_choose.png",p1Label);
    }

    private void p1LabelMouseExited(MouseEvent e) {
        //设置图片
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p1_default.png",p1Label);
    }

    private void p1LabelMousePressed(MouseEvent e) {
        //设置图片
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p1_choose.png",p1Label);
    }

    private void p1LabelMouseReleased(MouseEvent e) {
        //设置图片
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p1_default.png",p1Label);
    }

    private void p2LabelMouseEntered(MouseEvent e) {
        //设置图片
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p2_choose.png",p2Label);
    }

    private void p2LabelMouseExited(MouseEvent e) {
        //设置图片
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p2_default.png",p2Label);
    }

    private void p2LabelMousePressed(MouseEvent e) {
        //设置图片
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p2_choose.png",p2Label);
    }

    private void p2LabelMouseReleased(MouseEvent e) {
        //设置图片
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p2_default.png",p2Label);
    }

    private void p3LabelMouseEntered(MouseEvent e) {
        //设置图片
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p3_choose.png",p3Label);
    }

    private void p3LabelMouseExited(MouseEvent e) {
        //设置图片
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p3_default.png",p3Label);
    }

    private void p3LabelMousePressed(MouseEvent e) {
        //设置图片
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p3_choose.png",p3Label);
    }

    private void p3LabelMouseReleased(MouseEvent e) {
        //设置图片
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p3_default.png",p3Label);
    }

    private void p4LabelMouseEntered(MouseEvent e) {
        //设置图片
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p4_choose.png",p4Label);
    }

    private void p4LabelMouseExited(MouseEvent e) {
        //设置图片
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p4_default.png",p4Label);
    }

    private void p4LabelMousePressed(MouseEvent e) {
        //设置图片
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p4_choose.png",p4Label);
    }

    private void p4LabelMouseReleased(MouseEvent e) {
        //设置图片
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p4_default.png",p4Label);
    }

    private void p5LabelMouseEntered(MouseEvent e) {
        //设置图片
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p5_choose.png",p5Label);
    }

    private void p5LabelMouseExited(MouseEvent e) {
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p5_default.png",p5Label);
    }

    private void p5LabelMousePressed(MouseEvent e) {
        //设置图片
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p5_choose.png",p5Label);
    }

    private void p5LabelMouseReleased(MouseEvent e) {
        //设置图片
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p5_default.png",p5Label);
    }

    private void p6LabelMouseEntered(MouseEvent e) {
        //设置图片
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p6_choose.png",p6Label);
    }

    private void p6LabelMouseExited(MouseEvent e) {
        //设置图片
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p6_default.png",p6Label);
    }

    private void p6LabelMousePressed(MouseEvent e) {
        //设置图片
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p6_choose.png",p6Label);
    }

    private void p6LabelMouseReleased(MouseEvent e) {
        //设置图片
        SetImage.setLabelIcon("img/component/cleanUpPanel/cleanUp_p6_default.png",p6Label);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        p1Label = new JLabel();
        p2Label = new JLabel();
        p3Label = new JLabel();
        p4Label = new JLabel();
        p5Label = new JLabel();
        p6Label = new JLabel();
        p1CheckBox = new JCheckBox();
        p2CheckBox = new JCheckBox();
        p3CheckBox = new JCheckBox();
        p4CheckBox = new JCheckBox();
        p5CheckBox = new JCheckBox();
        p6CheckBox = new JCheckBox();

        //======== this ========
        setOpaque(false);
        setPreferredSize(new Dimension(920, 465));
        setLayout(null);

        //---- p1Label ----
        p1Label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                p1LabelMouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                p1LabelMouseExited(e);
            }
            @Override
            public void mousePressed(MouseEvent e) {
                p1LabelMousePressed(e);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                p1LabelMouseReleased(e);
            }
        });
        add(p1Label);
        p1Label.setBounds(90, 150, 230, 85);

        //---- p2Label ----
        p2Label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                p2LabelMouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                p2LabelMouseExited(e);
            }
            @Override
            public void mousePressed(MouseEvent e) {
                p2LabelMousePressed(e);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                p2LabelMouseReleased(e);
            }
        });
        add(p2Label);
        p2Label.setBounds(340, 150, 230, 85);

        //---- p3Label ----
        p3Label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                p3LabelMouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                p3LabelMouseExited(e);
            }
            @Override
            public void mousePressed(MouseEvent e) {
                p3LabelMousePressed(e);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                p3LabelMouseReleased(e);
            }
        });
        add(p3Label);
        p3Label.setBounds(590, 150, 230, 85);

        //---- p4Label ----
        p4Label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                p4LabelMouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                p4LabelMouseExited(e);
            }
            @Override
            public void mousePressed(MouseEvent e) {
                p4LabelMousePressed(e);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                p4LabelMouseReleased(e);
            }
        });
        add(p4Label);
        p4Label.setBounds(90, 250, 230, 85);

        //---- p5Label ----
        p5Label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                p5LabelMouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                p5LabelMouseExited(e);
            }
            @Override
            public void mousePressed(MouseEvent e) {
                p5LabelMousePressed(e);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                p5LabelMouseReleased(e);
            }
        });
        add(p5Label);
        p5Label.setBounds(340, 250, 230, 85);

        //---- p6Label ----
        p6Label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                p6LabelMouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                p6LabelMouseExited(e);
            }
            @Override
            public void mousePressed(MouseEvent e) {
                p6LabelMousePressed(e);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                p6LabelMouseReleased(e);
            }
        });
        add(p6Label);
        p6Label.setBounds(590, 250, 230, 85);

        //---- p1CheckBox ----
        p1CheckBox.setBackground(null);
        p1CheckBox.setSelected(true);
        add(p1CheckBox);
        p1CheckBox.setBounds(new Rectangle(new Point(240, 170), p1CheckBox.getPreferredSize()));

        //---- p2CheckBox ----
        p2CheckBox.setBackground(null);
        p2CheckBox.setSelected(true);
        add(p2CheckBox);
        p2CheckBox.setBounds(new Rectangle(new Point(490, 170), p2CheckBox.getPreferredSize()));

        //---- p3CheckBox ----
        p3CheckBox.setBackground(null);
        p3CheckBox.setSelected(true);
        add(p3CheckBox);
        p3CheckBox.setBounds(new Rectangle(new Point(760, 170), p3CheckBox.getPreferredSize()));

        //---- p4CheckBox ----
        p4CheckBox.setBackground(null);
        p4CheckBox.setSelected(true);
        add(p4CheckBox);
        p4CheckBox.setBounds(new Rectangle(new Point(240, 270), p4CheckBox.getPreferredSize()));

        //---- p5CheckBox ----
        p5CheckBox.setSelected(true);
        p5CheckBox.setBackground(null);
        add(p5CheckBox);
        p5CheckBox.setBounds(new Rectangle(new Point(490, 270), p5CheckBox.getPreferredSize()));

        //---- p6CheckBox ----
        p6CheckBox.setBackground(null);
        p6CheckBox.setSelected(true);
        add(p6CheckBox);
        p6CheckBox.setBounds(new Rectangle(new Point(775, 270), p6CheckBox.getPreferredSize()));

        setPreferredSize(new Dimension(920, 465));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel p1Label;
    private JLabel p2Label;
    private JLabel p3Label;
    private JLabel p4Label;
    private JLabel p5Label;
    private JLabel p6Label;
    private JCheckBox p1CheckBox;
    private JCheckBox p2CheckBox;
    private JCheckBox p3CheckBox;
    private JCheckBox p4CheckBox;
    private JCheckBox p5CheckBox;
    private JCheckBox p6CheckBox;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
