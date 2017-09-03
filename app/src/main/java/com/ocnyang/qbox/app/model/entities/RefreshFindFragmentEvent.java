package com.ocnyang.qbox.app.model.entities;

/*******************************************************************
 * * * * *   * * * *   *     *       Created by Naiqing
 * *     *   *         * *   *       Time:2017/3/3 11:04.
 * *     *   *         *   * *       Email address:naiqing.zheng@hotmail.com
 * * * * *   * * * *   *     *.github
 *******************************************************************/


public class RefreshFindFragmentEvent {
    public int flagSmall;
    public int flagBig;

    public RefreshFindFragmentEvent() {
    }

    public RefreshFindFragmentEvent(int flagSmall, int flagBig) {
        this.flagSmall = flagSmall;
        this.flagBig = flagBig;
    }

    public int getFlagSmall() {
        return flagSmall;
    }

    public void setFlagSmall(int flagSmall) {
        this.flagSmall = flagSmall;
    }

    public int getFlagBig() {
        return flagBig;
    }

    public void setFlagBig(int flagBig) {
        this.flagBig = flagBig;
    }
}
