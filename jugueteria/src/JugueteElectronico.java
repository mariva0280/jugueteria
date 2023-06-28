public class JugueteElectronico extends Juguete{
    private int recargo;
    public JugueteElectronico(String name, int edadMinima, int precioBase,int recargo) throws EinvalidPropertyException {
        super(name, edadMinima, precioBase);
        if(recargo < 0) throw new EinvalidPropertyException("Recargo no puede ser menor que 0");
        if(recargo > precioBase) throw new EinvalidPropertyException("Recargo no puede ser mayor que el precio base");
        this.recargo = recargo;
    }

    public JugueteElectronico(String name, int nJugadores, int edadMinima, int precioBase,int recargo) throws EinvalidPropertyException {
        super(name, nJugadores, edadMinima, precioBase);
        if(recargo < 0) throw new EinvalidPropertyException("Recargo no puede ser menor que 0");
        if(recargo > precioBase) throw new EinvalidPropertyException("Recargo no puede ser mayor que el precio base");
        this.recargo = recargo;
    }
    public int getPrecioFinal() {
        int precioFinal = getPrecioBase();
        if(recargo > 0) {
            precioFinal += recargo;
        }
        return precioFinal;
    }
}
