package com.ocnyang.qbox.app.model.entities.textjoke;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by Naiqing
 *    *     *   *         * *   *       Time:2017/3/13 17:18.
 *    *     *   *         *   * *       Email address:naiqing.zheng@hotmail.com
 *    * * * *   * * * *   *     *.github
 *******************************************************************/


public class RefreshJokeStyleEvent {
    private int JokeStyle;

    public RefreshJokeStyleEvent(int jokeStyle) {
        JokeStyle = jokeStyle;
    }

    public int getJokeStyle() {
        return JokeStyle;
    }

    public void setJokeStyle(int jokeStyle) {
        JokeStyle = jokeStyle;
    }
}
