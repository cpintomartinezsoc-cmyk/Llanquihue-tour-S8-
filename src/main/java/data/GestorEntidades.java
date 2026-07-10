package data;

import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Registrable;
import model.Vehiculo;

import java.util.ArrayList;

public class GestorEntidades {

    private ArrayList<Registrable> listaEntidades;

    public GestorEntidades() {

        listaEntidades = new ArrayList<>();
    }

    public void agregarEntidad(Registrable entidad) {

        listaEntidades.add(entidad);

    }

    public void mostrarEntidades() {

        for (Registrable entidad : listaEntidades) {

            entidad.mostrarResumen();

            if (entidad instanceof GuiaTuristico) {

                System.out.println("Tipo detectado: Guía Turístico");

            } else if (entidad instanceof Vehiculo) {

                System.out.println("Tipo detectado: Vehículo");

            } else if (entidad instanceof ColaboradorExterno) {

                System.out.println("Tipo detectado: Colaborador Externo");

            }

            System.out.println("------------------------------------");
        }

    }

}