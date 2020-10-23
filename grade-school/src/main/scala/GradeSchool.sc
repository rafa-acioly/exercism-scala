class School {

  var DB = Map.newBuilder[Int, Seq[String]]

  def add(g: Int, name: String) = DB(g) = name
  def db: DB = DB
}

var sc = new School

sc.add(1,"name")
sc.add(2, "name 2")

println(sc.db)