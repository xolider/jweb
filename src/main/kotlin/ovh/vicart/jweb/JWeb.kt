package ovh.vicart.jweb

import ovh.vicart.jweb.theme.BaseTheme
import ovh.vicart.jweb.theme.IJWebTheme

class JWeb private constructor() {

    companion object {
        var theme: IJWebTheme = BaseTheme()

        var contextPath: String = ""

        var staticContentPath: String = ""

        fun configure() : JWebConfigurer {
            return JWebConfigurer()
        }
    }
}

class JWebConfigurer internal constructor() {

    fun withTheme(theme: IJWebTheme) : JWebConfigurer {
        JWeb.theme = theme
        return this
    }

    fun withContextPath(path: String) : JWebConfigurer {
        JWeb.contextPath = if(path == "/") "" else if(path.endsWith('/')) path.substring(0, path.length-1) else path
        return this
    }
}