package net.tatabang.push.ios;

import org.json.JSONObject;

import net.tatabang.push.IOSNotification;

public class IOSGroupcast extends IOSNotification {

    public IOSGroupcast(String alert) {
        super(alert);
    }

    public void preSetParams(String appkey,String appMasterSecret) throws Exception {
        setAppMasterSecret(appMasterSecret);
        setPredefinedKeyValue("appkey", appkey);
        this.setPredefinedKeyValue("type", "groupcast");
    }

	public void setFilter(JSONObject filter) throws Exception {
    	setPredefinedKeyValue("filter", filter);
    }
}
