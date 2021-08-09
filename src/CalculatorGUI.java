import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Stack;

public class CalculatorGUI extends JFrame {
    //라벨과 커스텀패널 객체생성
    CalculatorPanel panel = new CalculatorPanel();
    JLabel label = new JLabel("0");
    //계산기 GUI클래스 생성자
    public CalculatorGUI(){
        initdata();
        layoutInitdata();
        addClickListener();
    }
    //프레임 관련 함수
    public void initdata(){
        this.setTitle("계산기");// 프레임 명을 정한다.
        this.setSize(400,600);// 프레임의 사이즈를 정한다
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);//크기 조절 불가능하게
    }
    //레이아웃 설정 관련 함수
    public void layoutInitdata(){
        label.setOpaque(true);
        label.setBackground(Color.WHITE);

        panel.setPreferredSize(new Dimension(400,400));

        label.setPreferredSize(new Dimension(400,160));
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        label.setHorizontalTextPosition(SwingConstants.SOUTH_EAST);
        label.setFont(new Font("0", Font.PLAIN,50));

        this.add(label,BorderLayout.NORTH);
        this.add(panel,BorderLayout.SOUTH);
    }
    //클릭에 관한 함수
    public void addClickListener(){
        //숫자버튼 클릭 시
        for(int i=0;i<=9;i++){
            panel.btn[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(label.getText().equals("0")){// 초기 화면을 0이라고 잡아놨고
                        label.setText("");          // 다른숫자들을 타이핑했을 때 0이 사라지면서 숫자들이 나열되어야
                    }                               // 상식적이라고 생각했다.
                    String number = e.getActionCommand();
                    label.setText(label.getText() + number);
                }
            });
        }
        //연산자 클릭 시
        for(int i=14;i<=17;i++){
            panel.btn[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(label.getText().equals("0")){
                        label.setText("0");
                    }else{
                        String operator = e.getActionCommand();
                        label.setText(label.getText() + operator);
                    }

                }
            });
        }
        // = 연산
        panel.btn[13].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //split(label.getText());
                System.out.println(postfixToInfix(label.getText()));
                System.out.println(3+6*9-5/8);
            }
        });
    }

    int calculate(String cal){
        int result = 0;
        String[] operator = {"+","-","x","/"};
        Stack<Integer> stack = new Stack<>();
        for(char c : cal.toCharArray()){
            if(Arrays.asList(operator).contains(c+"")){
                int second = stack.pop();
                int first = stack.pop();

                switch (c){
                    case '+':
                        stack.push(second + first);
                        break;
                    case '-':
                        stack.push(second - first);
                        break;
                    case 'x':
                        stack.push(second * first);
                        break;
                    case '/':
                        stack.push(second / first);
                        break;
                }
            }else{
                stack.push(Integer.parseInt(c+""));
            }
        }
        result = stack.pop();
        return result;
    }
    String postfixToInfix(String lab){
        StringBuilder answer = new StringBuilder();
        Stack<String> stack = new Stack<>();
        String[] op = {"+", "-", "x", "/"};
        for(char c : lab.toCharArray()){
            if(Arrays.asList(op).contains(c+"")){
                while(!stack.isEmpty() && compare(c,stack.peek().charAt(0))){
                    answer.append(stack.pop());

                }
                stack.push(c + "");
            }else {
                answer.append(c);
            }
        }
        while (!stack.isEmpty()) {
            answer.append(stack.pop());
        }
        return answer.toString();
    }

    boolean compare(char op1, char op2){
        switch(op1){
            case '+':
                if(op2 == '+' || op2 == '-' || op2 == 'x' || op2 == '/'){
                    return true;
                }
            case '-':
                if(op2 == '+' || op2 == '-' || op2 == 'x' || op2 == '/'){
                    return true;
                }
            case 'x':
                if(op2 == 'x' || op2 == '/'){
                    return true;
                }
            case '/':
                if(op2 == 'x' || op2 == '/'){
                    return true;
                }
        }
        return false;
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
