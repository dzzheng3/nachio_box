package com.ocnyang.qbox.app.model.entities.constellation;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by Naiqing
 *    *     *   *         * *   *       Time:2017/3/20 11:23.
 *    *     *   *         *   * *       Email address:naiqing.zheng@hotmail.com
 *    * * * *   * * * *   *     *.github
 *******************************************************************/


public class WeekConstellation extends BaseConstellation{

    /**
     * weekth : 13
     */

    private int weekth;
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getWeekth() {
        return weekth;
    }

    public void setWeekth(int weekth) {
        this.weekth = weekth;
    }

    @Override
    public String toString() {
        return "weekth=" + weekth;
    }
}
