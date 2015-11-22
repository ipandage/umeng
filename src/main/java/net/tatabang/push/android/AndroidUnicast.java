package net.tatabang.push.android;

import net.tatabang.push.AndroidNotification;

public class AndroidUnicast extends AndroidNotification {

    public String ticker = "";
    public String title = "";
    public String text = "";

    /**
     * @param ticker 通知栏文字
     * @param title 通知标题
     * @param text 通知文字描述
     */
    public AndroidUnicast(String ticker, String title, String text) {
        this.ticker = ticker;
        this.title = title;
        this.text = text;
    }

    public void preSetParams(String appkey,String appMasterSecret) throws Exception {
        setTicker(ticker);
        setTitle(title);
        setText(text);
        setAppMasterSecret(appMasterSecret);
        setPredefinedKeyValue("appkey", appkey);
        this.setPredefinedKeyValue("type", "unicast");
    }

	public void setDeviceToken(String token) throws Exception {
    	setPredefinedKeyValue("device_tokens", token);
    }

}