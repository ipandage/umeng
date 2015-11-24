package net.tatabang.push.ios;

import net.tatabang.push.IOSNotification;

public class IOSBroadcast extends IOSNotification {

    public IOSBroadcast(String alert) {
        super(alert);
    }

    public void preSetParams(String appkey,String appMasterSecret) throws Exception {
        setAppMasterSecret(appMasterSecret);
        setPredefinedKeyValue("appkey", appkey);
        this.setPredefinedKeyValue("type", "broadcast");
    }
}
