import Ejercicio1.*;
import Ejercicio2.*;
import Ejercicio3.*;



public class Main {
    public static void main(String[] args) {
        //Figuras();
        //Nomina();
        Transporte();
    }
    public static void Figuras() {
        System.out.println("Ejercicio 1: Área de Figuras");
        Figura f1 = new Cuadrado(4);
        Figura f2 = new Triangulo(5, 3);
        System.out.println("Área del cuadrado: " + f1.calcularArea());
        System.out.println("Área del triángulo: " + f2.calcularArea());
        System.out.println();
    }

    public static void Nomina() {
        System.out.println("Ejercicio 2: Nómina de empleados");
        EmpleadoNomina e1 = new EmpleadoFijo(600);
        EmpleadoNomina e2 = new EmpleadoPorHoras(40, 5);
        System.out.println("Salario fijo: " + e1.calcularSalario());
        System.out.println("Salario por horas: " + e2.calcularSalario());
        System.out.println();
    }
    public static void Transporte() {
        System.out.println("Ejercicio 3: Transporte");
        Transporte t1 = new Bus();
        Transporte t2 = new Bicicleta();
        t1.iniciarViaje();
        t2.iniciarViaje();
        System.out.println();
    }

}