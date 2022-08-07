package CHAPTER14;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class JCapitals extends JFrame implements ItemListener {
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        JLabel countryLabel = new JLabel("Select a country");
        JComboBox<String> countryBox = new JComboBox<String>();
        JTextField capitalField = new JTextField(25);
        
        HashMap<String, String> capitals = new HashMap<>();
        
        public JCapitals() {

                capitals.put("Austria", "Vienna");
                capitals.put("Canada", "Toronto");
                capitals.put("England", "London");
                capitals.put("France", "Paris");
                capitals.put("Italy", "Rome");
                capitals.put("Mexico", "Mexico City");
                capitals.put("Spain", "Madrid");
                
                setLayout(flow);
                
                add(countryLabel);
                add(countryBox);
                add(capitalField);
                
                for(String k: capitals.keySet()) {
                        countryBox.insertItemAt(k, 0);
                }
                countryBox.addItemListener(this);
                
        }

        public static void main(String[] arguments) {
                JCapitals cframe = new JCapitals();
                cframe.setSize(400, 150);
                cframe.setVisible(true);
        }

        @Override
        public void itemStateChanged(ItemEvent list) {
        if (list.getStateChange() == 1) {
                capitalField.setText(capitals.getOrDefault(countryBox.getSelectedItem().toString(), ""));
        }
        }
}
