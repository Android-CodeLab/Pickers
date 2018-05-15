# Jamun-Pickers

Pickers Library provide you a set of different Pickers like Country, Language, Share and Intent Chooser. 

1. `Country Pickers` allow you to access Country picking functionality with great UI/UX design, and there are numberous of function which help you to modify picker as per your requirements. Library has been provided with four custom UI initate mode you can decide how the view of picker can be initate. You can also decide weather picker inheriate Single or Multi Selection property. Library consists of updated collection of country name, code and there flags. We are using APIs base structure to avoid increase in the size of apk due to flag Images. This module Maintain the database so that you don't need to call APIs again and again rather than you can choose when to refresh the Database and fetch new real time data.

2. `Language Picker` provides you read-made Language picker  which is easy to use and comes with great UI/UX, and there are numberous of function which help you to modify picker as per your requirements. Library has been provided with four custom UI initate mode you can decide how the view of picker can be initate. You can also decide weather picker inheriate Single or Multi Selection property. You can allow edit the list of country name and language easily.

3. `Intent Picker` helps you to use Custom Intent Chooser with great UI/UX, and there are many of the feature for the customization of already embedded features. So that you can use it easily and gracefully.

4. `Share Dialog Picker` provide you Intent Chooser with great UI/UX. It automatically retrive the sort list of all the apps which can share the file. This functionality saves much of your task. You can also share dialog Picker for sending Large files. For this you just need to call a single function with file as Argument.

### What's New? (0.0.1)
* Stable official Version for Rapid Development.
* Custom UI components with Single and Multi Selection Mode in Country and Language Pickers.
* Easy Calling mechanism with instant reply via Listeners
* Optimized code with Api integration for Country Picker for Flags Images
* Country and Language Pickers have four modes you can optout from these Four mode (i.e. Bottom Sheet, Dialog, Activity, Navigation View)
* All the views in the library are Screen compatible i.e. You can execute this library on different android screens including tabs.

### All-in-One Setup

The easiest way to add **Pickers** library to your project is by adding it as a dependency to your `build.gradle`. To add picker library you just need to append few lines into your `build.gradle`.
These lines are provided in Integration Part given Below

#### Gradle Setup

Step 1\. Add the jCenter repository to your build file. Add it in your root build.gradle at the end of repositories:

```java
allprojects {
  repositories {
        jcenter()
  }
}
```
Step 2\. Add the dependency

```java
dependencies {
        compile 'tk.jamun:pickers:0.0.1'
}
```
#### Maven
```xml
<dependency>
  <groupId>tk.jamun</groupId>
  <artifactId>pickers</artifactId>
  <version>0.0.1</version>
  <type>aar</type>
</dependency>
```
------

# Types of Pickers

## Utility Pickers

It consist of Intent and Share dialog Picker. Both Modules are enough smart to Provide you enough feature to customize them as much as you want.

`Intent Picker` helps you to use Custom Intent Chooser with great UI/UX, and there are many of the feature for the customization of already embedded features. So that you can use it easily and gracefully.

`Share Dialog Picker` provide you Intent Chooser with great UI/UX. It automatically retrive the sort list of all the apps which can share the file. This functionality saves much of your task. You can also share dialog Picker for sending Large files. For this you just need to call a single function with file as Argument.

**Portrait Mode Layout**

Intent Picker | Share Picker
---- | ----
![jamun_pickers_intent](https://user-images.githubusercontent.com/38988514/39989090-ab29beae-5786-11e8-9121-40c387032a1a.png) | ![jamun_pickers_share](https://user-images.githubusercontent.com/38988514/39989077-a83e147e-5786-11e8-9c08-3652393d1830.png)

**Landscape Mode Layout**

Intent Picker | Share Picker
---- | ----
![jamun_pickers_intent_landscape](https://user-images.githubusercontent.com/38988514/39989091-ab6f28ea-5786-11e8-9ba4-66745bd4b7cb.png) | ![jamun_pickers_share_landscape](https://user-images.githubusercontent.com/38988514/39989079-a87d1480-5786-11e8-816d-db3e8d2d0789.png)

## Country-Pickers

`Country Pickers` allow you to access Country picking functionality with great UI/UX design, and there are numberous of function which help you to modify picker as per your requirements. Library has been provided with four custom UI initate mode you can decide how the view of picker can be initate. You can also decide weather picker inheriate Single or Multi Selection property. Library consists of updated collection of country name, code and there flags.

#### Gradle Setup

Step 1\. Add the jCenter repository to your build file. Add it in your root build.gradle at the end of repositories:

```java
allprojects {
  repositories {
        jcenter()
  }
}
```
Step 2\. Add the dependency

```java
dependencies {
        compile 'tk.jamun:country:0.0.1'
}
```
#### Maven
```xml
<dependency>
  <groupId>tk.jamun</groupId>
  <artifactId>country</artifactId>
  <version>0.0.1</version>
  <type>aar</type>
</dependency>
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

 `Language Picker` provides you read-made Language picker  which is easy to use and comes with great UI/UX, and there are numberous of function which help you to modify picker as per your requirements. Library has been provided with four custom UI initate mode you can decide how the view of picker can be initate. You can also decide weather picker inheriate Single or Multi Selection property. You can allow edit the list of country name and language easily.

#### Gradle Setup

Step 1\. Add the jCenter repository to your build file. Add it in your root build.gradle at the end of repositories:

```java
allprojects {
  repositories {
        jcenter()
  }
}
```
Step 2\. Add the dependency

```java
dependencies {
        compile 'tk.jamun:language:0.0.1'
}
```
#### Maven
```xml
<dependency>
  <groupId>tk.jamun</groupId>
  <artifactId>language</artifactId>
  <version>0.0.1</version>
  <type>aar</type>
</dependency>
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

Once the project has been added to gradle, You can use these lines of code to configure pickers....

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

This implement your picker as an Bottom Sheet view.

**1. Define Class Object**
```
PickerCountryBottom pickerCountryBottom = new PickerCountryBottom().setThings(this)
                .bindListener(new PickerListenerCountry() {
                    @Override
            public void singleModeData(ModelDialog modelDialog) {
                super.singleModeData(modelDialog);
                       //Return single selection mode data as an model
            }

            @Override
            public void multiModeData(ArrayList<ModelDialog> countryArrayList) {
                super.multiModeData(countryArrayList);
                //Return Multi selection mode data as an arraylist.
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

This implement your picker as an Navigation Drawer view.

**1. Define Class Object with Toolbar and DrawerLayout Object**
```
 PickerCountryNavigation navLeftFragment = (PickerCountryNavigation)
                getSupportFragmentManager().findFragmentById(R.id.id_navigation);
        navLeftFragment.setSelectionModeMulti(false);
        navLeftFragment.setTags(initializeDataCountryTags());
        navLeftFragment.setUpDrawer(drawerLayout, toolbar, false, new PickerListenerCountry() {
            @Override
            public void singleModeData(ModelDialog modelDialog) {
                super.singleModeData(modelDialog);
                       //Return single selection mode data as an model
            }

            @Override
            public void multiModeData(ArrayList<ModelDialog> countryArrayList) {
                super.multiModeData(countryArrayList);
                //Return Multi selection mode data as an arraylist.
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

This implement your picker as an Dialog view.

**1. Define Class Object**
```
PickerCountryDialog  pickerCountryDialog = new PickerCountryDialog(this).bindListener(new PickerListenerCountry() {
            @Override
            public void singleModeData(ModelDialog modelDialog) {
                super.singleModeData(modelDialog);
                       //Return single selection mode data as an model
            }

            @Override
            public void multiModeData(ArrayList<ModelDialog> countryArrayList) {
                super.multiModeData(countryArrayList);
                //Return Multi selection mode data as an arraylist.
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

This implement your picker as an Activity view.

**1. Start Activity**
```
PickerCountryActivity.setThings(this, new PickerListenerCountry() {
            @Override
            public void singleModeData(ModelDialog modelDialog) {
                super.singleModeData(modelDialog);
                       //Return single selection mode data as an model
            }

            @Override
            public void multiModeData(ArrayList<ModelDialog> countryArrayList) {
                super.multiModeData(countryArrayList);
                //Return Multi selection mode data as an arraylist.
            }

            @Override
            public void apiError(int statusCode, String errorMessage) {

            }
        }, initializeDataCountryTags(), false);
```
### 5. Additional Options

**1. Customize Api tags and Urls**

You can also customize APIs urls and tags as per your need for Country Picker. We are using APIs base structure to avoid increase in the size of apk due to flag Images..

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

You can use this function refreshDatabase(). i.e. that you can call api again to fetch real time data into your app. This module Maintain the database so that you don't need to call APIs again and again rather than you can choose when to refresh the Database and fetch new real time data.

```
object.refreshDatabase();
```

You can retrive all the data assosiated to Object if you now any of the parameter Name,Code and ISO.

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

This function call provide you an opportunity to make your picker Multi or Single Selector.

```
object..setSelectionModeMulti(true);
```

------

## 3. Language-Picker

### 1. Bottom Sheet View

This implement your picker as an Bottom Sheet view.

**1. Define Class Object**
```
PickerLanguageBottom  pickerLanguageBottom = new PickerLanguageBottom().setThings(this, initializeData())
                .bindListener(new PickerListenerLanguage() {
                    @Override
                    public void singleModeData(ModelLanguage modelLanguage) {
                        super.singleModeData(modelLanguage);
                       //Return single selection mode data as an model
            }

            @Override
            public void multiModeData(ArrayList<ModelLanguage> languageArrayList) {
                super.multiModeData(languageArrayList);
                //Return Multi selection mode data as an arraylist.
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

This implement your picker as an Navigation Drawer View.

**1. Define Class Object with Toolbar and DrawerLayout Object**
```
  PickerLanguageNavigation navLeftFragment = (PickerLanguageNavigation)
                getSupportFragmentManager().findFragmentById(R.id.id_navigation_language);
        navLeftFragment.setSelectionModeMulti(false);
        navLeftFragment.setUpDrawer(drawerLayout, toolbar, false, new PickerListenerLanguage() {
            @Override
            public void singleModeData(ModelLanguage modelLanguage) {
                super.singleModeData(modelLanguage);
                       //Return single selection mode data as an model
            }

            @Override
            public void multiModeData(ArrayList<ModelLanguage> languageArrayList) {
                super.multiModeData(languageArrayList);
                //Return Multi selection mode data as an arraylist.
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

This implement your picker as an Dialog.

**1. Define Class Object**
```
PickerLanguageDialog pickerLanguageDialog = new PickerLanguageDialog(this).setData(initializeData()).
                bindListener(new PickerListenerLanguage() {
                    @Override
                    public void singleModeData(ModelLanguage modelLanguage) {
                        super.singleModeData(modelLanguage);
                       //Return single selection mode data as an model
            }

            @Override
            public void multiModeData(ArrayList<ModelLanguage> languageArrayList) {
                super.multiModeData(languageArrayList);
                //Return Multi selection mode data as an arraylist.
                    }
                }).setSelectionModeMulti(false).createSetUp();
```
**2. Call onClick**
```
 pickerLanguageDialog.show();
```
**3. onBackPressed or Destroy**
```
pickerLanguageDialog.clear();
```
### 4. Activity View

This implement your picker as an Activity.

**Start Activity**
```
 PickerLanguageActivity.setThings(this, new PickerListenerLanguage() {
            @Override
            public void singleModeData(ModelLanguage modelLanguage) {
                super.singleModeData(modelLanguage);
                //Return single selection mode data as an model
            }

            @Override
            public void multiModeData(ArrayList<ModelLanguage> languageArrayList) {
                super.multiModeData(languageArrayList);
                //Return Multi selection mode data as an arraylist.
            }
        }, initializeData(), LANG_MODE_NORMAL, false);
```
### 5. Additional Options

**1. Customize Data**

You can send data in the form of array list to customize data of Language Picker.
The sample given below display a Perfect example how to add more data into language picker.
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

This function call provide you an opportunity to make your picker Multi or Single Selector.
```
object..setSelectionModeMulti(true);
```

> **To understand more how the library works, please take a look at the sample app.**

------

# Why this library?

* This library Pickers competible with all screen sizes and device (Tab with 7' inches and 10'inches).
* Library support both orientation that is portrait and landscape.
* It uses DatePickerDialog & TimePickerDialog internally.
* Its simple and easy to use.
* Its Customizable (Support Custom Themes). 
* Minimum API is 15, but it'll probably work in API 9 and above, just make sure you test it out (we use `Support Fragment Manager`).  


# Dependency

* Android Support Fragment Library ``v27.1.1``
* Jamun Volley Library **[Volley](https://github.com/Lib-Jamun/Volley.git)**

## Credits

Desgin & Developed by : **[Jatin Sahgal](http://jatin.techcruzers.com)**

Content Writer : **[Achal Garg](http://achal.techcruzers.com)**

Company : **[Techcruzers](http://www.techcruzers.com)**

# Live Project using this Library

The following apps are using this library without facing any kind of Bugs.

* **[SimplyBlood](https://play.google.com/store/apps/details?id=com.simplyblood)**
* **[ZINI](https://play.google.com/store/apps/details?id=ai.zini)**
* **[SaveBloodIndia](https://play.google.com/store/apps/details?id=com.savebloodindia)**
* **[Rectangle India](https://play.google.com/store/apps/details?id=com.rectangleindia.blooddonation)**
* **[Jeevan Rakshak](https://play.google.com/store/apps/details?id=com.jeevanrakshak)**

## More Library under Jamun 
* **[Volley](https://github.com/Lib-Jamun/Volley.git)**
Library is a set of Custom Classes with UI components for network programming, integration and transaction handling in a better and standard way. This will help developers for making quality use of volley library. 

* **[Scanner](https://github.com/Lib-Jamun/scanner.git)** is a collection of Beautiful Activity which help others to make there own Custom QR/Barcode Scanner. 

* **[Calendar](https://github.com/Lib-Jamun/calendar.git)**
is a collection of Beautiful Activities which help others to make there Fully Custom Calendar View with Single and Multi Date Picker Functionality 

* **[Camera](https://github.com/Lib-Jamun/ui.git)**
library provide you Custom Complete Camera view with full features like Flash, Rotation, Gallery Picker, Focus, Tap to capture, Confirmation window and last but not least croping feature. It also provide you file path in return so that developer can feel a friendly handy way to Deal After. 

* **[Gallery](https://github.com/Lib-Jamun/ui.git)**
have some Beautiful UI Components and Multi files Mode for android Developers to give there app a A Rich look With single and Multi picker Functionality.

* **[UI](https://github.com/Lib-Jamun/ui.git)**
library is a set of UI Views, Custom Component and Collection of Helper Classes which help Developer for making quality Product. Such as Camera, Gallery, Number of Pickers, Calendar, Date Pickers, Dialogs and many more Heler UI and Backend Component.

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
