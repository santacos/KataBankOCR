/**
  * Created by santacos on 5/21/2016 AD.
  */
object Number {
  val zero =
      " _ " +
      "| |" +
      "|_|" +
      "   "
  val one =
      "   " +
      "  |" +
      "  |" +
      "   "

  val two =
      " _ " +
      " _|" +
      "|_ " +
      "   "
  val three =
      " _ " +
      " _|" +
      " _|" +
      "   "

  val four =
      "   " +
      "|_|" +
      "  |" +
      "   "

  val five =
      " _ " +
      "|_ " +
      " _|" +
      "   "

  val six =
      " _ " +
      "|_ " +
      "|_|" +
      "   "

  val seven =
      " _ " +
      "  |" +
      "  |" +
      "   "

  val eight =
      " _ " +
      "|_|" +
      "|_|" +
      "   "

  val nine =
      " _ " +
      "|_|" +
      " _|" +
      "   "

  val digits:List[String] = zero :: one :: two :: three :: four :: five :: six :: seven :: eight :: nine :: Nil

  def matcher(input: String): String = input match {
    case this.zero	=> "0"
    case this.one	  => "1"
    case this.two	  => "2"
    case this.three => "3"
    case this.four	=> "4"
    case this.five	=> "5"
    case this.six	  => "6"
    case this.seven => "7"
    case this.eight => "8"
    case this.nine	=> "9"
    case _ 			    => "?"
  }

}
