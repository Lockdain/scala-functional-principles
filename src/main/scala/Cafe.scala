class Cafe {

  def buyCoffee(cc: CreditCard): (Coffee, Charge) = {
    val cup = new Coffee("latte", 250.0)
    (cup, Charge(cc, cup.price))
  }

  def buyCoffees(cc: CreditCard, n: Int): (List[Coffee], Charge) = {
    val purchases: List[(Coffee, Charge)] = List.fill(n)(buyCoffee(cc))
    val (coffees, charges) = purchases.unzip
    (coffees, charges.reduce((c1, c2) => c1.combine(c2)))

  }

}
