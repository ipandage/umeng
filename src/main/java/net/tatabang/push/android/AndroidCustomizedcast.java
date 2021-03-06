package net.tatabang.push.android;

import net.tatabang.push.AndroidNotification;

public class AndroidCustomizedcast extends AndroidNotification {

    /**
     * @param ticker 通知栏文字
     * @param title 通知标题
     * @param text 通知文字描述
     */
    public AndroidCustomizedcast(String ticker, String title, String text) {
        super(ticker, title, text);
    }

    public void preSetParams(String appkey,String appMasterSecret) throws Exception {
        super.preSetParams(appkey, appMasterSecret);
        this.setPredefinedKeyValue("type", "customizedcast");
    }

	public void setAlias(String alias,String aliasType) throws Exception {
    	setPredefinedKeyValue("alias", alias);
    	setPredefinedKeyValue("alias_type", aliasType);
    }
			
	public void setFileId(String fileId,String aliasType) throws Exception {
    	setPredefinedKeyValue("file_id", fileId);
    	setPredefinedKeyValue("alias_type", aliasType);
    }

}
