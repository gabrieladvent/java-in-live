package Testing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class BloodPressurePredictionGUI extends JFrame {

    private JLabel titleLabel;
    private JLabel dataInputLabel;
    private JTextField dataInputField;
    private JButton predictButton;
    private JTextArea resultArea;

    public BloodPressurePredictionGUI() {
        super("Blood Pressure Prediction");

        titleLabel = new JLabel("Blood Pressure Prediction");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        dataInputLabel = new JLabel("Enter Blood Pressure Data:");
        dataInputField = new JTextField(10);

        predictButton = new JButton("Predict");
        predictButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                predictButtonClicked();
            }
        });

        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(titleLabel, BorderLayout.NORTH);
        mainPanel.add(dataInputLabel, BorderLayout.WEST);
        mainPanel.add(dataInputField, BorderLayout.CENTER);
        mainPanel.add(predictButton, BorderLayout.EAST);
        mainPanel.add(scrollPane, BorderLayout.SOUTH);

        setContentPane(mainPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void predictButtonClicked() {
        String input = dataInputField.getText().trim();
        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter blood pressure data.",
                    "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String[] dataValues = input.split("\\s+");
        int[] bloodPressures = new int[dataValues.length];
        for (int i = 0; i < dataValues.length; i++) {
            try {
                bloodPressures[i] = Integer.parseInt(dataValues[i]);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter valid blood pressure data.",
                        "Invalid Input", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        int normalCount = 0;
        int preHypertensionCount = 0;
        int hypertension1Count = 0;
        int hypertension2Count = 0;

        for (int bloodPressure : bloodPressures) {
            String prediction = calculatePrediction(bloodPressure);

            switch (prediction) {
                case "Normal":
                    normalCount++;
                    break;
                case "Pre-Hipertensi":
                    preHypertensionCount++;
                    break;
                case "Hipertensi Stage 1":
                    hypertension1Count++;
                    break;
                case "Hipertensi Stage 2":
                    hypertension2Count++;
                    break;
            }
        }

        int totalCount = bloodPressures.length;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append("Prediction Results:\n");
        resultBuilder.append("Normal: ").append(decimalFormat.format((double) normalCount / totalCount * 100)).append("%\n");
        resultBuilder.append("Pre-Hypertension: ").append(decimalFormat.format((double) preHypertensionCount / totalCount * 100)).append("%\n");
        resultBuilder.append("Hypertension Stage 1: ").append(decimalFormat.format((double) hypertension1Count / totalCount * 100)).append("%\n");
        resultBuilder.append("Hypertension Stage 2: ").append(decimalFormat.format((double) hypertension2Count / totalCount * 100)).append("%\n");

        int maxCount = Math.max(Math.max(normalCount, preHypertensionCount), Math.max(hypertension1Count, hypertension2Count));
        resultBuilder.append("\nHighest Probability:\n");
        if (normalCount == maxCount) {
            resultBuilder.append("Normal\n");
        }
        if (preHypertensionCount == maxCount) {
            resultBuilder.append("Pre-Hypertension\n");
        }
        if (hypertension1Count == maxCount) {
            resultBuilder.append("Hypertension Stage 1\n");
        }
        if (hypertension2Count == maxCount) {
            resultBuilder.append("Hypertension Stage 2\n");
        }

        resultArea.setText(resultBuilder.toString());
    }

    public static String calculatePrediction(int bloodPressure) {
        if (bloodPressure < 120) {
            return "Normal";
        } else if (bloodPressure >= 120 && bloodPressure <= 139) {
            return "Pre-Hipertensi";
        } else if (bloodPressure >= 140 && bloodPressure <= 159) {
            return "Hipertensi Stage 1";
        } else {
            return "Hipertensi Stage 2";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BloodPressurePredictionGUI().setVisible(true);
            }
        });
    }
}
