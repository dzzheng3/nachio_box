package com.ocnyang.qbox.app.model.entities.textjoke;

import java.util.List;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by Naiqing
 *    *     *   *         * *   *       Time:2017/3/13 13:39.
 *    *     *   *         *   * *       Email address:naiqing.zheng@hotmail.com
 *    * * * *   * * * *   *     *.github
 *******************************************************************/


public class RandomTextJoke extends BaseJokeBean{


    private List<TextJokeBean> result;

    public List<TextJokeBean> getResult() {
        return result;
    }

    public void setResult(List<TextJokeBean> result) {
        this.result = result;
    }

}
