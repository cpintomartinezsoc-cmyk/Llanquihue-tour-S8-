package model;

public class Vehiculo extends RecursoAgencia {

    private String patente;
    private int capacidad;

    public Vehiculo(String nombre,
                    String codigo,
                    String patente,
                    int capacidad) {

        super(nombre, codigo);

        this.patente = patente;
        this.capacidad = capacidad;
    }

    @Override
    public void mostrarResumen() {

        System.out.println("=== VEHÍCULO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Patente: " + patente);
        System.out.println("Capacidad: " + capacidad);
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}