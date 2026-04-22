import javax.swing.JOptionPane;

/**
 * Lab 01 - Exercise 2.2.5
 * Chương trình tính tổng, hiệu, tích, thương của 2 số thực nhập từ người dùng.
 */
public class CalculateTwoNumbers {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog(null, 
            "Please input the first number: ", "Input first number", 
            JOptionPane.INFORMATION_MESSAGE);
        
        String strNum2 = JOptionPane.showInputDialog(null, 
            "Please input the second number: ", "Input second number", 
            JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;
        
        String result = "Results for " + num1 + " and " + num2 + ":\n";
        result += "Sum: " + sum + "\n";
        result += "Difference: " + diff + "\n";
        result += "Product: " + product + "\n";

        if (num2 != 0) {
            double quotient = num1 / num2;
            result += "Quotient: " + quotient;
        } else {
            result += "Quotient: Cannot divide by zero!";
        }

        // Hiển thị kết quả
        JOptionPane.showMessageDialog(null, result, 
            "Calculation Results", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}