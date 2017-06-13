/*
 * Created by JFormDesigner on Mon Dec 05 14:44:44 CST 2016
 */

package MainInterface.KillingTrojansPanelUI;

import java.awt.event.*;
import Func.SetImage;
import MainInterface.SectionUI.SectionPanel;
import SubFunctionUI.UndoneUI.Undone;

import java.awt.*;
import javax.swing.*;

/**
 * @author xuanyu
 */
public class KillingTrojansPanel extends JPanel {

    private SectionPanel secsionPanel;
    private JFrame jFrame;
    private Undone undone;

    public KillingTrojansPanel(JFrame jFrame) {
        initComponents();
        this.jFrame=jFrame;
        set();
    }

    private void set(){
        secsionPanel=new SectionPanel(jFrame,
                "img/component/mainJFrame/killingTrojansIcon.png",
                "img/component/mainJFrame/killingTrojansRemind.png",
                "img/component/sectionPanel/beginButtonDefault.png",
                "img/component/sectionPanel/beginButtonChoose.png");
        this.add(secsionPanel);
        secsionPanel.setBounds(100,25,710,70);
        secsionPanel.setVisible(true);
        loadImage();
    }

    private void loadImage(){
        SetImage.setLabelIcon("img/component/killingTrojansPanel/quickScanDefault.png",quickScanIconLabel);
        SetImage.setLabelIcon("img/component/killingTrojansPanel/fullScanDefault.png",fullScanIconLabel);
        SetImage.setLabelIcon("img/component/killingTrojansPanel/customScanDefault.png",customIconLabel);
    }

    private void quickScanIconLabelMouseEntered(MouseEvent e) {
        SetImage.setLabelIcon("img/component/killingTrojansPanel/quickScanChoose.png",quickScanIconLabel);
    }

    private void quickScanIconLabelMouseExited(MouseEvent e) {
        SetImage.setLabelIcon("img/component/killingTrojansPanel/quickScanDefault.png",quickScanIconLabel);
    }

    private void quickScanIconLabelMousePressed(MouseEvent e) {
        SetImage.setLabelIcon("img/component/killingTrojansPanel/quickScanChoose.png",quickScanIconLabel);
    }

    private void quickScanIconLabelMouseReleased(MouseEvent e) {
        SetImage.setLabelIcon("img/component/killingTrojansPanel/quickScanDefault.png",quickScanIconLabel);
    }

    private void fullScanIconLabelMouseEntered(MouseEvent e) {
        SetImage.setLabelIcon("img/component/killingTrojansPanel/fullScanChoose.png",fullScanIconLabel);
    }

    private void fullScanIconLabelMouseExited(MouseEvent e) {
        SetImage.setLabelIcon("img/component/killingTrojansPanel/fullScanDefault.png",fullScanIconLabel);
    }

    private void fullScanIconLabelMousePressed(MouseEvent e) {
        SetImage.setLabelIcon("img/component/killingTrojansPanel/fullScanChoose.png",fullScanIconLabel);
    }

    private void fullScanIconLabelMouseReleased(MouseEvent e) {
        SetImage.setLabelIcon("img/component/killingTrojansPanel/fullScanDefault.png",fullScanIconLabel);
    }

    private void customIconLabelMouseEntered(MouseEvent e) {
        SetImage.setLabelIcon("img/component/killingTrojansPanel/customScanChoose.png",customIconLabel);
    }

    private void customIconLabelMouseExited(MouseEvent e) {
        SetImage.setLabelIcon("img/component/killingTrojansPanel/customScanDefault.png",customIconLabel);
    }

    private void customIconLabelMousePressed(MouseEvent e) {
        SetImage.setLabelIcon("img/component/killingTrojansPanel/customScanChoose.png",customIconLabel);
    }

    private void customIconLabelMouseReleased(MouseEvent e) {
        SetImage.setLabelIcon("img/component/killingTrojansPanel/customScanDefault.png",customIconLabel);
    }

    private void quickScanIconLabelMouseClicked(MouseEvent e) {
        undone=new Undone(jFrame);
        undone.setVisible(true);
    }

    private void fullScanIconLabelMouseClicked(MouseEvent e) {
        undone=new Undone(jFrame);
        undone.setVisible(true);
    }

    private void customIconLabelMouseClicked(MouseEvent e) {
        undone=new Undone(jFrame);
        undone.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        quickScanIconLabel = new JLabel();
        fullScanIconLabel = new JLabel();
        customIconLabel = new JLabel();

        //======== this ========
        setOpaque(false);
        setPreferredSize(new Dimension(920, 465));
        setLayout(null);

        //---- quickScanIconLabel ----
        quickScanIconLabel.setBackground(null);
        quickScanIconLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                quickScanIconLabelMouseClicked(e);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                quickScanIconLabelMouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                quickScanIconLabelMouseExited(e);
            }
            @Override
            public void mousePressed(MouseEvent e) {
                quickScanIconLabelMousePressed(e);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                quickScanIconLabelMouseReleased(e);
            }
        });
        add(quickScanIconLabel);
        quickScanIconLabel.setBounds(90, 230, 230, 85);

        //---- fullScanIconLabel ----
        fullScanIconLabel.setBackground(null);
        fullScanIconLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                fullScanIconLabelMouseClicked(e);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                fullScanIconLabelMouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                fullScanIconLabelMouseExited(e);
            }
            @Override
            public void mousePressed(MouseEvent e) {
                fullScanIconLabelMousePressed(e);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                fullScanIconLabelMouseReleased(e);
            }
        });
        add(fullScanIconLabel);
        fullScanIconLabel.setBounds(340, 230, 230, 85);

        //---- customIconLabel ----
        customIconLabel.setBackground(null);
        customIconLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                customIconLabelMouseClicked(e);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                customIconLabelMouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                customIconLabelMouseExited(e);
            }
            @Override
            public void mousePressed(MouseEvent e) {
                customIconLabelMousePressed(e);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                customIconLabelMouseReleased(e);
            }
        });
        add(customIconLabel);
        customIconLabel.setBounds(590, 230, 230, 85);

        setPreferredSize(new Dimension(920, 465));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel quickScanIconLabel;
    private JLabel fullScanIconLabel;
    private JLabel customIconLabel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
