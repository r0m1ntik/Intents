package fr.univpau.intents;

import android.app.Application;

public class Foo extends Application {
    private static Foo singleton;

    // Données à partager
    public String userLogin;
    public boolean estSympa;

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public static Foo getInstance() {
        if (singleton == null)
            singleton = new Foo();
        return singleton;
    }

    @Override
    public final void onCreate() {
        super.onCreate();
        singleton=this;
    }
}