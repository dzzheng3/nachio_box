package com.ocnyang.qbox.app.model.entities.textjoke;

import java.util.List;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by Naiqing
 *    *     *   *         * *   *       Time:2017/3/13 13:37.
 *    *     *   *         *   * *       Email address:naiqing.zheng@hotmail.com
 *    * * * *   * * * *   *     *.github
 *******************************************************************/


public class NewTextJokeBean extends BaseJokeBean{
    private ResultBean result;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private List<TextJokeBean> data;

        public List<TextJokeBean> getData() {
            return data;
        }

        public void setData(List<TextJokeBean> data) {
            this.data = data;
        }

    }
}
