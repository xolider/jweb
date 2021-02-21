package ovh.vicart.jweb.jweb.html.layouts

import ovh.vicart.jweb.jweb.html.HTMLObject

class LinearLayout : HTMLObject() {

    override var root: String = "div"

    override val closing: Boolean = true

    init {
        addClasses("")
    }
}