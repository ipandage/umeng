package net.tatabang.push;

import net.tatabang.push.ios.IOSBroadcast;
import net.tatabang.push.ios.IOSUnicast;
import org.junit.Test;

public class IosTest {

	private final UmengProxyIos umengProxy = new UmengProxyIos();

	@Test
	public void testSendIOSBroadcast() throws Exception {
        IOSBroadcast broadcast = new IOSBroadcast("广播测试");
        umengProxy.sendIOSBroadcast(broadcast);
	}

    @Test
    public void testSendIOSUnicast() throws Exception {
        IOSUnicast unicast = new IOSUnicast("单播测试");
        umengProxy.sendIOSUnicast("", unicast);
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
