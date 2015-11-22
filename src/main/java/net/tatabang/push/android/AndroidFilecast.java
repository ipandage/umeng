package net.tatabang.push.android;

import net.tatabang.push.AndroidNotification;

public class AndroidFilecast extends AndroidNotification {

    /**
     * @param ticker 通知栏文字
     * @param title 通知标题
     * @param text 通知文字描述
     */
    public AndroidFilecast(String ticker, String title, String text) {
        super(ticker, title, text);
    }

    public void preSetParams(String appkey,String appMasterSecret) throws Exception {
        super.preSetParams(appkey, appMasterSecret);
        this.setPredefinedKeyValue("type", "filecast");
    }

	public void setFileId(String fileId) throws Exception {
    	setPredefinedKeyValue("file_id", fileId);
    }
}