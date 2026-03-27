import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, 
                "Do you want to change to the first class ticket?");
        
        JOptionPane.showMessageDialog(null, "You've chosen: " 
                + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));

        String[] customOptions = {"I do", "I don't"};
        int customChoice = JOptionPane.showOptionDialog(null, 
                "Do you agree with the terms?", 
                "Custom Option",
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                customOptions, 
                customOptions[0]);

        JOptionPane.showMessageDialog(null, "You've chosen: " 
                + (customChoice == JOptionPane.YES_OPTION ? "I do" : "I don't"));

        System.exit(0);
    }
}