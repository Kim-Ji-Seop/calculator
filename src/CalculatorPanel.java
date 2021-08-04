import javax.swing.*;
import java.awt.*;

public class CalculatorPanel extends JPanel {
    JButton bt1 = new JButton("C");
    JButton bt2 = new JButton("√");
    JButton bt3 = new JButton("<-");
    JButton bt4 = new JButton("/");
    JButton bt5 = new JButton("1");
    JButton bt6 = new JButton("2");
    JButton bt7 = new JButton("3");
    JButton bt8 = new JButton("*");
    JButton bt9 = new JButton("4");
    JButton bt10 = new JButton("5");
    JButton bt11 = new JButton("6");
    JButton bt12 = new JButton("-");
    JButton bt13 = new JButton("7");
    JButton bt14 = new JButton("8");
    JButton bt15 = new JButton("9");
    JButton bt16 = new JButton("+");
    JButton bt17 = new JButton("+/-");
    JButton bt18 = new JButton("0");
    JButton bt19 = new JButton(".");
    JButton bt20 = new JButton("=");
    public CalculatorPanel(){
        this.setLayout(new GridLayout(5,4));
        //this.setSize(400,400);
        this.add(bt1);this.add(bt2);this.add(bt3);this.add(bt4);
        this.add(bt5);this.add(bt6);this.add(bt7);this.add(bt8);
        this.add(bt9);this.add(bt10);this.add(bt11);this.add(bt12);
        this.add(bt13);this.add(bt14);this.add(bt15);this.add(bt16);
        this.add(bt17);this.add(bt18);this.add(bt19);this.add(bt20);
    }
}
