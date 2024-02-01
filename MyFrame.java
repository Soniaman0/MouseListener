import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    //Images.
    JLabel Label;
    ImageIcon smile;
    ImageIcon nervous;
    ImageIcon dizzy;
    ImageIcon pain;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        Label = new JLabel();
        Label.addMouseListener(this);

        smile = new ImageIcon("smile.png");
        dizzy = new ImageIcon("pngimg.com - smiley_PNG36230.png");
        pain = new ImageIcon("pain.jpg");
        nervous = new ImageIcon("nervious.png");

        Label.setIcon(smile);

        this.add(Label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    //MouseListener
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        Label.setIcon(pain);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Label.setIcon(dizzy);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Label.setIcon(nervous);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Label.setIcon(smile);
    }
}
