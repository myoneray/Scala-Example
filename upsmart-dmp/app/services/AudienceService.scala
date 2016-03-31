package services

import models._

object AudienceService {

  val data: Map[String, Audience] = AudienceGenerator.loadData()
  val allAudiences = data.values.toList

  def queryAudience(cond: Audience) = {
    allAudiences filter { aud =>
      var includ = true
      if (cond.basicInfo.gender != "") includ = includ && (cond.basicInfo.gender == aud.basicInfo.gender)
      if (cond.basicInfo.age != "") includ = includ && (cond.basicInfo.age == aud.basicInfo.age)
      if (cond.basicInfo.isEmployed.isDefined) includ = includ && (cond.basicInfo.isEmployed.get == aud.basicInfo.isEmployed.get)
      if (cond.basicInfo.isMarried.isDefined) includ = includ && (cond.basicInfo.isMarried.get == aud.basicInfo.isMarried.get)
      if (cond.basicInfo.hasChildren.isDefined) includ = includ && (cond.basicInfo.hasChildren.get == aud.basicInfo.hasChildren.get)
      if (cond.basicInfo.isStudent.isDefined) includ = includ && (cond.basicInfo.isStudent.get == aud.basicInfo.isStudent.get)

      if (cond.locInfo.city != "") includ = includ && (cond.locInfo.city == aud.locInfo.city)

      if (cond.netPrefer.timePeroid != "") includ = includ && (cond.netPrefer.timePeroid == aud.netPrefer.timePeroid)

      if (cond.consumptionInfo.consumeablity != "") includ = includ && (cond.consumptionInfo.consumeablity == aud.consumptionInfo.consumeablity)
      if (cond.consumptionInfo.repayablity != "") includ = includ && (cond.consumptionInfo.repayablity == aud.consumptionInfo.repayablity)

      includ
    }
  }

  def queryAudienceById(id: String, idType: String): Option[Audience] = {
    data.get(id).filter(_.idType == idType)
  }

  def rawData(limit: Int, skip: Int) = {
    val _limit = if (limit > 100) 100 else if (limit < 1) 1 else limit
    val _skip = if (skip > data.size - _limit) data.size - _limit else skip
    allAudiences.drop(_skip).take(_limit)
  }

}
