package net.tatabang.push.android;

import net.tatabang.push.AndroidNotification;

public class AndroidUnicast extends AndroidNotification {

    /**
     * @param ticker 通知栏文字
     * @param title 通知标题
     * @param text 通知文字描述
     */
    public AndroidUnicast(String ticker, String title, String text) {
        super(ticker, title, text);
    }

    public void preSetParams(String appkey,String appMasterSecret) throws Exception {
        super.preSetParams(appkey, appMasterSecret);
        this.setPredefinedKeyValue("type", "unicast");
    }

	public void setDeviceToken(String token) throws Exception {
    	setPredefinedKeyValue("device_tokens", token);
    }

}