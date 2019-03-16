package com.oneago;

import javax.swing.JOptionPane;

public class parcial {
    
    public static void main(String[] args) {
        
        int op = Integer.valueOf(JOptionPane.showInputDialog("Seleccione una opción:\n\nTragaPlata (1)\nNómina (2)"));
        
        TragaPlata tragaPlata = new TragaPlata();
        Nomina nomina = new Nomina();
        
        switch (op) {
            case 1:
                tragaPlata.start();
                break;
                
            case 2:
                nomina.start();
                JOptionPane.showMessageDialog(null, "El salario a pagar es de $" + nomina.totnet());
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Valor digitado es invalido, no haga caer mi bendito programa");
                
        }
    }
    
}
