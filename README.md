# think in Java
## 2019-9-16 gradle install
1. install gradle  [https://gradle.org/releases/](https://gradle.org/releases/)
2. environment setting,build new system environment named "GRADLE_HOME",the value is "D:\soft\gradle\gradle-4.8".find variable named path,and push "%GRADLE_HOME%\bin" inside.

```groovy
repositories {
     mavenLocal()
     maven { url "http://maven.aliyun.com/nexus/content/groups/public/"}
     mavenCentral()
     jcenter()
     maven { url "https://repo.spring.io/snapshot" }
     maven { url "https://repo.spring.io/milestone" }
     maven { url 'http://oss.jfrog.org/artifactory/oss-snapshot-local/' } 
 }
```
## 2019-9-18 The Java's language taste (Java 语言的品味)
this lesson's target is learn two commonly used keywords: final and static (这节课的目标是掌握两个常用的关键字 static and final)

### keywords static
then we use static to limit a function or variable in the class,wo can use function or variable in the class and without new this Class; (当我们使用 static 对类的方法或者变量限制以后,我们就可以直接去调用方法或者使用类,而不是还需要去创建一个对象,然后才能去调用这个方法)
But unfortunately Java's design has a bad taste,that's reusing keywords.It make some simple thing to complicates;(不幸的事情是 Java 的设计者让他有了一个坏品味,这让原本是很简单的事情变得复杂了)

Static keywords can also be used to define static code blocks,static code blocks can be anywhere in the class, there can be multiple static blocks in the class.when the class is first loaded,each static block is executed in the order of the static blocks,
and just only once. (static 还可以用来定义静态的代码块,static 块可以被放置在类的任意地方,类中可以有多个static块,在类被初次加载的时候,会按照static的顺序去执行每个static块,并且只会执行一次)

### keywords final
final is used to modify a class,so that it can no longer be inherited by other classes.final is used to modify a function,so that it can no longer be rewrite.final is very good keywords.we can avoid creating chaotic inheritance structures(当一个类被 final 修饰
的时候,那么这个类就不能被继承了,当一个函数被final修饰的时候这个函数就不能被覆写了)