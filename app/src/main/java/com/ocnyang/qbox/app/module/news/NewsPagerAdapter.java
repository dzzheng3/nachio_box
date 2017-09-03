package com.ocnyang.qbox.app.module.news;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;


/*******************************************************************
 * * * * *   * * * *   *     *       Created by Naiqing
 * *     *   *         * *   *       Time:2017/2/15 14:26.
 * *     *   *         *   * *       Email address:naiqing.zheng@hotmail.com
 * * * * *   * * * *   *     *.github
 *******************************************************************/


public class NewsPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFragmentList;

    public NewsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public NewsPagerAdapter(FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        mFragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList==null?0:mFragmentList.size();
    }
}
