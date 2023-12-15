package menu.controller

import menu.model.Coach
import menu.view.InputView

class MenuRecommenderController {
  fun startMenuRecommender() {
    val coachNames = InputView.readCoachNames()
    val coachs: List<Coach> = getCoachs(coachNames)
    InputView.readInedibleMenus(coachs)

  }

  fun getCoachs(coachNames: List<String>): List<Coach> {
    val coachs = mutableListOf<Coach>()
    for (coachName in coachNames) {
      coachs.add(Coach(coachName))
    }
    return coachs
  }
}