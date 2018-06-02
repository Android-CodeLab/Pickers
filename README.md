# Jamun-Pickers

Pickers Library provide you a set of different Pickers like Country, Language, Share and Intent Chooser. 

1. `Country Pickers` allow you to access Country picking functionality with great UI/UX design, and there are numberous of function which help you to modify picker as per your requirements. Library has been provided with four custom UI initate mode you can decide how the view of picker can be initate. You can also decide weather picker inheriate Single or Multi Selection property. Library consists of updated collection of country name, code and there flags. We are using APIs base structure to avoid increase in the size of apk due to flag Images. This module Maintain the database so that you don't need to call APIs again and again rather than you can choose when to refresh the Database and fetch new real time data.

2. `Language Picker` provides you read-made Language picker  which is easy to use and comes with great UI/UX, and there are numberous of function which help you to modify picker as per your requirements. Library has been provided with four custom UI initate mode you can decide how the view of picker can be initate. You can also decide weather picker inheriate Single or Multi Selection property.

3. `Intent Picker` helps you to use Custom Intent Chooser with great UI/UX, and there are many of the feature for the customization of already embedded features. So that you can use it easily and gracefully.

4. `Share Dialog Picker` provide you Intent Chooser with great UI/UX. It automatically retrive the sort list of all the apps which can share the file. This functionality saves much of your task. You can also share dialog Picker for sending Large files. For this you just need to call a single function with file as Argument.

### What's New? (0.0.1)
* Stable official Version for Rapid Development.
* Custom UI components with Single and Multi Selection Mode in Country and Language Pickers.
* Easy Calling mechanism with instant reply via Listeners
* Optimized code with Api integration for Country Picker for Flags Images
* Country and Language Pickers have four modes you can optout from these Four mode (i.e. Bottom Sheet, Dialog, Activity, Navigation View)
* All the views in the library are Screen compatible i.e. You can execute this library on different android screens including tabs.

### Quality Measures? for (0.0.1)

The following apps are using this library without facing any kind of Bugs.

* **[SimplyBlood](https://play.google.com/store/apps/details?id=com.simplyblood)**
* **[ZINI](https://play.google.com/store/apps/details?id=ai.zini)**,
* **[Jumboo](https://play.google.com/store/apps/details?id=ai.jumboo)**
* **[USEonRENT](https://play.google.com/store/apps/details?id=com.useonrent)**
* **[QR/Barcode Scanner](https://play.google.com/store/apps/details?id=ai.scanners)** 
* **[Wall-E](https://play.google.com/store/apps/details?id=ai.hdwallpapers)**
* **[SaveBloodIndia](https://play.google.com/store/apps/details?id=com.savebloodindia)**
* **[Rectangle India](https://play.google.com/store/apps/details?id=com.rectangleindia.blooddonation)**
* **[Jeevan Rakshak](https://play.google.com/store/apps/details?id=com.jeevanrakshak)**
* **[QuizHacker](https://play.google.com/store/apps/details?id=in.quiz.hacker)**

# Why this library?

* This library Pickers competible with all screen sizes and device (Tab with 7' inches and 10'inches).
* Library support both orientation that is portrait and landscape.
* Its simple and easy to use.
* Its Customizable (Support Custom Themes). 
* Minimum API is 15, but it'll probably work in API 9 and above, just make sure you test it out (we use `Support Fragment Manager`).  

### All-in-One Setup

The easiest way to add **Pickers** library to your project is by adding it as a dependency to your `build.gradle`. To add picker library you just need to append few lines into your `build.gradle`.
These lines are provided in Integration Part given Below

### Gradle Configuration

**Add the dependency**

Step 1\. Add the jCenter repository to your build file. Add it in your root build.gradle at the end of repositories:

```java
allprojects {
  repositories {
        mavenCentral()
  }
}
```
Step 2\. Add the dependency
```java
dependencies {
        compile 'tk.jamun.ui:pickers:0.0.1'
}
```

### Maven Config

```xml
<dependency>
  <groupId>tk.jamun.ui</groupId>
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

#### Gradle Setup

Step 1\. Add the jCenter repository to your build file. Add it in your root build.gradle at the end of repositories:

```java
allprojects {
  repositories {
        mavenCentral()
  }
}
```
Step 2\. Add the dependency

```java
dependencies {
        compile 'tk.jamun.ui:share:0.0.1'
}
```
#### Maven
```xml
<dependency>
  <groupId>tk.jamun.ui</groupId>
  <artifactId>share</artifactId>
  <version>0.0.1</version>
  <type>aar</type>
</dependency>
```

**Portrait Mode Layout**

Intent Picker | Share Picker
---- | ----
![jamun_pickers_intent](https://user-images.githubusercontent.com/38988514/40280828-794d08f6-5c76-11e8-8217-2cf48acca1e7.png) | ![jamun_pickers_share](https://user-images.githubusercontent.com/38988514/40280819-74b00884-5c76-11e8-9fff-a47f28ac0a0e.png)

**Landscape Mode Layout**

Intent Picker | Share Picker
---- | ----
![jamun_pickers_intent_landscape](https://user-images.githubusercontent.com/38988514/40280829-7a4ea50c-5c76-11e8-9655-0c3900b404c4.png) | ![jamun_pickers_share_landscape](https://user-images.githubusercontent.com/38988514/40280820-75784722-5c76-11e8-8553-129b7d359264.png)

## Country-Pickers

`Country Pickers` allow you to access Country picking functionality with great UI/UX design, and there are numberous of function which help you to modify picker as per your requirements. Library has been provided with four custom UI initate mode you can decide how the view of picker can be initate. You can also decide weather picker inheriate Single or Multi Selection property. Library consists of updated collection of country name, code and there flags.

#### Gradle Setup

Step 1\. Add the jCenter repository to your build file. Add it in your root build.gradle at the end of repositories:

```java
allprojects {
  repositories {
        mavenCentral()
  }
}
```
Step 2\. Add the dependency

```java
dependencies {
        compile 'tk.jamun.ui:country:0.0.1'
}
```
#### Maven
```xml
<dependency>
  <groupId>tk.jamun.ui</groupId>
  <artifactId>country</artifactId>
  <version>0.0.1</version>
  <type>aar</type>
</dependency>
```

**Portrait Mode Layout**

Bottom Sheet View | Navigation View
---- | ----
![jamun_pickers_country_bottom](https://user-images.githubusercontent.com/38988514/40280822-767b522c-5c76-11e8-956a-56320998538d.png) | ![jamun_pickers_country_nav](https://user-images.githubusercontent.com/38988514/40280827-78d7afe8-5c76-11e8-9eec-8f2490bb12fd.png)

Activity View | Dialog View
---- | ----
![jamun_pickers_country_activity](https://user-images.githubusercontent.com/38988514/40280821-7609f28a-5c76-11e8-9106-431d4036877c.png) | ![jamun_pickers_country_dialog](https://user-images.githubusercontent.com/38988514/40280823-772addc8-5c76-11e8-856c-7b121a27214e.png)

## Language-Pickers

 `Language Picker` provides you read-made Language picker  which is easy to use and comes with great UI/UX, and there are numberous of function which help you to modify picker as per your requirements. Library has been provided with four custom UI initate mode you can decide how the view of picker can be initate. You can also decide weather picker inheriate Single or Multi Selection property. You can allow edit the list of country name and language easily.

#### Gradle Setup

Step 1\. Add the jCenter repository to your build file. Add it in your root build.gradle at the end of repositories:

```java
allprojects {
  repositories {
        mavenCentral()
  }
}
```
Step 2\. Add the dependency

```java
dependencies {
        compile 'tk.jamun.ui:language:0.0.1'
}
```
#### Maven

```xml
<dependency>
  <groupId>tk.jamun.ui</groupId>
  <artifactId>language</artifactId>
  <version>0.0.1</version>
  <type>aar</type>
</dependency>
```

**Portrait Mode Layout**

Bottom Sheet View | Navigation View
---- | ----
![jamun_pickers_language_bottom](https://user-images.githubusercontent.com/38988514/40280831-7b417d5e-5c76-11e8-90e8-8223f23c6c26.png) | ![jamun_pickers_language_navigation](https://user-images.githubusercontent.com/38988514/40280818-7438401a-5c76-11e8-91e6-04f662c5aac0.png)

Activity View | Dialog View
---- | ----
![jamun_pickers_language_activity](https://user-images.githubusercontent.com/38988514/40280830-7ac219ce-5c76-11e8-8687-d9ae468d30ee.png) | ![jamun_pickers_language_dialog](https://user-images.githubusercontent.com/38988514/40280832-7bae9e48-5c76-11e8-8652-199b1cffb582.png)

## Landscape Mode

Country-Picker | Language Picker
---- | ----
![jamun_pickers_country_landscape](https://user-images.githubusercontent.com/38988514/40280824-779c6ad8-5c76-11e8-982b-88c1ac482069.png) | ![jamun_pickers_language_landscape](https://user-images.githubusercontent.com/38988514/40280833-7c2e0552-5c76-11e8-868c-9f7a632606d9.png)

## Multi Selection Mode

Country-Picker | Language Picker
---- | ----
![jamun_pickers_country_multi_selection](https://user-images.githubusercontent.com/38988514/40280826-7869cb54-5c76-11e8-92f0-196bc6233055.png) | ![jamun_pickers_language_multi_selection](https://user-images.githubusercontent.com/38988514/40280817-73c8ff16-5c76-11e8-8a2e-7e2bdd92c772.png)

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
            public void singleModeData(ModelCountry modelCountry) {
                super.singleModeData(modelCountry);
                       //Return single selection mode data as an model
            }

            @Override
            public void multiModeData(ArrayList<ModelCountry> countryArrayList) {
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
            public void singleModeData(ModelCountry modelCountry) {
                super.singleModeData(modelCountry);
                       //Return single selection mode data as an model
            }

            @Override
            public void multiModeData(ArrayList<ModelCountry> countryArrayList) {
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
        android:name="tk.jamun.pickers.views.country.PickerCountryNavigation"
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
            public void singleModeData(ModelCountry modelCountry) {
                super.singleModeData(modelCountry);
                       //Return single selection mode data as an model
            }

            @Override
            public void multiModeData(ArrayList<ModelCountry> countryArrayList) {
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
            public void singleModeData(ModelCountry modelCountry) {
                super.singleModeData(modelCountry);
                       //Return single selection mode data as an model
            }

            @Override
            public void multiModeData(ArrayList<ModelCountry> countryArrayList) {
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
        android:name="tk.jamun.pickers.views.language.PickerLanguageNavigation"
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

# Dependency

* Android Support Fragment Library ``v27.1.1``
* Jamun Volley Library **[Volley](https://github.com/Lib-Jamun/Volley.git)**

## Credits

Desgin & Developed by : **[Jatin Sahgal](https://www.linkedin.com/in/jatinsahgal/)**
 (**[Linkedin](https://www.linkedin.com/in/jatinsahgal/)** & **[Website](https://jatin.techcruzers.com)**) 

Content Writer : **[Achal Garg](https://www.linkedin.com/in/techgarg/)**
 (**[Linkedin](https://www.linkedin.com/in/techachal/)** & **[Website](https://achal.techcruzers.com)**) 

Company : **[Techcruzers](https://www.techcruzers.com)**

## More Library under Jamun 
* **[Volley](https://github.com/Lib-Jamun/Volley.git)**
Library is a set of Custom Classes with UI components for network programming, integration and transaction handling in a better and standard way. This will help developers for making quality use of volley library. 

* **[Scanner](https://github.com/Lib-Jamun/scanner.git)** is a collection of Beautiful Activity which help others to make there own Custom QR/Barcode Scanner. 

* **[Calendar](https://github.com/Lib-Jamun/calendar.git)**
is a collection of Beautiful Activities which help others to make there Fully Custom Calendar View with Single and Multi Date Picker Functionality 

* **[Camera](https://github.com/Lib-Jamun/Camera.git)**
library provide you Custom Complete Camera view with full features like Flash, Rotation, Gallery Picker, Focus, Tap to capture, Confirmation window and last but not least croping feature. It also provide you file path in return so that developer can feel a friendly handy way to Deal After. 

* **[Gallery](https://github.com/Lib-Jamun/Gallery.git)**
have some Beautiful UI Components and Multi files Mode for android Developers to give there app a A Rich look With single and Multi picker Functionality.

* **[UI](https://github.com/Lib-Jamun/ui.git)**
library is a set of UI Views, Custom Component and Collection of Helper Classes which help Developer for making quality Product. Such as Camera, Gallery, Number of Pickers, Calendar, Date Pickers, Dialogs and many more Heler UI and Backend Component.

## License
    Copyright (c) 2018 Jatin Sahgal

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
