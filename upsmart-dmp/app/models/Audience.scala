package models

case class Audience(id: String, idType: String, basicInfo: BasicInfo, locInfo: LocInfo, netPrefer: NetPrefer, consumptionInfo: ConsumptionInfo)
case class BasicInfo(gender: String, age: String, isEmployed: Option[Boolean], isMarried: Option[Boolean], hasChildren: Option[Boolean], isStudent: Option[Boolean])
case class LocInfo(city: String)
case class NetPrefer(category: String, timePeroid: String, freqency: Int)
case class ConsumptionInfo(consumeablity: String, repayablity: String, consumptionCategory: String, consumptionFreqency: Int, hasNightLife: Option[Boolean])

case class ChartDataItem(name: String, nameEn: String, value: Int )

case object AudienceConst{
  val IdTypeCookie = "cookie"
  val IdTypeIMEI = "imei"
  val IdTypeIDFA = "idfa"
  val IdTypeMobile = "mobile"
  val IdTypeCard = "card"

  val GenderMale = "Male"
  val GenderFamale = "Famale"

  val AgeYoung = "young"
  val AgeOld = "old"
  val AgeMiddle = "middle"

  val allIdTypes = List(IdTypeCookie, IdTypeIMEI + "-" + IdTypeIDFA, IdTypeMobile, IdTypeCard)
  val idTypesWeight = List(7, 2, 1, 1)

  val allGenders = List(GenderMale, GenderFamale)
  val genderWeight = List(2, 1)

  val allAgeRange = List(AgeYoung, AgeMiddle, AgeOld)
  val ageWeight = List(3, 2, 1)

  //6:00-11:00，11:00-14:00，14:00-17:00，17:00-21:00，21:00-1:00，1:00-6:00
  val allNetTimePeroid = List("6:00-11:00", "11:00-14:00", "14:00-17:00",
    "17:00-21:00", "21:00-1:00", "1:00-6:00")
  val netTimeWeight = List(2, 3, 2, 4, 3, 1)

  //0-1000，1000-5000，5000-10000,10000-15000,15000-20000,20000-
  val allConsumeablities = List("0-1000", "1000-5000", "5000-10000",
    "10000-15000", "15000-20000", "GT20000")
  val consumablityWeight = List(1, 4, 3, 2, 2, 1)

  //5000,10000,15000,20000,20000以上
  val allRepayablities = List("5000", "10000", "15000", "20000", "GT20000")
  val repayablityWeight = List(4, 5, 3, 2, 1)

  val allCities = List("Beijing", "Shanghai", "Guangdong", "Zhejiang", "Chongqing", "Hubei", "Jiangsu")
  val cityNames = Map("Beijing" -> "北京", "Shanghai" -> "上海", "Guangdong" -> "广东", "Zhejiang" -> "浙江", "Chongqing" -> "重庆", "Hubei" -> "湖北", "Jiangsu" -> "江苏")
  val citiesWeight = List(9, 17, 8, 5, 2, 1, 1, 4)

  val allNetCategory = List("news", "finance", "sport", "entertainment", "military",  "car", "beauty", "house", "game", "reading", "vedio")
  val allNetCateNames = Map("news" ->"新闻", "finance"->"金融", "sport"->"体育", "entertainment"->"娱乐", "military"->"母婴",  "car"->"汽车", "beauty"->"美容", "house"->"房产", "game"->"游戏", "reading"->"阅读", "vedio"->"视频")

  val allConsumptionCategory = List("food", "finance", "retail", "car", "wholesale", "medical", "IT", "transport", "education")
  val consumeCateWeight = List(5, 10, 2, 4, 1, 2, 1, 1, 4)

  def weightedList[T](srcList: List[T], weightList: List[Int]): List[T] = {
    var resList = List[T]()
    srcList zip weightList map { p =>
      resList = resList ::: List.fill(p._2)(p._1)
    }
    resList
  }
}
