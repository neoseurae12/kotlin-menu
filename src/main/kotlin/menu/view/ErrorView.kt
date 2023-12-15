package menu.view

object ErrorView {
  fun printErrorMessage(e: Exception) {
    println(e.message)
  }
}