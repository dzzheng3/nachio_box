package com.ocnyang.qbox.app.network.api;

import com.ocnyang.qbox.app.model.entities.Constellation;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/*******************************************************************
 * * * * *   * * * *   *     *       Created by Naiqing
 * *     *   *         * *   *       Time:2017/3/3 15:45.
 * *     *   *         *   * *       Email address:naiqing.zheng@hotmail.com
 * * * * *   * * * *   *     *.github
 *******************************************************************/


public interface ConstellationApi {
    @GET("constellation/getAll")
    Observable<Constellation> getConstellation(
            @Query("consName") String consName,
            @Query("type") String type,
            @Query("key") String key);
}
