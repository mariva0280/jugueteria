public class Juguete {
    private String name;
    private int nJugadores;
    private int edadMinima;
    private int precioBase;

    public Juguete(String name, int edadMinima, int precioBase) throws EinvalidPropertyException {
        validateNombre(name);

        this.name = name;
        this.edadMinima = edadMinima;
        this.precioBase = precioBase;
    }

    public Juguete(String name, int nJugadores, int edadMinima, int precioBase) throws EinvalidPropertyException {
        validateNombre(name);
        this.name = name;
        if(nJugadores <= 0) throw new EinvalidPropertyException("Numero de jugadores al menos debe ser 1");
        this.nJugadores = nJugadores;
        this.edadMinima = edadMinima;
        this.precioBase = precioBase;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public int getPrecioFinal() {
        int precioFinal = getPrecioBase();
        return precioFinal;
    }
    private void validateNombre(String name) throws EinvalidPropertyException {
        if(name == null) throw new EinvalidPropertyException("Nombre no puede ser nulo");
        if(name.isEmpty()) throw new EinvalidPropertyException("Nombre no puede ser nulo");
    }
}
