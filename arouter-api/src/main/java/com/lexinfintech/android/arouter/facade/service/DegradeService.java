package com.lexinfintech.android.arouter.facade.service;

import android.content.Context;

import com.lexinfintech.android.arouter.facade.Postcard;
import com.lexinfintech.android.arouter.facade.template.IProvider;

/**
 * Provide degrade service for router, you can do something when route has lost.
 *
 * @author Alex <a href="mailto:zhilong.liu@aliyun.com">Contact me.</a>
 * @version 1.0
 * @since 2016/9/22 14:51
 */
public interface DegradeService extends IProvider {

    /**
     * Router has lost.
     *
     * @param postcard meta
     */
    void onLost(Context context, Postcard postcard);
}
