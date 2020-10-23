import javax.swing.*;

public class resbok {
    public static void main(String[] arg) {
    int siffra = Integer.parseInt(JOptionPane.showInputDialog("Säg en siffra"));
    int antal = 0;

    while (antal < 10){
       antal++;
        System.out.println(siffra+ "*"+ antal + "="+  siffra*antal);
        }











    }



}




