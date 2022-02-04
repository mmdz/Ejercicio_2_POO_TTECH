package ejercicio2_poo;

import ejercicio2_poo.entidades.Circunferencias;

/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).*/
public class Main_2 {

    public static void main(String[] args) {
        
        Circunferencias circulo1 = new Circunferencias();//creo objeto
        
        //creo el circulo
        circulo1 = circulo1.crearCircunferencia(); 
        
        //area circulo
        circulo1.area();
        circulo1.perimetro();
        
        //mostrar
        circulo1.mostrar(circulo1);
    }

}
