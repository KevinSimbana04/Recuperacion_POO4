package Ejercicio2;

public class EmpleadoFijo extends EmpleadoNomina {
    private double sueldoBase;

    public EmpleadoFijo(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public double calcularSalario() {
        return sueldoBase;
    }
}