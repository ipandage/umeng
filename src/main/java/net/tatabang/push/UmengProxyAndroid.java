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
public class UmengProxyAndroid {

    private final String appkey;
    private final String appMasterSecret;

    private PushClient client = new PushClient();

	public UmengProxyAndroid() {
		this.appkey = UMConfigUtil.getValue("android_app_key");
		this.appMasterSecret = UMConfigUtil.getValue("android_master_secret");
	}

	public UmengProxyAndroid(String appkey, String masterSecret) {
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
        unicast.setDeviceToken(deviceToken);
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
     * todo 修改
     * @param customizedcast
     * @throws Exception
     */
    public void sendAndroidCustomizedcastFile(AndroidCustomizedcast customizedcast) throws Exception {
        customizedcast.preSetParams(appkey, appMasterSecret);
        customizedcast.setDisplayType(AndroidNotification.DisplayType.NOTIFICATION);
        client.uploadContents(appkey, appMasterSecret, "");
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

}
