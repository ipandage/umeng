package net.tatabang.push.android;

import org.json.JSONObject;

import net.tatabang.push.AndroidNotification;

public class AndroidGroupcast extends AndroidNotification {

    /**
     * @param ticker 通知栏文字
     * @param title 通知标题
     * @param text 通知文字描述
     */
    public AndroidGroupcast(String ticker, String title, String text) {
        super(ticker, title, text);
    }

    public void preSetParams(String appkey,String appMasterSecret) throws Exception {
        super.preSetParams(appkey, appMasterSecret);
        this.setPredefinedKeyValue("type", "groupcast");
    }

	public void setFilter(JSONObject filter) throws Exception {
    	setPredefinedKeyValue("filter", filter);
    }
}
