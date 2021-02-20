package ovh.vicart.jweb.web

import java.net.URL

abstract class WebContentURL {

    companion object {
        fun getWebContentFrom(localContent: String, baseURL: URL) : URL {
            var url = ""
            url = if(localContent.startsWith('/')) {
                baseURL.protocol + "://" + baseURL.host + if(baseURL.port != -1) ":${baseURL.port}$localContent" else localContent
            } else {
                "$baseURL/$localContent"
            }
            return URL(url)
        }
    }
}