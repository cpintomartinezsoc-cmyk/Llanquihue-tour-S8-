package model;

public class ColaboradorExterno extends RecursoAgencia {

    private String empresa;
    private String especialidad;

    public ColaboradorExterno(String nombre,
                              String codigo,
                              String empresa,
                              String especialidad) {

        super(nombre, codigo);

        this.empresa = empresa;
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarResumen() {

        System.out.println("=== COLABORADOR EXTERNO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Empresa: " + empresa);
        System.out.println("Especialidad: " + especialidad);
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}