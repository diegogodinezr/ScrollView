public class estados {
    private String nombre;
    private String extension;
    private String poblacion;
    private String capital;
    public estados(String nombre, String extension, String poblacion, String capital) {
        this.nombre = nombre;
        this.extension = extension;
        this.poblacion = poblacion;
        this.capital = capital;
    }

    public String getNombre() {
        return nombre;
    }

    public String getExtension() {
        return extension;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public String getCapital() {
        return capital;
    }
}

