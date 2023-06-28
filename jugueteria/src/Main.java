public class Main {
    public static void main(String[] args) {
        try {
            Juguete jugueteGeneral1 = new Juguete("Trivial",10,12,35);
            System.out.println("El juego cuesta: " +jugueteGeneral1.getPrecioFinal() + " €.");
            Juguete jugueteEducativo1 = new JugueteEducativo("Sapiens",10,25,30,5);
            System.out.println("El juego cuesta: "+jugueteEducativo1.getPrecioFinal() + " €.");
            Juguete jugueteElectronico1 = new JugueteElectronico("Random",2,8,20,5);
            System.out.println("El juego cuesta: " +jugueteElectronico1.getPrecioFinal() + " €.");

        } catch (EinvalidPropertyException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}