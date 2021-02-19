package ovh.vicart.jweb.html.specials

import ovh.vicart.jweb.html.HTMLObject

class HLink(_rel: String, _href: String): HTMLObject() {

    override var root: String = "link"

    override val closing: Boolean = false

    var rel: String = _rel
        set(value) {
            attributes["rel"] = value
            field = value
    }

    var href: String = _href
    set(value) {
        attributes["href"] = value
        field = value
    }

    init {
        rel = _rel
        href = _href
    }
}