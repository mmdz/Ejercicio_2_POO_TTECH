package ejercicio2_poo.entidades;

import java.util.Scanner;
import java.math.MathContext;

/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:*/
public class Circunferencias {

    //atributos
    private double radio;
    private double area;
    private double perimetro;

    //constructores
    public Circunferencias() {
        //vacio por defecto
    }
    //a) Método constructor que inicialice el radio pasado como parámetro.

    public Circunferencias(double radio) {
        this.radio = radio; //this es el atributo q tiene la clase, 
        //el otro es el que recibe por parametro    
    }

    Scanner leer = new Scanner(System.in);

    //metodos
    //c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el 
    //atributo del objeto.    
    public Circunferencias crearCircunferencia() {

        System.out.println("Ingrese el radio");
        Circunferencias circulo = new Circunferencias();
        circulo.setRadio(leer.nextDouble());
    //    System.out.println("radio _ " + circulo.getRadio());
        return circulo;
    }

    //d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
    public double area() {

        //   Circunferencias circulo = new Circunferencias();
        area = Math.PI * (Math.pow(getRadio(), 2));
        return area;
    }
    //e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).

    public double perimetro() {

        //   Circunferencias circulo = new Circunferencias();
        perimetro = 2 * Math.PI * getRadio();

      //  System.out.println("per "+perimetro);
        return perimetro;
    }

    
            
    //mostrar
    public Circunferencias mostrar(Circunferencias circulo) {

        System.out.println("Resultados" + circulo);
        return circulo;
    }

    //b) Métodos get y set para el atributo radio de la clase Circunferencia.  
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    //metodo toString, muestra TODOS los datos del objeto(atributos) por pantalla
    @Override
    public String toString() {
        return "Radio=" + radio +", "+ area + " area,\n " + perimetro + " perimetro.";
    }

}
