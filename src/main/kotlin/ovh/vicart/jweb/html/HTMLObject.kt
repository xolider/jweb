package ovh.vicart.jweb.html

abstract class HTMLObject {

    abstract var root: String

    abstract val closing: Boolean

    private val classes: MutableList<String> = mutableListOf()

    val attributes: MutableMap<String, String> = mutableMapOf()

    var id: String? = null

    val innerNodes: Array<HTMLObject> = arrayOf()

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
}