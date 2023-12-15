package menu.controller

import menu.model.Coach
import menu.model.MenuRecommender
import menu.view.InputView
import menu.view.OutputView

class MenuRecommenderController {
  fun startMenuRecommender() {
    val coachNames = InputView.readCoachNames()
    println()
    val coachs: List<Coach> = getCoachs(coachNames)
    InputView.readInedibleMenus(coachs)

    MenuRecommender.recommendDailyMenus(coachs)
    OutputView.showLunchMenuRecommend(coachs)
  }

  fun getCoachs(coachNames: List<String>): List<Coach> {
    val coachs = mutableListOf<Coach>()
    for (coachName in coachNames) {
      coachs.add(Coach(coachName))
    }
    return coachs
  }
}