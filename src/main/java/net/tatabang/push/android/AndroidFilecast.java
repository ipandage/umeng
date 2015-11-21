package net.tatabang.push.android;

import net.tatabang.push.AndroidNotification;

public class AndroidFilecast extends AndroidNotification {

    public AndroidFilecast() { }

    public void preSetParams(String appkey,String appMasterSecret) throws Exception {
        setAppMasterSecret(appMasterSecret);
        setPredefinedKeyValue("appkey", appkey);
        this.setPredefinedKeyValue("type", "filecast");
    }

	public void setFileId(String fileId) throws Exception {
    	setPredefinedKeyValue("file_id", fileId);
    }
}