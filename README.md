# scala-datastructures

## UnionFind 
A simple union-find/disjoint-set datastructure. Find is implemented with path compression. The worst-case runtime for union and find is O(α(n)). α is the inverse Ackermann function and can be treated as constant for every real world use case. 

### Usage
``` scala
val x = UnionFind.makeSet(element1)
val y = UnionFind.makeSet(element2)
assert(UnionFind.find(x) == UnionFind.find(y)) // false

UnionFind.union(x,y)
assert(UnionFind.find(x) == UnionFind.find(y)) // true

```
