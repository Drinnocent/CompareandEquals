package sample;

import javax.swing.*;
import java.awt.*;

public class Calculations
{
    public static void main(String[]args)
    {
        JFrame frame=new JFrame("Simple calculation");
        JPanel panel=new JPanel(new FlowLayout(FlowLayout.LEFT));

        String strnum1,strnum2;
        int num1,num2,sum;
        strnum1=JOptionPane.showInputDialog("Enter the number to add");
        strnum2=JOptionPane.showInputDialog("Enter your second number");
        num1=Integer.parseInt(strnum1);num2=Integer.parseInt(strnum2);
        sum=num1+num2;
        JOptionPane.showMessageDialog(null,"The sum of  "+num1+" + "+num2+" = "+sum);

        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

}
