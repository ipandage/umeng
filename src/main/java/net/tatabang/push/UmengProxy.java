package net.tatabang.push;

import net.tatabang.push.android.AndroidBroadcast;
import net.tatabang.push.android.AndroidCustomizedcast;
import net.tatabang.push.android.AndroidFilecast;
import net.tatabang.push.android.AndroidGroupcast;
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
     * @param broadcast
     * @throws Exception
     */
    public void sendAndroidUnicast(AndroidBroadcast broadcast) throws Exception {
        client.send(broadcast);
    }

    /**
     * 广播（Android）
     * @param broadcast
     * @throws Exception
     */
    public void sendAndroidBroadcast(AndroidBroadcast broadcast) throws Exception {
        broadcast = new AndroidBroadcast(appkey, appMasterSecret);
        broadcast.setDisplayType(AndroidNotification.DisplayType.NOTIFICATION);
        client.send(broadcast);
    }

    /**
     *
     * @param customizedcast
     * @throws Exception
     */
    public void sendAndroidCustomizedcast(AndroidCustomizedcast customizedcast) throws Exception {
        customizedcast = new AndroidCustomizedcast(appkey,appMasterSecret);
        customizedcast.setDisplayType(AndroidNotification.DisplayType.NOTIFICATION);
        client.send(customizedcast);
    }

    /**
     *
     * @param customizedcast
     * @throws Exception
     */
    public void sendAndroidCustomizedcastFile(AndroidCustomizedcast customizedcast) throws Exception {
        customizedcast = new AndroidCustomizedcast(appkey,appMasterSecret);
        customizedcast.setDisplayType(AndroidNotification.DisplayType.NOTIFICATION);
        client.send(customizedcast);
    }

    /**
     * 组播（Android）
     * @param groupcast
     * @throws Exception
     */
    public void sendAndroidGroupcast(AndroidGroupcast groupcast) throws Exception {
        groupcast = new AndroidGroupcast(appkey,appMasterSecret);
        groupcast.setDisplayType(AndroidNotification.DisplayType.NOTIFICATION);
        client.send(groupcast);
    }

    /**
     * 文件播（Android）
     * @param filecast
     * @throws Exception
     */
    public void sendAndroidFilecast(AndroidFilecast filecast) throws Exception {
        filecast = new AndroidFilecast(appkey,appMasterSecret);
        filecast.setDisplayType(AndroidNotification.DisplayType.NOTIFICATION);
        client.send(filecast);
    }


    /**
     * 广播（Ios）
     * @param broadcast
     * @throws Exception
     */
    public void sendIOSBroadcast(IOSBroadcast broadcast) throws Exception {
        broadcast = new IOSBroadcast(appkey,appMasterSecret);
        client.send(broadcast);
    }

    /**
     * 单播（Ios）
     * @param unicast
     * @throws Exception
     */
    public void sendIOSUnicast(IOSUnicast unicast) throws Exception {
        unicast = new IOSUnicast(appkey,appMasterSecret);
        client.send(unicast);
    }

    /**
     * 组播（Ios）
     * @param groupcast
     * @throws Exception
     */
    public void sendIOSGroupcast(IOSGroupcast groupcast) throws Exception {
        groupcast = new IOSGroupcast(appkey,appMasterSecret);
        client.send(groupcast);
    }

    /**
     *
     * @param customizedcast
     * @throws Exception
     */
    public void sendIOSCustomizedcast(IOSCustomizedcast customizedcast) throws Exception {
        customizedcast = new IOSCustomizedcast(appkey,appMasterSecret);
        client.send(customizedcast);
    }

    /**
     * 文件播 （Ios）
     * @param filecast
     * @throws Exception
     */
    public void sendIOSFilecast(IOSFilecast filecast) throws Exception {
        filecast = new IOSFilecast(appkey,appMasterSecret);
        client.send(filecast);
    }

}
