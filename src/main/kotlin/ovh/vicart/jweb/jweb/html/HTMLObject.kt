package ovh.vicart.jweb.jweb.html

import ovh.vicart.jweb.jweb.JWeb
import java.util.*

abstract class HTMLObject {

    abstract var root: String

    abstract val closing: Boolean

    val classes: MutableList<String> = JWeb.theme.baseClasses(this).toMutableList()

    val attributes: MutableMap<String, String> = mutableMapOf()

    var id: String? = null

    var innerNodes: MutableList<HTMLObject> = mutableListOf()
        private set

    val styles : MutableMap<String, String> = mutableMapOf()

    fun addClasses(vararg cssClasses: String) : HTMLObject {
        classes.addAll(cssClasses)
        return this
    }

    open fun renderHTML() : String {
        val builder = StringBuilder()
        builder.append("<$root")
        attributes.forEach {
            builder.append(" ${it.key}=\"${it.value}\"")
        }
        if(classes.size > 0) {
            builder.append(" class=\"")
            classes.forEach {
                builder.append("$it ")
            }
            builder.append("\"")
        }
        if(styles.isNotEmpty()) {
            builder.append(" style=\"")
            styles.forEach {
                builder.append("${it.key}: ${it.value}; ")
            }
            builder.append("\"")
        }
        if(id != null) {
            builder.append(" id=\"$id\"")
        }
        builder.append(">")
        if(closing) {
            innerNodes.forEach {
                builder.append(it.renderHTML())
            }
            builder.append("</$root>")
        }

        return builder.toString()
    }

    fun reorderNodes(reorder: (HTMLObject) -> Int) {
        val copy = innerNodes.toTypedArray()
        for(node in innerNodes) {
            val newPos = reorder(node)
            copy[newPos] = node
        }
        innerNodes = copy.toMutableList()
    }
}