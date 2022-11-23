package fr.univpau.intents;

import android.app.Application;

public class Foo extends Application {
    private static Foo singleton;

    // Données à partager
    public String userLogin;
    public boolean estSympa;

    public static Foo getInstance() { return singleton; }

    @Override
    public final void onCreate() {
        super.onCreate();
        singleton=this;
    }
}