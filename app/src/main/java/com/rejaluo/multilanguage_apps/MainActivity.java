package com.rejaluo.multilanguage_apps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        String languagePref="en";

        switch(view.getId()) {
            case R.id.radio_english:
                if (checked)
                    languagePref = "en";
                    break;
            case R.id.radio_indonesian:
                if (checked)
                    languagePref = "ind";
                    break;
            case R.id.radio_malay:
                if (checked)
                    languagePref = "ml";
                    break;
            case R.id.radio_german:
                if (checked)
                    languagePref = "gr";
                    break;
        }

        if (!languagePref.isEmpty()) {
            LocaleHelper.setLocale(MainActivity.this, languagePref);
            recreate();
        }
    }
}
