public class JugueteEducativo extends Juguete {
    private int edadMaxima;
    private int bonificacion;
    public JugueteEducativo(String name, int edadMinima, int precioBase,int edadMaxima,int bonificacion) throws EinvalidPropertyException {
        super(name, edadMinima, precioBase);
        if(edadMaxima <= edadMinima) throw new EinvalidPropertyException("Edad maxima es menor que edad minima");
        this.edadMaxima = edadMaxima;
        if(bonificacion < 0) throw new EinvalidPropertyException("Bonificacion ha de ser igual o mayor que 0");
        if(bonificacion > precioBase) throw new EinvalidPropertyException("Bonificacion ha de ser menor que el precio base");
        this.bonificacion = bonificacion;
    }

    public JugueteEducativo(String name, int nJugadores, int edadMinima, int precioBase,int edadMaxima,int bonificacion) throws EinvalidPropertyException {
        super(name, nJugadores, edadMinima, precioBase);
        if (edadMaxima < edadMinima) throw new EinvalidPropertyException("Edad maxima es menor que edad minima");
        this.edadMaxima = edadMaxima;
        if (bonificacion < 0) throw new EinvalidPropertyException("Bonificacion ha de ser igual o mayor que 0");
        if (bonificacion > precioBase)
            throw new EinvalidPropertyException("Bonificacion ha de ser menor que el precio base");
        this.bonificacion = bonificacion;
    }

    public int getPrecioFinal() {
        int precioFinal= getPrecioBase();
        if(bonificacion > 0) {
            precioFinal -= bonificacion;
        }
        return precioFinal;
    }

}
