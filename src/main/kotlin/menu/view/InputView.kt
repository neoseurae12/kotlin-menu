package menu.view

import camp.nextstep.edu.missionutils.Console
import menu.constant.GuideMessage
import menu.constant.GuideMessage.InputGuide.ENTER_INEDIBLE_MENUS
import menu.model.Coach
import menu.utils.InputValidator
import menu.utils.StringFormatter

object InputView {
  private fun readUserInput(): String = Console.readLine()

  fun readCoachNames(): List<String> {
    println(GuideMessage.InputGuide.ENTER_COACH_NAMES)

    return getCoachNames()
  }

  fun getCoachNames(): List<String> {
    val coachNamesInput = readUserInput()
    val coachNames = StringFormatter.splitByComma(coachNamesInput)

    InputValidator.validateCoachNames(coachNames)

    return coachNames
  }

  fun readInedibleMenus(coachs: List<Coach>) {
    for (coach in coachs) {
      println(ENTER_INEDIBLE_MENUS.format(coach.name))

      coach.inedibleMenus = getInedibleMenus()

      println()
    }
  }

  fun getInedibleMenus(): List<String> {
    val inedibleMenusInput = readUserInput()
    val inedibleMenus = StringFormatter.splitByComma(inedibleMenusInput)

    InputValidator.validateInedibleMenus(inedibleMenus)

    return inedibleMenus
  }
}