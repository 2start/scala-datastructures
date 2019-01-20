import org.scalatest._

class UnionFindSpec extends FlatSpec with Matchers {
  "A find" should "always find the same representant for all set members" in {
    val x = UnionFind.makeSet(1)
    val y = UnionFind.makeSet(2)
    val z = UnionFind.makeSet(3)
    val unionXY = UnionFind.union(x, y)
    val unionXYZ = UnionFind.union(unionXY , z)

    unionXYZ should be (UnionFind.find(x))
    unionXYZ should be (UnionFind.find(y))
    unionXYZ should be (UnionFind.find(z))
  }
}
