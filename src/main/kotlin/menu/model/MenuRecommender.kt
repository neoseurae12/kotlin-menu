package menu.model

import camp.nextstep.edu.missionutils.Randoms
import menu.constant.MenuRecommenderConstant.금
import menu.constant.MenuRecommenderConstant.월
import menu.model.Category.*
import java.util.*

object MenuRecommender {
  val dailyCategories = mutableListOf<Category>()

  fun recommendDailyMenus(coachs: List<Coach>) {
    for (day in 월..금) {
      val dailyCategory = pickCategory()
      dailyCategories.add(dailyCategory)

      for (coach in coachs) {
        val dailyMenu = pickDailyMenu(dailyCategory, coach)
        coach.recommendedMenus.add(dailyMenu)
      }
    }
  }

  private fun pickCategory(): Category {
    val category: Category = when (Randoms.pickNumberInRange(1, 5)) {
      1 -> Japanese
      2 -> Korean
      3 -> Chinese
      4 -> Asian
      else -> Western
    }

    validateCategory(category)

    return category
  }

  private fun validateCategory(category: Category) {
    val categoryFrequency = Collections.frequency(dailyCategories, category)
    if (categoryFrequency >= 2) {
      pickCategory()
    }
  }

  fun pickDailyMenu(dailyCategory: Category, coach: Coach): String {
    val dailyMenu = recommend(dailyCategory)
    validateMenu(dailyMenu, dailyCategory, coach)

    return dailyMenu
  }

  fun validateMenu(recommend: String, dailyCategory: Category, coach: Coach) {
    val alreadyRecommendedMenus = coach.recommendedMenus
    val inedibleMenus = coach.inedibleMenus
    if (recommend in alreadyRecommendedMenus || recommend in inedibleMenus)
      pickDailyMenu(dailyCategory, coach)
  }

  fun recommend(dailyCategory: Category): String {
    return Randoms.shuffle(dailyCategory.categoryMenus)[0]
  }
}