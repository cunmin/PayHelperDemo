package com.littleyellow.payhelper.alipay;

/**
 * Created by 小黄 on 2018/4/12.
 */

public interface AliPayListener {

    void onPaySuccess();

    void onPayFailure(String resultStatus, String resultInfo);

}
