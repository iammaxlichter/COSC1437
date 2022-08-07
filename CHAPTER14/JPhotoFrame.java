package CHAPTER14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JPhotoFrame extends JFrame implements ItemListener {

    FlowLayout flow = new FlowLayout();
    JCheckBox locBox = new JCheckBox("On location", false);
    JCheckBox studioBox = new JCheckBox("In studio", false);

    JCheckBox oneBox = new JCheckBox("One human subject ", false);
    JCheckBox moreBox = new JCheckBox("Two or more human subjects ", false);
    JCheckBox petBox = new JCheckBox("Pet subject ", false);

    JLabel mainLabel = new JLabel("Paula's Portaits");
    Font font = new Font("Ariel", Font.ITALIC, 30);
    JLabel label2 = new JLabel("Portait fee");
    JLabel label1 = new JLabel("Select options");
    JTextField totPrice = new JTextField(10);
    String output;
    final double LOC_PRICE = 90.00;

    double ONE_HUMAN_SUBJECT_PRICE = 40.00;
    double MORE_HUMAN_SUBJECTS_PRICE = 75.00;
    double PET_SUBJECT_PRICE = 95.00;

    double locPrice = 0.00;
    double subPrice = 0.0;

    public JPhotoFrame() {
        setTitle("PhotoFrame");
        setLayout(flow);
        add(mainLabel);
        add(label1);
        ButtonGroup gp=new ButtonGroup();
        gp.add(locBox);
        gp.add(studioBox);

        locBox.addItemListener(this);
        add(locBox);

        studioBox.addItemListener(this);
        add(studioBox);

        oneBox.addItemListener(this);
        add(oneBox);

        moreBox.addItemListener(this);
        add(moreBox);

        petBox.addItemListener(this);
        add(petBox);
        add(label2);

        add(totPrice);
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent check) {
        subPrice=0;
        if(studioBox.isSelected()) {
            subPrice=subPrice+40.00;
        }
        else if(locBox.isSelected()) {
            subPrice=subPrice+LOC_PRICE;
        }

        if(oneBox.isSelected()) {
            subPrice=subPrice+ONE_HUMAN_SUBJECT_PRICE;
        }

        if(moreBox.isSelected()) {
            subPrice=subPrice+MORE_HUMAN_SUBJECTS_PRICE;
        }
        if(petBox.isSelected()) {
            subPrice=subPrice+PET_SUBJECT_PRICE;
        }

        totPrice.setText(String.format("%.2f", subPrice));
    }


    public static void main(String[] args) {
        JPhotoFrame frame = new JPhotoFrame();
        frame.setSize(320, 250);
        frame.setVisible(true);
    }
}
