package ovh.vicart.jweb.jweb.theme

import ovh.vicart.jweb.jweb.html.HTMLObject
import ovh.vicart.jweb.jweb.html.widgets.HParagraph
import java.net.URL

class BootstrapTheme : IJWebTheme {

    override fun <T : HTMLObject> baseClasses(obj: T): Array<String> {
        return when(obj) {
            is HParagraph -> arrayOf("")
            else -> arrayOf()
        }
    }

    override val cssFile: URL
        get() = URL("")
    override val javascriptFile: URL?
        get() = null


}