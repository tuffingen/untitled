import javax.swing.*;

public class java {
    public static void main (String[] args){
        String s = JOptionPane.showInputDialog(null, "Vilket år är det?");
        int år = Integer.parseInt(s);
        boolean isskottår = false;
        if ((år % 4 == 0 && år % 100 != 0 ) || år % 400 == 0 )
            isskottår = true;


        String month = JOptionPane.showInputDialog(null, "Vilken månad undrar du över");


        switch (month.toLowerCase()) {
            case "Januari" :
            case "Mars" :
            case "Maj" :
            case "Juli" :
            case "Augusti" :
            case "Oktober" :
            case "December" :

                JOptionPane.showMessageDialog(null, "31 dagar");
                break ;
            case "Februari" :
            case "februari" :
                if (isskottår)
                    JOptionPane.showMessageDialog(null, " Det är skottår, 29 dagar");
                else
                    JOptionPane.showMessageDialog(null, "28 dagar");

                break ;
            case "April" :
            case "Juni" :
            case "September" :
            case "November" :
            case "april" :
            case "juni" :
            case "september" :
            case "november" :
                JOptionPane.showMessageDialog(null, "30 dagar");
                break ;


            default :
                JOptionPane.showMessageDialog(null, "VAD I HELVETET SNACKAR DU OM CHRISTER");

        }
    }

}
