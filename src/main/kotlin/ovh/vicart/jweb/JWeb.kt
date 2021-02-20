package ovh.vicart.jweb

import ovh.vicart.jweb.theme.BaseTheme
import ovh.vicart.jweb.theme.JWebTheme

class JWeb private constructor() {

    companion object {
        var theme: JWebTheme = BaseTheme()

        var contextPath: String = ""

        var staticContentPath: String = ""

        fun configure() : JWebConfigurer {
            return JWebConfigurer()
        }
    }
}

class JWebConfigurer internal constructor() {

    fun withTheme(theme: JWebTheme) : JWebConfigurer {
        JWeb.theme = theme
        return this
    }

    fun withContextPath(path: String) : JWebConfigurer {
        JWeb.contextPath = path
        return this
    }
}