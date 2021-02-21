package ovh.vicart.jweb.jweb.theme

import ovh.vicart.jweb.jweb.html.HTMLObject
import java.net.URL

interface IJWebTheme {

    fun <T : HTMLObject> baseClasses(obj : T) : Array<String>

    val cssFile: URL

    val javascriptFile: URL?

    val layoutCssFile: URL
        get() = javaClass.classLoader.getResource("ovh/vicart/jweb/jweb/theme/css/layouts.css")!!
}