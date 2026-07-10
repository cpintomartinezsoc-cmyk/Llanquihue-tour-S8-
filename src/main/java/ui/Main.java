package ui;

import data.GestorEntidades;
import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Vehiculo;

import javax.swing.*;
import java.awt.*;

public class Main {

    private static GestorEntidades gestor = new GestorEntidades();

    public static void main(String[] args) {

        // Colaborador externo agregado por defecto, como en la versión original
        gestor.agregarEntidad(
                new ColaboradorExterno(
                        "Turismo Puerto Varas",
                        "145",
                        "Turis PV",
                        "Volcanes"));

        JFrame frame = new JFrame("Gestion Turismo Llanquihue");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 200);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton btnGuia = new JButton("Agregar Guía Turístico");
        JButton btnVehiculo = new JButton("Agregar Vehículo");
        JButton btnMostrar = new JButton("Mostrar Registro");

        btnGuia.addActionListener(e -> crearGuia());
        btnVehiculo.addActionListener(e -> crearVehiculo());
        btnMostrar.addActionListener(e -> gestor.mostrarEntidades());

        panel.add(btnGuia);
        panel.add(btnVehiculo);
        panel.add(btnMostrar);

        frame.add(panel);
        frame.setVisible(true);
    }

    private static void crearGuia() {

        String nombre = JOptionPane.showInputDialog("Nombre del guía");
        String codigo = JOptionPane.showInputDialog("Código");
        String idioma = JOptionPane.showInputDialog("Idioma");
        int experiencia = Integer.parseInt(
                JOptionPane.showInputDialog("Años de experiencia"));

        GuiaTuristico guia = new GuiaTuristico(nombre, codigo, idioma, experiencia);
        gestor.agregarEntidad(guia);

        JOptionPane.showMessageDialog(null, "Guía turístico creado correctamente.");
    }

    private static void crearVehiculo() {

        String nombre = JOptionPane.showInputDialog("Marca del vehículo");
        String codigo = JOptionPane.showInputDialog("Código");
        String patente = JOptionPane.showInputDialog("Patente");
        int capacidad = Integer.parseInt(
                JOptionPane.showInputDialog("Capacidad"));

        Vehiculo vehiculo = new Vehiculo(nombre, codigo, patente, capacidad);
        gestor.agregarEntidad(vehiculo);

        JOptionPane.showMessageDialog(null, "Vehículo creado correctamente.");
    }

}