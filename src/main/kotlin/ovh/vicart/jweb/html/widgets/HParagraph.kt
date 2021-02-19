package ovh.vicart.jweb.html.widgets

import ovh.vicart.jweb.html.HTMLObject
import ovh.vicart.jweb.html.utils.HString

class HParagraph(text: String) : HTMLObject() {

    override var root: String = "p"

    override val closing: Boolean = true

    var text = text
    set(value) {
        field = value
        innerNodes[0] = HString(value)
    }
}