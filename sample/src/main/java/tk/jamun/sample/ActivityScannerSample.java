package tk.jamun.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import tk.jamun.ui.scanner.classes.ActivityScanner;

import static tk.jamun.ui.scanner.classes.ActivityScanner.INTENT_FOR_CODE;

public class ActivityScannerSample extends AppCompatActivity {

    private static final int ACTION_QR_READER = 11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner_sample);
    }

    public void onClickScanner(View view) {
        startActivityForResult(new Intent(ActivityScannerSample.this, ActivityScanner.class),
                ACTION_QR_READER);
    }

    @Override
    protected void onActivityResult(final int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (requestCode == ACTION_QR_READER) {
                if (data != null) {
                    String qrCode = data.getStringExtra(INTENT_FOR_CODE);
                }
            }
        }
    }
}
