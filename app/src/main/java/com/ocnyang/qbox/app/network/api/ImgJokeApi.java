package com.ocnyang.qbox.app.network.api;

import com.ocnyang.qbox.app.model.entities.textjoke.NewTextJokeBean;
import com.ocnyang.qbox.app.model.entities.textjoke.RandomTextJoke;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/*******************************************************************
 * * * * *   * * * *   *     *       Created by Naiqing
 * *     *   *         * *   *       Time:2017/3/3 15:24.
 * *     *   *         *   * *       Email address:naiqing.zheng@hotmail.com
 * * * * *   * * * *   *     *.github
 *******************************************************************/


public interface ImgJokeApi {
    @GET("joke/img/text.from")
    Observable<NewTextJokeBean> getNewTextJokeJoke(@Query("key") String appkey,
                                                   @Query("page") int pno,
                                                   @Query("pagesize") int ps);

    @GET("joke/randJoke.php")
    Observable<RandomTextJoke> getRandomTextJoke(@Query("key") String key,@Query("type") String type);
}
