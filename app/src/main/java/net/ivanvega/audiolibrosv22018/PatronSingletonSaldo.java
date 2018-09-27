package net.ivanvega.audiolibrosv22018;

public class PatronSingletonSaldo {

    // Esta será la instancia única de esta clase
    private static PatronSingletonSaldo INSTANCIA = new PatronSingletonSaldo();

    // El constructor es private para evitar su acceso desde fuera.
    private PatronSingletonSaldo() {}

    // Método para obtener la única instancia de la clase
    public static PatronSingletonSaldo getInstancia() {


        return INSTANCIA;
    }
}
