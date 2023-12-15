package menu

import menu.constant.GuideMessage.GuideTitle.START_LUNCH_MENU_RECOMMEND
import menu.controller.MenuRecommenderController

fun main() {
  println(START_LUNCH_MENU_RECOMMEND)
  println()
  MenuRecommenderController().startMenuRecommender()
}
