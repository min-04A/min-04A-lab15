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
        JPanel topPanel = new JPanel(new GridLayout(1, 10, 5, 5));

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
        encryptButton = new JButton("Encrypt");
        topPanel.add(encryptButton);
        decryptButton = new JButton("Decrypt");
        topPanel.add(decryptButton);

        // Create center panel
        JPanel centerPanel = new JPanel(new GridLayout(2, 1));
        
        // Panel for input
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(new JLabel("Input"), BorderLayout.WEST);
        inArea = new JTextArea(4, 40);
        inputPanel.add(new JScrollPane(inArea), BorderLayout.CENTER);

        // Panel for output 
        JPanel outputPanel = new JPanel(new BorderLayout());
        outputPanel.add(new JLabel("Output"), BorderLayout.WEST);
        outArea = new JTextArea(4, 40);
        outArea.setEditable(false);
        outputPanel.add(new JScrollPane(outArea), BorderLayout.CENTER);

        // Add input and output panels
        centerPanel.add(inputPanel);
        centerPanel.add(outputPanel);

        
    }

    // Give 5 numbers for users to choose
    private Integer[] getRotorNumbers() 
    {
        return new Integer[]{1, 2, 3, 4, 5};
    }
}
