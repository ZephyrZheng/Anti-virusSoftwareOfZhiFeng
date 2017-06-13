/*
 * Created by JFormDesigner on Mon Dec 19 21:13:36 CST 2016
 */

package SubFunctionUI.LoginUI;

import Func.SetImage;
import SubFunctionUI.UndoneUI.Undone;

import java.awt.*;
import java.awt.event.*;
import java.util.Set;
import javax.swing.*;

/**
 * @author xuanyu
 */
public class Login extends JDialog {

    //用于处理拖动事件，表示鼠标按下时的坐标，相对于JFrame
    int xOld = 0;
    int yOld = 0;
    private String account="志峰";
    private String password="1234";
    private Undone undone;

    public Login(Frame owner) {
        super(owner);
        initComponents();
        set();
    }

    public Login(Dialog owner) {
        super(owner);
        initComponents();
        set();
    }

    private void set(){
        this.setSize(366,228);
        loadImage();
    }

    private void loadImage(){
        SetImage.setLabelIcon("img/bg/picture/loginDialog/loginBg.jpg",bgLabel);
        SetImage.setLabelIcon("img/bg/border/loginBorder.png",borderLabel);
        SetImage.setLabelIcon("img/component/window/close.png",closeLabel);
        SetImage.setLabelIcon("img/component/window/title.png",titleLabel);
        SetImage.setLabelIcon("img/component/loginDialog/loginButtonDefault.png",loginLabel);
    }

    private void judge(){
        if(accountTextField.getText().equals("")){
            remindLabel.setText("账号为空！");
            remindLabel.setVisible(true);
        }else if(String.valueOf(passwordField.getPassword()).equals("")){
            remindLabel.setText("密码为空！");
            remindLabel.setVisible(true);
        }else if(!accountTextField.getText().equals(account)){
            remindLabel.setText("账号错误！");
            remindLabel.setVisible(true);
        }else if(!String.valueOf(passwordField.getPassword()).equals(password)){
            remindLabel.setText("密码错误！");
            remindLabel.setVisible(true);
        }else{
            this.dispose();
        }
    }

    private void thisMousePressed(MouseEvent e) {
        xOld = e.getX();
        yOld = e.getY();
    }

    private void thisMouseDragged(MouseEvent e) {
        Login.this.setLocation(e.getXOnScreen() - xOld, e.getYOnScreen() - yOld);
    }

    private void closeLabelMouseClicked(MouseEvent e) {
        this.dispose();
    }

    private void loginLabelMouseClicked(MouseEvent e) {
        judge();
    }

    private void loginLabelMouseEntered(MouseEvent e) {
        SetImage.setLabelIcon("img/component/loginDialog/loginButtonChoose.png",loginLabel);
    }

    private void loginLabelMouseExited(MouseEvent e) {
        SetImage.setLabelIcon("img/component/loginDialog/loginButtonDefault.png",loginLabel);
    }

    private void loginLabelMousePressed(MouseEvent e) {
        SetImage.setLabelIcon("img/component/loginDialog/loginButtonChoose.png",loginLabel);
    }

    private void loginLabelMouseReleased(MouseEvent e) {
        SetImage.setLabelIcon("img/component/loginDialog/loginButtonDefault.png",loginLabel);
    }

    private void accountTextFieldKeyPressed(KeyEvent e) {
        if(e.getKeyCode()==10){
            passwordField.requestFocus();
        }
    }

    private void passwordFieldKeyPressed(KeyEvent e) {
        if(e.getKeyCode()==10){
            loginLabel.requestFocus();
        }
    }

    private void loginLabelKeyPressed(KeyEvent e) {
        if(e.getKeyCode()==10){
            judge();
        }
    }

    private void registerLabelMouseClicked(MouseEvent e) {
        undone=new Undone(this);
        undone.setVisible(true);
    }

    private void registerLabelMouseEntered(MouseEvent e) {
        registerLabel.setForeground(Color.orange);
    }

    private void registerLabelMouseExited(MouseEvent e) {
        registerLabel.setForeground(new Color(102,102,102));
    }

    private void retrieveLabelMouseClicked(MouseEvent e) {
        undone=new Undone(this);
        undone.setVisible(true);
    }

    private void retrieveLabelMouseEntered(MouseEvent e) {
        retrieveLabel.setForeground(Color.orange);
    }

    private void retrieveLabelMouseExited(MouseEvent e) {
        retrieveLabel.setForeground(new Color(102,102,102));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        loginLayeredPane = new JLayeredPane();
        bgPanel = new JPanel();
        bgLabel = new JLabel();
        borderPanel = new JPanel();
        borderLabel = new JLabel();
        mainPanel = new JPanel();
        titleLabel = new JLabel();
        closeLabel = new JLabel();
        remindLabel = new JLabel();
        accountTextField = new JTextField();
        passwordField = new JPasswordField();
        accountLabel = new JLabel();
        passwordLabel = new JLabel();
        registerLabel = new JLabel();
        retrieveLabel = new JLabel();
        loginLabel = new JLabel();

        //======== this ========
        setBackground(null);
        setResizable(false);
        setUndecorated(true);
        setMinimumSize(new Dimension(366, 228));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
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

        //======== loginLayeredPane ========
        {

            //======== bgPanel ========
            {
                bgPanel.setOpaque(false);
                bgPanel.setLayout(null);

                //---- bgLabel ----
                bgLabel.setBackground(null);
                bgLabel.setOpaque(true);
                bgPanel.add(bgLabel);
                bgLabel.setBounds(0, 0, 366, 228);

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
            loginLayeredPane.add(bgPanel, new Integer(1));
            bgPanel.setBounds(0, 0, 366, 228);

            //======== borderPanel ========
            {
                borderPanel.setBackground(null);
                borderPanel.setOpaque(false);
                borderPanel.setLayout(null);

                //---- borderLabel ----
                borderLabel.setBackground(null);
                borderPanel.add(borderLabel);
                borderLabel.setBounds(0, 0, 366, 228);

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
            loginLayeredPane.add(borderPanel, new Integer(2));
            borderPanel.setBounds(0, 0, 366, 228);

            //======== mainPanel ========
            {
                mainPanel.setBackground(null);
                mainPanel.setOpaque(false);
                mainPanel.setLayout(null);

                //---- titleLabel ----
                titleLabel.setBackground(null);
                mainPanel.add(titleLabel);
                titleLabel.setBounds(15, 10, 100, 20);

                //---- closeLabel ----
                closeLabel.setBackground(null);
                closeLabel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        closeLabelMouseClicked(e);
                    }
                });
                mainPanel.add(closeLabel);
                closeLabel.setBounds(334, 10, 17, 17);

                //---- remindLabel ----
                remindLabel.setBackground(new Color(255, 153, 102));
                remindLabel.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
                remindLabel.setHorizontalTextPosition(SwingConstants.CENTER);
                remindLabel.setMaximumSize(null);
                remindLabel.setMinimumSize(null);
                remindLabel.setHorizontalAlignment(SwingConstants.CENTER);
                remindLabel.setForeground(new Color(102, 102, 102));
                remindLabel.setOpaque(true);
                remindLabel.setVisible(false);
                mainPanel.add(remindLabel);
                remindLabel.setBounds(2, 50, 362, 20);

                //---- accountTextField ----
                accountTextField.setBackground(null);
                accountTextField.setOpaque(false);
                accountTextField.setNextFocusableComponent(passwordField);
                accountTextField.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        accountTextFieldKeyPressed(e);
                    }
                });
                mainPanel.add(accountTextField);
                accountTextField.setBounds(60, 85, 220, 25);

                //---- passwordField ----
                passwordField.setBackground(null);
                passwordField.setOpaque(false);
                passwordField.setNextFocusableComponent(loginLabel);
                passwordField.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        passwordFieldKeyPressed(e);
                    }
                });
                mainPanel.add(passwordField);
                passwordField.setBounds(60, 120, 220, 25);

                //---- accountLabel ----
                accountLabel.setText("\u8d26\u6237\uff1a");
                accountLabel.setBackground(null);
                accountLabel.setForeground(new Color(102, 102, 102));
                mainPanel.add(accountLabel);
                accountLabel.setBounds(20, 85, 40, 25);

                //---- passwordLabel ----
                passwordLabel.setText("\u5bc6\u7801\uff1a");
                passwordLabel.setForeground(new Color(102, 102, 102));
                mainPanel.add(passwordLabel);
                passwordLabel.setBounds(20, 120, 40, 25);

                //---- registerLabel ----
                registerLabel.setText("\u6ce8\u518c\u8d26\u6237");
                registerLabel.setBackground(null);
                registerLabel.setForeground(new Color(102, 102, 102));
                registerLabel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        registerLabelMouseClicked(e);
                    }
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        registerLabelMouseEntered(e);
                    }
                    @Override
                    public void mouseExited(MouseEvent e) {
                        registerLabelMouseExited(e);
                    }
                });
                mainPanel.add(registerLabel);
                registerLabel.setBounds(290, 85, 60, 25);

                //---- retrieveLabel ----
                retrieveLabel.setText("\u627e\u56de\u5bc6\u7801");
                retrieveLabel.setBackground(null);
                retrieveLabel.setForeground(new Color(102, 102, 102));
                retrieveLabel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        retrieveLabelMouseClicked(e);
                    }
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        retrieveLabelMouseEntered(e);
                    }
                    @Override
                    public void mouseExited(MouseEvent e) {
                        retrieveLabelMouseExited(e);
                    }
                });
                mainPanel.add(retrieveLabel);
                retrieveLabel.setBounds(290, 120, 60, 25);

                //---- loginLabel ----
                loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
                loginLabel.setBackground(null);
                loginLabel.setNextFocusableComponent(accountTextField);
                loginLabel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        loginLabelMouseClicked(e);
                    }
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        loginLabelMouseEntered(e);
                    }
                    @Override
                    public void mouseExited(MouseEvent e) {
                        loginLabelMouseExited(e);
                    }
                    @Override
                    public void mousePressed(MouseEvent e) {
                        loginLabelMousePressed(e);
                    }
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        loginLabelMouseReleased(e);
                    }
                });
                loginLabel.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        loginLabelKeyPressed(e);
                    }
                });
                mainPanel.add(loginLabel);
                loginLabel.setBounds(143, 165, 80, 20);

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
            loginLayeredPane.add(mainPanel, new Integer(3));
            mainPanel.setBounds(0, 0, 366, 228);
        }
        contentPane.add(loginLayeredPane);
        loginLayeredPane.setBounds(0, 0, 366, 228);

        contentPane.setPreferredSize(new Dimension(375, 260));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLayeredPane loginLayeredPane;
    private JPanel bgPanel;
    private JLabel bgLabel;
    private JPanel borderPanel;
    private JLabel borderLabel;
    private JPanel mainPanel;
    private JLabel titleLabel;
    private JLabel closeLabel;
    private JLabel remindLabel;
    private JTextField accountTextField;
    private JPasswordField passwordField;
    private JLabel accountLabel;
    private JLabel passwordLabel;
    private JLabel registerLabel;
    private JLabel retrieveLabel;
    private JLabel loginLabel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
