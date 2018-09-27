package net.ivanvega.audiolibrosv22018;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.res.Configuration;

public class AplicacionSaldo extends Application {
    private int saldo;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;

    }



    @Override
    public void onCreate() {
        super.onCreate();

        SharedPreferences pref =
                getSharedPreferences("pref", MODE_PRIVATE);
        int saldo =
                pref.getInt("saldo_inicial", -1);

        PatronSingletonSaldo mipatron =
                PatronSingletonSaldo.getInstancia();


    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

    }

    @Override
    public void onLowMemory() {

        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {

        super.onTrimMemory(level);
    }

}
