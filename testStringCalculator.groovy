def add(args){
  args.split("\n|,")?.collect { n ->
    n.isInteger() ? n as Integer : 0
  }.sum() ?: 0
}

assert add("") == 0
assert add("1,2") == 3
assert add("1,2,3") == 6
assert add("1,2,3\n4") == 10

