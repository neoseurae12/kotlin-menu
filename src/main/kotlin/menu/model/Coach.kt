package menu.model

class Coach(val name: String) {
  lateinit var inedibleMenus: List<String>
  val recommendedMenus: MutableList<String> = mutableListOf()
}