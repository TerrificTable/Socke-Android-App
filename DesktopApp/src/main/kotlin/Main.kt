import gui.AppFrame
import javax.swing.JFrame

fun main() {
    val frame = AppFrame()
    frame.title = "Socke ToDo"
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE



    frame.isVisible = true
}
