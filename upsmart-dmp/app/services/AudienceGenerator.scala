package services

import java.io._
import java.util.Random;
import java.util.UUID;
import models._
import AudienceConst._

object AudienceGenerator {

  val dataFile = "rawdata/audience.store"
  val rand = new Random()

  def loadData() = {
    val f = new File(dataFile)
    if (f.exists) {
      f.delete()
    }

    val result = generateData()
    println("data generating finished. size: " + result.size)
    val writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dataFile)))
    for (entry <- result) {
      writer.write(entry._2 + "\n")
    }
    writer.close()
    result
  }

  private def loadDataFromFile(file: File) = {
    Map[String, Audience]("nodata" -> null)
  }

  private def generateData(): Map[String, Audience] = {
    val dataMap = Map[String, Audience]()
    val dataSize = 200000
    println("begin generating data... total size: " + dataSize)

    val weightedGenderList = weightedList(allGenders, genderWeight)
    val weightedAgeList = weightedList(allAgeRange, ageWeight)
    val weightedIdTypeList = weightedList(allIdTypes, idTypesWeight)
    val weightedNetTimeList = weightedList(allNetTimePeroid, netTimeWeight)
    val weightedConsumeAblityList = weightedList(allConsumeablities, consumablityWeight)
    val weightedRepayAblityList = weightedList(allRepayablities, repayablityWeight)
    val weightedCitiesList = weightedList(allCities, citiesWeight)
    //val weightedNetCateList = weightedList()
    val weightedConsumeCateList = weightedList(allConsumptionCategory, consumeCateWeight)

    val boolList = List(true, false)
    var tag = 10
    (1 to dataSize) map { i =>
      if (i == tag) {
        println(s"已经产生${i}条数据")
        tag = tag * 10
      }

      val id = UUID.randomUUID.toString
      val idType = weightedIdTypeList(rand.nextInt(weightedIdTypeList.size))
      val gender = weightedGenderList(rand.nextInt(weightedGenderList.size))
      val age = weightedAgeList(rand.nextInt(weightedAgeList.size))
      val isEmployed = Some(boolList(rand.nextInt(2)))
      val isMarried = Some(boolList(rand.nextInt(2)))
      val hasChildren = if(!(isMarried.get)) Some(false) else Some(boolList(rand.nextInt(2)))
      val isStudent = if(isEmployed.get || isMarried.get || hasChildren.get) Some(false) else Some(boolList(rand.nextInt(2)))
      val city = weightedCitiesList(rand.nextInt(weightedCitiesList.size))
      val netCate = allNetCategory(rand.nextInt(allNetCategory.size))
      val timePeroid = weightedNetTimeList(rand.nextInt(weightedNetTimeList.size))
      val freqency = rand.nextInt(5) + 1
      val consumeablity = weightedConsumeAblityList(rand.nextInt(weightedConsumeAblityList.size))
      val repayablity = weightedRepayAblityList(rand.nextInt(weightedRepayAblityList.size))
      val consumptionCategory = weightedConsumeCateList(rand.nextInt(weightedConsumeCateList.size))
      val consumptionFreqency = rand.nextInt(8) + 3
      val hasNightLife = Some(boolList(rand.nextInt(2)))

      val b = BasicInfo(gender, age, isEmployed, isMarried, hasChildren, isStudent)
      val loc = LocInfo(city)
      val netPrefer = NetPrefer(netCate, timePeroid, freqency)
      val consumptionInfo = ConsumptionInfo(consumeablity, repayablity, consumptionCategory, consumptionFreqency, hasNightLife)

      val audience = Audience(id, idType, b, loc, netPrefer, consumptionInfo)

      id -> audience
    } toMap
  }

}
