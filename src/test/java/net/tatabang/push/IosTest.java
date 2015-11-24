package net.tatabang.push;

import net.tatabang.push.ios.IOSBroadcast;
import org.junit.Test;

public class IosTest {

	private final UmengProxyIos umengProxy = new UmengProxyIos();

	@Test
	public void testSendIOSBroadcast() throws Exception {
        IOSBroadcast broadcast = new IOSBroadcast("IOS 广播测试");
        umengProxy.sendIOSBroadcast(broadcast);
	}

    @Test
    public void testSendIOSUnicast() {

    }

    @Test
    public void testSendIOSGroupcast() {

    }

    @Test
    public void testSendIOSCustomizedcast() {

    }

    @Test
    public void testSendIOSFilecast() {

    }

}
