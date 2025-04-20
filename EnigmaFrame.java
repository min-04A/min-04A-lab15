import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EnigmaFrame extends JFrame
{
    private JComboBox<Integer> innerRotor;
    private JComboBox<Integer> midRotor;
    private JComboBox<Integer> outerRotor;
    private JTextField initialPosition;
    private JTextArea inArea;
    private JTextArea outArea;
    private JButton encryptButton;
    private JButton decryptButton;

    public EnigmaFrame()
    {
        setTitle("Enigma GUI"); // set title
        setSize(1200, 400); // set size of frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // available to close window
        setLayout(new BorderLayout()); // set layout of panel

        // Create top panel with flow layout and add GUI elements
        JPanel topPanel = new JPanel(new FlowLayout()); 

        // Need getRotorNumbers to make users to choose three rotors
        innerRotor = new JComboBox<>(getRotorNumbers());
        midRotor = new JComboBox<>(getRotorNumbers());
        outerRotor = new JComboBox<>(getRotorNumbers());

        // Make a space for users to type three letters to start with
        initialPosition = new JTextField(3);

        // Add elements
        topPanel.add(new JLabel("Inner"));
        topPanel.add(innerRotor);
        topPanel.add(new JLabel("Middle"));
        topPanel.add(midRotor);
        topPanel.add(new JLabel("Out"));
        topPanel.add(outerRotor);
        topPanel.add(new JLabel("Initial Positions"));
        topPanel.add(initialPosition);
    }

    // Give 5 numbers for users to choose
    private Integer[] getRotorNumbers() 
    {
        return new Integer[]{1, 2, 3, 4, 5};
    }
}
