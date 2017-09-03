package com.ocnyang.qbox.app.network.api;

import com.ocnyang.qbox.app.model.entities.WechatItem;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/*******************************************************************
 * * * * *   * * * *   *     *       Created by Naiqing
 * *     *   *         * *   *       Time:2017/2/24 14:53.
 * *     *   *         *   * *       Email address:naiqing.zheng@hotmail.com
 * * * * *   * * * *   *     *.github
 *******************************************************************/


public interface WechatApi {
    @GET("weixin/query")
    Observable<WechatItem> getWechat(@Query("key") String appkey,
                                     @Query("pno") int pno,
                                     @Query("ps") int ps);
}
