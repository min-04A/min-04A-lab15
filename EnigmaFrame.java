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

    }
}
