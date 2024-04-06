import scala.io.StdIn.readLine
import scala.concurrent.duration._

@main def hello(): Unit =
  gameLoop()

def gameLoop(): Unit = {

  printTitle()

  printStoryMessage("The year is 2048...")

  printStoryMessage("Paradise, formerly known as London, is one of the few remaining " +
    "major cities left in the country where " +
    "the middle and upper classes reside. " +
    "It's towering structures and state-of-the-art infrastructure symbolize the pinnacle of " +
    "human development. Technology seamlessly integrates into every aspect of life, " +
    "creating a world where everything is efficient, convenient, and advanced. " +
    "Humans have incorporated cybernetic enhancements into their bodies, " +
    "blurring the lines between organic and synthetic and elevating their abilities to new heights.")

  printStoryMessage("Your name is Alex Mercer, and you're just another face in the crowd of Paradise. " +
    "You live in a cramped, rundown apartment in one of the city's less desirable districts. " +
    "The walls are thin, the plumbing is questionable, and the neon lights from the street outside " +
    "never quite let the darkness settle in. Each day blends into the next as you go through the motions, " +
    "working a job that pays the bills but offers little else. " +
    "In the midst of the technological marvel that is Paradise, you're just another soul trying to make it through another day. ")

  printStoryMessage("You wake up in your apartment Sunday morning. ")

  val input = getInput()

  input match {
    case "help" => printHelp()
    case "quit" => System.exit(0)
    case _ => println("Unknown command. Try 'help' for a list of commands.")
  }

  gameLoop()
}

def printTitle(): Unit = {
  val title = 
    """
       _____  _______  ______ _______ ______  _____ _______ _______
      |_____] |_____| |_____/ |_____| |     \   |   |______ |______
      |       |     | |    \_ |     | |_____/ __|__ ______| |______
    """
  println(title)
}

def printStoryMessage(message: String): Unit = {
  message.foreach { char =>
    print(char)
    Thread.sleep(25)
  }
  println()
  println()
  Thread.sleep(1000)
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