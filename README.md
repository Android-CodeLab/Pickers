# Jamun-Pickers

Pickers Library provide you a set of Pickers like Country, Language, Share and Intent Chooser. 

1. `Country Pickers` provide you Country picking functionality with great UI|UX, and there custom calling features to make there picker developer handy. This have four custom ways to make there picker UI with Single and Multi Selection functionality. It have updated collection of country name, code and there flags for better understanding and UI.

2. `Language Picker` provide you Language picking functionality with great UI|UX, and there custom calling features to make there picker developer handy. This have four custom ways to make there picker UI with Single and Multi Selection functionality. User have option to customize there data at your own by simple calls.

3. `Intent Picker` provide you Complete Custom Intent Chooser with great UI|UX, and there custom calling features to make there picker developer handy.

4. `Share Dialog Picker` provide you Intent Chooser with great UI|UX.

### What's New? (0.0.1)
* Stable official Version for Developers and Live Apps.
* Custom UI components with Single and Multi Selection Mode in Country and Language Pickers
* Easy Calling mechanism with instal reply via Listeners
* Lite version code with Api integration for Country Picker for Runtime improvement and Flags Images
* Country and Language Pickers are in Four screen Bottom Sheet/Dialog/Activity/Navigation View
* All view are Android device screen compatible upto tab 7' and 10' inches.
* Intent, Share and Language Pickers are provide you more flexible way to customize data.

------

# Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

## All-in-One Setup

The easiest way to add **Pickers** library to your project is by adding it as a dependency to your `build.gradle`

```
Either
repositories {
        jcenter()
}
Or
repositories {
        mavenCentral()
}

dependencies {
        compile 'tk.jamun:pickers:0.0.1'
}
```

## Utility Pickers

**Portrait Mode Layout**

Intent Picker | Share Picker
---- | ----
![jamun_pickers_intent](https://user-images.githubusercontent.com/38988514/39989090-ab29beae-5786-11e8-9121-40c387032a1a.png) | ![jamun_pickers_share](https://user-images.githubusercontent.com/38988514/39989077-a83e147e-5786-11e8-9c08-3652393d1830.png)

**Landscape Mode Layout**

Intent Picker | Share Picker
---- | ----
![jamun_pickers_intent_landscape](https://user-images.githubusercontent.com/38988514/39989091-ab6f28ea-5786-11e8-9ba4-66745bd4b7cb.png) | ![jamun_pickers_share_landscape](https://user-images.githubusercontent.com/38988514/39989079-a87d1480-5786-11e8-816d-db3e8d2d0789.png)

## Country-Pickers

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

The easiest way to add the Only **Country-Picker** library to your project is by adding it as a dependency to your `build.gradle`

```
Either
repositories {
        jcenter()
}
Or
repositories {
        mavenCentral()
}

dependencies {
        compile 'tk.jamun:country:0.0.1'
}
```

**Portrait Mode Layout**

Bottom Sheet View | Navigation View
---- | ----
![jamun_pickers_country_bottom](https://user-images.githubusercontent.com/38988514/39989083-a9390884-5786-11e8-8aa3-c0108ed2546a.png) | ![jamun_pickers_country_nav](https://user-images.githubusercontent.com/38988514/39989089-aae485aa-5786-11e8-88d8-a6d5f9b32bc1.png)

**Landscape Mode Layout**

Activity View | Dialog View
---- | ----
![jamun_pickers_country_activity](https://user-images.githubusercontent.com/38988514/39989082-a8fa7164-5786-11e8-8d01-7f4b27b9f112.png) | ![jamun_pickers_country_dialog](https://user-images.githubusercontent.com/38988514/39989084-aa14f27c-5786-11e8-8c26-07fb9ffa5c26.png)

## Language-Pickers

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

The easiest way to add the Only **Language-Picker** library to your project is by adding it as a dependency to your `build.gradle`

```
Either
repositories {
        jcenter()
}
Or
repositories {
        mavenCentral()
}

dependencies {
        compile 'tk.jamun:language:0.0.1'
}
```

**Portrait Mode Layout**

Bottom Sheet View | Navigation View
---- | ----
![jamun_pickers_language_bottom](https://user-images.githubusercontent.com/38988514/39989094-acf88de6-5786-11e8-82d7-9b8c2a8f257c.png) | ![jamun_pickers_language_navigation](https://user-images.githubusercontent.com/38988514/39989075-a7b637d4-5786-11e8-8bca-7d3535369218.png)

Activity View | Dialog View
---- | ----
![jamun_pickers_language_activity](https://user-images.githubusercontent.com/38988514/39989092-ac444a48-5786-11e8-93f4-4016d9d3676b.png) | ![jamun_pickers_language_dialog](https://user-images.githubusercontent.com/38988514/39989096-ad6d1404-5786-11e8-9a2d-12f7b30806ff.png)

## Landscape Mode

Country-Picker | Language Picker
---- | ----
![jamun_pickers_country_landscape](https://user-images.githubusercontent.com/38988514/39989086-aa686dc6-5786-11e8-98ad-d3a86f209ad0.png) | ![jamun_pickers_language_landscape](https://user-images.githubusercontent.com/38988514/39989099-ade8d256-5786-11e8-87c0-1f322b53f303.png)

------

# How to Implement

## 1. Share Picker

**1. Define Class Object**
```
PickerShareFiles pickerShareFiles = new PickerShareFiles();
pickerShareFiles.setThings(activity);
```
**2. Call on Click**
```
pickerShareFiles.shareThings(getSupportFragmentManager(), "Description", "Title");
```

------

## 2. Intent Picker

**1. Define Class Object**
```
ArrayList<ModelIntentPicker> arrayList = new ArrayList<>();

arrayList.add(new ModelIntentPicker(PickerIntent.PICKER_CAMERA, getString(R.string.string_button_name_camera),               R.drawable.library_icon_vd_clear,R.drawable.library_background_intent_two, ACTION_REQUEST_CAMERA));

arrayList.add(new ModelIntentPicker(PickerIntent.PICKER_REMOVE, getString(R.string.string_button_name_remove),R.drawable.library_icon_vd_clear, R.drawable.library_background_intent_five, 0));

PickerIntent intentPicker = new PickerIntent();
intentPicker.setThings(activity).setPicker("Title of the Intent Picker", arrayList);
```
**2. Call on Click**
```
intentPicker.showPicker(getSupportFragmentManager());
```
**3. onBackPressed or Destroy**
```
intentPicker.clear();
```

------

## 3. Country-Picker

### 1. Bottom Sheet View

**1. Define Class Object**
```
PickerCountryBottom pickerCountryBottom = new PickerCountryBottom().setThings(this)
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
```
**2. Call on Click**
```
pickerCountryBottom.showPicker(getSupportFragmentManager());
```
**3. onBackPressed or Destroy**
```
pickerCountryBottom.clear();
```

### 2. Navigation View

**1. Define Class Object with Toolbar and DrawerLayout Object**
```
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
```
**2. XML layout Code**
```
<android.support.v4.widget.DrawerLayout>
 <fragment
        android:id="@+id/id_navigation"
        android:name="in.jamun.pickers.views.country.PickerCountryNavigation"
        android:layout_width="@dimen/dimen_nav_width"
        android:layout_height="match_parent"
        android:layout_gravity="end"
        app:layout="@layout/library_country_bottom"
        tools:layout="@layout/library_country_bottom" />
</android.support.v4.widget.DrawerLayout>
```
**3. onBackPressed or Destroy**
```
if (drawerLayout.isDrawerOpen(GravityCompat.END)) {
            drawerLayout.closeDrawer(GravityCompat.END);
}else{
 super.onBackPressed();
 }
```
### 3. Dialog View

**1. Define Class Object**
```
PickerCountryDialog  pickerCountryDialog = new PickerCountryDialog(this).bindListener(new PickerListenerCountry() {
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
```
**2. Call on Click**
```
 pickerCountryDialog.show();
```
**3. onBackPressed or Destroy**
```
pickerCountryDialog.clear();
```
### 4. Activity View

**1. Start Activity**
```
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
```
### 5. Utility Methods

**1. Customize Api tags and Urls**
```
 private ModelCountryDetails initializeDataCountryTags() {
        ModelCountryDetails modelCountryDetails = new ModelCountryDetails();
        modelCountryDetails.setTagCountry("country");
        modelCountryDetails.setTagISO("iso");
        modelCountryDetails.setTagCountryCode("countrycode");
        modelCountryDetails.setTagFlag("flag");
        modelCountryDetails.setUrlImageDownload("imageUrl");
        modelCountryDetails.setUrlGetCountry("url");
        return modelCountryDetails;
    }
```
**2. Refresh Databse**
```
object.refreshDatabase();
```
**3. Find Data Model with Country Name**
```
object.findByName(countryName);
```
**4. Find Data Model with Country Code**
```
object.findByCode((int)countryCode);
```
**5. Find Data Model with ISO**
```
object.findByCode(iso);
```
**6. Start Multi Selection (Dialog/Bottom/Navigation)**
```
object..setSelectionModeMulti(true);
```

------

## 3. Language-Picker

### 1. Bottom Sheet View

**1. Define Class Object**
```
PickerLanguageBottom  pickerLanguageBottom = new PickerLanguageBottom().setThings(this, initializeData())
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
```
**2. Call on Click**
```
pickerLanguageBottom.showPicker(getSupportFragmentManager());
```
**3. onBackPressed or Destroy**
```
pickerLanguageBottom.clear();
```

### 2. Navigation View

**1. Define Class Object with Toolbar and DrawerLayout Object**
```
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
```
**2. XML layout Code**
```
<android.support.v4.widget.DrawerLayout>
  <fragment
        android:id="@+id/id_navigation_language"
        android:name="in.jamun.pickers.views.language.PickerLanguageNavigation"
        android:layout_width="@dimen/dimen_nav_width"
        android:layout_height="match_parent"
        android:layout_gravity="start"
        app:layout="@layout/library_language"
        tools:layout="@layout/library_language" />
</android.support.v4.widget.DrawerLayout>
```
**3. onBackPressed or Destroy**
```
if (drawerLayout.isDrawerOpen(GravityCompat.END)) {
drawerLayout.closeDrawer(GravityCompat.END);
}else{
 super.onBackPressed();
 }
```
### 3. Dialog View

**1. Define Class Object**
```
PickerLanguageDialog pickerLanguageDialog = new PickerLanguageDialog(this).setData(initializeData()).
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
```
**2. Call on Click**
```
 pickerLanguageDialog.show();
```
**3. onBackPressed or Destroy**
```
pickerLanguageDialog.clear();
```
### 4. Activity View

**1. Start Activity**
```
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
```
### 5. Utility Methods

**1. Customize Api tags and Urls**
```
  public ArrayList<ModelLanguageParent> initializeData() {
        ArrayList<ModelLanguageParent> arrayList = new ArrayList<>();
        ArrayList<ModelLanguage> arrayListChild = new ArrayList<>();
        arrayListChild.add(new ModelLanguage(LANG_ENGLISH, "English", "English"));
        arrayListChild.add(new ModelLanguage(LANG_HINDI, "Hindi", "हिंदी"));
        arrayListChild.add(new ModelLanguage(LANG_ARABIC, "Arabic", "عربى"));
        arrayList.add(new ModelLanguageParent(arrayListChild, getString(R.string.jamun_pickers_string_text_setting_select_language)));
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
```
**2. Start Multi Selection (Dialog/Bottom/Navigation)**
```
object..setSelectionModeMulti(true);
```

------

## Credits

Desgin & Developed by : **[Jatin Sahgal](http://jatin.techcruzers.com)**

Content Writer : **[Achal Garg](http://achal.techcruzers.com)**

Company : **[Techcruzers](http://www.techcruzers.com)**

## More Library under Jamun 
* **[Volley](https://github.com/Lib-Jamun/Volley.git)**
Volley Library is a set of Custom Classes with UI components for network programming, integration and transaction handling in a better and standard way. This will help developers for making quality use of volley library. 

* **[Scanner](https://github.com/Lib-Jamun/scanner.git)**
Scanner is a collection of Beautiful Activity which help others to make there own Custom QR/Barcode Scanner. 

* **[Calendar](https://github.com/Lib-Jamun/calendar.git)**
Calendar is a collection of Beautiful Activities which help others to make there Fully Custom Calendar View with Single and Multi Date Picker Functionality 

* **[Camera](https://github.com/Lib-Jamun/ui.git)**
Camera library provide you Custom Complete Camera view with full features like Flash, Rotation, Gallery Picker, Focus, Tap to capture, Confirmation window and last but not least croping feature. It also provide you file path in return so that developer can feel a friendly handy way to Deal After. 

* **[Gallery](https://github.com/Lib-Jamun/ui.git)**
Gallery have some Beautiful UI Components and Multi files Mode for android Developers to give there app a A Rich look With single and Multi picker Functionality.

* **[UI](https://github.com/Lib-Jamun/ui.git)**
UI library is a set of UI Views, Custom Component and Collection of Helper Classes which help Developer for making quality Product. Such as Camera, Gallery, Number of Pickers, Calendar, Date Pickers, Dialogs and many more Heler UI and Backend Component.

## License
    Copyright (c) 2015 Wouter Dullaert

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
