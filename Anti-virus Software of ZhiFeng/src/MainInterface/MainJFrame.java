/*
 * Created by JFormDesigner on Sun Dec 11 13:48:12 CST 2016
 */

package MainInterface;

import javax.swing.event.*;
import Func.SetImage;
import MainInterface.AccelerationPanelUI.AccelerationPanel;
import MainInterface.CheckPanelUI.CheckPanel;
import MainInterface.CleanUpPanelUI.CleanUpPanel;
import MainInterface.FunctionPanelUI.FunctionPanel;
import MainInterface.KillingTrojansPanelUI.KillingTrojansPanel;
import MainInterface.SystemRepairPanelUI.SystemRepairPanel;
import SubFunctionUI.LoginUI.Login;
import SubFunctionUI.OperateUI.AboutDeveloperUI.AboutDeveloper;
import SubFunctionUI.OperateUI.BackgroundSettingUI.BackgroundSetting;
import SubFunctionUI.OperateUI.Operate;
import SubFunctionUI.OperateUI.UpdateSettingUI.UpdateSetting;
import SubFunctionUI.OperateUI.UserInformationUI.UserInformation;
import SubFunctionUI.UndoneUI.Undone;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * @author xuanyu
 */
public class MainJFrame extends JFrame {

    //用于处理拖动事件，表示鼠标按下时的坐标，相对于JFrame
    private int xOld = 0;
    private int yOld = 0;
    private CardLayout mainCard;
    private Login login;
    private Operate operate;
    private UserInformation userInformation;
    private BackgroundSetting backgroundSetting;
    private UpdateSetting updateSetting;
    private AboutDeveloper aboutDeveloper;
    private Undone undone;

    public MainJFrame() {
        initComponents();
        set();
    }

    private void set(){
        //设置图片
        loadImage();

        //创建并设置卡片式布局
        createCardLayout();

        //创建登录对话框
        login=new Login(this);
        login.setVisible(true);

        //panel引入
    }

    private void loadImage(){
        //设置图片
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/bg1.png",bgLabel);
        SetImage.setLabelIcon("img/component/window/close.png",closeMainPanelLabel);
        SetImage.setLabelIcon("img/component/window/mini.png",miniMainPanelLabel);
        SetImage.setLabelIcon("img/component/window/set.png",setUpMainPanelLabel);
        SetImage.setLabelIcon("img/component/window/contact.png",contactMainPanelLabel);
        SetImage.setLabelIcon("img/component/window/update.png",updateMainPanelLabel);
        SetImage.setLabelIcon("img/component/window/personal.png",personalMainPanelLabel);
        SetImage.setLabelIcon("img/component/window/title.png",titleMainPanelLabel);
        SetImage.setLabelIcon("img/component/mainJFrame/checkUpIcon.png",checkUpIconLabel);
        SetImage.setLabelIcon("img/component/mainJFrame/killingTrojansIcon.png",killingTrojansIconLabel);
        SetImage.setLabelIcon("img/component/mainJFrame/cleanUpIcon.png",cleanUpIconLabel);
        SetImage.setLabelIcon("img/component/mainJFrame/systemRepairIcon.png",systemRepairIconLabel);
        SetImage.setLabelIcon("img/component/mainJFrame/accelerationIcon.png",accelerationIconLabel);
        SetImage.setLabelIcon("img/component/mainJFrame/functionIcon.png",functionIconLabel);
        SetImage.setLabelIcon("img/bg/picture/mainJFrame/cardLayoutBg.png",cardLayoutBgLabel);
    }

    private void createCardLayout(){
        //panel引入
        CheckPanel checkPanel=new CheckPanel(this);
        KillingTrojansPanel killingTrojansPanel=new KillingTrojansPanel(this);
        CleanUpPanel cleanUpPanel=new CleanUpPanel(this);
        SystemRepairPanel systemRepairPanel=new SystemRepairPanel(this);
        AccelerationPanel accelerationPanel=new AccelerationPanel(this);
        FunctionPanel functionPanel=new FunctionPanel(this);

        userInformation=new UserInformation();
        backgroundSetting=new BackgroundSetting(bgLabel);
        updateSetting=new UpdateSetting();
        aboutDeveloper=new AboutDeveloper();

        //创建卡片式布局
        mainCard = new CardLayout();
        mainCardLayoutPanel.setLayout(mainCard);

        //添加卡片
        mainCardLayoutPanel.add("cardCheck",checkPanel);
        mainCardLayoutPanel.add("cardKillingTrojans",killingTrojansPanel);
        mainCardLayoutPanel.add("cardCleanUp",cleanUpPanel);
        mainCardLayoutPanel.add("cardSystemRepair",systemRepairPanel);
        mainCardLayoutPanel.add("cardAcceleration",accelerationPanel);
        mainCardLayoutPanel.add("cardFunction",functionPanel);

        //设置默认显示卡片
        mainCard.show(mainCardLayoutPanel,"cardCheck");
    }

    private void thisMousePressed(MouseEvent e) {
        xOld = e.getX();
        yOld = e.getY();
    }

    private void thisMouseDragged(MouseEvent e) {
        MainJFrame.this.setLocation(e.getXOnScreen() - xOld, e.getYOnScreen() - yOld);
    }

    private void closeMainPanelLabelMouseClicked(MouseEvent e) {
        System.exit(0);
    }

    private void miniMainPanelLabelMouseClicked(MouseEvent e) {
        this.setExtendedState(JFrame.ICONIFIED); //最小化
    }

    private void setUpMainPanelLabelMouseClicked(MouseEvent e) {
        //setUpMainPanelPopupMenu.setVisible(true);
        setUpMenuItem1.setVisible(true);
        setUpMenuItem2.setVisible(true);
        setUpMenuItem3.setVisible(true);
        setUpMainPanelPopupMenu.show(this,827,30);
    }

    private void contactMainPanelLabelMouseClicked(MouseEvent e) {
        //informationSettingPopupMenu.setVisible(true);
        informationSettingMenuItem1.setVisible(true);
        informationSettingMenuItem2.setVisible(true);
        informationSettingMenuItem3.setVisible(true);
        informationSettingPopupMenu.show(this,800,30);
    }

    private void updateMainPanelLabelMouseClicked(MouseEvent e) {
        //updateSettingPopupMenu.setVisible(true);
        updateSettingMenuItem1.setVisible(true);
        updateSettingMenuItem2.setVisible(true);
        updateSettingMenuItem3.setVisible(true);
        updateSettingPopupMenu.show(this,771,30);
    }

    private void personalMainPanelLabelMouseClicked(MouseEvent e) {
       // userSettingPopupMenu.setVisible(true);
        userSettingMenuItem1.setVisible(true);
        userSettingMenuItem2.setVisible(true);
        userSettingMenuItem3.setVisible(true);
        userSettingPopupMenu.show(this,742,30);
    }

    private void checkUpIconLabelMouseClicked(MouseEvent e) {
        //单击显示cardCheck卡片
        mainCard.show(mainCardLayoutPanel,"cardCheck");
    }

    private void killingTrojansIconLabelMouseClicked(MouseEvent e) {
        //单击显示cardKillingTrojans卡片
        mainCard.show(mainCardLayoutPanel,"cardKillingTrojans");
    }

    private void cleanUpIconLabelMouseClicked(MouseEvent e) {
        //单击显示cardCleanUp卡片
        mainCard.show(mainCardLayoutPanel,"cardCleanUp");
    }

    private void systemRepairIconLabelMouseClicked(MouseEvent e) {
        //单击显示cardSystemRepair卡片
        mainCard.show(mainCardLayoutPanel,"cardSystemRepair");
    }

    private void accelerationIconLabelMouseClicked(MouseEvent e) {
        //单击显示cardAcceleration卡片
        mainCard.show(mainCardLayoutPanel,"cardAcceleration");
    }

    private void functionIconLabelMouseClicked(MouseEvent e) {
        //单击显示cardFunction卡片
        mainCard.show(mainCardLayoutPanel,"cardFunction");
    }

    private void userSettingMenuItem1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        //创建登录对话框
        login=new Login(this);
        login.setVisible(true);
    }

    private void userSettingMenuItem2ActionPerformed(ActionEvent e) {
        operate=new Operate(this,userInformation);
        operate.setVisible(true);
    }

    private void userSettingMenuItem3ActionPerformed(ActionEvent e) {
        operate=new Operate(this,backgroundSetting);
        operate.setVisible(true);
    }

    private void updateSettingMenuItem3ActionPerformed(ActionEvent e) {
        operate=new Operate(this,updateSetting);
        operate.setVisible(true);
    }

    private void informationSettingMenuItem2ActionPerformed(ActionEvent e) {
        operate=new Operate(this,aboutDeveloper);
        operate.setVisible(true);
    }

    private void userSettingPopupMenuPopupMenuCanceled(PopupMenuEvent e) {
        //userSettingPopupMenu.setVisible(false);
        userSettingMenuItem1.setVisible(false);
        userSettingMenuItem2.setVisible(false);
        userSettingMenuItem3.setVisible(false);
    }

    private void updateSettingPopupMenuPopupMenuCanceled(PopupMenuEvent e) {
        //updateSettingPopupMenu.setVisible(false);
        updateSettingMenuItem1.setVisible(false);
        updateSettingMenuItem2.setVisible(false);
        updateSettingMenuItem3.setVisible(false);
    }

    private void informationSettingPopupMenuPopupMenuCanceled(PopupMenuEvent e) {
        //informationSettingPopupMenu.setVisible(false);
        informationSettingMenuItem1.setVisible(false);
        informationSettingMenuItem2.setVisible(false);
        informationSettingMenuItem3.setVisible(false);
    }

    private void setUpMainPanelPopupMenuPopupMenuCanceled(PopupMenuEvent e) {
        //setUpMainPanelPopupMenu.setVisible(true);
        setUpMenuItem1.setVisible(true);
        setUpMenuItem2.setVisible(true);
        setUpMenuItem3.setVisible(true);
    }

    private void updateSettingMenuItem1ActionPerformed(ActionEvent e) {
        undone=new Undone(this);
        undone.setVisible(true);
    }

    private void updateSettingMenuItem2ActionPerformed(ActionEvent e) {
        undone=new Undone(this);
        undone.setVisible(true);
    }

    private void informationSettingMenuItem1ActionPerformed(ActionEvent e) {
        undone=new Undone(this);
        undone.setVisible(true);
    }

    private void setUpMenuItem1ActionPerformed(ActionEvent e) {
        undone=new Undone(this);
        undone.setVisible(true);
    }

    private void setUpMenuItem2ActionPerformed(ActionEvent e) {
        undone=new Undone(this);
        undone.setVisible(true);
    }

    private void setUpMenuItem3ActionPerformed(ActionEvent e) {
        undone=new Undone(this);
        undone.setVisible(true);
    }

    private void informationSettingMenuItem3ActionPerformed(ActionEvent a) {
        try
        {
            Runtime.getRuntime().exec("cmd.exe /c start 志峰卫士帮助文档.chm");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        mainLayeredPane = new JLayeredPane();
        bgPanel = new JPanel();
        bgLabel = new JLabel();
        mainPanel = new JPanel();
        closeMainPanelLabel = new JLabel();
        miniMainPanelLabel = new JLabel();
        setUpMainPanelLabel = new JLabel();
        contactMainPanelLabel = new JLabel();
        updateMainPanelLabel = new JLabel();
        personalMainPanelLabel = new JLabel();
        titleMainPanelLabel = new JLabel();
        userSettingPopupMenu = new JPopupMenu();
        userSettingMenuItem1 = new JMenuItem();
        userSettingMenuItem2 = new JMenuItem();
        userSettingMenuItem3 = new JMenuItem();
        updateSettingPopupMenu = new JPopupMenu();
        updateSettingMenuItem1 = new JMenuItem();
        updateSettingMenuItem2 = new JMenuItem();
        updateSettingMenuItem3 = new JMenuItem();
        informationSettingPopupMenu = new JPopupMenu();
        informationSettingMenuItem1 = new JMenuItem();
        informationSettingMenuItem2 = new JMenuItem();
        informationSettingMenuItem3 = new JMenuItem();
        setUpMainPanelPopupMenu = new JPopupMenu();
        setUpMenuItem1 = new JMenuItem();
        setUpMenuItem2 = new JMenuItem();
        setUpMenuItem3 = new JMenuItem();
        checkUpIconLabel = new JLabel();
        killingTrojansIconLabel = new JLabel();
        cleanUpIconLabel = new JLabel();
        systemRepairIconLabel = new JLabel();
        accelerationIconLabel = new JLabel();
        functionIconLabel = new JLabel();
        cardLayoutLayeredPane = new JLayeredPane();
        cardLayoutBgPanel = new JPanel();
        cardLayoutBgLabel = new JLabel();
        mainCardLayoutPanel = new JPanel();

        //======== this ========
        setResizable(false);
        setMinimumSize(new Dimension(920, 580));
        setUndecorated(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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
            mainLayeredPane.setOpaque(true);
            mainLayeredPane.setPreferredSize(new Dimension(920, 580));
            mainLayeredPane.setMinimumSize(new Dimension(920, 580));
            mainLayeredPane.setMaximumSize(new Dimension(920, 580));

            //======== bgPanel ========
            {
                bgPanel.setOpaque(false);
                bgPanel.setLayout(null);

                //---- bgLabel ----
                bgLabel.setLabelFor(mainLayeredPane);
                bgPanel.add(bgLabel);
                bgLabel.setBounds(0, 0, 920, 580);
            }
            mainLayeredPane.add(bgPanel, new Integer(1));
            bgPanel.setBounds(0, 0, 920, 580);

            //======== mainPanel ========
            {
                mainPanel.setOpaque(false);
                mainPanel.setLayout(null);

                //---- closeMainPanelLabel ----
                closeMainPanelLabel.setToolTipText("\u5173\u95ed\u7a97\u53e3");
                closeMainPanelLabel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        closeMainPanelLabelMouseClicked(e);
                    }
                });
                mainPanel.add(closeMainPanelLabel);
                closeMainPanelLabel.setBounds(888, 10, 17, 17);

                //---- miniMainPanelLabel ----
                miniMainPanelLabel.setToolTipText("\u6700\u5c0f\u5316\u7a97\u53e3");
                miniMainPanelLabel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        miniMainPanelLabelMouseClicked(e);
                    }
                });
                mainPanel.add(miniMainPanelLabel);
                miniMainPanelLabel.setBounds(859, 10, 17, 17);

                //---- setUpMainPanelLabel ----
                setUpMainPanelLabel.setToolTipText("\u8bbe\u7f6e");
                setUpMainPanelLabel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        setUpMainPanelLabelMouseClicked(e);
                    }
                });
                mainPanel.add(setUpMainPanelLabel);
                setUpMainPanelLabel.setBounds(827, 8, 21, 21);

                //---- contactMainPanelLabel ----
                contactMainPanelLabel.setToolTipText("\u5173\u4e8e");
                contactMainPanelLabel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        contactMainPanelLabelMouseClicked(e);
                    }
                });
                mainPanel.add(contactMainPanelLabel);
                contactMainPanelLabel.setBounds(800, 10, 17, 17);

                //---- updateMainPanelLabel ----
                updateMainPanelLabel.setToolTipText("\u66f4\u65b0");
                updateMainPanelLabel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        updateMainPanelLabelMouseClicked(e);
                    }
                });
                mainPanel.add(updateMainPanelLabel);
                updateMainPanelLabel.setBounds(771, 10, 17, 17);

                //---- personalMainPanelLabel ----
                personalMainPanelLabel.setToolTipText("\u7528\u6237");
                personalMainPanelLabel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        personalMainPanelLabelMouseClicked(e);
                    }
                });
                mainPanel.add(personalMainPanelLabel);
                personalMainPanelLabel.setBounds(742, 10, 17, 17);
                mainPanel.add(titleMainPanelLabel);
                titleMainPanelLabel.setBounds(15, 10, 100, 20);

                //======== userSettingPopupMenu ========
                {
                    userSettingPopupMenu.addPopupMenuListener(new PopupMenuListener() {
                        @Override
                        public void popupMenuCanceled(PopupMenuEvent e) {
                            userSettingPopupMenuPopupMenuCanceled(e);
                        }
                        @Override
                        public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {}
                        @Override
                        public void popupMenuWillBecomeVisible(PopupMenuEvent e) {}
                    });

                    //---- userSettingMenuItem1 ----
                    userSettingMenuItem1.setText("\u7528\u6237\u767b\u5f55");
                    userSettingMenuItem1.setBackground(Color.white);
                    userSettingMenuItem1.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
                    userSettingMenuItem1.setForeground(new Color(102, 102, 102));
                    userSettingMenuItem1.setVisible(false);
                    userSettingMenuItem1.addActionListener(e -> userSettingMenuItem1ActionPerformed(e));
                    userSettingPopupMenu.add(userSettingMenuItem1);

                    //---- userSettingMenuItem2 ----
                    userSettingMenuItem2.setText("\u7528\u6237\u4fe1\u606f");
                    userSettingMenuItem2.setBackground(Color.white);
                    userSettingMenuItem2.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
                    userSettingMenuItem2.setForeground(new Color(102, 102, 102));
                    userSettingMenuItem2.setVisible(false);
                    userSettingMenuItem2.addActionListener(e -> userSettingMenuItem2ActionPerformed(e));
                    userSettingPopupMenu.add(userSettingMenuItem2);

                    //---- userSettingMenuItem3 ----
                    userSettingMenuItem3.setText("\u80cc\u666f\u56fe\u7247");
                    userSettingMenuItem3.setBackground(Color.white);
                    userSettingMenuItem3.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
                    userSettingMenuItem3.setForeground(new Color(102, 102, 102));
                    userSettingMenuItem3.setVisible(false);
                    userSettingMenuItem3.addActionListener(e -> userSettingMenuItem3ActionPerformed(e));
                    userSettingPopupMenu.add(userSettingMenuItem3);
                }
                mainPanel.add(userSettingPopupMenu);
                userSettingPopupMenu.setBounds(742, 30, 100, userSettingPopupMenu.getPreferredSize().height);

                //======== updateSettingPopupMenu ========
                {
                    updateSettingPopupMenu.addPopupMenuListener(new PopupMenuListener() {
                        @Override
                        public void popupMenuCanceled(PopupMenuEvent e) {
                            updateSettingPopupMenuPopupMenuCanceled(e);
                        }
                        @Override
                        public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {}
                        @Override
                        public void popupMenuWillBecomeVisible(PopupMenuEvent e) {}
                    });

                    //---- updateSettingMenuItem1 ----
                    updateSettingMenuItem1.setText("\u68c0\u67e5\u66f4\u65b0");
                    updateSettingMenuItem1.setBackground(Color.white);
                    updateSettingMenuItem1.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
                    updateSettingMenuItem1.setForeground(new Color(102, 102, 102));
                    updateSettingMenuItem1.setVisible(false);
                    updateSettingMenuItem1.addActionListener(e -> updateSettingMenuItem1ActionPerformed(e));
                    updateSettingPopupMenu.add(updateSettingMenuItem1);

                    //---- updateSettingMenuItem2 ----
                    updateSettingMenuItem2.setText("\u5173\u4e8e\u7248\u672c");
                    updateSettingMenuItem2.setBackground(Color.white);
                    updateSettingMenuItem2.setForeground(new Color(102, 102, 102));
                    updateSettingMenuItem2.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
                    updateSettingMenuItem2.setVisible(false);
                    updateSettingMenuItem2.addActionListener(e -> updateSettingMenuItem2ActionPerformed(e));
                    updateSettingPopupMenu.add(updateSettingMenuItem2);

                    //---- updateSettingMenuItem3 ----
                    updateSettingMenuItem3.setText("\u66f4\u65b0\u8bbe\u7f6e");
                    updateSettingMenuItem3.setBackground(Color.white);
                    updateSettingMenuItem3.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
                    updateSettingMenuItem3.setForeground(new Color(102, 102, 102));
                    updateSettingMenuItem3.setVisible(false);
                    updateSettingMenuItem3.addActionListener(e -> updateSettingMenuItem3ActionPerformed(e));
                    updateSettingPopupMenu.add(updateSettingMenuItem3);
                }
                mainPanel.add(updateSettingPopupMenu);
                updateSettingPopupMenu.setBounds(771, 30, 100, updateSettingPopupMenu.getPreferredSize().height);

                //======== informationSettingPopupMenu ========
                {
                    informationSettingPopupMenu.setBackground(Color.white);
                    informationSettingPopupMenu.setForeground(Color.white);
                    informationSettingPopupMenu.addPopupMenuListener(new PopupMenuListener() {
                        @Override
                        public void popupMenuCanceled(PopupMenuEvent e) {
                            informationSettingPopupMenuPopupMenuCanceled(e);
                        }
                        @Override
                        public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {}
                        @Override
                        public void popupMenuWillBecomeVisible(PopupMenuEvent e) {}
                    });

                    //---- informationSettingMenuItem1 ----
                    informationSettingMenuItem1.setText("\u4fe1\u606f\u53cd\u9988");
                    informationSettingMenuItem1.setBackground(Color.white);
                    informationSettingMenuItem1.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
                    informationSettingMenuItem1.setForeground(new Color(102, 102, 102));
                    informationSettingMenuItem1.setVisible(false);
                    informationSettingMenuItem1.addActionListener(e -> informationSettingMenuItem1ActionPerformed(e));
                    informationSettingPopupMenu.add(informationSettingMenuItem1);

                    //---- informationSettingMenuItem2 ----
                    informationSettingMenuItem2.setText("\u5173\u4e8e\u5f00\u53d1\u8005");
                    informationSettingMenuItem2.setBackground(Color.white);
                    informationSettingMenuItem2.setForeground(new Color(102, 102, 102));
                    informationSettingMenuItem2.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
                    informationSettingMenuItem2.setVisible(false);
                    informationSettingMenuItem2.addActionListener(e -> informationSettingMenuItem2ActionPerformed(e));
                    informationSettingPopupMenu.add(informationSettingMenuItem2);

                    //---- informationSettingMenuItem3 ----
                    informationSettingMenuItem3.setText("\u5e2e\u52a9\u6587\u6863");
                    informationSettingMenuItem3.setBackground(Color.white);
                    informationSettingMenuItem3.setForeground(new Color(102, 102, 102));
                    informationSettingMenuItem3.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
                    informationSettingMenuItem3.setVisible(false);
                    informationSettingMenuItem3.addActionListener(e -> informationSettingMenuItem3ActionPerformed(e));
                    informationSettingPopupMenu.add(informationSettingMenuItem3);
                }
                mainPanel.add(informationSettingPopupMenu);
                informationSettingPopupMenu.setBounds(800, 30, 100, informationSettingPopupMenu.getPreferredSize().height);

                //======== setUpMainPanelPopupMenu ========
                {
                    setUpMainPanelPopupMenu.setBackground(Color.white);
                    setUpMainPanelPopupMenu.setForeground(Color.white);
                    setUpMainPanelPopupMenu.addPopupMenuListener(new PopupMenuListener() {
                        @Override
                        public void popupMenuCanceled(PopupMenuEvent e) {
                            setUpMainPanelPopupMenuPopupMenuCanceled(e);
                        }
                        @Override
                        public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {}
                        @Override
                        public void popupMenuWillBecomeVisible(PopupMenuEvent e) {}
                    });

                    //---- setUpMenuItem1 ----
                    setUpMenuItem1.setText("\u57fa\u672c\u8bbe\u7f6e");
                    setUpMenuItem1.setBackground(Color.white);
                    setUpMenuItem1.setForeground(new Color(102, 102, 102));
                    setUpMenuItem1.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
                    setUpMenuItem1.setVisible(false);
                    setUpMenuItem1.addActionListener(e -> setUpMenuItem1ActionPerformed(e));
                    setUpMainPanelPopupMenu.add(setUpMenuItem1);

                    //---- setUpMenuItem2 ----
                    setUpMenuItem2.setText("\u5f39\u7a97\u8bbe\u7f6e");
                    setUpMenuItem2.setBackground(Color.white);
                    setUpMenuItem2.setForeground(new Color(102, 102, 102));
                    setUpMenuItem2.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
                    setUpMenuItem2.setVisible(false);
                    setUpMenuItem2.addActionListener(e -> setUpMenuItem2ActionPerformed(e));
                    setUpMainPanelPopupMenu.add(setUpMenuItem2);

                    //---- setUpMenuItem3 ----
                    setUpMenuItem3.setText("\u5b89\u5168\u8bbe\u7f6e");
                    setUpMenuItem3.setBackground(Color.white);
                    setUpMenuItem3.setForeground(new Color(102, 102, 102));
                    setUpMenuItem3.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
                    setUpMenuItem3.setVisible(false);
                    setUpMenuItem3.addActionListener(e -> setUpMenuItem3ActionPerformed(e));
                    setUpMainPanelPopupMenu.add(setUpMenuItem3);
                }
                mainPanel.add(setUpMainPanelPopupMenu);
                setUpMainPanelPopupMenu.setBounds(827, 30, 100, setUpMainPanelPopupMenu.getPreferredSize().height);

                //---- checkUpIconLabel ----
                checkUpIconLabel.setToolTipText("\u7535\u8111\u4f53\u68c0");
                checkUpIconLabel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        checkUpIconLabelMouseClicked(e);
                    }
                });
                mainPanel.add(checkUpIconLabel);
                checkUpIconLabel.setBounds(90, 40, 42, 42);

                //---- killingTrojansIconLabel ----
                killingTrojansIconLabel.setToolTipText("\u6728\u9a6c\u67e5\u6740");
                killingTrojansIconLabel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        killingTrojansIconLabelMouseClicked(e);
                    }
                });
                mainPanel.add(killingTrojansIconLabel);
                killingTrojansIconLabel.setBounds(220, 40, 42, 42);

                //---- cleanUpIconLabel ----
                cleanUpIconLabel.setToolTipText("\u7535\u8111\u6e05\u7406");
                cleanUpIconLabel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        cleanUpIconLabelMouseClicked(e);
                    }
                });
                mainPanel.add(cleanUpIconLabel);
                cleanUpIconLabel.setBounds(355, 40, 42, 42);

                //---- systemRepairIconLabel ----
                systemRepairIconLabel.setToolTipText("\u7cfb\u7edf\u4fee\u590d");
                systemRepairIconLabel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        systemRepairIconLabelMouseClicked(e);
                    }
                });
                mainPanel.add(systemRepairIconLabel);
                systemRepairIconLabel.setBounds(490, 40, 42, 42);

                //---- accelerationIconLabel ----
                accelerationIconLabel.setToolTipText("\u4f18\u5316\u52a0\u901f");
                accelerationIconLabel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        accelerationIconLabelMouseClicked(e);
                    }
                });
                mainPanel.add(accelerationIconLabel);
                accelerationIconLabel.setBounds(625, 40, 42, 42);

                //---- functionIconLabel ----
                functionIconLabel.setToolTipText("\u529f\u80fd\u5927\u5168");
                functionIconLabel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        functionIconLabelMouseClicked(e);
                    }
                });
                mainPanel.add(functionIconLabel);
                functionIconLabel.setBounds(760, 40, 42, 42);

                //======== cardLayoutLayeredPane ========
                {
                    cardLayoutLayeredPane.setPreferredSize(new Dimension(920, 465));

                    //======== cardLayoutBgPanel ========
                    {
                        cardLayoutBgPanel.setOpaque(false);
                        cardLayoutBgPanel.setPreferredSize(new Dimension(920, 465));
                        cardLayoutBgPanel.setLayout(null);

                        //---- cardLayoutBgLabel ----
                        cardLayoutBgLabel.setPreferredSize(new Dimension(920, 465));
                        cardLayoutBgPanel.add(cardLayoutBgLabel);
                        cardLayoutBgLabel.setBounds(50, 0, 820, 430);

                        { // compute preferred size
                            Dimension preferredSize = new Dimension();
                            for(int i = 0; i < cardLayoutBgPanel.getComponentCount(); i++) {
                                Rectangle bounds = cardLayoutBgPanel.getComponent(i).getBounds();
                                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                            }
                            Insets insets = cardLayoutBgPanel.getInsets();
                            preferredSize.width += insets.right;
                            preferredSize.height += insets.bottom;
                            cardLayoutBgPanel.setMinimumSize(preferredSize);
                            cardLayoutBgPanel.setPreferredSize(preferredSize);
                        }
                    }
                    cardLayoutLayeredPane.add(cardLayoutBgPanel, new Integer(1));
                    cardLayoutBgPanel.setBounds(new Rectangle(new Point(0, 0), cardLayoutBgPanel.getPreferredSize()));

                    //======== mainCardLayoutPanel ========
                    {
                        mainCardLayoutPanel.setOpaque(false);
                        mainCardLayoutPanel.setPreferredSize(new Dimension(920, 465));
                        mainCardLayoutPanel.setLayout(null);
                    }
                    cardLayoutLayeredPane.add(mainCardLayoutPanel, new Integer(2));
                    mainCardLayoutPanel.setBounds(new Rectangle(new Point(0, 0), mainCardLayoutPanel.getPreferredSize()));
                }
                mainPanel.add(cardLayoutLayeredPane);
                cardLayoutLayeredPane.setBounds(0, 115, 920, 465);
            }
            mainLayeredPane.add(mainPanel, new Integer(2));
            mainPanel.setBounds(0, 0, 920, 580);
        }
        contentPane.add(mainLayeredPane);
        mainLayeredPane.setBounds(0, 0, 920, 580);

        contentPane.setPreferredSize(new Dimension(920, 580));
        setSize(920, 580);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLayeredPane mainLayeredPane;
    private JPanel bgPanel;
    private JLabel bgLabel;
    private JPanel mainPanel;
    private JLabel closeMainPanelLabel;
    private JLabel miniMainPanelLabel;
    private JLabel setUpMainPanelLabel;
    private JLabel contactMainPanelLabel;
    private JLabel updateMainPanelLabel;
    private JLabel personalMainPanelLabel;
    private JLabel titleMainPanelLabel;
    private JPopupMenu userSettingPopupMenu;
    private JMenuItem userSettingMenuItem1;
    private JMenuItem userSettingMenuItem2;
    private JMenuItem userSettingMenuItem3;
    private JPopupMenu updateSettingPopupMenu;
    private JMenuItem updateSettingMenuItem1;
    private JMenuItem updateSettingMenuItem2;
    private JMenuItem updateSettingMenuItem3;
    private JPopupMenu informationSettingPopupMenu;
    private JMenuItem informationSettingMenuItem1;
    private JMenuItem informationSettingMenuItem2;
    private JMenuItem informationSettingMenuItem3;
    private JPopupMenu setUpMainPanelPopupMenu;
    private JMenuItem setUpMenuItem1;
    private JMenuItem setUpMenuItem2;
    private JMenuItem setUpMenuItem3;
    private JLabel checkUpIconLabel;
    private JLabel killingTrojansIconLabel;
    private JLabel cleanUpIconLabel;
    private JLabel systemRepairIconLabel;
    private JLabel accelerationIconLabel;
    private JLabel functionIconLabel;
    private JLayeredPane cardLayoutLayeredPane;
    private JPanel cardLayoutBgPanel;
    private JLabel cardLayoutBgLabel;
    private JPanel mainCardLayoutPanel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
