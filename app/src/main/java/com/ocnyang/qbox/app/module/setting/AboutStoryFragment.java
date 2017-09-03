package com.ocnyang.qbox.app.module.setting;

import com.ocnyang.qbox.app.R;
import com.ocnyang.qbox.app.base.BaseFragment;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by Naiqing
 *    *     *   *         * *   *       Time:2017/4/7 14:09.
 *    *     *   *         *   * *       Email address:naiqing.zheng@hotmail.com
 *    * * * *   * * * *   *     *.github
 *******************************************************************/


public class AboutStoryFragment extends BaseFragment{


    public AboutStoryFragment() {
    }

    public static AboutStoryFragment newInstance() {
        AboutStoryFragment fragment = new AboutStoryFragment();
        return fragment;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_about_story;
    }

    @Override
    public void initView() {

    }

    @Override
    protected void managerArguments() {

    }

    @Override
    public String getUmengFragmentName() {
        return getContext().getClass().getSimpleName()+"-"
                +this.getClass().getSimpleName();
    }
}
