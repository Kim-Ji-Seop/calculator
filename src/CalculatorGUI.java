import javax.swing.*;
import java.awt.*;

public class CalculatorGUI extends JFrame {
    CalculatorPanel panel;
    JLabel label;
    public CalculatorGUI(){
        initdata();
        layoutInitdata();
    }
    public void initdata(){
        this.setTitle("계산기");// 프레임 명을 정한다.
        this.setSize(400,600);// 프레임의 사이즈를 정한다
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);//크기 조절 불가능하게
        panel = new CalculatorPanel();
        label = new JLabel("0");
        label.setOpaque(true);
        label.setBackground(Color.WHITE);
        //label.setForeground(Color.WHITE);
    }
    public void layoutInitdata(){

        panel.setPreferredSize(new Dimension(400,400));

        label.setPreferredSize(new Dimension(400,160));
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        label.setHorizontalTextPosition(SwingConstants.SOUTH_EAST);
        label.setFont(new Font("0", Font.PLAIN,50));

        this.add(label,BorderLayout.NORTH);
        this.add(panel,BorderLayout.SOUTH);
    }
    int plus(int a,int b){
        return a+b;
    }
    int minus(int a, int b){
        return a-b;
    }
    int multiply(int a, int b){
        return a*b;
    }
    float divide(float a, float b){
        return a/b;
    }

}
