package gtk

external class Gtk{
    fun init()
    fun main()
    fun mainQuit()
}

fun Gtk.window(): Window {
    val  self = this
    return js("new self.Window()")
}

fun Gtk.label(label  :  String ) : Label{
    val  self = this
    val label = label
    return js("new self.Label({ label : label })")
}