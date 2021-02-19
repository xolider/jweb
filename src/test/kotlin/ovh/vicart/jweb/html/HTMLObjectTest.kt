package ovh.vicart.jweb.html

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import ovh.vicart.jweb.WebPage
import ovh.vicart.jweb.html.specials.HLink
import ovh.vicart.jweb.html.specials.HScript

class HTMLObjectTest {

    @Test
    fun testRender() {
        val obj = object : HTMLObject() {

            override var root: String = "p"
            override val closing: Boolean = true
        }

        val render = obj.renderHTML()
        assert(render.contains(Regex("<${obj.root}([ ][a-z]*[\",=]*[a-z]*[\"])*></${obj.root}>")))
    }

    @Test
    fun test() {
        val page = WebPage("test")
        val script = HScript("/js/test.js")
        page.scripts.add(script)
        page.links.add(HLink("stylesheet", "/css/test.css"))
        println(page.render())
        assert(true)
    }
}