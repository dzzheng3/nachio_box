package com.ocnyang.qbox.app.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by Naiqing
 *    *     *   *         * *   *       Time:2017/7/6 17:28.
 *    *     *   *         *   * *       Email address:naiqing.zheng@hotmail.com
 *    * * * *   * * * *   *     *.github
 *******************************************************************/


public class FourThreeImageView extends ImageView {
    public FourThreeImageView(Context context) {
        super(context);
    }

    public FourThreeImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        int fourThreeHeight = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(widthSpec) * 3 / 4,
                MeasureSpec.EXACTLY);
        super.onMeasure(widthSpec, fourThreeHeight);
    }
}