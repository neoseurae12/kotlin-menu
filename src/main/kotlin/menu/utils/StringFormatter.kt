package menu.utils

object StringFormatter {
  fun splitByComma(input: String): List<String> {
    val result = input.split(',').map { it.trim() }
    return result
  }
}