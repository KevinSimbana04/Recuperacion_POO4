import Ejercicio1.*;


public class Main {
    public static void main(String[] args) {
        Figuras();

    }
    public static void Figuras() {
        System.out.println("Ejercicio 1: Área de Figuras");
        Figura f1 = new Cuadrado(4);
        Figura f2 = new Triangulo(5, 3);
        System.out.println("Área del cuadrado: " + f1.calcularArea());
        System.out.println("Área del triángulo: " + f2.calcularArea());
        System.out.println();
    }
}