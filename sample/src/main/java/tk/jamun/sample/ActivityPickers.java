package tk.jamun.sample;

import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import tk.jamun.ui.pickers.extras.PickerListenerCountry;
import tk.jamun.ui.pickers.extras.PickerListenerLanguage;
import tk.jamun.ui.pickers.models.ModelCountryDetails;
import tk.jamun.ui.pickers.models.ModelDialog;
import tk.jamun.ui.pickers.models.ModelIntentPicker;
import tk.jamun.ui.pickers.models.ModelLanguage;
import tk.jamun.ui.pickers.models.ModelLanguageParent;
import tk.jamun.ui.pickers.views.country.PickerCountryActivity;
import tk.jamun.ui.pickers.views.country.PickerCountryBottom;
import tk.jamun.ui.pickers.views.country.PickerCountryDialog;
import tk.jamun.ui.pickers.views.country.PickerCountryNavigation;
import tk.jamun.ui.pickers.views.intents.PickerIntent;
import tk.jamun.ui.pickers.views.intents.PickerShareFiles;
import tk.jamun.ui.pickers.views.language.PickerLanguageActivity;
import tk.jamun.ui.pickers.views.language.PickerLanguageBottom;
import tk.jamun.ui.pickers.views.language.PickerLanguageDialog;
import tk.jamun.ui.pickers.views.language.PickerLanguageNavigation;

import static tk.jamun.ui.pickers.extras.InterfaceLanguageListener.LANG_ARABIC;
import static tk.jamun.ui.pickers.extras.InterfaceLanguageListener.LANG_ASSAMESE;
import static tk.jamun.ui.pickers.extras.InterfaceLanguageListener.LANG_BENGALI;
import static tk.jamun.ui.pickers.extras.InterfaceLanguageListener.LANG_ENGLISH;
import static tk.jamun.ui.pickers.extras.InterfaceLanguageListener.LANG_GUJRATI;
import static tk.jamun.ui.pickers.extras.InterfaceLanguageListener.LANG_HINDI;
import static tk.jamun.ui.pickers.extras.InterfaceLanguageListener.LANG_KANNADA;
import static tk.jamun.ui.pickers.extras.InterfaceLanguageListener.LANG_MAITHALI;
import static tk.jamun.ui.pickers.extras.InterfaceLanguageListener.LANG_MALAYALAM;
import static tk.jamun.ui.pickers.extras.InterfaceLanguageListener.LANG_MARATHI;
import static tk.jamun.ui.pickers.extras.InterfaceLanguageListener.LANG_MODE_NORMAL;
import static tk.jamun.ui.pickers.extras.InterfaceLanguageListener.LANG_ODIA;
import static tk.jamun.ui.pickers.extras.InterfaceLanguageListener.LANG_PUNJABI;
import static tk.jamun.ui.pickers.extras.InterfaceLanguageListener.LANG_TAMIL;
import static tk.jamun.ui.pickers.extras.InterfaceLanguageListener.LANG_TELGU;
import static tk.jamun.ui.pickers.extras.InterfaceLanguageListener.LANG_URDU;


public class ActivityPickers extends AppCompatActivity {
    private PickerCountryBottom pickerCountryBottom;
    private PickerLanguageBottom pickerLanguageBottom;
    private static final int ACTION_REQUEST_CAMERA = 111;
    private PickerIntent intentPicker;
    private PickerShareFiles pickerShareFiles;
    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    private PickerCountryDialog pickerCountryDialog;
    private PickerLanguageDialog pickerLanguageDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickers);
        setToolbar();
        initializeShareIntent();
        initializeNavigationViewLanguage();
        initializeNavigationViewCountry();
        initializeCountryDialog();
        initializeLanguageDialog();
        initializeCountryBottom();
        initializeLanguageBottom();
    }

    private void initializeShareIntent() {
        pickerShareFiles = new PickerShareFiles();
        pickerShareFiles.setThings(this);
    }

    private void initializeLanguageDialog() {
        pickerLanguageDialog = new PickerLanguageDialog(this).setData(initializeData()).
                bindListener(new PickerListenerLanguage() {
                    @Override
                    public void singleModeData(ModelLanguage modelLanguage) {
                        super.singleModeData(modelLanguage);
                    }

                    @Override
                    public void multiModeData(ArrayList<ModelLanguage> languageArrayList) {
                        super.multiModeData(languageArrayList);
                    }
                }).setSelectionModeMulti(false).createSetUp();
    }

    private void initializeLanguageBottom() {
        pickerLanguageBottom = new PickerLanguageBottom().setThings(this, initializeData())
                .bindListener(new PickerListenerLanguage() {
                    @Override
                    public void singleModeData(ModelLanguage modelLanguage) {
                        super.singleModeData(modelLanguage);
                    }

                    @Override
                    public void multiModeData(ArrayList<ModelLanguage> languageArrayList) {
                        super.multiModeData(languageArrayList);
                    }
                });
        pickerLanguageBottom.setSelectionModeMulti(false);
    }

    private void initializeCountryBottom() {
        pickerCountryBottom = new PickerCountryBottom().setThings(this)
                .bindListener(new PickerListenerCountry() {
                    @Override
                    public void singleModeData(ModelDialog modelLanguage) {
                        super.singleModeData(modelLanguage);
                    }

                    @Override
                    public void multiModeData(ArrayList<ModelDialog> languageArrayList) {
                        super.multiModeData(languageArrayList);
                    }

                    @Override
                    public void apiError(int statusCode, String errorMessage) {
                    }
                });
        pickerCountryBottom.setSelectionModeMulti(false);
    }

    private void initializeCountryDialog() {
        pickerCountryDialog = new PickerCountryDialog(this).bindListener(new PickerListenerCountry() {
            @Override
            public void singleModeData(ModelDialog modelLanguage) {
                super.singleModeData(modelLanguage);
            }

            @Override
            public void multiModeData(ArrayList<ModelDialog> languageArrayList) {
                super.multiModeData(languageArrayList);
            }

            @Override
            public void apiError(int statusCode, String errorMessage) {

            }
        }).setSelectionModeMulti(false).setTags(initializeDataCountryTags()).createSetUp();
    }

    private void setToolbar() {
        toolbar = findViewById(R.id.id_app_bar);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.id_drawer);
        drawerLayout.setDescendantFocusability(ViewGroup.FOCUS_AFTER_DESCENDANTS);
    }

    private void initializeNavigationViewLanguage() {
        PickerLanguageNavigation navLeftFragment = (PickerLanguageNavigation)
                getSupportFragmentManager().findFragmentById(R.id.id_navigation_language);
        navLeftFragment.setSelectionModeMulti(false);
        navLeftFragment.setUpDrawer(drawerLayout, toolbar, false, new PickerListenerLanguage() {
            @Override
            public void singleModeData(ModelLanguage modelLanguage) {
                super.singleModeData(modelLanguage);
            }

            @Override
            public void multiModeData(ArrayList<ModelLanguage> languageArrayList) {
                super.multiModeData(languageArrayList);
            }
        }, LANG_MODE_NORMAL, GravityCompat.START);
    }

    private void initializeNavigationViewCountry() {
        PickerCountryNavigation navLeftFragment = (PickerCountryNavigation)
                getSupportFragmentManager().findFragmentById(R.id.id_navigation);
        navLeftFragment.setSelectionModeMulti(false);
        navLeftFragment.setTags(initializeDataCountryTags());
        navLeftFragment.setUpDrawer(drawerLayout, toolbar, false, new PickerListenerCountry() {
            @Override
            public void singleModeData(ModelDialog modelLanguage) {
                super.singleModeData(modelLanguage);
            }

            @Override
            public void multiModeData(ArrayList<ModelDialog> languageArrayList) {
                super.multiModeData(languageArrayList);
            }

            @Override
            public void apiError(int statusCode, String errorMessage) {
            }
        }, GravityCompat.END);
    }

    public void onClickIntent(View view) {
        if (intentPicker == null) {
            ArrayList<ModelIntentPicker> arrayList = new ArrayList<>();
            arrayList.add(new ModelIntentPicker(PickerIntent.PICKER_CAMERA, getString(R.string.string_button_name_camera), R.drawable.library_icon_vd_clear,
                    R.drawable.library_background_intent_two, ACTION_REQUEST_CAMERA));
            arrayList.add(new ModelIntentPicker(PickerIntent.PICKER_REMOVE, getString(R.string.string_button_name_remove), R.drawable.library_icon_vd_clear, R.drawable.
                    library_background_intent_five, 0));
            intentPicker = new PickerIntent();
            intentPicker.setThings(this)
                    .setPicker("Choose Intent Picker", arrayList);
        }
        intentPicker.showPicker(getSupportFragmentManager());
    }

    public void onClickShare(View view) {
        pickerShareFiles.shareThings(getSupportFragmentManager(), "Description", "Title");
    }

    public void onClickCountry(View view) {
        pickerCountryBottom.showPicker(getSupportFragmentManager());
    }

    public void onClickCountryNavigation(View view) {
//        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);
        drawerLayout.openDrawer(GravityCompat.END);
    }

    public void onClickCountryDialog(View view) {
        pickerCountryDialog.show();
    }

    public void onClickCountryActivity(View view) {
        initializeDataCountryTags();
        PickerCountryActivity.setThings(this, new PickerListenerCountry() {
            @Override
            public void singleModeData(ModelDialog modelLanguage) {
                super.singleModeData(modelLanguage);
            }

            @Override
            public void multiModeData(ArrayList<ModelDialog> languageArrayList) {
                super.multiModeData(languageArrayList);
            }

            @Override
            public void apiError(int statusCode, String errorMessage) {

            }
        }, initializeDataCountryTags(), false);
    }

    private ModelCountryDetails initializeDataCountryTags() {
        ModelCountryDetails modelCountryDetails = new ModelCountryDetails();
        modelCountryDetails.setTagCountry("country");
        modelCountryDetails.setTagISO("iso");
        modelCountryDetails.setTagCountryCode("countrycode");
        modelCountryDetails.setTagFlag("flag");
        modelCountryDetails.setUrlImageDownload("http://flag.techcruzers.com/CountryFlag/");
        modelCountryDetails.setUrlGetCountry("http://api.simplyblood.com/public/country/2");
        return modelCountryDetails;
    }

    public void onClickLanguage(View view) {
        pickerLanguageBottom.showPicker(getSupportFragmentManager());
    }

    public void onClickLanguageNavigation(View view) {
//        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);
        drawerLayout.openDrawer(GravityCompat.START);
    }

    public void onClickLanguageDialog(View view) {
        pickerLanguageDialog.show();
    }

    public void onClickLanguageActivity(View view) {
        PickerLanguageActivity.setThings(this, new PickerListenerLanguage() {
            @Override
            public void singleModeData(ModelLanguage modelLanguage) {
                super.singleModeData(modelLanguage);
            }

            @Override
            public void multiModeData(ArrayList<ModelLanguage> languageArrayList) {
                super.multiModeData(languageArrayList);
            }
        }, initializeData(), LANG_MODE_NORMAL, false);
    }

    public ArrayList<ModelLanguageParent> initializeData() {
        ArrayList<ModelLanguageParent> arrayList = new ArrayList<>();
        ArrayList<ModelLanguage> arrayListChild = new ArrayList<>();
        arrayListChild.add(new ModelLanguage(LANG_ENGLISH, "English", "English"));
        arrayListChild.add(new ModelLanguage(LANG_HINDI, "Hindi", "हिंदी"));
        arrayListChild.add(new ModelLanguage(LANG_ARABIC, "Arabic", "عربى"));
        arrayList.add(new ModelLanguageParent(arrayListChild, getString(R.string.library_pickers_string_text_setting_select_language)));
        arrayListChild = new ArrayList<>();
        arrayListChild.add(new ModelLanguage(LANG_PUNJABI, "Punjabi", "ਪੰਜਾਬੀ"));
        arrayListChild.add(new ModelLanguage(LANG_BENGALI, "Bengali", "বাঙালি"));
        arrayListChild.add(new ModelLanguage(LANG_TELGU, "Telugu", "తెలుగు"));
        arrayListChild.add(new ModelLanguage(LANG_MARATHI, "Marathi", "मराठी"));
        arrayListChild.add(new ModelLanguage(LANG_TAMIL, "Tamil", "தமிழ்"));
        arrayListChild.add(new ModelLanguage(LANG_URDU, "Urdu", "اردو"));
        arrayListChild.add(new ModelLanguage(LANG_GUJRATI, "Gujarati", "ગુજરાતી"));
        arrayListChild.add(new ModelLanguage(LANG_KANNADA, "Kannada", "ಕನ್ನಡ"));
        arrayListChild.add(new ModelLanguage(LANG_ODIA, "Odia", "ଓରିୟା"));
        arrayListChild.add(new ModelLanguage(LANG_MALAYALAM, "Malayalam", "മലയാളം"));
        arrayListChild.add(new ModelLanguage(LANG_ASSAMESE, "Assamese", "অসমীয়া"));
        arrayListChild.add(new ModelLanguage(LANG_MAITHALI, "Maithili", "মৈথিলী"));
        arrayList.add(new ModelLanguageParent(arrayListChild, "Indian"));
        return arrayList;
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.END)) {
            drawerLayout.closeDrawer(GravityCompat.END);
        } else if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.END);
        } else
            super.onBackPressed();
    }
}
