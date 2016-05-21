import scala.collection.immutable.IndexedSeq

/**
  * Created by santacos on 5/10/2016 AD.
  */
class OCRAccountReader (input: String) {
  val lines = input.split("\n")

  def isValid(): Boolean = {
    lines.length == 4 &&
      lines.map(line => line.length == 27)
        .filter(_.equals(false)).length == 0
  }


  def splitToLetter(): IndexedSeq[String] = {
    val lineOfDigits = lines.map{case line => line.grouped(3).toArray}
    (0 to 8).map( i =>
      lineOfDigits(0)(i) + lineOfDigits(1)(i) + lineOfDigits(2)(i) + lineOfDigits(3)(i) )
  }

  def getActualNumber(): String = {
    if(isValid()){
      val digits = splitToLetter()
      digits.map( digit => getDigit(digit) ).mkString("")
    } else "Invalid number"
  }

  def getDigit(input: String): String = Number.matcher(input)


}
