/*
 * Created by JFormDesigner on Tue Dec 13 16:50:50 CST 2016
 */

package SubFunctionUI.UndoneUI;

import Func.SetImage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author xuanyu
 */
public class Undone extends JDialog {

    //用于处理拖动事件，表示鼠标按下时的坐标，相对于JFrame
    int xOld = 0;
    int yOld = 0;

    public Undone(Frame owner) {
        super(owner);
        initComponents();
        set();
        this.setModal(true);
    }

    public Undone(Dialog owner) {
        super(owner);
        initComponents();
        set();
        this.setModal(true);
    }

    private void set(){
        this.setSize(300,200);
        loadImage();
    }

    private void loadImage(){
        SetImage.setLabelIcon("img/component/window/close.png",undoneCloseLabel);
        SetImage.setLabelIcon("img/component/waringDialog/warning.png",warningLabel);
        SetImage.setLabelIcon("img/bg/picture/waringDialog/warningBg.png",undoneBgLabel);
    }

    private void thisMousePressed(MouseEvent e) {
        xOld = e.getX();
        yOld = e.getY();
    }

    private void thisMouseDragged(MouseEvent e) {
        Undone.this.setLocation(e.getXOnScreen() - xOld, e.getYOnScreen() - yOld);
    }

    private void undoneCloseLabelMouseClicked(MouseEvent e) {
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        UndoneLayeredPane1 = new JLayeredPane();
        UndoneBgPanel = new JPanel();
        undoneBgLabel = new JLabel();
        panel1 = new JPanel();
        undoneCloseLabel = new JLabel();
        warningLabel = new JLabel();
        warningTextLabel = new JLabel();

        //======== this ========
        setResizable(false);
        setMinimumSize(new Dimension(6, 24));
        setUndecorated(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                thisMouseDragged(e);
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                thisMousePressed(e);
            }
        });
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== UndoneLayeredPane1 ========
        {
            UndoneLayeredPane1.setPreferredSize(new Dimension(300, 200));

            //======== UndoneBgPanel ========
            {
                UndoneBgPanel.setPreferredSize(new Dimension(300, 200));
                UndoneBgPanel.setLayout(null);
                UndoneBgPanel.add(undoneBgLabel);
                undoneBgLabel.setBounds(0, 0, 300, 200);
            }
            UndoneLayeredPane1.add(UndoneBgPanel, new Integer(1));
            UndoneBgPanel.setBounds(0, 0, 300, 200);

            //======== panel1 ========
            {
                panel1.setOpaque(false);
                panel1.setPreferredSize(new Dimension(300, 200));
                panel1.setLayout(null);

                //---- undoneCloseLabel ----
                undoneCloseLabel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        undoneCloseLabelMouseClicked(e);
                    }
                });
                panel1.add(undoneCloseLabel);
                undoneCloseLabel.setBounds(273, 10, 17, 17);
                panel1.add(warningLabel);
                warningLabel.setBounds(40, 75, 50, 50);

                //---- warningTextLabel ----
                warningTextLabel.setText("\u8be5\u529f\u80fd\u8fd8\u672a\u5b9e\u73b0\uff01");
                warningTextLabel.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 18));
                warningTextLabel.setForeground(new Color(102, 102, 102));
                warningTextLabel.setBackground(null);
                panel1.add(warningTextLabel);
                warningTextLabel.setBounds(100, 75, 160, 50);
            }
            UndoneLayeredPane1.add(panel1, new Integer(2));
            panel1.setBounds(0, 0, 300, 200);
        }
        contentPane.add(UndoneLayeredPane1);
        UndoneLayeredPane1.setBounds(0, 0, 300, 200);

        contentPane.setPreferredSize(new Dimension(300, 200));
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLayeredPane UndoneLayeredPane1;
    private JPanel UndoneBgPanel;
    private JLabel undoneBgLabel;
    private JPanel panel1;
    private JLabel undoneCloseLabel;
    private JLabel warningLabel;
    private JLabel warningTextLabel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
