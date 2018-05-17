package tk.jamun.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickPicker(View view) {
        startActivity(new Intent(this, ActivityPickers.class));
    }

    public void onClickCamerAndGallery(View view) {
        startActivity(new Intent(this, ActivityCameraGallery.class));
    }

    public void onClickScanner(View view) {
        startActivity(new Intent(this, ActivityScannerSample.class));
    }

    public void onClickCalendar(View view) {
        startActivity(new Intent(this, ActivityCalendar.class));
    }

    public void onClickUIComponent(View view) {
        startActivity(new Intent(this, ActivityUIComponent.class));
    }
}
