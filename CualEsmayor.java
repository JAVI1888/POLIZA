
package ejer.solo;

import javax.swing.JOptionPane;

public class CualEsmayor {
    public static void main(String Args[]){
        int Valor1;
        int Valor2;
        Valor1=Byte.parseByte(JOptionPane.showInputDialog("Ingrese el Valor 1"));
        Valor2=Byte.parseByte(JOptionPane.showInputDialog("Ingrese el valor 2"));
        if (Valor1>Valor2){
            System.out.println("El valor 1 es el mayor");
        } else if (Valor2>Valor1){
        System.out.println("El valor 2 es el mayor");
        }else
            System.out.println("Ambos valores son iguales");
            
        
            
        
    }
    
}
