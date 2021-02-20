package ovh.vicart.jweb.web

import org.junit.jupiter.api.Test
import java.net.URL

class WebContentURLTest {

    @Test
    fun testWebContentURL() {
        val content1 = WebContentURL.getWebContentFrom("/css/test.css", URL("http://localhost.local"))
        assert(content1.toString() == "http://localhost.local/css/test.css")

        val content2 = WebContentURL.getWebContentFrom("css/test.css", URL("http://localhost.local/test"))
        assert(content2.toString() == "http://localhost.local/test/css/test.css")

        val content3 = WebContentURL.getWebContentFrom("/css/test.css", URL("http://localhost.local:87"))
        println(content3.toString())
        assert(content3.toString() == "http://localhost.local:87/css/test.css")

        val content4 = WebContentURL.getWebContentFrom("css/test.css", URL("http://localhost.local:87/test"))
        assert(content4.toString() == "http://localhost.local:87/test/css/test.css")
    }
}