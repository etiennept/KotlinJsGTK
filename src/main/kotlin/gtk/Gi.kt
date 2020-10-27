package gtk

private external fun require (eee :dynamic) : Gi

external class Gi{
    fun require(b : String,  version: String ) : Gtk
    fun startLoop()
}

fun gi() = require("node-gtk")







