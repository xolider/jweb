package ovh.vicart.jweb.jweb.html.utils

import ovh.vicart.jweb.jweb.html.HTMLObject

open class HString(val text: String): HTMLObject() {

    override var root: String = ""
    override val closing: Boolean = false

    override fun renderHTML(): String {
        return text
    }
}