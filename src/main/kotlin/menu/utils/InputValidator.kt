package menu.utils

import menu.constant.ErrorMessage.WRONG_COACH_NAME_LENGTH
import menu.constant.ErrorMessage.WRONG_NUMBER_OF_COACH
import menu.constant.ErrorMessage.WRONG_NUMBER_OF_INEDIBLE_MENU
import menu.view.ErrorView
import menu.view.InputView

object InputValidator {
  fun validateCoachNames(coachNames: List<String>) {
    try {
      require(coachNames.all { it.length in 2..4 }) { WRONG_COACH_NAME_LENGTH }
      require(coachNames.size in 2..5) { WRONG_NUMBER_OF_COACH }
    } catch (e: IllegalArgumentException) {
      ErrorView.printErrorMessage(e)
      InputView.getCoachNames()
    }
  }

  fun validateInedibleMenus(inedibleMenus: List<String>) {
    try {
      require(inedibleMenus.size in 0..2) { WRONG_NUMBER_OF_INEDIBLE_MENU }
    } catch (e: IllegalArgumentException) {
      ErrorView.printErrorMessage(e)
      InputView.getInedibleMenus()
    }
  }
}