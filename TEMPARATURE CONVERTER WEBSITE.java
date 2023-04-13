import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter extends JFrame implements ActionListener {
    private JLabel inputLabel, outputLabel, resultLabel;
    private JTextField inputField;
    private JComboBox<String> inputUnit, outputUnit;
    private JButton convertButton;

    public TemperatureConverter() {
        setTitle("Temperature Converter");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        inputLabel = new JLabel("Input Temperature:");
        inputField = new JTextField();
        inputUnit = new JComboBox<>(new String[] {"Celsius", "Fahrenheit"});
        outputLabel = new JLabel("Output Temperature:");
        outputUnit = new JComboBox<>(new String[] {"Fahrenheit", "Celsius"});
        convertButton = new JButton("Convert");
        resultLabel = new JLabel("");

        add(inputLabel);
        add(inputField);
        add(inputUnit);
        add(outputLabel);
        add(outputUnit);
        add(convertButton);
        add(resultLabel);

        convertButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double inputTemperature = Double.parseDouble(inputField.getText());

            if (inputUnit.getSelectedIndex() == 0) { // Celsius to Fahrenheit
                double outputTemperature = (inputTemperature * 9/5) + 32;
                resultLabel.setText(inputTemperature + " Celsius = " + outputTemperature + " Fahrenheit");
            } else { // Fahrenheit to Celsius
                double outputTemperature = (inputTemperature - 32) * 5/9;
                resultLabel.setText(inputTemperature + " Fahrenheit = " + outputTemperature + " Celsius");
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid Input");
        }
    }