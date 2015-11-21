package net.tatabang.push;

import net.tatabang.push.android.AndroidBroadcast;
import net.tatabang.push.android.AndroidUnicast;
import org.junit.Test;

public class AndroidTest {

	private final UmengProxy umengProxy = new UmengProxy();

	@Test
	public void testSendAndroidUnicast() throws Exception {
        AndroidUnicast unicast = new AndroidUnicast();
        umengProxy.sendAndroidUnicast("", unicast);
	}

    @Test
    public void testSendAndroidBroadcast() throws Exception {
        AndroidBroadcast broadcast = new AndroidBroadcast();
        umengProxy.sendAndroidBroadcast(broadcast);

    }

    @Test
    public void testSendAndroidCustomizedcast() {

    }

    @Test
    public void testSendAndroidCustomizedcastFile() {

    }

    @Test
    public void testSendAndroidGroupcast() {

    }

    @Test
    public void testSendAndroidFilecast() {

    }

}
