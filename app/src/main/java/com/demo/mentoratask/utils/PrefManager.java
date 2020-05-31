package com.demo.mentoratask.utils;

import android.content.Context;
import android.content.SharedPreferences;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class PrefManager {

        private SharedPreferences pref;
        private SharedPreferences.Editor editor;
         Context _context;

        // shared pref mode
        private int PRIVATE_MODE = 0;

        // Shared preferences file name
        private static final String PREF_NAME = "welcome";

        private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";


        String currentDate ;

        public PrefManager(Context context) {
            this._context = context;
            pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
            editor = pref.edit();
        }

        public void setFirstTimeLaunch(boolean isFirstTime) {
            editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
            editor.commit();
        }

        public boolean isFirstTimeLaunch() {
            return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
        }

        public void setFirst(boolean isFirstTime, String currentDate) {
            editor.putString("appOpenDate", currentDate); //save date when app open
            editor.putBoolean("isShowWelcomeScreen", isFirstTime);
            editor.apply();
        }

        public boolean isFirst() {
            return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
        }

        public String dates(String appOpenDate, String s) {
            return pref.getString("appOpenDate", "");
        }






}
