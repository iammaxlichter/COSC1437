package CHAPTER14;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JDorm extends JFrame implements ItemListener
{
  FlowLayout flow = new FlowLayout();
  JCheckBox privateRm = new JCheckBox("Private");
  JCheckBox internet = new JCheckBox("Internet");
  JCheckBox cable = new JCheckBox("Cable TV");
  JCheckBox microwave = new JCheckBox("Microwave");
  JCheckBox refrigerator = new JCheckBox("Refrigerator");
  JTextArea outArea = new JTextArea(5,10);
  String dormOption;
  String output;

 public JDorm()
  {
        super("Check Box");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane = new JPanel();
        pane.setLayout(flow);
    pane.add(privateRm);
    privateRm.addItemListener(this);
    pane.add(internet);
    internet.addItemListener(this);
    pane.add(cable);
    cable.addItemListener(this);
    pane.add(microwave);
    microwave.addItemListener(this);
    pane.add(refrigerator);
    refrigerator.addItemListener(this);
    pane.add(outArea);
    setContentPane(pane);
  }
  public static void main(String[] arguments)
  {
    JDorm dFrame = new JDorm();
    dFrame.setSize(450,300);
    dFrame.setVisible(true);
  }
  public void itemStateChanged(ItemEvent check)
  {
    Object source = check.getItem();
    if (source == privateRm)
        {
                int select = check.getStateChange();
                if(select == ItemEvent.SELECTED) {
                        dormOption = "Private Room";
                        output = " " + dormOption;
                        outArea.append(output);
                }
    }
    if (source == cable)
        {
                int select = check.getStateChange();
                if(select == ItemEvent.SELECTED) {
                        dormOption = "\nCable TV";
                        output = " " + dormOption;
                        outArea.append(output);
                }
    }
   if (source == internet)
        {
                int select = check.getStateChange();
                if(select == ItemEvent.SELECTED) {
                        dormOption = "\nInternet Connection";
                        output = " " + dormOption;
                        outArea.append(output);
                }
    }
   if (source == microwave)
        {
                int select = check.getStateChange();
                if(select == ItemEvent.SELECTED) {
                        dormOption = "\nMicrowave";
                        output = " " + dormOption;
                        outArea.append(output);
                }
   }
   if (source == refrigerator)
        {
                int select = check.getStateChange();
                if(select == ItemEvent.SELECTED) {
                        dormOption = "\nRefrigerator";
                        output = " " + dormOption;
                        outArea.append(output);
                }
    }

 }
}
