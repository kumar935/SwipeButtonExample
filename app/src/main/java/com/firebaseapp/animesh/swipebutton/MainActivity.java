package com.firebaseapp.animesh.swipebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SwipeButton mSwipeButton = (SwipeButton) findViewById(R.id.my_swipe_button);

        SwipeButtonCustomItems swipeButtonSettings = new SwipeButtonCustomItems() {
            @Override
            public void onSwipeConfirm() {
                Log.d("NEW_STUFF", "New swipe confirm callback");
            }
        };

        swipeButtonSettings
                .setButtonPressText(">> NEW TEXT! >>")
                .setGradientColor1(0xFF888888)
                .setGradientColor2(0xFF666666)
                .setGradientColor2Width(60)
                .setGradientColor3(0xFF333333)
                .setPostConfirmationColor(0xFF888888)
                .setActionConfirmDistanceFraction(0.7)
                .setActionConfirmText("Action Confirmed");

        if (mSwipeButton != null) {
            mSwipeButton.setSwipeButtonCustomItems(swipeButtonSettings);
        }
    }
}
