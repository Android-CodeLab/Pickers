package tk.jamun.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import tk.jamun.ui.utils.JamunDialogInterface;
import tk.jamun.ui.views.JamunAlertDialog;


public class ActivityUIComponent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uicomponent);
    }

    public void onClickDialog(View view) {
        new JamunAlertDialog(this)
                .setMessage(getString(R.string.string_message_alert))
                .setPositiveButton(R.string.string_button_name_yes_want, new JamunDialogInterface.OnClickListener() {
                    @Override
                    public void onClick(JamunAlertDialog customAlertDialog) {
                        customAlertDialog.dismiss();
                    }
                })
                .setNegativeButton(R.string.string_button_name_no, new JamunDialogInterface.OnClickListener() {
                    @Override
                    public void onClick(JamunAlertDialog customAlertDialog) {
                        customAlertDialog.dismiss();
                    }
                }).show();
    }


}
