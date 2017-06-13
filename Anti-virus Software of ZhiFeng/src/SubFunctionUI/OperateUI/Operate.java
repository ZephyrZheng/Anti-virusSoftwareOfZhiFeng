/*
 * Created by JFormDesigner on Tue Dec 20 15:31:03 CST 2016
 */

package SubFunctionUI.OperateUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

import Func.SetImage;
import SubFunctionUI.OperateUI.UserInformationUI.UserInformation;
import com.jgoodies.forms.factories.*;

/**
 * @author xuanyu
 */
public class Operate extends JDialog {

    //用于处理拖动事件，表示鼠标按下时的坐标，相对于JFrame
    int xOld = 0;
    int yOld = 0;

    //用于处理滚动条
    int yScroll = 0;

    private JPanel jPanel;

    private CardLayout mainCard;

    public Operate(Frame owner,JPanel jPanel) {
        super(owner);
        this.jPanel=jPanel;
        initComponents();
        set();
    }

    public Operate(Dialog owner) {
        super(owner);
        initComponents();
        set();
    }

    private void set(){
        loadImage();

        //创建卡片式布局
        mainCard = new CardLayout();
        cardLayoutPanel.setLayout(mainCard);

        //添加卡片
        cardLayoutPanel.add("jPanel",jPanel);

        //设置默认显示卡片
        mainCard.show(cardLayoutPanel,"jPanel");

        //判断是否需要滚动条
        if(jPanel.getPreferredSize().getHeight() <= 351){
            scrollLabel.setVisible(false);
            scrollBorderLabel.setVisible(false);
        }
    }

    private void loadImage(){
        SetImage.setLabelIcon("img/bg/picture/operateDialog/operateBg.jpg",bgLabel);
        SetImage.setLabelIcon("img/bg/border/operateBorder.png",borderLabel);
        SetImage.setLabelIcon("img/component/window/title.png",titleLabel);
        SetImage.setLabelIcon("img/component/window/close.png",closeLabel);;
        SetImage.setLabelIcon("img/component/operateDialog/confirmDefault.png",confirmLabel);
        SetImage.setLabelIcon("img/component/operateDialog/scrollDefault.png",scrollLabel);
        SetImage.setLabelIcon("img/component/operateDialog/scrollBorder.png",scrollBorderLabel);
    }

    private void thisMousePressed(MouseEvent e) {
        xOld = e.getX();
        yOld = e.getY();
    }

    private void thisMouseDragged(MouseEvent e) {
        Operate.this.setLocation(e.getXOnScreen() - xOld, e.getYOnScreen() - yOld);
    }

    private void closeLabelMouseClicked(MouseEvent e) {
        this.dispose();
    }

    private void confirmLabelMouseClicked(MouseEvent e) {
        this.dispose();
    }

    private void confirmLabelMouseEntered(MouseEvent e) {
        SetImage.setLabelIcon("img/component/operateDialog/confirmChoose.png",confirmLabel);
    }

    private void confirmLabelMouseExited(MouseEvent e) {
        SetImage.setLabelIcon("img/component/operateDialog/confirmDefault.png",confirmLabel);
    }

    private void confirmLabelMousePressed(MouseEvent e) {
        SetImage.setLabelIcon("img/component/operateDialog/confirmChoose.png",confirmLabel);
    }

    private void confirmLabelMouseReleased(MouseEvent e) {
        SetImage.setLabelIcon("img/component/operateDialog/confirmDefault.png",confirmLabel);
    }

    private void scrollLabelMousePressed(MouseEvent e) {
        yScroll=e.getY();
    }

    private void scrollLabelMouseDragged(MouseEvent e) {
        int yEnd=e.getYOnScreen() - yScroll-this.getY();
        int yPanel=(int)jPanel.getPreferredSize().getHeight();
        int xPanel=(int)jPanel.getPreferredSize().getWidth();
        if(yEnd >= 60 && yEnd <= 260){
            scrollLabel.setLocation(560, yEnd);
            jPanel.setBounds(0,-(yEnd-60)*(yPanel-315)/200,xPanel,yPanel);
        }
    }

    private void scrollLabelMouseEntered(MouseEvent e) {
        SetImage.setLabelIcon("img/component/operateDialog/scrollChoose.png",scrollLabel);
    }

    private void scrollLabelMouseExited(MouseEvent e) {
        SetImage.setLabelIcon("img/component/operateDialog/scrollDefault.png",scrollLabel);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        mainLayeredPane = new JLayeredPane();
        bgPanel = new JPanel();
        bgLabel = new JLabel();
        borderPanel = new JPanel();
        borderLabel = new JLabel();
        mainPanel = new JPanel();
        closeLabel = new JLabel();
        titleLabel = new JLabel();
        cardLayoutPanel = new JPanel();
        scrollLabel = new JLabel();
        scrollBorderLabel = new JLabel();
        confirmLabel = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(null);
        setUndecorated(true);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                thisMousePressed(e);
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                thisMouseDragged(e);
            }
        });
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== mainLayeredPane ========
        {

            //======== bgPanel ========
            {
                bgPanel.setBackground(null);
                bgPanel.setOpaque(false);
                bgPanel.setLayout(null);

                //---- bgLabel ----
                bgLabel.setBackground(null);
                bgPanel.add(bgLabel);
                bgLabel.setBounds(0, 0, 590, 375);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < bgPanel.getComponentCount(); i++) {
                        Rectangle bounds = bgPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = bgPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    bgPanel.setMinimumSize(preferredSize);
                    bgPanel.setPreferredSize(preferredSize);
                }
            }
            mainLayeredPane.add(bgPanel, new Integer(1));
            bgPanel.setBounds(0, 0, 590, 375);

            //======== borderPanel ========
            {
                borderPanel.setBackground(null);
                borderPanel.setOpaque(false);
                borderPanel.setLayout(null);

                //---- borderLabel ----
                borderLabel.setBackground(null);
                borderPanel.add(borderLabel);
                borderLabel.setBounds(0, 0, 590, 375);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < borderPanel.getComponentCount(); i++) {
                        Rectangle bounds = borderPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = borderPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    borderPanel.setMinimumSize(preferredSize);
                    borderPanel.setPreferredSize(preferredSize);
                }
            }
            mainLayeredPane.add(borderPanel, new Integer(2));
            borderPanel.setBounds(0, 0, 590, 375);

            //======== mainPanel ========
            {
                mainPanel.setBackground(null);
                mainPanel.setOpaque(false);
                mainPanel.setLayout(null);

                //---- closeLabel ----
                closeLabel.setBackground(null);
                closeLabel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        closeLabelMouseClicked(e);
                    }
                });
                mainPanel.add(closeLabel);
                closeLabel.setBounds(558, 10, 17, 17);

                //---- titleLabel ----
                titleLabel.setBackground(null);
                mainPanel.add(titleLabel);
                titleLabel.setBounds(15, 10, 100, 20);

                //======== cardLayoutPanel ========
                {
                    cardLayoutPanel.setBackground(null);
                    cardLayoutPanel.setOpaque(false);
                    cardLayoutPanel.setLayout(null);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < cardLayoutPanel.getComponentCount(); i++) {
                            Rectangle bounds = cardLayoutPanel.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = cardLayoutPanel.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        cardLayoutPanel.setMinimumSize(preferredSize);
                        cardLayoutPanel.setPreferredSize(preferredSize);
                    }
                }
                mainPanel.add(cardLayoutPanel);
                cardLayoutPanel.setBounds(0, 30, 590, 315);

                //---- scrollLabel ----
                scrollLabel.setBackground(null);
                scrollLabel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        scrollLabelMouseEntered(e);
                    }
                    @Override
                    public void mouseExited(MouseEvent e) {
                        scrollLabelMouseExited(e);
                    }
                    @Override
                    public void mousePressed(MouseEvent e) {
                        scrollLabelMousePressed(e);
                    }
                });
                scrollLabel.addMouseMotionListener(new MouseMotionAdapter() {
                    @Override
                    public void mouseDragged(MouseEvent e) {
                        scrollLabelMouseDragged(e);
                    }
                });
                mainPanel.add(scrollLabel);
                scrollLabel.setBounds(560, 60, 10, 60);

                //---- scrollBorderLabel ----
                scrollBorderLabel.setBackground(null);
                mainPanel.add(scrollBorderLabel);
                scrollBorderLabel.setBounds(560, 60, 10, 260);

                //---- confirmLabel ----
                confirmLabel.setBackground(null);
                confirmLabel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        confirmLabelMouseClicked(e);
                    }
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        confirmLabelMouseEntered(e);
                    }
                    @Override
                    public void mouseExited(MouseEvent e) {
                        confirmLabelMouseExited(e);
                    }
                    @Override
                    public void mousePressed(MouseEvent e) {
                        confirmLabelMousePressed(e);
                    }
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        confirmLabelMouseReleased(e);
                    }
                });
                mainPanel.add(confirmLabel);
                confirmLabel.setBounds(475, 345, 100, 20);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < mainPanel.getComponentCount(); i++) {
                        Rectangle bounds = mainPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = mainPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    mainPanel.setMinimumSize(preferredSize);
                    mainPanel.setPreferredSize(preferredSize);
                }
            }
            mainLayeredPane.add(mainPanel, new Integer(3));
            mainPanel.setBounds(0, 0, 590, 375);
        }
        contentPane.add(mainLayeredPane);
        mainLayeredPane.setBounds(0, 0, 590, 375);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLayeredPane mainLayeredPane;
    private JPanel bgPanel;
    private JLabel bgLabel;
    private JPanel borderPanel;
    private JLabel borderLabel;
    private JPanel mainPanel;
    private JLabel closeLabel;
    private JLabel titleLabel;
    private JPanel cardLayoutPanel;
    private JLabel scrollLabel;
    private JLabel scrollBorderLabel;
    private JLabel confirmLabel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
