import gtk.*
fun main(){
    gi().run{
        require("Gtk", "3.0").run {
            startLoop()
            init()
            window().run{
                on("destroy") {
                    mainQuit()  }
                on("delete-event"){ false }
                setDefaultSize(200, 80)
                add( label("eeeee"))
                showAll()
            }
            main()
        }
    }
}