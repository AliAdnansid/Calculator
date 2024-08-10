import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScientificCalculator {

    //Members
    static JFrame frame;
    static JTextField textField;
    static JButton [] numberButtons = new JButton[10];
    static JButton [] functionButtons = new JButton[12];
    static JButton addBtn,subBtn,mulBtn,divBtn,eqBtn,decBtn,clrBtn,delBtn,sinBtn,cosBtn,sqrtBtn,tanBtn;
    static JPanel panel;
    static double num1=0,num2=0,result=0;
    static String operator;

    public static void main(String[] args) {

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500,100,400,600);
        frame.setLayout(null);
        frame.setVisible(true);
        Border lineBorder = BorderFactory.createLineBorder(Color.BLACK, 4);
        Font myfont = new Font("my font",Font.BOLD,30);
        textField = new JTextField();
        textField.setBounds(40,25,350,70);
        textField.setBackground(Color.WHITE);
        textField.setBorder(lineBorder);
        textField.setFont(myfont);
        textField.setEditable(false);

        addBtn = new JButton("+");
        subBtn = new JButton("-");
        mulBtn = new JButton("*");
        divBtn = new JButton("/");
        clrBtn = new JButton("Clear");
        delBtn = new JButton("Delete");
        decBtn = new JButton(".");
        eqBtn = new JButton("=");
        sinBtn = new JButton("Sin");
        cosBtn = new JButton("Cos");
        tanBtn = new JButton("Tan");
        sqrtBtn = new JButton("\u221A");

        functionButtons[0] = addBtn;
        functionButtons[1] = subBtn;
        functionButtons[2] = mulBtn;
        functionButtons[3] = divBtn;
        functionButtons[4] = decBtn;
        functionButtons[5] = eqBtn;
        functionButtons[6] = delBtn;
        functionButtons[7] = clrBtn;
        functionButtons[8] = sinBtn;
        functionButtons[9] = cosBtn;
        functionButtons[10] = tanBtn;
        functionButtons[11] = sqrtBtn;


        for (int i = 0; i < 8; i++) {
            functionButtons[i].setFont(myfont);
            functionButtons[i].setBackground(Color.orange);
            functionButtons[i].setFocusable(false);
        }

        functionButtons[8].setBackground(Color.orange);
        functionButtons[9].setBackground(Color.orange);
        functionButtons[10].setBackground(Color.orange);
        functionButtons[11].setBackground(Color.orange);



        for (int i = 0; i <10 ; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(myfont);
            numberButtons[i].setBackground(Color.WHITE);
            numberButtons[i].setFocusable(false);
        }
        delBtn.setBounds(45,475,150,50);
        clrBtn.setBounds(235,475,150,50);
        delBtn.setBorder(lineBorder);
        clrBtn.setBorder(lineBorder);

        panel = new JPanel();
        panel.setBounds(40,100,350,350);
        panel.setLayout(new GridLayout(4,5,5,5));
        panel.setBackground(Color.black);

        panel.setBorder(lineBorder);
        panel.setVisible(true);

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addBtn);
        panel.add(sinBtn);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subBtn);
        panel.add(cosBtn);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulBtn);
        panel.add(tanBtn);
        panel.add(decBtn);
        panel.add(numberButtons[0]);
        panel.add(divBtn);
        panel.add(eqBtn);
        panel.add(sqrtBtn);
        frame.add(textField);
        frame.add(delBtn);
        frame.add(clrBtn);
        frame.add(panel);
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            numberButtons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText()+numberButtons[finalI].getText());
                }
            });
        }
        decBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText()+".");
            }
        });
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                operator = "+";
                textField.setText("");
            }
        });
        subBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                operator = "-";
                textField.setText("");
            }
        });
        mulBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                operator = "*";
                textField.setText("");
            }
        });
        divBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                operator = "/";
                textField.setText("");
            }
        });
        sinBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                operator = "Sin";
                textField.setText(num1+"");
            }
        });
        cosBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                operator = "Cos";
                textField.setText(num1+"");
            }
        });
        tanBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                operator = "Tan";
                textField.setText(num1+"");
            }
        });
        sqrtBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                operator = "\u221A";
                textField.setText(num1+"");
            }
        });
        eqBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(textField.getText());
                switch (operator){
                    case "+":{
                        result = num1+num2;
                        break;
                    }
                    case "-":{
                        result = num1-num2;
                        break;
                    }
                    case "*":{
                        result = num1*num2;
                        break;
                    }
                    case "/":{
                        result = num1/num2;
                        break;
                    }
                    case "Sin":{
                        result = Math.sin(num1);
                        break;
                    }
                    case "Cos":{
                        result = Math.cos(num1);
                        break;
                    }
                    case "Tan":{
                        result = Math.tan(num1);
                        break;
                    }
                    case "Sqrt":{
                        result = Math.sqrt(num1);
                        break;
                    }
                }
                textField.setText(result+"");
                num1 = result;
            }
        });
        clrBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        delBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textField.getText().isEmpty()==false) {
                    String txt = textField.getText();//123
                    textField.setText("");
                    textField.setText(txt.substring(0, txt.length() - 1));
                }

            }
        });




    }
}





