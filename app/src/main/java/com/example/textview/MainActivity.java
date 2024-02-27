package com.example.textview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button more = findViewById(R.id.more);
        Button less = findViewById(R.id.less);

        ArrayList<TextView> textViewlist = new ArrayList<TextView>();
        ConstraintLayout layout = findViewById(R.id.layout_id);

        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for( int i = 0; i < layout.getChildCount(); i++ ) {

                    if (layout.getChildAt(i) instanceof TextView) {
                        float sizeText = ((TextView) layout.getChildAt(i)).getTextSize();
                        ((TextView) layout.getChildAt(i)).setTextSize(TypedValue.COMPLEX_UNIT_PX, sizeText + 1);
                    }
                }
            }
        });

        less.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for( int i = 0; i < layout.getChildCount(); i++ ) {

                    if (layout.getChildAt(i) instanceof TextView) {
                        float sizeText = ((TextView) layout.getChildAt(i)).getTextSize();
                        ((TextView) layout.getChildAt(i)).setTextSize(TypedValue.COMPLEX_UNIT_PX, sizeText - 1);
                    }
                }
            }
        });
    }
}