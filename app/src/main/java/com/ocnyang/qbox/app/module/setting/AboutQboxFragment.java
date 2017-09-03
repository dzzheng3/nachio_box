package com.ocnyang.qbox.app.module.setting;

import com.ocnyang.qbox.app.R;
import com.ocnyang.qbox.app.base.BaseFragment;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by Naiqing
 *    *     *   *         * *   *       Time:2017/4/7 14:09.
 *    *     *   *         *   * *       Email address:naiqing.zheng@hotmail.com
 *    * * * *   * * * *   *     *.github
 *******************************************************************/


public class AboutQboxFragment extends BaseFragment{


    public AboutQboxFragment() {
    }

    public static AboutQboxFragment newInstance() {
        AboutQboxFragment fragment = new AboutQboxFragment();
        return fragment;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_about_qbox;
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
