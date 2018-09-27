package net.ivanvega.audiolibrosv22018;

import android.content.Context;
import android.content.SharedPreferences;

public class Saldo {

    private static Saldo INSTANCIA = new Saldo();
    // En Android casi siempre necesitas conocer el contexto
    private Context contexto;
    // Otras variables de la clase
    private int saldo = -1;
    private Saldo() {}
    public static Saldo getInstancia() {
        return INSTANCIA;
    }
    // Método para inicializar el objeto
    public void inicializa(Context contexto){
        this.contexto = contexto;
        SharedPreferences pref = contexto.getSharedPreferences("pref",
                Context.MODE_PRIVATE);
        int saldo = pref.getInt("saldo_inicial", -1);
    }
    public int getSaldo() {
        return saldo;
    }
    public void putSaldo(int saldo) {
        this.saldo = saldo;
        SharedPreferences pref = contexto.getSharedPreferences("pref",
                Context.MODE_PRIVATE);
        SharedPreferences.Editor e = pref.edit();
        e.putInt("saldo_inicial", 500);
        e.commit();
        
    }
}
