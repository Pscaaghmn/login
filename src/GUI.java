import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JPanel implements ActionListener, DocumentListener {
    // canvas for other GUI widgets

    JButton button1;
    JButton button2;

    public GUI(int width, int height) {
        System.out.println("SQUENCE: GUI constructor");
        this.setPreferredSize(new Dimension(width, height));
        setLayout(null);
        button1 = new JButton("b1");
        button1.setBounds(0,0, 100, 40);
        button2 = new JButton("b2");
        button2.setBounds(120,0, 100, 40);
        add(button1);
        add(button2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void insertUpdate(DocumentEvent e) {

    }

    @Override
    public void removeUpdate(DocumentEvent e) {

    }

    @Override
    public void changedUpdate(DocumentEvent e) {

    }
}
