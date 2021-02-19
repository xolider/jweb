package ovh.vicart.jweb.html.specials

import ovh.vicart.jweb.html.HTMLObject
import java.net.URL

class HScript(_src: String) : HTMLObject() {

    override var root: String = "script"
    override val closing: Boolean = true

    var src: String = _src
    set(value) {
        attributes["src"] = value
        field = value
    }

    init {
        src = _src
    }

}