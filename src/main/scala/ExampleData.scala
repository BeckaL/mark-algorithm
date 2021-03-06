import models.Node

object ExampleData {
  val nodes = List(
    Node(id = 1, linksTo = Set(43, 50), inRootScope = true),
    Node(id = 2, linksTo = Set(), inRootScope = false),
    Node(id = 3, linksTo = Set(2, 13, 7), inRootScope = false),
    Node(id = 4, linksTo = Set(1), inRootScope = false),
    Node(id = 5, linksTo = Set(14, 62, 58), inRootScope =  true),
    Node(id = 6, linksTo = Set(12), inRootScope = false),
    Node(id = 7, linksTo = Set(), inRootScope = false),
    Node(id = 8, linksTo = Set(19), inRootScope =  false),
    Node(id = 9, linksTo = Set(16), inRootScope =  false),
    Node(id = 10, linksTo = Set(), inRootScope = false),
    Node(id = 11, linksTo = Set(36), inRootScope = false),
    Node(id = 12, linksTo = Set(), inRootScope = false),
    Node(id = 13, linksTo = Set(24), inRootScope = false),
    Node(id = 14, linksTo = Set(5, 26, 23), inRootScope =  false),
    Node(id = 15, linksTo = Set(25), inRootScope = false),
    Node(id = 16, linksTo = Set(20), inRootScope =  false),
    Node(id = 17, linksTo = Set(11), inRootScope = false),
    Node(id = 18, linksTo = Set(2), inRootScope = false),
    Node(id = 19, linksTo = Set(22, 23, 8), inRootScope =  false),
    Node(id = 20, linksTo = Set(), inRootScope =  false),
    Node(id = 21, linksTo = Set(57), inRootScope =  false),
    Node(id = 22, linksTo = Set(23, 19), inRootScope =  false),
    Node(id = 23, linksTo = Set(14, 26, 22), inRootScope =  false),
    Node(id = 24, linksTo = Set(), inRootScope = false),
    Node(id = 25, linksTo = Set(11, 18), inRootScope =  true),
    Node(id = 26, linksTo = Set(5, 23), inRootScope =  false),
    Node(id = 27, linksTo = Set(18), inRootScope = false),
    Node(id = 28, linksTo = Set(), inRootScope = false),
    Node(id = 29, linksTo = Set(), inRootScope = false),
    Node(id = 30, linksTo = Set(25), inRootScope = false),
    Node(id = 31, linksTo = Set(25), inRootScope = false),
    Node(id = 32, linksTo = Set(3), inRootScope = false),
    Node(id = 33, linksTo = Set(53), inRootScope =  false),
    Node(id = 34, linksTo = Set(), inRootScope = false),
    Node(id = 35, linksTo = Set(34, 45, 39), inRootScope = false),
    Node(id = 36, linksTo = Set(47, 35, 47, 42), inRootScope = false),
    Node(id = 37, linksTo = Set(46), inRootScope =  true),
    Node(id = 38, linksTo = Set(44), inRootScope = false),
    Node(id = 39, linksTo = Set(), inRootScope = false),
    Node(id = 40, linksTo = Set(51), inRootScope =  false),
    Node(id = 41, linksTo = Set(48), inRootScope =  false),
    Node(id = 42, linksTo = Set(), inRootScope = false),
    Node(id = 43, linksTo = Set(), inRootScope = false),
    Node(id = 44, linksTo = Set(), inRootScope = false),
    Node(id = 45, linksTo = Set(56), inRootScope = false),
    Node(id = 46, linksTo = Set(46, 58, 55), inRootScope =  false),
    Node(id = 47, linksTo = Set(1), inRootScope = false),
    Node(id = 48, linksTo = Set(52), inRootScope =  false),
    Node(id = 49, linksTo = Set(43), inRootScope = false),
    Node(id = 50, linksTo = Set(34), inRootScope = false),
    Node(id = 51, linksTo = Set(54, 55, 40), inRootScope =  false),
    Node(id = 52, linksTo = Set(), inRootScope =  false),
    Node(id = 53, linksTo = Set(33), inRootScope =  false),
    Node(id = 54, linksTo = Set(55, 51), inRootScope =  false),
    Node(id = 55, linksTo = Set(46, 58, 54), inRootScope =  false),
    Node(id = 56, linksTo = Set(), inRootScope = false),
    Node(id = 57, linksTo = Set(21), inRootScope = false),
    Node(id = 58, linksTo = Set(37, 55), inRootScope =  false),
    Node(id = 59, linksTo = Set(50), inRootScope = false),
    Node(id = 60, linksTo = Set(), inRootScope = false),
    Node(id = 61, linksTo = Set(), inRootScope = false),
    Node(id = 62, linksTo = Set(1), inRootScope = false),
    Node(id = 63, linksTo = Set(15, 3, 12, 10), inRootScope = true),
    Node(id = 64, linksTo = Set(35), inRootScope = false),
  )
}
