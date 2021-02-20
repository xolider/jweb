package ovh.vicart.jweb.html.widgets

import ovh.vicart.jweb.html.HTMLObject
import ovh.vicart.jweb.html.utils.HString

class HButton(text: String) : HTMLObject() {

    override var root: String = "button"
    override val closing: Boolean = true

    var text = text
        set(value) {
            innerNodes[0] = HString(value)
            field = value
        }

    init {
        this.text = text
    }


}