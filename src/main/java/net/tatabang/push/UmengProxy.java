package net.tatabang.push;

import net.tatabang.push.android.*;
import net.tatabang.push.ios.*;
import net.tatabang.push.util.UMConfigUtil;

/**
 * 友盟消息接口实现
 * 
 * @author xingang
 * @date 2015年11月21日
 */
public class UmengProxy {

    private final String appkey;
    private final String appMasterSecret;

    private PushClient client = new PushClient();

	public UmengProxy() {
		this.appkey = UMConfigUtil.getValue("app_key");
		this.appMasterSecret = UMConfigUtil.getValue("master_secret");
	}

	public UmengProxy(String appkey, String masterSecret) {
		this.appkey = appkey;
		this.appMasterSecret = masterSecret;
	}

    /**
     * 单播（Android）
     * @param deviceToken
     * @param unicast
     * @throws Exception
     */
    public void sendAndroidUnicast(String deviceToken, AndroidUnicast unicast) throws Exception {
        unicast.preSetParams(appkey, appMasterSecret);
        client.send(unicast);
    }

    /**
     * 广播（Android）
     * @param broadcast
     * @throws Exception
     */
    public void sendAndroidBroadcast(AndroidBroadcast broadcast) throws Exception {
        broadcast.preSetParams(appkey, appMasterSecret);
        broadcast.setDisplayType(AndroidNotification.DisplayType.NOTIFICATION);
        client.send(broadcast);
    }

    /**
     *
     * @param customizedcast
     * @throws Exception
     */
    public void sendAndroidCustomizedcast(AndroidCustomizedcast customizedcast) throws Exception {
        customizedcast.preSetParams(appkey, appMasterSecret);
        customizedcast.setDisplayType(AndroidNotification.DisplayType.NOTIFICATION);
        client.send(customizedcast);
    }

    /**
     *
     * @param customizedcast
     * @throws Exception
     */
    public void sendAndroidCustomizedcastFile(AndroidCustomizedcast customizedcast) throws Exception {
        customizedcast.preSetParams(appkey, appMasterSecret);
        customizedcast.setDisplayType(AndroidNotification.DisplayType.NOTIFICATION);
        client.send(customizedcast);
    }

    /**
     * 组播（Android）
     * @param groupcast
     * @throws Exception
     */
    public void sendAndroidGroupcast(AndroidGroupcast groupcast) throws Exception {
        groupcast.preSetParams(appkey, appMasterSecret);
        groupcast.setDisplayType(AndroidNotification.DisplayType.NOTIFICATION);
        client.send(groupcast);
    }

    /**
     * 文件播（Android）
     * @param filecast
     * @throws Exception
     */
    public void sendAndroidFilecast(AndroidFilecast filecast) throws Exception {
        filecast.preSetParams(appkey, appMasterSecret);
        filecast.setDisplayType(AndroidNotification.DisplayType.NOTIFICATION);
        client.send(filecast);
    }


    /**
     * 广播（Ios）
     * @param broadcast
     * @throws Exception
     */
    public void sendIOSBroadcast(IOSBroadcast broadcast) throws Exception {
        broadcast.preSetParams(appkey, appMasterSecret);
        client.send(broadcast);
    }

    /**
     * 单播（Ios）
     * @param unicast
     * @throws Exception
     */
    public void sendIOSUnicast(IOSUnicast unicast) throws Exception {
        unicast.preSetParams(appkey, appMasterSecret);
        client.send(unicast);
    }

    /**
     * 组播（Ios）
     * @param groupcast
     * @throws Exception
     */
    public void sendIOSGroupcast(IOSGroupcast groupcast) throws Exception {
        groupcast.preSetParams(appkey, appMasterSecret);
        client.send(groupcast);
    }

    /**
     *
     * @param customizedcast
     * @throws Exception
     */
    public void sendIOSCustomizedcast(IOSCustomizedcast customizedcast) throws Exception {
        customizedcast.preSetParams(appkey, appMasterSecret);
        client.send(customizedcast);
    }

    /**
     * 文件播 （Ios）
     * @param filecast
     * @throws Exception
     */
    public void sendIOSFilecast(IOSFilecast filecast) throws Exception {
        filecast.preSetParams(appkey, appMasterSecret);
        client.send(filecast);
    }

}
