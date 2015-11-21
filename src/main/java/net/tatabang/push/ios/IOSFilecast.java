package net.tatabang.push.ios;

import net.tatabang.push.IOSNotification;

public class IOSFilecast extends IOSNotification {

    public IOSFilecast() { }

    public void preSetParams(String appkey,String appMasterSecret) throws Exception {
        setAppMasterSecret(appMasterSecret);
        setPredefinedKeyValue("appkey", appkey);
        this.setPredefinedKeyValue("type", "filecast");
    }

	public void setFileId(String fileId) throws Exception {
    	setPredefinedKeyValue("file_id", fileId);
    }
}
