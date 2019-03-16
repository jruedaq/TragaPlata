package com.oneago;

import javax.swing.JOptionPane;

public class Nomina {
    
    private double vhedi, vheno, vhedodi, vhedono, auxtrans, salud, pens;
    private double salario;
    private int dlab, hedi, heno, hedodi, hedono;
    private double totsal, comisiones, auxtrans_di;
    
    public void start() {
        
        vhedi       = 0.25;
        vheno       = 0.75;
        vhedodi     = 1;
        vhedono     = 1.14;
        auxtrans_di = 3234.40;
        salud       = 0.04;
        pens        = 0.04;
        
        try {
            salario = Double.parseDouble(JOptionPane.showInputDialog("Inserte el salario mensual"));
            dlab = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los días laborados"));
            if (dlab > 30) {
                JOptionPane.showMessageDialog(null, "Los días no pueden ser mayor de 30, fin de la ejecución");
                return;
            }
            totsal     = salario-(30-dlab);
            hedi       = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas extras diurnas"));
            heno       = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas extras nocturnas"));
            hedodi     = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas extras dominicales diurnas"));
            hedono     = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas extras dominicales nocturnas"));
            comisiones = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las comisiones"));
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error en la ejecución\nValores no válidos");
        }
        
    }
    
    public double tothe() {
        return totsal*(hedi*vhedi)+totsal*(heno*vheno)+totsal*(hedodi*vhedodi)+totsal*(hedono*vhedono);
    }
    
    public double totdev() {
        return totsal+tothe()+comisiones;
    }
    
    public double totded() {
        return (totdev()*salud)+(totdev()*pens);
    }
    
    public double totnet() {
        double calc = totdev()-totded();
        if (salario >= 1656232) {
            calc = calc + auxtrans_di;
        }
        return calc;
    }
}
