package tk.jamun.sample;

import android.app.Application;
import android.content.Context;
import android.support.v7.app.AppCompatDelegate;

import tk.jamun.ui.pickers.database.DatabaseHandler;


public class MyApplication extends Application {
    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        DatabaseHandler.setInstance(this);
    }
}
