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

## 2019-9-18 The Java's language taste 2 (Java 的语言品味2)
The objectives of this lesson:
1. grasp value types and reference types in java; (掌握Java中的值类型和引用类型)
2. grasp the literals in Java;(掌握Java中的字面量和,了解其他语言中的字面量)
3. grasp the value of the automatic disassembly box in Java;(掌握值Java中的自动拆装箱)

Everything in java is object,all of function,variable,constant must defined in class,but when java was first designed
,for performance reasons,it left a back door: primitive types(在Java
中的任何东西都是对象,包括函数,变量,常量,他们都是必须要定义在一个类里面才行,这是很完美的设计,但是Java在考虑了性能的影响后留下了一道口子
那就是primitive类型,我们在开发的过程中称之为值类型,或者按照字面量翻译为基础类型或者原始类型.
primitive 类型包括有 **byte,char,long,int,float,double,boolean**,我们经常用到这些类型,并不陌生.Java在提供了这些类型以后为了任然保持强类型的要求也就是Java
中的一切都是对象,又引入了他们的包装类,wrapper class)分别是:
```
byte -> Byte
char -> Character
short -> Short
int -> Integer
long -> Long
float -> Float
double -> Double
boolean -> Boolean
```
this is means that,the same integer has two method in java,one is a value,one is an object;(也就是说在Java中同样的一个整数在Java
中有两种表达方法,一个是值,一个是对象)

## 2019-9-20  Design pattern in java: adaptation and decoration (Java 中的设计模式: 适配与装饰)
firstly we have a question, input **((11 + 33) / 11 - 2 * 4) * (8 - 3) -20** and output value ?

### input and output
```java
public class Main {
    public static void main(String args[]) {
        System.out.println("Hello World!");
    }
    public final static PrintStream out = null;  // in the source code, system.out is defined as static variable,
}
```
all inputs are abstracted into input stream,and all outputs are abstracted into output stream in the java language.Take output stream as an example,


