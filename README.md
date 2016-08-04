자바와 클로저 함께 사용하기 위한 설정 
=====================

클로저의 코드를 자바에서 불러다 쓰기 위한 설정입니다.
features:

- [clojuresque](https://github.com/clojuresque/clojuresque) 기반 Gradle plugin [nebula](https://plugins.gradle.org/plugin/nebula.clojure) 사용  
- [Compile 되지 않은 Clojure 함수를 Java 에서 불러본다.](http://clojure.org/reference/java_interop#_calling_clojure_from_java)
- Hello#main 에서 Clojure 로 생성된 Class 를 직접 new 하기 위해 [aotCompile](http://clojure.org/reference/compilation) 을 활성화 시킨다.
- 예제 실행의 편리함을 위해 uberJar(의존성을 하나의 jar 로 묶어준다) 실행 
- [gen-class](http://clojuredocs.org/clojure.core/gen-class)

To use:
```
$ ./gradlew clean uberJar
$ java -cp build/libs/leanning-clojure-standalone-1.0-SNAPSHOT.jar Hello
i am Helly
Hello Clojure
```
