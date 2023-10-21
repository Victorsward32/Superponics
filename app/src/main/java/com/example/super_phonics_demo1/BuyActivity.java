package com.example.super_phonics_demo1;

import static com.example.super_phonics_demo1.R.id.fert1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BuyActivity extends AppCompatActivity {
    TextView t1,t2,t3,t4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        t1 = findViewById(fert1);
        t2 = findViewById(R.id.f2);
        t3 = findViewById(R.id.f3);
        t4 = findViewById(R.id.f4);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.amazon.in/Garden-Tomato-Nutrients-Advance-Package/dp/B0BHWRXBXN";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.plantit-growit.com/product/hydro-chilli-pepper-feed-1l/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.amazon.in/City-Greens-Hydroponic-Hydroponics-Nutrients/dp/B097MJRDR8/ref=asc_df_B097MJRDR8/?tag=googleshopdes-21&linkCode=df0&hvadid=397009291831&hvpos=&hvnetw=g&hvrand=2031038251862210118&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9303196&hvtargid=pla-1394025963505&psc=1&ext_vrnc=hi";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.amazon.in/Garden-Water-Soluble-Plant-Control/dp/B09NTR9M2C/ref=asc_df_B09NTR9M2C/?tag=googleshopdes-21&linkCode=df0&hvadid=544920781431&hvpos=&hvnetw=g&hvrand=12766024395577270025&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9303196&hvtargid=pla-1592761598121&th=1";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}