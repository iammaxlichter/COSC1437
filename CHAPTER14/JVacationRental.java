package CHAPTER14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JVacationRental extends JFrame implements ItemListener {

    final static int SIZE = 300;
    final int PARK_PRICE = 600, POOL_PRICE = 750, LAKE_PRICE = 825;
    int totalPrice = 0;

    FlowLayout flow = new FlowLayout();

    String companyName = new String("Lambert's Vacation Rentals");

    Font font = new Font("Arial", Font.PLAIN, 24);

    ButtonGroup locationGroup = new ButtonGroup();
    JCheckBox parkBox = new JCheckBox("Parkside", false);
    JCheckBox poolBox = new JCheckBox("Poolside", false);
    JCheckBox lakeBox = new JCheckBox("Lakeside", false);

    final int ONE_PRICE = 0, TWO_PRICE = 75, THREE_PRICE = 150;
    ButtonGroup bedGroup = new ButtonGroup();
    JCheckBox oneBox = new JCheckBox("1 bedroom", false);
    JCheckBox twoBox = new JCheckBox("2 bedrooms", false);
    JCheckBox threeBox = new JCheckBox("3 bedrooms", false);

    final int NO_MEAL_PRICE = 0, MEAL_PRICE = 200;
    ButtonGroup mealGroup = new ButtonGroup();
    JCheckBox noMealsBox = new JCheckBox("No meals", false);
    JCheckBox mealsBox = new JCheckBox("Meals", false);

    JTextField totPrice = new JTextField(10);
    String output;

    public JVacationRental() {

        super("Vacation Rentals");
        setSize(SIZE,SIZE);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);

        locationGroup.add(parkBox);
        parkBox.addItemListener(this);
        locationGroup.add(poolBox);
        poolBox.addItemListener(this);
        locationGroup.add(lakeBox);
        lakeBox.addItemListener(this);

        add(parkBox);
        add(poolBox);
        add(lakeBox);

        bedGroup.add(oneBox);
        oneBox.addItemListener(this);
        bedGroup.add(twoBox);
        twoBox.addItemListener(this);
        bedGroup.add(threeBox);
        threeBox.addItemListener(this);

        add(oneBox);
        add(twoBox);
        add(threeBox);

        mealGroup.add(noMealsBox);
        noMealsBox.addItemListener(this);
        mealGroup.add(mealsBox);
        mealsBox.addItemListener(this);

        add(noMealsBox);
        add(mealsBox);

        add(totPrice);
        totPrice.setText("0.00");

    }

public void itemStateChanged(ItemEvent check) {

    Object source = check.getItem();

    if(source == parkBox) {
        int select = check.getStateChange();
        if(select == ItemEvent.SELECTED) {
            totalPrice += PARK_PRICE;
        }
        else {
            if(select == ItemEvent.DESELECTED) {
                totalPrice -= PARK_PRICE;
            }
        }

        output = "" + totalPrice;
        totPrice.setText(output);
    }

    if(source == poolBox) {
        int select = check.getStateChange();
            if(select == ItemEvent.SELECTED) {
                totalPrice += POOL_PRICE;
            }
            else {
                if(select == ItemEvent.DESELECTED) {
                    totalPrice -= POOL_PRICE;
                }
            }

        output = "" + totalPrice;
        totPrice.setText(output);
    }

    if(source == lakeBox) {
        int select = check.getStateChange();
        if(select == ItemEvent.SELECTED) {
            totalPrice += LAKE_PRICE;
        }
        else {
            if(select == ItemEvent.DESELECTED) {
                totalPrice -= LAKE_PRICE;
            }
        }

        output = "" + totalPrice;
        totPrice.setText(output);
    }

    if(source == oneBox) {
        int select = check.getStateChange();
        if(select == ItemEvent.SELECTED) {
            totalPrice += ONE_PRICE;
        }
        else {
            if(select == ItemEvent.DESELECTED) {
                totalPrice -= ONE_PRICE;
            }
        }

    output = "" + totalPrice;
    totPrice.setText(output);
    }

    if(source == twoBox) {
        int select = check.getStateChange();
        if(select == ItemEvent.SELECTED) {
            totalPrice += TWO_PRICE;
        }
        else {
            if(select == ItemEvent.DESELECTED) {
                totalPrice -= TWO_PRICE;
            }
        }

    output = "" + totalPrice;
    totPrice.setText(output);
    }


    if(source == threeBox) {
        int select = check.getStateChange();
        if(select == ItemEvent.SELECTED) {
            totalPrice += THREE_PRICE;
        }
        else {
            if(select == ItemEvent.DESELECTED) {
                totalPrice -= THREE_PRICE;
            }
        }

    output = "" + totalPrice;
    totPrice.setText(output);
    }


    if(source == noMealsBox) {
        int select = check.getStateChange();
        if(select == ItemEvent.SELECTED) {
            totalPrice += NO_MEAL_PRICE;
        }
        else {
            if(select == ItemEvent.DESELECTED) {
                totalPrice -= NO_MEAL_PRICE;
            }
        }

    output = "" + totalPrice;
    totPrice.setText(output);
    }


    if(source == mealsBox) {
        int select = check.getStateChange();
        if(select == ItemEvent.SELECTED) {
            totalPrice += MEAL_PRICE;
        }
        else {
            if(select == ItemEvent.DESELECTED) {
                totalPrice -= MEAL_PRICE;
            }
        }

    output = "" + totalPrice;
    totPrice.setText(output);
    }
}

    public static void main(String[] args) {
        JVacationRental vacationFrame = new JVacationRental();
        vacationFrame.setVisible((true));
    }
}
