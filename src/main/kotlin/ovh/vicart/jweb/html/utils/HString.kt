package ovh.vicart.jweb.html.utils

import ovh.vicart.jweb.html.HTMLObject

class HString(val text: String): HTMLObject() {

    override var root: String = ""

    override val closing: Boolean = false

    override fun renderHTML(): String {
        return text
    }
}