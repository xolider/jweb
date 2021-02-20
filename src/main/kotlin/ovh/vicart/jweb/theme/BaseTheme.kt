package ovh.vicart.jweb.theme

import ovh.vicart.jweb.html.HTMLObject
import ovh.vicart.jweb.html.widgets.HParagraph
import java.net.URL

class BaseTheme : IJWebTheme {


    override fun <T : HTMLObject> baseClasses(obj: T): Array<String> {
        return when(obj) {
            is HParagraph -> arrayOf("")
            else -> arrayOf()
        }
    }

    override val cssFile: URL
        get() = this.javaClass.classLoader.getResource("css/base.css")!!
    override val javascriptFile: URL?
        get() = null
}