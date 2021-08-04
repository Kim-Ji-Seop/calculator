import javax.swing.*;
import java.awt.*;

public class CalculatorPanel extends JPanel {
    JButton[] btn = new JButton[20];
    public CalculatorPanel(){
        initData();
    }
    public void initData(){
        this.setLayout(new GridLayout(5,4));
        btn[0] = new JButton("0");
        btn[1] = new JButton("1");
        btn[2] = new JButton("2");
        btn[3] = new JButton("3");
        btn[4] = new JButton("4");
        btn[5] = new JButton("5");
        btn[6] = new JButton("6");
        btn[7] = new JButton("7");
        btn[8] = new JButton("8");
        btn[9] = new JButton("9");
        btn[10] = new JButton("C");
        btn[11] = new JButton("√");
        btn[12] = new JButton("<-");
        btn[13] = new JButton("=");
        btn[14] = new JButton("+");
        btn[15] = new JButton("-");
        btn[16] = new JButton("x");
        btn[17] = new JButton("/");
        btn[18] = new JButton("+/-");
        btn[19] = new JButton(".");

        this.add(btn[10]);  this.add(btn[11]);  this.add(btn[12]);  this.add(btn[14]);
        this.add(btn[1]);   this.add(btn[2]);   this.add(btn[3]);   this.add(btn[15]);
        this.add(btn[4]);   this.add(btn[5]);   this.add(btn[6]);   this.add(btn[16]);
        this.add(btn[7]);   this.add(btn[8]);   this.add(btn[9]);   this.add(btn[17]);
        this.add(btn[18]);  this.add(btn[0]);   this.add(btn[19]);  this.add(btn[13]);
    }
}

