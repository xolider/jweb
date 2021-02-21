package ovh.vicart.jweb.jweb.html.layouts

import ovh.vicart.jweb.jweb.html.HTMLObject

open class LinearLayout : AbstractLayout() {

    enum class Orientation {
        HORIZONTAL,
        VERTICAL
    }

    var orientation: Orientation = Orientation.HORIZONTAL

    init {
        addClasses(if(orientation == Orientation.HORIZONTAL) "hlinear" else "vlinear")
    }
}