package ovh.vicart.jweb

import ovh.vicart.jweb.html.HTMLObject
import ovh.vicart.jweb.html.specials.HLink
import ovh.vicart.jweb.html.specials.HMeta
import ovh.vicart.jweb.html.specials.HScript
import java.io.File

class WebPage(val title: String) {

    val metas: MutableList<HMeta> = mutableListOf()

    val links: MutableList<HLink> = mutableListOf()

    private val base = File(javaClass.classLoader.getResource("base.html")!!.toURI()).readText()

    val body: MutableList<HTMLObject> = mutableListOf()

    val scripts: MutableList<HScript> = mutableListOf()

    fun render(): String {
        return base.replace("%title%", title)
            .replace("%meta%", metas.stream().map { it.renderHTML() }.reduce {old, new -> old + new}.orElse(""))
            .replace("%link%", links.stream().map { it.renderHTML() }.reduce {old, new -> old + new}.orElse(""))
            .replace("%body%", body.stream().map { it.renderHTML() }.reduce {old, new -> old + new}.orElse(""))
            .replace("%script%", scripts.stream().map { it.renderHTML() }.reduce {old, new -> old + new}.orElse(""))
    }
}