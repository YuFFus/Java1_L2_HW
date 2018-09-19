import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
 
public class CalcSkin extends JFrame{

    JPanel topSubPanel;
    JPanel middlePanel;
    JPanel numSubPanel;
    int operation = 0;
    float operand1 = 0.0f;
    float operand2 = 0.0f;
    float result = 0.0f;
    boolean isOperationSet = false;
    boolean isCycleOn = false;
    
    public CalcSkin(String title){
        super(title);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(270, 325);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        
        Num num = new Num();
        
        topSubPanel = new JPanel();
        numSubPanel = new JPanel();
        
        topSubPanel.setPreferredSize(new Dimension(250, 25));
        topSubPanel.setOpaque(true);
        topSubPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        
        
        numSubPanel.setPreferredSize(new Dimension(250, 250));
        numSubPanel.setOpaque(true);
        numSubPanel.setLayout(new GridLayout(5, 4, 5, 5));
        
        JLabel jlbl = new JLabel("0");
        jlbl.setAlignmentY(JComponent.LEFT_ALIGNMENT);

        JButton jbtn1 = new JButton("1");
        JButton jbtn2 = new JButton("2");
        JButton jbtn3 = new JButton("3");
        JButton jbtn4 = new JButton("4");
        JButton jbtn5 = new JButton("5");
        JButton jbtn6 = new JButton("6");
        JButton jbtn7 = new JButton("7");
        JButton jbtn8 = new JButton("8");
        JButton jbtn9 = new JButton("9");
        JButton jbtn11 = new JButton("+/-");
        JButton jbtn0 = new JButton("0");
        JButton jbtnDot = new JButton(".");
        JButton jbtn12 = new JButton("+");
        JButton jbtn13 = new JButton("-");
        JButton jbtn14 = new JButton("/");
        JButton jbtnMultiple = new JButton("*");
        JButton jbtnC = new JButton("C");
        JButton jbtnDelLast = new JButton("<");
        JButton jbtnEq = new JButton("=");
        JButton jbtnBlank = new JButton();
                
        numSubPanel.add(jbtnBlank);
        numSubPanel.add(jbtnC);
        numSubPanel.add(jbtnDelLast);
        numSubPanel.add(jbtnEq);
        numSubPanel.add(jbtn7);
        numSubPanel.add(jbtn8);
        numSubPanel.add(jbtn9);
        numSubPanel.add(jbtn12);
        numSubPanel.add(jbtn4);
        numSubPanel.add(jbtn5);
        numSubPanel.add(jbtn6);
        numSubPanel.add(jbtn13);
        numSubPanel.add(jbtn1);
        numSubPanel.add(jbtn2);
        numSubPanel.add(jbtn3);
        numSubPanel.add(jbtn14);
        numSubPanel.add(jbtn11);
        numSubPanel.add(jbtn0);
        numSubPanel.add(jbtnDot);
        numSubPanel.add(jbtnMultiple);
        
        topSubPanel.add(jlbl);
        
        getContentPane().add(topSubPanel);
        getContentPane().add(numSubPanel);
        
        setVisible(true);
        
        jbtn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (isCycleOn){
                    num.clear();
                    isCycleOn = false;
                }
                num.add('1');
                jlbl.setText(String.valueOf(num.num));
            }
        });
        
        jbtn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (isCycleOn){
                    num.clear();
                    isCycleOn = false;
                }
                num.add('2');
                jlbl.setText(String.valueOf(num.num));
            }
        });
        jbtn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (isCycleOn){
                    num.clear();
                    isCycleOn = false;
                }
                num.add('3');
                jlbl.setText(String.valueOf(num.num));
            }
        });
        jbtn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (isCycleOn){
                    num.clear();
                    isCycleOn = false;
                }
                num.add('4');
                jlbl.setText(String.valueOf(num.num));
            }
        });
        jbtn5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (isCycleOn){
                    num.clear();
                    isCycleOn = false;
                }
                num.add('5');
                jlbl.setText(String.valueOf(num.num));
            }
        });
        jbtn6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (isCycleOn){
                    num.clear();
                    isCycleOn = false;
                }
                num.add('6');
                jlbl.setText(String.valueOf(num.num));
            }
        });
        jbtn7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (isCycleOn){
                    num.clear();
                    isCycleOn = false;
                }
                num.add('7');
                jlbl.setText(String.valueOf(num.num));
            }
        });
        jbtn8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (isCycleOn){
                    num.clear();
                    isCycleOn = false;
                }
                num.add('8');
                jlbl.setText(String.valueOf(num.num));
            }
        });
        jbtn9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (isCycleOn){
                    num.clear();
                    isCycleOn = false;
                }
                num.add('9');
                jlbl.setText(String.valueOf(num.num));
            }
        });
        jbtn0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (isCycleOn){
                    num.clear();
                    isCycleOn = false;
                }
                if (num.index>0) {
                    num.add('0');
                    jlbl.setText(String.valueOf(num.num));
                }
            }
        });
        jbtnDot.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (isCycleOn){
                    num.clear();
                    isCycleOn = false;
                }
                if (!num.dotPresence&&num.index>0){
                    num.add('.');
                    jlbl.setText(String.valueOf(num.num));
                    num.dotPresence =  true;
                }
            }
        });
        jbtn11.addActionListener(new ActionListener(){                      // (+/-) processing;
            public void actionPerformed(ActionEvent ae){
                if (isCycleOn){
                    num.clear();
                    isCycleOn = false;
                }
                if ((!num.isNegative) && num.index>0){
                    num.addMinus();
                    jlbl.setText(String.valueOf(num.num));
                }
                else {
                    num.removeMinus();
                    jlbl.setText(String.valueOf(num.num));
                }
            }
        });
        jbtnC.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                num.clear();
                operation = 0;
                isCycleOn = false;
                operand1 = 0.0f;
                operand2 = 0.0f;
                jlbl.setText("0");
                isOperationSet = false;
            }
        });
        
        jbtnDelLast.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                num.delLast();
                jlbl.setText(String.valueOf(num.num));
            }
        });
        
        jbtn12.addActionListener(new ActionListener(){                      // "+"
            public void actionPerformed(ActionEvent ae){
                if (!isOperationSet) {
                    operation = 1;
                    isOperationSet = true;
                    operand1 = num.arrToFloat(num.num);
                    num.clear();
                }
            }
        });
        
        jbtn13.addActionListener(new ActionListener(){                      // "-"
            public void actionPerformed(ActionEvent ae){
                if (!isOperationSet) {
                    operation = 2;
                    isOperationSet = true;
                    operand1 = num.arrToFloat(num.num);
                    num.clear();
                }
            }
        });
        jbtn14.addActionListener(new ActionListener(){                      // "/"
            public void actionPerformed(ActionEvent ae){
                if (!isOperationSet) {
                    operation = 3;
                    isOperationSet = true;
                    operand1 = num.arrToFloat(num.num);
                    num.clear();
                }
            }
        });
        
        jbtnMultiple.addActionListener(new ActionListener(){                // "*"
            public void actionPerformed(ActionEvent ae){
                if (!isOperationSet) {
                    operation = 4;
                    isOperationSet = true;
                    operand1 = num.arrToFloat(num.num);
                    num.clear();
                }
            }
        });
        
        jbtnEq.addActionListener(new ActionListener(){                      // "="
            public void actionPerformed(ActionEvent ae){
                if (isOperationSet){
                    operand2 = num.arrToFloat(num.num);
                    if (operation == 1){
                        result = operand1 + operand2;
                        jlbl.setText(String.valueOf(result));
                    } 
                    else if (operation == 2){
                        result = operand1 - operand2;
                        jlbl.setText(String.valueOf(result));
                    }
                    else if (operation == 3){
                        result = operand1 / operand2;
                        jlbl.setText(String.valueOf(result));
                    }
                    else if (operation == 4){
                        result = operand1 * operand2;
                        jlbl.setText(String.valueOf(result));
                    }
                }
                operation = 0;
                isCycleOn = true;
                isOperationSet = false;
            }
        });
    }
}
 