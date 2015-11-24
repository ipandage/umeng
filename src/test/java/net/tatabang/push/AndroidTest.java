package net.tatabang.push;

import net.tatabang.push.android.*;
import org.junit.Test;

public class AndroidTest {

	private final UmengProxyAndroid umengProxy = new UmengProxyAndroid();

	@Test
	public void testSendAndroidUnicast() throws Exception {
        AndroidUnicast unicast = new AndroidUnicast("Unicast","测试","测试");
        umengProxy.sendAndroidUnicast("", unicast);
	}

    @Test
    public void testSendAndroidBroadcast() throws Exception {
        AndroidBroadcast broadcast = new AndroidBroadcast("Broadcast","测试","测试");
        umengProxy.sendAndroidBroadcast(broadcast);
    }

    @Test
    public void testSendAndroidCustomizedcast() throws Exception {
        AndroidCustomizedcast customizedcast = new AndroidCustomizedcast("Customizedcast","测试","测试");
        umengProxy.sendAndroidCustomizedcast(customizedcast);
    }

    @Test
    public void testSendAndroidCustomizedcastFile() throws Exception {
        AndroidCustomizedcast customizedcast = new AndroidCustomizedcast("CustomizedcastFile","测试","测试");
        umengProxy.sendAndroidCustomizedcastFile(customizedcast);
    }

    @Test
    public void testSendAndroidGroupcast() throws Exception {
        AndroidGroupcast groupcast = new AndroidGroupcast("Groupcast","测试","测试");
        umengProxy.sendAndroidGroupcast(groupcast);
    }

    @Test
    public void testSendAndroidFilecast() throws Exception {
        AndroidFilecast filecast = new AndroidFilecast("Filecast","测试","测试");
        umengProxy.sendAndroidFilecast(filecast);
    }

}
