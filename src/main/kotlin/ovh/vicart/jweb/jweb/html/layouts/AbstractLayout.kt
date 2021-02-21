package ovh.vicart.jweb.jweb.html.layouts

import ovh.vicart.jweb.jweb.html.HTMLObject

abstract class AbstractLayout : HTMLObject() {

    override var root: String = "div"

    override val closing: Boolean = true
}