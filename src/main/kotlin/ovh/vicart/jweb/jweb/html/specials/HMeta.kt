package ovh.vicart.jweb.jweb.html.specials

import ovh.vicart.jweb.jweb.html.HTMLObject

open class HMeta : HTMLObject() {

    override var root: String = "meta"

    override val closing: Boolean = false

    companion object {
        fun createViewport(initialScale: Double = 1.0) : HMeta {
            val meta = HMeta()
            meta.attributes["name"] = "viewport"
            meta.attributes["content"] = "width=device-width, initial-scale=$initialScale"
            return meta
        }
    }
}