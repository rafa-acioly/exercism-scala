object SpaceAge {

  val earthOrbital = 31557600
  val mercuryOrbital = 0.2408467
  val venusOrbital = 0.61519726
  val marsOrbital = 1.8808158
  val jupiterOrbital = 11.862615
  val saturnOrbital = 29.447498
  val uranusOrbital = 84.016846
  val neptuneOrbital = 164.79132

  def calculate(age: Double, orbit: Double = 1): Double = age / (earthOrbital * orbit)

  def onEarth(secs: Double): Double = calculate(secs)
  def onMercury(secs: Double): Double = calculate(secs, mercuryOrbital)
  def onVenus(secs: Double): Double = calculate(secs, venusOrbital)
  def onMars(secs: Double): Double = calculate(secs, marsOrbital)
  def onJupiter(secs: Double): Double = calculate(secs, jupiterOrbital)
  def onSaturn(secs: Double): Double = calculate(secs, saturnOrbital)
  def onUranus(secs: Double): Double = calculate(secs, uranusOrbital)
  def onNeptune(secs: Double): Double = calculate(secs, neptuneOrbital)
}