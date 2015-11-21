package net.tatabang.push.android;

import net.tatabang.push.AndroidNotification;

public class AndroidUnicast extends AndroidNotification {

    public AndroidUnicast() { }

    public void preSetParams(String appkey,String appMasterSecret) throws Exception {
        setAppMasterSecret(appMasterSecret);
        setPredefinedKeyValue("appkey", appkey);
        this.setPredefinedKeyValue("type", "unicast");
    }

	public void setDeviceToken(String token) throws Exception {
    	setPredefinedKeyValue("device_tokens", token);
    }

}