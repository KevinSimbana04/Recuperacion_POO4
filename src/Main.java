import Ejercicio1.*;
import Ejercicio2.*;
import Ejercicio3.*;
import Ejercicio4.*;
import Ejercicio5.*;
import Ejercicio6.*;


public class Main {
    public static void main(String[] args) {
        //Figuras();
        //Nomina();
        //Transporte();
        //ValidarEdad();
        //ValidarNota();
        ValidarPassword();
    }

    //Ejercicio1
    public static void Figuras() {
        System.out.println("Ejercicio 1: Área de Figuras");
        Figura f1 = new Cuadrado(4);
        Figura f2 = new Triangulo(5, 3);
        System.out.println("Área del cuadrado: " + f1.calcularArea());
        System.out.println("Área del triángulo: " + f2.calcularArea());
        System.out.println();
    }
    //Ejercicio2
    public static void Nomina() {
        System.out.println("Ejercicio 2: Nómina de empleados");
        EmpleadoNomina e1 = new EmpleadoFijo(600);
        EmpleadoNomina e2 = new EmpleadoPorHoras(40, 5);
        System.out.println("Salario fijo: " + e1.calcularSalario());
        System.out.println("Salario por horas: " + e2.calcularSalario());
        System.out.println();
    }
    //Ejercicio3
    public static void Transporte() {
        System.out.println("Ejercicio 3: Transporte");
        Transporte t1 = new Bus();
        Transporte t2 = new Bicicleta();
        t1.iniciarViaje();
        t2.iniciarViaje();
        System.out.println();
    }
    //Ejercicio4
    public static void ValidarEdad() {
        System.out.println("Ejercicio 4: Validación de Edad");
        PersonaVal p1 = new PersonaVal();
        p1.setEdad(25);
        p1.setEdad(-3);
        System.out.println();
    }
    //Ejercicio5
    public static void ValidarNota() {
        System.out.println("Ejercicio 5: Validación de Nota");
        EstudianteVal est1 = new EstudianteVal();
        est1.setNota(8.7);
        est1.setNota(12);
        System.out.println();
    }
    //Ejercicio6
    public static void ValidarPassword() {
        System.out.println("Ejercicio 6: Validación de Contraseña");
        Usuario u1 = new Usuario();
        u1.setPassword("clave123");
        u1.setPassword("abc");
        System.out.println();
    }
}