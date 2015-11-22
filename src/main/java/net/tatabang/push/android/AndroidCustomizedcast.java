package net.tatabang.push.android;

import net.tatabang.push.AndroidNotification;

public class AndroidCustomizedcast extends AndroidNotification {

    public String ticker = "";
    public String title = "";
    public String text = "";

    /**
     * @param ticker 通知栏文字
     * @param title 通知标题
     * @param text 通知文字描述
     */
    public AndroidCustomizedcast(String ticker, String title, String text) {
        this.ticker = ticker;
        this.title = title;
        this.text = text;
    }

    public void preSetParams(String appkey,String appMasterSecret) throws Exception {
        setTicker(ticker);
        setTitle(title);
        setText(text);
        setAppMasterSecret(appMasterSecret);
        setPredefinedKeyValue("appkey", appkey);
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
