import org.scalatest.{Matchers, FunSuite}

/**
  * Created by santacos on 5/10/2016 AD.
  */
class OCRAccountReader$Test extends FunSuite with Matchers{

  test("number of line long is not 4."){
    val input = " _  _  _  _  _  _  _  _  _ \n" +
                "| || || || || || || || || |\n" +
                "|_||_||_||_||_||_||_||_||_|\n" +
                "                           \n" +
                "                           "
    val output = new OCRAccountReader(input)
    output.isValid() shouldBe false
  }

  test("each line should have 27 characters."){
    val input = " _  _  _  _  _  _  _  _  _ ||\n" +
                "| || || || || || || || || |\n" +
                "|_||_||_||_||_||_||_||_||_|\n" +
                "                           \n"
    val output = new OCRAccountReader(input)
    output.isValid() shouldBe false
  }

  test("Get input correctly"){
    val input = " _  _  _  _  _  _  _  _  _ \n" +
                "| || || || || || || || || |\n" +
                "|_||_||_||_||_||_||_||_||_|\n" +
                "                           "

    val output = new OCRAccountReader(input).splitToLetter()
    val expect = (1 to 9).map(digit => " _ | ||_|   ")
    //output shouldBe Map()
    output shouldBe expect
  }

  test("Get number for each digit"){
    val input = "   " +
                "|_|" +
                "  |" +
                "   "
    println(input.matches(input.reverse))
    println(input.matches(Number.four))
    val output = new OCRAccountReader(input).getDigit(input)
    output shouldBe "4"
  }

  test("Get the actual number"){
    val input = " _  _  _  _  _  _  _  _  _ \n" +
                "| || || || || || || || || |\n" +
                "|_||_||_||_||_||_||_||_||_|\n" +
                "                           "

    val output = new OCRAccountReader(input).getActualNumber()
    val expect = "000000000"
    output shouldBe expect
  }




}

