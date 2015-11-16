

package boletin91;

import javax.swing.JOptionPane;

/**
 *
 * @author agomezcastro
 */
public class Boletin91 {


    public static void main(String[] args) {
        int cn=0, cp=0, co=0, num = 0;
        for (int i=0; i<10; i++){
            num= Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero:"));
            if (num<0)
                cn++;
            else if (num>0)
                cp++;
            else
                co++;
            
            
        }
        JOptionPane.showMessageDialog(null, "Hay "+cp+ " numeros positivos");
        JOptionPane.showMessageDialog(null, "Hay "+cn+ " numeros negativos");
        JOptionPane.showMessageDialog(null, "Hay "+co+ " ceros");
    }
    
}
