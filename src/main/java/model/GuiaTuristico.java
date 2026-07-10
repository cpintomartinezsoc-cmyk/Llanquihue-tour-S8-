package model;

public class GuiaTuristico extends RecursoAgencia {

    private String idioma;
    private int aniosExperiencia;

    public GuiaTuristico(String nombre,
                         String codigo,
                         String idioma,
                         int aniosExperiencia) {

        super(nombre, codigo);

        this.idioma = idioma;
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void mostrarResumen() {

        System.out.println("=== GUÍA TURÍSTICO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Idioma: " + idioma);
        System.out.println("Años de experiencia: " + aniosExperiencia);
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
}