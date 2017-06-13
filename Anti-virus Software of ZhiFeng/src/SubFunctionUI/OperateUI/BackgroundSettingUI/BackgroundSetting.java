/*
 * Created by JFormDesigner on Tue Dec 20 16:54:56 CST 2016
 */

package SubFunctionUI.OperateUI.BackgroundSettingUI;

import Func.SetImage;
import SubFunctionUI.OperateUI.Operate;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author xuanyu
 */
public class BackgroundSetting extends JPanel {

    JLabel jLabel;

    public BackgroundSetting(JLabel jLabel) {
        this.jLabel=jLabel;
        initComponents();
        set();
    }

    private void set(){
        loadImage();
    }

    private void loadImage(){
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg1.png",label1);
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg2.jpg",label2);
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg3.jpg",label3);
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg4.jpg",label4);
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg5.jpg",label5);
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg6.jpg",label6);
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg7.jpg",label7);
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg8.png",label8);
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg9.jpg",label9);
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg10.jpg",label10);
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg11.jpg",label11);
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg12.jpg",label12);
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg13.jpg",label13);
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg14.jpg",label14);
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg15.jpg",label15);
    }

    private void change(String src,JLabel e){
        /*e.setBounds(
                (int)e.getLocation().getX()-5,
                (int)e.getLocation().getY()-5,
                (int)e.getPreferredSize().getWidth()+10,
                (int)e.getPreferredSize().getHeight()+10);*/
        SetImage.setLabelIcon(src,e);

    }

    private void turnBack(String src,JLabel e){
        /*e.setBounds(
                (int)e.getLocation().getX()+5,
                (int)e.getLocation().getY()+5,
                (int)e.getPreferredSize().getWidth()-10,
                (int)e.getPreferredSize().getHeight()-10);*/
        SetImage.setLabelIcon(src,e);


    }

    private void label1MouseClicked(MouseEvent e) {
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg1.png",jLabel);
    }

    private void label1MouseEntered(MouseEvent e) {
        change("img/bg/picture/mainJFrame/bg1.png",label1);
    }

    private void label1MouseExited(MouseEvent e) {
        turnBack("img/bg/picture/mainJFrame/bg1.png",label1);
    }

    private void label2MouseClicked(MouseEvent e) {
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg2.jpg",jLabel);
    }

    private void label2MouseEntered(MouseEvent e) {
        change("img/bg/picture/mainJFrame/bg2.jpg",label2);
    }

    private void label2MouseExited(MouseEvent e) {
        turnBack("img/bg/picture/mainJFrame/bg2.jpg",label2);
    }

    private void label3MouseClicked(MouseEvent e) {
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg3.jpg",jLabel);
    }

    private void label3MouseEntered(MouseEvent e) {
        change("img/bg/picture/mainJFrame/bg3.jpg",label3);
    }

    private void label3MouseExited(MouseEvent e) {
        turnBack("img/bg/picture/mainJFrame/bg3.jpg",label3);
    }

    private void label4MouseClicked(MouseEvent e) {
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg4.jpg",jLabel);
    }

    private void label4MouseEntered(MouseEvent e) {
        change("img/bg/picture/mainJFrame/bg4.jpg",label4);
    }

    private void label4MouseExited(MouseEvent e) {
        turnBack("img/bg/picture/mainJFrame/bg4.jpg",label4);
    }

    private void label5MouseClicked(MouseEvent e) {
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg5.jpg",jLabel);
    }

    private void label5MouseEntered(MouseEvent e) {
        change("img/bg/picture/mainJFrame/bg5.jpg",label5);
    }

    private void label5MouseExited(MouseEvent e) {
        turnBack("img/bg/picture/mainJFrame/bg5.jpg",label5);
    }

    private void label6MouseClicked(MouseEvent e) {
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg6.jpg",jLabel);
    }

    private void label6MouseEntered(MouseEvent e) {
        change("img/bg/picture/mainJFrame/bg6.jpg",label6);
    }

    private void label6MouseExited(MouseEvent e) {
        turnBack("img/bg/picture/mainJFrame/bg6.jpg",label6);
    }

    private void label7MouseClicked(MouseEvent e) {
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg7.jpg",jLabel);
    }

    private void label7MouseEntered(MouseEvent e) {
        change("img/bg/picture/mainJFrame/bg7.jpg",label7);
    }

    private void label7MouseExited(MouseEvent e) {
        turnBack("img/bg/picture/mainJFrame/bg7.jpg",label7);
    }

    private void label8MouseClicked(MouseEvent e) {
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg8.jpg",jLabel);
    }

    private void label8MouseEntered(MouseEvent e) {
        change("img/bg/picture/mainJFrame/bg8.png",label8);
    }

    private void label8MouseExited(MouseEvent e) {
        turnBack("img/bg/picture/mainJFrame/bg8.png",label8);
    }

    private void label9MouseClicked(MouseEvent e) {
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg9.jpg",jLabel);
    }

    private void label9MouseEntered(MouseEvent e) {
        change("img/bg/picture/mainJFrame/bg9.jpg",label9);
    }

    private void label9MouseExited(MouseEvent e) {
        turnBack("img/bg/picture/mainJFrame/bg9.jpg",label9);
    }

    private void label10MouseClicked(MouseEvent e) {
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg10.jpg",jLabel);
    }

    private void label10MouseEntered(MouseEvent e) {
        change("img/bg/picture/mainJFrame/bg10.jpg",label10);
    }

    private void label10MouseExited(MouseEvent e) {
        turnBack("img/bg/picture/mainJFrame/bg10.jpg",label10);
    }

    private void label11MouseClicked(MouseEvent e) {
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg11.jpg",jLabel);
    }

    private void label11MouseEntered(MouseEvent e) {
        change("img/bg/picture/mainJFrame/bg11.jpg",label11);
    }

    private void label11MouseExited(MouseEvent e) {
        turnBack("img/bg/picture/mainJFrame/bg11.jpg",label11);
    }

    private void label12MouseClicked(MouseEvent e) {
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg12.jpg",jLabel);
    }

    private void label12MouseEntered(MouseEvent e) {
        change("img/bg/picture/mainJFrame/bg12.jpg",label12);
    }

    private void label12MouseExited(MouseEvent e) {
        turnBack("img/bg/picture/mainJFrame/bg12.jpg",label12);
    }

    private void label13MouseClicked(MouseEvent e) {
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg13.jpg",jLabel);
    }

    private void label13MouseEntered(MouseEvent e) {
        change("img/bg/picture/mainJFrame/bg13.jpg",label13);
    }

    private void label13MouseExited(MouseEvent e) {
        turnBack("img/bg/picture/mainJFrame/bg13.jpg",label13);
    }

    private void label14MouseClicked(MouseEvent e) {
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg14.jpg",jLabel);
    }

    private void label14MouseEntered(MouseEvent e) {
        change("img/bg/picture/mainJFrame/bg14.jpg",label14);
    }

    private void label14MouseExited(MouseEvent e) {
        turnBack("img/bg/picture/mainJFrame/bg14.jpg",label14);
    }

    private void label15MouseClicked(MouseEvent e) {
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg15.jpg",jLabel);
    }

    private void label15MouseEntered(MouseEvent e) {
        change("img/bg/picture/mainJFrame/bg15.jpg",label15);
    }

    private void label15MouseExited(MouseEvent e) {
        turnBack("img/bg/picture/mainJFrame/bg15.jpg",label15);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        label14 = new JLabel();
        label15 = new JLabel();

        //======== this ========
        setBackground(null);
        setOpaque(false);
        setPreferredSize(new Dimension(590, 630));
        setLayout(null);

        //---- label1 ----
        label1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label1MouseClicked(e);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                label1MouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                label1MouseExited(e);
            }
        });
        add(label1);
        label1.setBounds(50, 30, 150, 94);

        //---- label2 ----
        label2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label2MouseClicked(e);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                label2MouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                label2MouseExited(e);
            }
        });
        add(label2);
        label2.setBounds(220, 30, 150, 94);

        //---- label3 ----
        label3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label3MouseClicked(e);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                label3MouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                label3MouseExited(e);
            }
        });
        add(label3);
        label3.setBounds(390, 30, 150, 94);

        //---- label4 ----
        label4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label4MouseClicked(e);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                label4MouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                label4MouseExited(e);
            }
        });
        add(label4);
        label4.setBounds(50, 150, 150, 94);

        //---- label5 ----
        label5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label5MouseClicked(e);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                label5MouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                label5MouseExited(e);
            }
        });
        add(label5);
        label5.setBounds(220, 150, 150, 94);

        //---- label6 ----
        label6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label6MouseClicked(e);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                label6MouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                label6MouseExited(e);
            }
        });
        add(label6);
        label6.setBounds(390, 150, 150, 94);

        //---- label7 ----
        label7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label7MouseClicked(e);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                label7MouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                label7MouseExited(e);
            }
        });
        add(label7);
        label7.setBounds(50, 270, 150, 94);

        //---- label8 ----
        label8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label8MouseClicked(e);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                label8MouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                label8MouseExited(e);
            }
        });
        add(label8);
        label8.setBounds(220, 270, 150, 94);

        //---- label9 ----
        label9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label9MouseClicked(e);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                label9MouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                label9MouseExited(e);
            }
        });
        add(label9);
        label9.setBounds(390, 270, 150, 94);

        //---- label10 ----
        label10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label10MouseClicked(e);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                label10MouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                label10MouseExited(e);
            }
        });
        add(label10);
        label10.setBounds(50, 390, 150, 94);

        //---- label11 ----
        label11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label11MouseClicked(e);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                label11MouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                label11MouseExited(e);
            }
        });
        add(label11);
        label11.setBounds(220, 390, 150, 94);

        //---- label12 ----
        label12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label12MouseClicked(e);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                label12MouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                label12MouseExited(e);
            }
        });
        add(label12);
        label12.setBounds(390, 390, 150, 94);

        //---- label13 ----
        label13.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label13MouseClicked(e);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                label13MouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                label13MouseExited(e);
            }
        });
        add(label13);
        label13.setBounds(50, 510, 150, 94);

        //---- label14 ----
        label14.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label14MouseClicked(e);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                label14MouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                label14MouseExited(e);
            }
        });
        add(label14);
        label14.setBounds(220, 510, 150, 94);

        //---- label15 ----
        label15.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label15MouseClicked(e);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                label15MouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                label15MouseExited(e);
            }
        });
        add(label15);
        label15.setBounds(390, 510, 150, 94);

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
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JLabel label15;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
