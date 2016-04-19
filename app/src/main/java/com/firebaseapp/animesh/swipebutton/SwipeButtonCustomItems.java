package com.firebaseapp.animesh.swipebutton;

import android.graphics.Color;

/**
 * Created by animesh on 4/19/16.
 */
public abstract class SwipeButtonCustomItems {
    //These are the default values if we don't choose to set them:
    public int gradientColor1 = 0xFF333333;
    public int gradientColor2 = 0xFF666666;
    public double gradientColor2Width = 0.8;
    public int gradientColor3 = 0xFF888888;
    public int swipePartitionWidth = 50;
    public String buttonPressText = ">>   SWIPE TO CONFIRM   >> ";

    public int getGradientColor1() {
        return gradientColor1;
    }

    public SwipeButtonCustomItems setGradientColor1(int gradientColor1) {
        this.gradientColor1 = gradientColor1;
        return this;
    }

    public int getGradientColor2() {
        return gradientColor2;
    }

    public SwipeButtonCustomItems setGradientColor2(int gradientColor2) {
        this.gradientColor2 = gradientColor2;
        return this;
    }

    public double getGradientColor2Width() {
        return gradientColor2Width;
    }

    public SwipeButtonCustomItems setGradientColor2Width(double gradientColor2Width) {
        this.gradientColor2Width = gradientColor2Width;
        return this;
    }

    public int getGradientColor3() {
        return gradientColor3;
    }

    public SwipeButtonCustomItems setGradientColor3(int gradientColor3) {
        this.gradientColor3 = gradientColor3;
        return this;
    }

    public int getSwipePartitionWidth() {
        return swipePartitionWidth;
    }

    public SwipeButtonCustomItems setSwipePartitionWidth(int swipePartitionWidth) {
        this.swipePartitionWidth = swipePartitionWidth;
        return this;
    }

    public String getButtonPressText() {
        return buttonPressText;
    }

    public SwipeButtonCustomItems setButtonPressText(String buttonPressText) {
        this.buttonPressText = buttonPressText;
        return this;
    }

    //These methods listed below can be overridden in the instance of SwipeButton and
    public void onButtonPress(){

    }

    public void onSwipeCancel(){

    }

    abstract public void onSwipeConfirm();
}
