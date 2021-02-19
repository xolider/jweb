package ovh.vicart.jweb.html.layouts

import ovh.vicart.jweb.html.HTMLObject

class LinearLayout : HTMLObject() {

    override var root: String = "div"

    override val closing: Boolean = true

    init {
        addClasses("")
    }
}