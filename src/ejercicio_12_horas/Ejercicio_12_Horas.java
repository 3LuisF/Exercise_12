package ejercicio_12_horas;

import java.lang.Math;

public class Ejercicio_12_Horas {

    public static void main(String[] args) {
        double Num_Horas = 48;
        double Valor_Hora = 5000;
        double Sal_Bruto = Num_Horas*Valor_Hora;
        double Rete_Fuente = 0.125*Sal_Bruto;
        double Sal_Neto = Sal_Bruto-Rete_Fuente;
        System.out.println("El salario bruto es: "+Sal_Bruto+"\nLa retencion en la fuente es: "+Rete_Fuente+" \nEl salario neto es: "+Sal_Neto);
    }
    
}
