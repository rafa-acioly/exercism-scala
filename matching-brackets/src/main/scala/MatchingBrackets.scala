import scala.collection.mutable.Stack

object MatchingBrackets {

  def isPaired(content:String): Boolean = {
    val pairs = Map('[' -> ']', '{' -> '}', '(' -> ')')
    val openings = pairs.keys.toSeq
    val closings = pairs.values.toSeq

    val open_stack = Stack[Char]()
    for (char <- content.toList) {
      if (openings.contains(char)) open_stack.push(char)
      if (closings.contains(char)) {
        if (open_stack.isEmpty || char != brackets(open_stack.pop)) false
      }
    }

    open_stack.isEmpty
  }
}