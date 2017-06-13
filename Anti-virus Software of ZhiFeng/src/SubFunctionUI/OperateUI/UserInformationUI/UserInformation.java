/*
 * Created by JFormDesigner on Tue Dec 20 16:55:31 CST 2016
 */

package SubFunctionUI.OperateUI.UserInformationUI;

import SubFunctionUI.UndoneUI.Undone;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author xuanyu
 */
public class UserInformation extends JPanel {

    ButtonGroup buttonGroup;
    Date birthDate;
    Date dateMax;
    Date dateMin;
    SimpleDateFormat format;

    public UserInformation() {
        initComponents();
        set();
    }

    private void set(){
        buttonGroup=new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        format=new SimpleDateFormat("yyyy/MM/dd");
        format.setLenient(false);

        try{
            dateMax = format.parse("1886/01/01");
            dateMin = format.parse("2016/01/01");
        } catch (Exception ex){
            ex.printStackTrace();
        }

        setFont();
    }

    private void textGained(JTextField jTextField){
        if(!jTextField.getForeground().equals(new Color(80,80,80))){
            jTextField.setForeground(new Color(80,80,80));
            jTextField.setText("");
        }
    }

    private void textLost(JTextField jTextField,String remind){
        if(jTextField.getText().isEmpty()){
            jTextField.setForeground(new Color(187,187,187));
            jTextField.setText(remind);
        }
        else{
            jTextField.setForeground(new Color(80,80,80));
        }
    }

    private void setFont(){
        textField1.setForeground(new Color(187,187,187));
        textField1.setText("输入任意5位字符");
        textField2.setForeground(new Color(187,187,187));
        textField2.setText("输入姓名");
        textField3.setForeground(new Color(187,187,187));
        textField3.setText("输入岁数");
        textField4.setForeground(new Color(187,187,187));
        textField4.setText("年/月/日");
        textField5.setForeground(new Color(187,187,187));
        textField5.setText("输入血型");
        textField6.setForeground(new Color(187,187,187));
        textField6.setText("输入星座");
        textField7.setForeground(new Color(187,187,187));
        textField7.setText("输入生肖");
        textField8.setForeground(new Color(187,187,187));
        textField8.setText("输入职业");
        textField9.setForeground(new Color(187,187,187));
        textField9.setText("输入职位");
        textField10.setForeground(new Color(187,187,187));
        textField10.setText("输入学历");
        textField11.setForeground(new Color(187,187,187));
        textField11.setText("输入学校");
        textField12.setForeground(new Color(187,187,187));
        textField12.setText("输入电话");
        textField13.setForeground(new Color(187,187,187));
        textField13.setText("输入手机");
    }

    private void textField1KeyPressed(KeyEvent e) {
        if(e.getKeyCode()==10){
            textField2.requestFocus();
        }
    }

    private void textField1KeyTyped(KeyEvent e) {
        if(textField1.getText().length()>=5){
            e.consume();
        }
    }

    private void textField1FocusGained(FocusEvent e) {
        textGained(textField1);
    }

    private void textField1FocusLost(FocusEvent e) {
        textLost(textField1,"输入任意5位字符");
    }

    private void textField2KeyPressed(KeyEvent e) {
        if(e.getKeyCode()==10){
            radioButton1.requestFocus();
        }
    }

    private void textField2KeyTyped(KeyEvent e) {
        int keyChar =e.getKeyChar();
        if(textField2.getText().length()>=5){
            e.consume();
        }else if(keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9){
            e.consume();
        }
    }

    private void textField2FocusGained(FocusEvent e) {
        textGained(textField2);
    }

    private void textField2FocusLost(FocusEvent e) {
        textLost(textField2,"输入姓名");
    }

    private void textField3KeyTyped(KeyEvent e) {
        if(textField3.getText().length()>=3){
            e.consume();
        }else if(e.getKeyChar() < KeyEvent.VK_0 && e.getKeyChar() > KeyEvent.VK_9){
            e.consume();
        }
    }

    private void textField3FocusGained(FocusEvent e) {
        textGained(textField3);
    }

    private void textField3FocusLost(FocusEvent e) {
        if(textField3.getText().isEmpty()){
            textField3.setForeground(new Color(187,187,187));
            textField3.setText("输入岁数");
        }
        else{
            int value=Integer.parseInt(textField3.getText());
            if(value<=0||value>130){
                textField3.setForeground(new Color(255, 149, 144));
                textField3.setText("您输入的岁数有误！");
            }else{
                textField3.setForeground(new Color(80,80,80));
            }
        }
    }

    private void textField3KeyPressed(KeyEvent e) {
        if(e.getKeyCode()==10){
            textField4.requestFocus();
        }
    }

    private void textField4KeyPressed(KeyEvent e) {
        if(e.getKeyCode()==10){
            textField5.requestFocus();
        }
    }

    private void textField4KeyTyped(KeyEvent e) {
        if(textField4.getText().length()>=10){
            e.consume();
        }else if(e.getKeyChar() >= KeyEvent.VK_0 && e.getKeyChar() <= KeyEvent.VK_9){
            if(textField4.getText().length()==4){
                textField4.setText(textField4.getText()+"/");
            }
            if(textField4.getText().length()==7){
                textField4.setText(textField4.getText()+"/");
            }
        }else{
            e.consume();
        }
    }

    private void textField4FocusGained(FocusEvent e) {
        textGained(textField4);
    }

    private void textField4FocusLost(FocusEvent e) {
        try {
            if(textField4.getText().isEmpty()){
                textField4.setForeground(new Color(187,187,187));
                textField4.setText("年/月/日");
            }
            else{
                birthDate = format.parse(textField4.getText());
                if(birthDate.before(dateMax)||birthDate.after(dateMin)){
                    textField4.setForeground(new Color(255, 149, 144));
                    textField4.setText("您输入的日期有误！");
                }else{
                    textField4.setForeground(new Color(80,80,80));
                }
            }
        } catch (Exception ex){
            ex.printStackTrace();
            textField4.setForeground(new Color(255, 149, 144));
            textField4.setText("您输入的日期有误！");
        }
    }

    private void textField5KeyPressed(KeyEvent e) {
        if(e.getKeyCode()==10){
            textField6.requestFocus();
        }
    }

    private void textField5KeyTyped(KeyEvent e) {
        if(textField5.getText().length()>=4){
            e.consume();
        }
    }

    private void textField5FocusGained(FocusEvent e) {
        textGained(textField5);
    }

    private void textField5FocusLost(FocusEvent e) {
        textLost(textField5,"输入血型");
    }

    private void textField6KeyPressed(KeyEvent e) {
        if(e.getKeyCode()==10){
            textField7.requestFocus();
        }
    }

    private void textField6KeyTyped(KeyEvent e) {
        if(textField6.getText().length()>=4){
            e.consume();
        }
    }

    private void textField6FocusGained(FocusEvent e) {
        textGained(textField6);
    }

    private void textField6FocusLost(FocusEvent e) {
        textLost(textField6,"输入星座");
    }

    private void textField7KeyPressed(KeyEvent e) {
        if(e.getKeyCode()==10){
            textField8.requestFocus();
        }
    }

    private void textField7KeyTyped(KeyEvent e) {
        if(textField7.getText().length()>=2){
            e.consume();
        }
    }

    private void textField7FocusGained(FocusEvent e) {
        textGained(textField7);
    }

    private void textField7FocusLost(FocusEvent e) {
        textLost(textField7,"输入生肖");
    }

    private void textField8KeyPressed(KeyEvent e) {
        if(e.getKeyCode()==10){
            textField9.requestFocus();
        }
    }

    private void textField8KeyTyped(KeyEvent e) {
        if(textField8.getText().length()>=10){
            e.consume();
        }
    }

    private void textField8FocusGained(FocusEvent e) {
        textGained(textField8);
    }

    private void textField8FocusLost(FocusEvent e) {
        textLost(textField8,"输入职业");
    }

    private void textField9KeyPressed(KeyEvent e) {
        if(e.getKeyCode()==10){
            textField10.requestFocus();
        }
    }

    private void textField9KeyTyped(KeyEvent e) {
        if(textField9.getText().length()>=10){
            e.consume();
        }
    }

    private void textField9FocusGained(FocusEvent e) {
        textGained(textField9);
    }

    private void textField9FocusLost(FocusEvent e) {
        textLost(textField9,"输入职位");
    }

    private void textField10KeyPressed(KeyEvent e) {
        if(e.getKeyCode()==10){
            textField11.requestFocus();
        }
    }

    private void textField10KeyTyped(KeyEvent e) {
        if(textField10.getText().length()>=10){
            e.consume();
        }
    }

    private void textField10FocusGained(FocusEvent e) {
        textGained(textField10);
    }

    private void textField10FocusLost(FocusEvent e) {
        textLost(textField10,"输入学历");
    }

    private void textField11KeyPressed(KeyEvent e) {
        if(e.getKeyCode()==10){
            textField12.requestFocus();
        }
    }

    private void textField11KeyTyped(KeyEvent e) {
        if(textField11.getText().length()>=10){
            e.consume();
        }
    }

    private void textField11FocusGained(FocusEvent e) {
        textGained(textField11);
    }

    private void textField11FocusLost(FocusEvent e) {
        textLost(textField11,"输入学校");
    }

    private void textField12KeyPressed(KeyEvent e) {
        if(e.getKeyCode()==10){
            textField13.requestFocus();
        }
    }

    private void textField12KeyTyped(KeyEvent e) {
        if(textField12.getText().length()>=14){
            e.consume();
        }else if((e.getKeyChar() < KeyEvent.VK_0 && e.getKeyChar() > KeyEvent.VK_9)||e.getKeyChar() != KeyEvent.VK_MINUS){
            e.consume();
        }
    }

    private void textField12FocusGained(FocusEvent e) {
        textGained(textField12);
    }

    private void textField12FocusLost(FocusEvent e) {
        textLost(textField12,"输入电话");
    }

    private void textField13KeyPressed(KeyEvent e) {
        if(e.getKeyCode()==10){
            textField14.requestFocus();
        }
    }

    private void textField13KeyTyped(KeyEvent e) {
        if(textField12.getText().length()>=14){
            e.consume();
        }else if(e.getKeyChar() < KeyEvent.VK_0 && e.getKeyChar() > KeyEvent.VK_9){
            e.consume();
        }
    }

    private void textField13FocusGained(FocusEvent e) {
        textGained(textField13);
    }

    private void textField13FocusLost(FocusEvent e) {
        textLost(textField13,"输入手机");
    }

    private void textField14KeyPressed(KeyEvent e) {
        if(e.getKeyCode()==10){
            textField15.requestFocus();
        }
    }

    private void textField15KeyPressed(KeyEvent e) {
        if(e.getKeyCode()==10){
            textField16.requestFocus();
        }
    }

    private void textField16KeyPressed(KeyEvent e) {
        if(e.getKeyCode()==10){
            textArea1.requestFocus();
        }
    }

    private void textArea1KeyPressed(KeyEvent e) {
        if(e.getKeyCode()==10){
            textArea2.requestFocus();
        }
    }

    private void radioButton1KeyPressed(KeyEvent e) {
        if(e.getKeyCode()==10){
            radioButton2.requestFocus();
        }
    }

    private void radioButton2KeyPressed(KeyEvent e) {
        if(e.getKeyCode()==10){
            textField3.requestFocus();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        mainPanel = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        label4 = new JLabel();
        textField3 = new JTextField();
        label5 = new JLabel();
        textField4 = new JTextField();
        label6 = new JLabel();
        textField5 = new JTextField();
        label7 = new JLabel();
        textField6 = new JTextField();
        label8 = new JLabel();
        textField7 = new JTextField();
        label9 = new JLabel();
        textField8 = new JTextField();
        label10 = new JLabel();
        textField9 = new JTextField();
        label11 = new JLabel();
        textField10 = new JTextField();
        label12 = new JLabel();
        textField11 = new JTextField();
        label13 = new JLabel();
        textField12 = new JTextField();
        label14 = new JLabel();
        textField13 = new JTextField();
        label15 = new JLabel();
        textField14 = new JTextField();
        label16 = new JLabel();
        textField15 = new JTextField();
        label17 = new JLabel();
        textField16 = new JTextField();
        label18 = new JLabel();
        textArea1 = new JTextArea();
        label19 = new JLabel();
        textArea2 = new JTextArea();

        //======== this ========
        setBackground(null);
        setOpaque(false);
        setPreferredSize(new Dimension(575, 720));
        setForeground(null);
        setLayout(null);

        //======== mainPanel ========
        {
            mainPanel.setOpaque(false);
            mainPanel.setBackground(null);
            mainPanel.setForeground(null);
            mainPanel.setPreferredSize(new Dimension(495, 720));
            mainPanel.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
            mainPanel.setLayout(null);

            //---- label1 ----
            label1.setText("\u6635\u79f0\uff1a");
            label1.setBackground(null);
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setForeground(new Color(102, 102, 102));
            label1.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
            mainPanel.add(label1);
            label1.setBounds(70, 30, 50, 25);

            //---- textField1 ----
            textField1.setNextFocusableComponent(textField2);
            textField1.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    textField1KeyPressed(e);
                }
                @Override
                public void keyTyped(KeyEvent e) {
                    textField1KeyTyped(e);
                }
            });
            textField1.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    textField1FocusGained(e);
                }
                @Override
                public void focusLost(FocusEvent e) {
                    textField1FocusLost(e);
                }
            });
            mainPanel.add(textField1);
            textField1.setBounds(120, 30, 120, 25);

            //---- label2 ----
            label2.setText("\u59d3\u540d\uff1a");
            label2.setBackground(null);
            label2.setForeground(new Color(102, 102, 102));
            label2.setHorizontalAlignment(SwingConstants.CENTER);
            label2.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
            mainPanel.add(label2);
            label2.setBounds(325, 30, 50, 25);

            //---- textField2 ----
            textField2.setNextFocusableComponent(radioButton1);
            textField2.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    textField2KeyPressed(e);
                }
                @Override
                public void keyTyped(KeyEvent e) {
                    textField2KeyTyped(e);
                }
            });
            textField2.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    textField2FocusGained(e);
                }
                @Override
                public void focusLost(FocusEvent e) {
                    textField2FocusLost(e);
                }
            });
            mainPanel.add(textField2);
            textField2.setBounds(375, 30, 120, 25);

            //---- label3 ----
            label3.setText("\u6027\u522b\uff1a");
            label3.setHorizontalAlignment(SwingConstants.CENTER);
            label3.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
            label3.setForeground(new Color(102, 102, 102));
            label3.setBackground(null);
            mainPanel.add(label3);
            label3.setBounds(70, 80, 50, 25);

            //---- radioButton1 ----
            radioButton1.setText("\u7537");
            radioButton1.setOpaque(false);
            radioButton1.setNextFocusableComponent(radioButton2);
            radioButton1.setSelected(true);
            radioButton1.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    radioButton1KeyPressed(e);
                }
            });
            mainPanel.add(radioButton1);
            radioButton1.setBounds(new Rectangle(new Point(120, 80), radioButton1.getPreferredSize()));

            //---- radioButton2 ----
            radioButton2.setText("\u5973");
            radioButton2.setOpaque(false);
            radioButton2.setNextFocusableComponent(textField3);
            radioButton2.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    radioButton2KeyPressed(e);
                }
            });
            mainPanel.add(radioButton2);
            radioButton2.setBounds(new Rectangle(new Point(205, 80), radioButton2.getPreferredSize()));

            //---- label4 ----
            label4.setText("\u5e74\u9f84\uff1a");
            label4.setBackground(null);
            label4.setHorizontalAlignment(SwingConstants.CENTER);
            label4.setForeground(new Color(102, 102, 102));
            mainPanel.add(label4);
            label4.setBounds(325, 80, 50, 25);

            //---- textField3 ----
            textField3.setNextFocusableComponent(textField4);
            textField3.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    textField3KeyPressed(e);
                }
                @Override
                public void keyTyped(KeyEvent e) {
                    textField3KeyTyped(e);
                }
            });
            textField3.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    textField3FocusGained(e);
                }
                @Override
                public void focusLost(FocusEvent e) {
                    textField3FocusLost(e);
                }
            });
            mainPanel.add(textField3);
            textField3.setBounds(375, 80, 120, 25);

            //---- label5 ----
            label5.setText("\u751f\u65e5\uff1a");
            label5.setBackground(null);
            label5.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
            label5.setForeground(new Color(102, 102, 102));
            label5.setHorizontalAlignment(SwingConstants.CENTER);
            mainPanel.add(label5);
            label5.setBounds(70, 130, 50, 25);

            //---- textField4 ----
            textField4.setNextFocusableComponent(textField5);
            textField4.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    textField4KeyPressed(e);
                }
                @Override
                public void keyTyped(KeyEvent e) {
                    textField4KeyTyped(e);
                }
            });
            textField4.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    textField4FocusGained(e);
                }
                @Override
                public void focusLost(FocusEvent e) {
                    textField4FocusLost(e);
                }
            });
            mainPanel.add(textField4);
            textField4.setBounds(120, 130, 120, 25);

            //---- label6 ----
            label6.setText("\u8840\u578b\uff1a");
            label6.setBackground(null);
            label6.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
            label6.setForeground(new Color(102, 102, 102));
            label6.setHorizontalAlignment(SwingConstants.CENTER);
            mainPanel.add(label6);
            label6.setBounds(325, 130, 50, 25);

            //---- textField5 ----
            textField5.setNextFocusableComponent(textField6);
            textField5.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    textField5KeyPressed(e);
                }
                @Override
                public void keyTyped(KeyEvent e) {
                    textField5KeyTyped(e);
                }
            });
            textField5.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    textField5FocusGained(e);
                }
                @Override
                public void focusLost(FocusEvent e) {
                    textField5FocusLost(e);
                }
            });
            mainPanel.add(textField5);
            textField5.setBounds(375, 130, 120, 25);

            //---- label7 ----
            label7.setText("\u661f\u5ea7\uff1a");
            label7.setBackground(null);
            label7.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
            label7.setForeground(new Color(102, 102, 102));
            label7.setHorizontalAlignment(SwingConstants.CENTER);
            mainPanel.add(label7);
            label7.setBounds(70, 180, 50, 25);

            //---- textField6 ----
            textField6.setNextFocusableComponent(textField7);
            textField6.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    textField6KeyPressed(e);
                }
                @Override
                public void keyTyped(KeyEvent e) {
                    textField6KeyTyped(e);
                }
            });
            textField6.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    textField6FocusGained(e);
                }
                @Override
                public void focusLost(FocusEvent e) {
                    textField6FocusLost(e);
                }
            });
            mainPanel.add(textField6);
            textField6.setBounds(120, 180, 120, 25);

            //---- label8 ----
            label8.setText("\u751f\u8096\uff1a");
            label8.setBackground(null);
            label8.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
            label8.setForeground(new Color(102, 102, 102));
            label8.setHorizontalAlignment(SwingConstants.CENTER);
            mainPanel.add(label8);
            label8.setBounds(325, 180, 50, 25);

            //---- textField7 ----
            textField7.setNextFocusableComponent(textField8);
            textField7.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    textField7KeyPressed(e);
                }
                @Override
                public void keyTyped(KeyEvent e) {
                    textField7KeyTyped(e);
                }
            });
            textField7.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    textField7FocusGained(e);
                }
                @Override
                public void focusLost(FocusEvent e) {
                    textField7FocusLost(e);
                }
            });
            mainPanel.add(textField7);
            textField7.setBounds(375, 180, 120, 25);

            //---- label9 ----
            label9.setText("\u804c\u4e1a\uff1a");
            label9.setBackground(null);
            label9.setForeground(new Color(102, 102, 102));
            label9.setHorizontalAlignment(SwingConstants.CENTER);
            label9.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
            mainPanel.add(label9);
            label9.setBounds(70, 230, 50, 25);

            //---- textField8 ----
            textField8.setNextFocusableComponent(textField9);
            textField8.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    textField8KeyPressed(e);
                }
                @Override
                public void keyTyped(KeyEvent e) {
                    textField8KeyTyped(e);
                }
            });
            textField8.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    textField8FocusGained(e);
                }
                @Override
                public void focusLost(FocusEvent e) {
                    textField8FocusLost(e);
                }
            });
            mainPanel.add(textField8);
            textField8.setBounds(120, 230, 120, 25);

            //---- label10 ----
            label10.setText("\u804c\u4f4d\uff1a");
            label10.setBackground(null);
            label10.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
            label10.setForeground(new Color(102, 102, 102));
            label10.setHorizontalAlignment(SwingConstants.CENTER);
            mainPanel.add(label10);
            label10.setBounds(325, 230, 50, 25);

            //---- textField9 ----
            textField9.setNextFocusableComponent(textField10);
            textField9.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    textField9KeyPressed(e);
                }
                @Override
                public void keyTyped(KeyEvent e) {
                    textField9KeyTyped(e);
                }
            });
            textField9.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    textField9FocusGained(e);
                }
                @Override
                public void focusLost(FocusEvent e) {
                    textField9FocusLost(e);
                }
            });
            mainPanel.add(textField9);
            textField9.setBounds(375, 230, 120, 25);

            //---- label11 ----
            label11.setText("\u5b66\u5386\uff1a");
            label11.setBackground(null);
            label11.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
            label11.setForeground(new Color(102, 102, 102));
            label11.setHorizontalAlignment(SwingConstants.CENTER);
            mainPanel.add(label11);
            label11.setBounds(70, 280, 50, 25);

            //---- textField10 ----
            textField10.setNextFocusableComponent(textField11);
            textField10.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    textField10KeyPressed(e);
                }
                @Override
                public void keyTyped(KeyEvent e) {
                    textField10KeyTyped(e);
                }
            });
            textField10.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    textField10FocusGained(e);
                }
                @Override
                public void focusLost(FocusEvent e) {
                    textField10FocusLost(e);
                }
            });
            mainPanel.add(textField10);
            textField10.setBounds(120, 280, 120, 25);

            //---- label12 ----
            label12.setText("\u5b66\u6821\uff1a");
            label12.setBackground(null);
            label12.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
            label12.setForeground(new Color(102, 102, 102));
            label12.setHorizontalAlignment(SwingConstants.CENTER);
            mainPanel.add(label12);
            label12.setBounds(325, 280, 50, 25);

            //---- textField11 ----
            textField11.setNextFocusableComponent(textField12);
            textField11.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    textField11KeyPressed(e);
                }
                @Override
                public void keyTyped(KeyEvent e) {
                    textField11KeyTyped(e);
                }
            });
            textField11.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    textField11FocusGained(e);
                }
                @Override
                public void focusLost(FocusEvent e) {
                    textField11FocusLost(e);
                }
            });
            mainPanel.add(textField11);
            textField11.setBounds(375, 280, 120, 25);

            //---- label13 ----
            label13.setText("\u7535\u8bdd\uff1a");
            label13.setBackground(null);
            label13.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
            label13.setForeground(new Color(102, 102, 102));
            label13.setHorizontalAlignment(SwingConstants.CENTER);
            mainPanel.add(label13);
            label13.setBounds(70, 330, 50, 25);

            //---- textField12 ----
            textField12.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
            textField12.setForeground(new Color(102, 102, 102));
            textField12.setHorizontalAlignment(SwingConstants.CENTER);
            textField12.setNextFocusableComponent(textField13);
            textField12.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    textField12KeyPressed(e);
                }
                @Override
                public void keyTyped(KeyEvent e) {
                    textField12KeyTyped(e);
                }
            });
            textField12.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    textField12FocusGained(e);
                }
                @Override
                public void focusLost(FocusEvent e) {
                    textField12FocusLost(e);
                }
            });
            mainPanel.add(textField12);
            textField12.setBounds(120, 330, 120, 25);

            //---- label14 ----
            label14.setText("\u624b\u673a\uff1a");
            label14.setBackground(null);
            label14.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
            label14.setForeground(new Color(102, 102, 102));
            label14.setHorizontalAlignment(SwingConstants.CENTER);
            mainPanel.add(label14);
            label14.setBounds(325, 330, 50, 25);

            //---- textField13 ----
            textField13.setNextFocusableComponent(textField14);
            textField13.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    textField13KeyPressed(e);
                }
                @Override
                public void keyTyped(KeyEvent e) {
                    textField13KeyTyped(e);
                }
            });
            textField13.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    textField13FocusGained(e);
                }
                @Override
                public void focusLost(FocusEvent e) {
                    textField13FocusLost(e);
                }
            });
            mainPanel.add(textField13);
            textField13.setBounds(375, 330, 120, 25);

            //---- label15 ----
            label15.setText("\u90ae\u7bb1\uff1a");
            label15.setBackground(null);
            label15.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
            label15.setForeground(new Color(102, 102, 102));
            label15.setHorizontalAlignment(SwingConstants.CENTER);
            mainPanel.add(label15);
            label15.setBounds(70, 380, 50, 25);

            //---- textField14 ----
            textField14.setNextFocusableComponent(textField15);
            textField14.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    textField14KeyPressed(e);
                }
            });
            mainPanel.add(textField14);
            textField14.setBounds(120, 380, 375, 25);

            //---- label16 ----
            label16.setText("\u4e3b\u9875\uff1a");
            label16.setBackground(null);
            label16.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
            label16.setForeground(new Color(102, 102, 102));
            label16.setHorizontalAlignment(SwingConstants.CENTER);
            mainPanel.add(label16);
            label16.setBounds(70, 430, 50, 25);

            //---- textField15 ----
            textField15.setNextFocusableComponent(textField16);
            textField15.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    textField15KeyPressed(e);
                }
            });
            mainPanel.add(textField15);
            textField15.setBounds(120, 430, 375, 25);

            //---- label17 ----
            label17.setText("\u5730\u5740\uff1a");
            label17.setBackground(null);
            label17.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
            label17.setForeground(new Color(102, 102, 102));
            label17.setHorizontalAlignment(SwingConstants.CENTER);
            mainPanel.add(label17);
            label17.setBounds(70, 480, 50, 25);

            //---- textField16 ----
            textField16.setNextFocusableComponent(textArea1);
            textField16.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    textField16KeyPressed(e);
                }
            });
            mainPanel.add(textField16);
            textField16.setBounds(120, 480, 375, 25);

            //---- label18 ----
            label18.setText("\u7231\u597d\uff1a");
            label18.setBackground(null);
            label18.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
            label18.setForeground(new Color(102, 102, 102));
            label18.setHorizontalAlignment(SwingConstants.CENTER);
            mainPanel.add(label18);
            label18.setBounds(70, 530, 50, 25);

            //---- textArea1 ----
            textArea1.setBorder(new BevelBorder(BevelBorder.LOWERED));
            textArea1.setNextFocusableComponent(textArea2);
            textArea1.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    textArea1KeyPressed(e);
                }
            });
            mainPanel.add(textArea1);
            textArea1.setBounds(120, 530, 375, 75);

            //---- label19 ----
            label19.setText("\u7b80\u4ecb\uff1a");
            label19.setBackground(null);
            label19.setFont(new Font("\u5e7c\u5706", Font.PLAIN, 12));
            label19.setHorizontalAlignment(SwingConstants.CENTER);
            mainPanel.add(label19);
            label19.setBounds(70, 630, 50, 25);

            //---- textArea2 ----
            textArea2.setBorder(new BevelBorder(BevelBorder.LOWERED));
            textArea2.setNextFocusableComponent(textField1);
            mainPanel.add(textArea2);
            textArea2.setBounds(120, 630, 375, 75);

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
        add(mainPanel);
        mainPanel.setBounds(0, 0, 575, 720);

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
    private JPanel mainPanel;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JLabel label4;
    private JTextField textField3;
    private JLabel label5;
    private JTextField textField4;
    private JLabel label6;
    private JTextField textField5;
    private JLabel label7;
    private JTextField textField6;
    private JLabel label8;
    private JTextField textField7;
    private JLabel label9;
    private JTextField textField8;
    private JLabel label10;
    private JTextField textField9;
    private JLabel label11;
    private JTextField textField10;
    private JLabel label12;
    private JTextField textField11;
    private JLabel label13;
    private JTextField textField12;
    private JLabel label14;
    private JTextField textField13;
    private JLabel label15;
    private JTextField textField14;
    private JLabel label16;
    private JTextField textField15;
    private JLabel label17;
    private JTextField textField16;
    private JLabel label18;
    private JTextArea textArea1;
    private JLabel label19;
    private JTextArea textArea2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
