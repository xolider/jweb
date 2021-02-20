package ovh.vicart.jweb.theme

import ovh.vicart.jweb.html.HTMLObject
import java.net.URL

interface JWebTheme {

    fun <T : HTMLObject> baseClasses(obj : T) : Array<String>

    val cssFile: URL

    val javascriptFile: URL?
}