import scala.io.StdIn.readLine

@main def hello(): Unit =
  gameLoop()

def gameLoop(): Unit = {
  val input = getInput()

  input match {
    case "help" => printHelp()
    case "quit" => System.exit(0)
    case _ => println("Unknown command. Try 'help' for a list of commands.")
  }

  gameLoop()
}

def printHelp(): Unit = {
  println("Help menu...")
}

def getInput(): String =
  print("> ")
  val input = readLine()
  if (isNotEmpty(input)) input.toLowerCase()
  else getInput()

def isNotEmpty(s: String) = 
  Option(s).map(_.trim).exists(_.nonEmpty)