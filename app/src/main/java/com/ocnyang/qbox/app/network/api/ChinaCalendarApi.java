package com.ocnyang.qbox.app.network.api;

import com.ocnyang.qbox.app.model.entities.ChinaCalendar;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/*******************************************************************
 * * * * *   * * * *   *     *       Created by Naiqing
 * *     *   *         * *   *       Time:2017/3/3 15:24.
 * *     *   *         *   * *       Email address:naiqing.zheng@hotmail.com
 * * * * *   * * * *   *     *.github
 *******************************************************************/


public interface ChinaCalendarApi {
    @GET("calendar/day")
    Observable<ChinaCalendar> getChinaCalendar(@Query("key") String key, @Query("date") String date);
}
