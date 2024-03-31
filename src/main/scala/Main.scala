import scala.io.StdIn.readLine

@main def hello(): Unit =
  gameLoop()

def gameLoop(): Unit = {
  val input = getInput()
} 

def getInput(): String =
  print("> ")
  val input = readLine()
  if (isNotEmpty(input)) input.toLowerCase()
  else getInput()

def isNotEmpty(s: String) = 
  Option(s).map(_.trim).exists(_.nonEmpty)