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
public class UmengProxyIos {

    private final String appkey;
    private final String appMasterSecret;

    private PushClient client = new PushClient();

	public UmengProxyIos() {
		this.appkey = UMConfigUtil.getValue("ios_app_key");
		this.appMasterSecret = UMConfigUtil.getValue("ios_master_secret");
	}

	public UmengProxyIos(String appkey, String masterSecret) {
		this.appkey = appkey;
		this.appMasterSecret = masterSecret;
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
     * @param deviceToken
     * @param unicast
     * @throws Exception
     */
    public void sendIOSUnicast(String deviceToken, IOSUnicast unicast) throws Exception {
        unicast.setDeviceToken(deviceToken);
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
