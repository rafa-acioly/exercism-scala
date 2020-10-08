import scala.collection.mutable
import scala.util.Random

class Robot {

  var name: String = this.generateName

  def generateName = {
    var letters = Random.alphanumeric.filter(_.isLetter).take(2).mkString
    var numbers = 100 + Random.nextInt((999 - 100) + 1)

    s"${letters.toUpperCase}$numbers"
  }

  def reset() = this.name = this.generateName
}