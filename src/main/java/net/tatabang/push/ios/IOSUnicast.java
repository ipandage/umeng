package net.tatabang.push.ios;

import net.tatabang.push.IOSNotification;

public class IOSUnicast extends IOSNotification {

    public IOSUnicast(String alert) {
        super(alert);
    }

    public void preSetParams(String appkey,String appMasterSecret) throws Exception {
        setAppMasterSecret(appMasterSecret);
        setPredefinedKeyValue("appkey", appkey);
        this.setPredefinedKeyValue("type", "unicast");
    }

	public void setDeviceToken(String token) throws Exception {
    	setPredefinedKeyValue("device_tokens", token);
    }
}
