package menu.view

import menu.constant.GuideMessage.GuideTitle.END_MENU_RECOMMEND
import menu.constant.GuideMessage.GuideTitle.MENU_RECOMMEND_RESULT
import menu.constant.GuideMessage.GuideTitle.HEADER
import menu.model.Coach
import menu.model.MenuRecommender

object OutputView {
  fun showLunchMenuRecommend(coachs: List<Coach>) {
    println(MENU_RECOMMEND_RESULT)
    println(HEADER)

    printDailyCategories()
    printDailyMenus(coachs)
    println(END_MENU_RECOMMEND)
  }

  private fun printDailyCategories() {
    val dailyCategories = MenuRecommender.dailyCategories.map { it.categoryName }
    println(dailyCategories.joinToString(prefix = "[ 카테고리 | ", postfix = " ]", separator = " | "))
  }

  private fun printDailyMenus(coachs: List<Coach>) {
    for (coach in coachs) {
      val dailyMenus = coach.recommendedMenus
      println(dailyMenus.joinToString(prefix = "[ ${coach.name} | ", postfix = " ]", separator = " | "))
    }
    println()
  }
}