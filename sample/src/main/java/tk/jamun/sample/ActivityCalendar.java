package tk.jamun.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import tk.jamun.ui.calendar.classes.ActivityCalenderDual;
import tk.jamun.ui.calendar.classes.ActivityCalenderSingle;
import tk.jamun.ui.calendar.model.ModelCalendar;
import tk.jamun.ui.utils.HelperTime;

import static tk.jamun.ui.calendar.inter.IC.INTENT_CALENDER_DATA;
import static tk.jamun.ui.calendar.inter.IC.INTENT_CALENDER_DATA_ONE;
import static tk.jamun.ui.calendar.inter.IC.INTENT_CALENDER_DATA_TWO;
import static tk.jamun.ui.calendar.inter.IC.INTENT_CALENDER_DATE;
import static tk.jamun.ui.calendar.inter.IC.INTENT_CALENDER_DATE_FROM;
import static tk.jamun.ui.calendar.inter.IC.INTENT_CALENDER_DATE_TO;
import static tk.jamun.ui.calendar.inter.IC.INTENT_CALENDER_DUAL_PICKER;
import static tk.jamun.ui.calendar.inter.IC.INTENT_CALENDER_MAX_YEAR;
import static tk.jamun.ui.calendar.inter.IC.INTENT_CALENDER_MONTH;
import static tk.jamun.ui.calendar.inter.IC.INTENT_CALENDER_MONTH_FROM;
import static tk.jamun.ui.calendar.inter.IC.INTENT_CALENDER_MONTH_TO;
import static tk.jamun.ui.calendar.inter.IC.INTENT_CALENDER_SET_MIN_DATE_TODAY;
import static tk.jamun.ui.calendar.inter.IC.INTENT_CALENDER_SINGLE_PICKER;
import static tk.jamun.ui.calendar.inter.IC.INTENT_CALENDER_TITLE;
import static tk.jamun.ui.calendar.inter.IC.INTENT_CALENDER_YEAR;
import static tk.jamun.ui.calendar.inter.IC.INTENT_CALENDER_YEAR_FROM;
import static tk.jamun.ui.calendar.inter.IC.INTENT_CALENDER_YEAR_TO;

public class ActivityCalendar extends AppCompatActivity {
    private ModelCalendar modelCalenderFrom;
    private ModelCalendar modelCalenderTo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
    }

    public void onClickMulti(View view) {
        Intent intent = new Intent(this, ActivityCalenderDual.class);
        intent.putExtra(INTENT_CALENDER_TITLE, getString(R.string.string_activity_name_select));
        if (modelCalenderFrom != null && modelCalenderTo != null) {
            intent.putExtra(INTENT_CALENDER_YEAR_FROM, modelCalenderFrom.getYear());
            intent.putExtra(INTENT_CALENDER_MONTH_FROM, modelCalenderFrom.getMonth() - 1);
            intent.putExtra(INTENT_CALENDER_DATE_FROM, modelCalenderFrom.getDate());
            intent.putExtra(INTENT_CALENDER_YEAR_TO, modelCalenderTo.getYear());
            intent.putExtra(INTENT_CALENDER_MONTH_TO, modelCalenderTo.getMonth() - 1);
            intent.putExtra(INTENT_CALENDER_DATE_TO, modelCalenderTo.getDate());
        }
        intent.putExtra(INTENT_CALENDER_SET_MIN_DATE_TODAY, true);
        intent.putExtra(INTENT_CALENDER_MAX_YEAR, HelperTime.getInstance().getCurrentYear()
                + 4);
        startActivityForResult(intent, INTENT_CALENDER_DUAL_PICKER);
    }


    public void onClickSingle(View view) {
        Intent intent = new Intent(this, ActivityCalenderSingle.class);
        intent.putExtra(INTENT_CALENDER_TITLE, getString(R.string.string_activity_name_select_from_date));
        if (modelCalenderFrom != null) {
            intent.putExtra(INTENT_CALENDER_YEAR, modelCalenderFrom.getYear());
            intent.putExtra(INTENT_CALENDER_MONTH, modelCalenderFrom.getMonth() - 1);
            intent.putExtra(INTENT_CALENDER_DATE, modelCalenderFrom.getDate());
        }
        intent.putExtra(INTENT_CALENDER_SET_MIN_DATE_TODAY, true);
        intent.putExtra(INTENT_CALENDER_MAX_YEAR, HelperTime.getInstance().getCurrentYear()
                + 20);
        startActivityForResult(intent, INTENT_CALENDER_SINGLE_PICKER);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case INTENT_CALENDER_DUAL_PICKER:
                    modelCalenderFrom = data.getParcelableExtra(INTENT_CALENDER_DATA_ONE);
                    modelCalenderTo = data.getParcelableExtra(INTENT_CALENDER_DATA_TWO);
                    break;
                case INTENT_CALENDER_SINGLE_PICKER:
                    modelCalenderTo = data.getParcelableExtra(INTENT_CALENDER_DATA);
                    break;
            }
        }
    }
}
