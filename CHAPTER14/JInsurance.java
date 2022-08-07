package CHAPTER14;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JInsurance extends JFrame implements ItemListener {

	FlowLayout flow = new FlowLayout();
	ButtonGroup insGrp = new ButtonGroup();
	JCheckBox hmo = new JCheckBox("HMO", false);
	JCheckBox ppo = new JCheckBox("PPO", false);
	JCheckBox dental = new JCheckBox("Dental", false);
	JCheckBox vision = new JCheckBox("Vision", false);
	JTextField insChoice = new JTextField(20);
	String output, insChosen;

	public JInsurance() {
		setLayout(flow);
		insGrp.add(hmo);
		insGrp.add(ppo);
		add(hmo);
		add(ppo);
		add(dental);
		add(vision);
		add(insChoice);
		hmo.addItemListener(this);
		ppo.addItemListener(this);
		dental.addItemListener(this);
		vision.addItemListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] arguments) {
		JInsurance iFrame = new JInsurance();
		iFrame.setSize(400, 100);
		iFrame.setVisible(true);
	}

	@Override

	public void itemStateChanged(ItemEvent check) {
		insChosen = "";
		output = "";
		if (check.getSource().equals(hmo)) {
			if (hmo.isSelected()) {
				insChosen = "hmo $200/month is selected";
			}
			insChoice.setText(insChosen);
		}
		else if (check.getSource().equals(ppo)) {
			if (ppo.isSelected()) {
				insChosen = "ppo $600/month is selecte";
			}
			insChoice.setText(insChosen);
		} else if (check.getSource().equals(dental)) {
			if (dental.isSelected()) {
				output = "dental $75 additional/month is selecte";
			}
			insChoice.setText(output);
		} else if (check.getSource().equals(vision)) {
			if (vision.isSelected()) {
				output = "vision $20 additional/month is selecte";
			}
			insChoice.setText(output);
		}
	}
}

