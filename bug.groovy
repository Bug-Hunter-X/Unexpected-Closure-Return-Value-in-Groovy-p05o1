```groovy
def methodWithClosure(closure) {
  println "Inside methodWithClosure"
  closure()
}

methodWithClosure { println "Inside closure" }

//This is incorrect usage of closure
methodWithClosure { println "Inside closure"; return 100 }
```