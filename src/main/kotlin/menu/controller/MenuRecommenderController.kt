package menu.controller

import menu.view.InputView

class MenuRecommenderController {
  fun startMenuRecommender() {
    val coachNames = InputView.readCoachNames()
    println(coachNames)
  }
}