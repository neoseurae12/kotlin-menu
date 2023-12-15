package menu.constant

object ErrorMessage {
  private const val ERROR_PREFIX = "[ERROR] "

  const val WRONG_COACH_NAME_LENGTH = ERROR_PREFIX + "코치의 이름은 최소 2글자, 최대 4글자여야 합니다."
  const val WRONG_NUMBER_OF_COACH = ERROR_PREFIX + "코치는 최소 2명, 최대 5명 입력해야 합니다."

  const val WRONG_NUMBER_OF_INEDIBLE_MENU = ERROR_PREFIX + "각 코치가 못 먹는 메뉴는 최대 2개까지 입력할 수 있습니다."
}