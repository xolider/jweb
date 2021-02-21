package ovh.vicart.jweb.jweb.html.widgets

import ovh.vicart.jweb.jweb.html.HTMLObject
import ovh.vicart.jweb.jweb.html.utils.HString

open class HParagraph(text: String) : HString(text) {

    override var root: String = "p"

    override val closing: Boolean = true
}