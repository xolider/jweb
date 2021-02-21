package ovh.vicart.jweb.jweb.html.specials

import ovh.vicart.jweb.jweb.html.HTMLObject
import java.net.URL

class HLink(_rel: String, _href: URL): HTMLObject() {

    override var root: String = "link"

    override val closing: Boolean = false

    var rel: String = _rel
        set(value) {
            attributes["rel"] = value
            field = value
    }

    var href: URL = _href
    set(value) {
        attributes["href"] = value.toString()
        field = value
    }

    init {
        rel = _rel
        href = _href
    }
}