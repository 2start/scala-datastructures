object UnionFind {
  case class Item[T](value: T) {
    self: Item[T] =>
    var parent: Item[T] = self
    var rank = 0
  }

  def find[T](item: Item[T]): Item[T] = {
    if(item != item.parent) item.parent = find(item.parent)
    item.parent
  }

  def makeSet[T](value: T): Item[T] = {
    Item[T](value)
  }

  def union[T](item1: Item[T], item2: Item[T]): Item[T] = {
    val root1 = find(item1)
    val root2 = find(item2)

    if (root1.rank < root2.rank) {
      root1.parent = root2
      root2
    } else if (root1.rank > root2.rank) {
      root2.parent = root1
      root1
    } else {
      root1.parent = root2
      root2.rank += 1
      root2
    }
  }
}


