object Main {
  def main(args: Array[String]): Unit = {
    val cafe = new Cafe
    val creditCard = new CreditCard("test", 1000.0)
    val tuple0 = cafe.buyCoffee(creditCard)
    val tuple1 = cafe.buyCoffee(creditCard)
    val tuple2 = cafe.buyCoffee(creditCard)

    val tuples = Array(tuple0, tuple1, tuple2)
    val tuple = cafe.buyCoffees(creditCard, 5)
    print(tuple)
  }


}
