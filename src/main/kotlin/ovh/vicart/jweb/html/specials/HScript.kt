package ovh.vicart.jweb.html.specials

import ovh.vicart.jweb.html.HTMLObject
import java.net.URL

class HScript(_src: URL) : HTMLObject() {

    override var root: String = "script"
    override val closing: Boolean = true

    var src: URL = _src
    set(value) {
        attributes["src"] = value.toString()
        field = value
    }

    init {
        src = _src
    }

}