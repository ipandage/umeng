package net.tatabang.push.android;

import net.tatabang.push.AndroidNotification;

public class AndroidBroadcast extends AndroidNotification {

    public AndroidBroadcast() { }

    public void preSetParams(String appkey,String appMasterSecret) throws Exception {
        setAppMasterSecret(appMasterSecret);
        setPredefinedKeyValue("appkey", appkey);
        this.setPredefinedKeyValue("type", "broadcast");
    }
}
