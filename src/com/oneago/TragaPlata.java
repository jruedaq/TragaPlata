package com.oneago;

import javax.swing.JOptionPane;

public class TragaPlata {
    
    private double tot;
    
    public void start() {
        boolean play = (0 == JOptionPane.showConfirmDialog(null, "Desea Jugar"));
        
        if (play) {
            JOptionPane.showMessageDialog(null, "Segun el dinero que ingrese y el número que saque se multiplicara como porcentaje, pero debe elegir una opción, si jugar con pares o impares, según lo que elija se multiplicará su valor, de lo contrario perderá todo... Los números que saldrán serán de 0 a 100");
            int val = Integer.valueOf(JOptionPane.showInputDialog("Cuanto desea ingresar?"));
            
            boolean multiplos = (0 == JOptionPane.showConfirmDialog(null, "Desea Jugar con los números pares?"));
            
            JOptionPane.showMessageDialog(null, "Sacará un número al azar entre 1 y 100");
            int number = (int) (Math.random() * 100);
            JOptionPane.showMessageDialog(null, "Sacó el número " + number);
            
            int comprove = number % 2;
            
            if (multiplos) {
                if (comprove == 0) {
                    tot = val+(val*number);
                    JOptionPane.showMessageDialog(null, "Ha ganado $" + tot);
                } else {
                    JOptionPane.showMessageDialog(null, "Lo ha perdido todo");
                }
            } else {
                if (comprove != 0) {
                    tot = val+(val*number);
                    JOptionPane.showMessageDialog(null, "Ha ganado $" + tot);
                } else {
                    JOptionPane.showMessageDialog(null, "Lo ha perdido todo");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Mucha Gallina");
        }
    }
}
