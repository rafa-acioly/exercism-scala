class School {
  type DB = Map[Int, Seq[String]]
  var rooster: DB = Map.empty

  def add(name: String, g: Int) = {
    if (!rooster.contains(g)) rooster += (g -> Seq(name))
    else rooster = rooster.updated(g, rooster(g) ++ Seq(name))
  }

  def db: DB = rooster

  def grade(g: Int): Seq[String] = rooster.getOrElse(g, Seq.empty)

  def sorted: DB = rooster.toList.map(grade => grade._1 -> grade._2.sorted).sortBy(_._1).toMap
}