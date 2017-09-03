package com.ocnyang.qbox.app.network.api;

import com.ocnyang.qbox.app.model.entities.NewsItem;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/*******************************************************************
 * * * * *   * * * *   *     *       Created by Naiqing
 * *     *   *         * *   *       Time:2017/2/17 10:17.
 * *     *   *         *   * *       Email address:naiqing.zheng@hotmail.com
 * * * * *   * * * *   *     *.github
 *******************************************************************/


public interface NewsApi {
    @GET("articles")
    Observable<NewsItem> getNews(@Query("source") String source, @Query("apiKey") String apiKey);
}
