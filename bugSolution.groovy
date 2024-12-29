```groovy
def methodWithClosure(closure) {
  println "Inside methodWithClosure"
  def result = closure()
  println "Closure returned: $result"
  return result
}

def methodWithClosureNoReturn(closure) {
  println "Inside methodWithClosure"
  closure()
}

println "Result: ${methodWithClosure { println "Inside closure"; return 100 }}"

methodWithClosureNoReturn { println "Inside closure"; return 100 }
```