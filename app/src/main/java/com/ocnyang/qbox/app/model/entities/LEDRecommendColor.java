package com.ocnyang.qbox.app.model.entities;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by Naiqing
 *    *     *   *         * *   *       Time:2017/3/9 14:05.
 *    *     *   *         *   * *       Email address:naiqing.zheng@hotmail.com
 *    * * * *   * * * *   *     *.github
 *******************************************************************/


public class LEDRecommendColor {
    private String name;
    private int backgroundColor;
    private int fontColor;

    public LEDRecommendColor(String name, int backgroundColor, int fontColor) {
        this.name = name;
        this.backgroundColor = backgroundColor;
        this.fontColor = fontColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public int getFontColor() {
        return fontColor;
    }

    public void setFontColor(int fontColor) {
        this.fontColor = fontColor;
    }
}
