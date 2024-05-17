package Exercise1;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        //Declaration of variables
        Scanner entrance = new Scanner(System.in);
        int num;

        //System.out.println("Insert a number: ");
        //Ask for the number
        num = Integer.parseInt(JOptionPane.showInputDialog("Insert a number: "));

        //Check the num is multiple of 10
        if(num%10 == 0){
            //Print message
            JOptionPane.showMessageDialog(null,"The number " +num+" is multiple of 10");
        }else{
            //Print message
            JOptionPane.showMessageDialog(null,"The number " +num+" is not multiple of 10");
        }
    }
}