object BeerSong {
  def recite(start:Int, end:Int) = {
    var result: String = ""
    for (amount <- end) {
      result = result.concat(
        s"""
          |"$start bottles of beer on the wall, 3 bottles of beer.
          |Take one down and pass it around, ${if (amount - 1 == 0) "no more bottles" else amount - 1} bottles of beer on the wall.
          |""".stripMargin
      )
    }
  }
}
"3 bottles of beer on the wall, 3 bottles of beer.\nTake one down and pass it around, 2 bottles of beer on the wall.\n")
