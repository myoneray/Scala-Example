package models

import play.api.libs.json._

object Implicits {

  implicit val consumptionInfoWrites = new Writes[ConsumptionInfo] {
    def writes(consumptionInfo: ConsumptionInfo) = Json.obj(
      "consumeablity" -> consumptionInfo.consumeablity,
      "repayablity" -> consumptionInfo.repayablity,
      "consumptionCategory" -> consumptionInfo.consumptionCategory,
      "consumptionFreqency" -> consumptionInfo.consumptionFreqency,
      "hasNightLife" -> consumptionInfo.hasNightLife
    )
  }

  implicit val basicInfoWrites = new Writes[BasicInfo] {
    def writes(basicInfo: BasicInfo) = Json.obj(
      "gender" -> basicInfo.gender,
      "age" -> basicInfo.age,
      "isEmployed" -> basicInfo.isEmployed,
      "isMarried" -> basicInfo.isMarried,
      "hasChildren" -> basicInfo.hasChildren,
      "isStudent" -> basicInfo.isStudent
    )
  }

  implicit val netPreferWrites = new Writes[NetPrefer] {
    def writes(netPrefer: NetPrefer) = Json.obj(
      "category" -> netPrefer.category,
      "timePeriod" -> netPrefer.timePeroid,
      "freqency" -> netPrefer.freqency
    )
  }

  implicit val locInfoWrites = new Writes[LocInfo] {
    def writes(locInfo: LocInfo) = Json.obj(
      "city" -> locInfo.city
    )
  }

  implicit val audienceWrites = new Writes[Audience] {
    def writes(audience: Audience) = Json.obj(
      "id" -> audience.id,
      "idType" -> audience.idType,
      "basicInfo" -> audience.basicInfo,
      "locInfo" -> audience.locInfo,
      "netPrefer" -> audience.netPrefer,
      "consumptionInfo" -> audience.consumptionInfo
    )
  }

  implicit val chartDataItemWrites = new Writes[ChartDataItem] {
    def writes(di: ChartDataItem) = Json.obj(
      "name" -> di.name,
      "value" -> di.value,
      "nameEn" -> di.nameEn
    )
  }
}
