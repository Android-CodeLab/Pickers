package tk.jamun.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import tk.jamun.elements.circularimageview.CircularImageView;
import tk.jamun.elements.circularnetworkimageview.CircularNetworkImageView;
import tk.jamun.volley.classes.VolleyImageDownload;
import tk.jamun.volley.main.VolleySingleton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeView();
    }
    private void initializeView() {
        CircularImageView circularImageView = findViewById(R.id.id_circle_image);
        CircularNetworkImageView circularNetworkImageView = findViewById(R.id.id_circle_network_image);
        VolleySingleton.setInstance(this);
        VolleyImageDownload.getInstance().downloadImage("https://techcruzers.com/images/team/members/jatin-sahgal.jpg", circularNetworkImageView,
                R.drawable.image_vd_user_default);
        VolleyImageDownload.getInstance().downloadImage("https://techcruzers.com/images/team/members/jatin-sahgal.jpg", circularImageView,
                R.drawable.image_vd_user_default);
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
