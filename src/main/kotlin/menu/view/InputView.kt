package menu.view

import camp.nextstep.edu.missionutils.Console
import menu.constant.GuideMessage
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
}