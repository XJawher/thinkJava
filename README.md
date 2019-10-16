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
firstly we have a question, input **((11 + 33) / 11 - 2 * 4) * (8 - 3) -20** and output value is?

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
it's subclasses,printStream can output bytes to the console,FileOutputStream can write bytes to the file
,SocketOutputStream can write bytes to the network connection,and so on,they are all OutputStream, subclasses
(以 outputStream 为例,它的几个子类,printStream 可以控制给控制台上输入字节,FileOutputStream 可以给文件里写入字节,SocketOutputStream 可以给网络上写入字节,这些都是 OutputStream 的子类)

```java
public class LessonTwo {

    public static void lessonTwoInput(String args) {

        System.out.println("hey, may I have your name, please? ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputValue = "";
        try {
            inputValue = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("hello, " + inputValue);
    }
}
```

`BufferedReader br = new BufferedReader(new InputStreamReader(System.in));` Look, a little line of code, including adapters and decorators.(看,小小的一行代码包括了适配器和装饰器)

### Work : Implementing an adapter by self (自己实现一个适配器)
implementing an adapter by self. it will changed standard put in to TokenStream(自己实现一个适配器,把标准的输入 System.in 转成 TokenStream)

## 2019-9-25 lesson two data structure stack (数据结构 - 栈)
the stack means data is LIFO (栈的意思就是数据后进先出)
how we fake stack with java? 
**Void** it's means function does not need  must return a value;
first,let's give a simple example to describe the principle of the stack. 
```java
public class Main {

	public static void main(String[] args) throws IOException {
		byte[] buf = new byte[10];
		int length = System.in.read(buf);

		LessonTwoDataStructureStack s = new LessonTwoDataStructureStack(10);
		System.out.println("length is : " + length);

		for (int i = 0; i < length; i++) {
			if (buf[i] == '(' || buf[i] == '[' || buf[i] == '{') {
				s.push(buf[i]);
				System.out.println(Arrays.toString(s.returnData()));
			} else if (buf[i] == ')') {
				if (s.getTop() == '(') {
					s.pop();
				} else {
					System.out.println("1 unmatched");
					System.exit(1);
				}
			} else if (buf[i] == ']') {
				if (s.getTop() == '[') {
					s.pop();
				} else {
					System.out.println("2 unmatched");
					System.exit(1);
				}
			} else if (buf[i] == '}') {
				if (s.getTop() == '{') {
					s.pop();
				} else {
					System.out.println("3 unmatched");
					System.exit(1);
				}
			}
		}

		if (!s.isEmpty()) {
			System.out.println("4 unmatched");
		} else {
			System.out.println("all matched");
		}
	}
}

/**
 * @author lipc
 * simulate data structure of stack
 */
public class LessonTwoDataStructureStack {
	private int[] data;
	private int size;

	/**
	 * point to top of stack
	 */
	private int top = 0;

	/**
	 * @param size
	 */
	public LessonTwoDataStructureStack(int size) {
		this.size = size;
		this.data = new int[size];
	}

	/**
	 * push num to stack;
	 *
	 * @param num data pushed into stack
	 */
	public void push(int num) {
		data[top++] = num;
	}

	public int pop() {
		if (top > 0) {
			return data[--top];
		} else {
			return data[top];
		}
	}

	public int getTop() {
		if (top > 0) {
			return data[top - 1];
		} else {
			return data[top];
		}
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public int[] returnData() {
		return data;
	}
}
```

use Postfix Expression to calculated the value of 34-56+*

## In-depth understanding of function calls (深入的理解函数的掉用 1)
Usually,we mean functions,which are functions that can exist independently in the global namespace
The method is a function defined in the class, as a member of the class.
Since the method in Java can not be defined independently from the class,there is actually no function in Java,only
 methods.(而方法是定义在类中,作为类的一个成员的函数.由于在Java中方法不能脱离类进行单独的定义,所以在Java中是没有函数的,只是存在方法的)
 
C/C++/Java function calls are similar (C/C++/Java的调用方式是很相近的)
1. What happened when the call was made(调用时发生了什么) 
When a function is called,a small piece of memory corresponding to the called function is created on a specific
 memory area,This small piece of memory is used to store local variables in the function and other information needed
  at runtime.This small space name called a frame
  (C/C++/Java的函数调用是比较类似的.调用一个函数的时候,会在一个特定的内存区域上,创建与被调用函数相对应的一小块内存.这一小块内存的作用是
  为了存放函数在运行过程中所需要的局部变量和运行所需要的其他信息,这一小块的内存有个专门的名字叫做帧)
  For example  
```java
public class Test {
    public static void main(String args[]) {
        int a = 1;
        int b = 2;
        foo(a, b); 
    }   

    public static void foo(int i, int j) {
        i += 1;
        j += 1;

        bar(i, j); 
        int t = i + j;
    }   

    public static void bar(int i, int j) {
        i += 1;
        j += 1;
        return i + j;
    }   
}
```
When main is executed,a function frame belonging to main is created,in which local variables A and B is defined in main are recorded,then a calling frame is created when foo is called,and finally a calling frame is created when bar is called as main or foo(
在main执行的时候会创建一个属于main的函数frame,这里面记录了main中所定义的局部变量a,b,然后在调用 foo 的时候同样的也是创建了一个调用帧,最后在调用 bar 的时候也是一样的去创建一个调用帧,)
,When the functions is return value,the last call frame is destroyed when it returned,and the first created call frame is destroyed at last.this is similar to the stack,but on this stack every element is a frame(最后返回的时候是最后创建的调用帧最先被销毁,最初创建的最后被销毁
这个是类似栈的一样,后进先出,只不过在这里栈里面的每个元素就是一个 frame)That is to say,the stack may refer to the memory used by the program when it runs.An element on the stack corresponds to a function called a frame.

2. What happened when the call was returned(当函数返回的时候发生了什么?)
The caller and the callee agree on a place,and then the callee puts the data in that place,and the caller goes to fetch the data (调用者和被调用者协商好一个地方,然后被调用者把数据放到那个地方,调用者去取这个数据就好了)

## In-depth understanding of function calls 2 (深入的理解函数的掉用 2)

**Stack and Heap**,we knew when a function is called and parameters are passed to a new stack frame,the parameters are copied from the caller's stack frame to callee's stack frame(当函数在调用的时候,往新的栈帧去传递参数的时候会把参数从调用者的栈帧里往被调用者的栈帧里复制一份)
To modify parameters in the callee's stack frame can only modify the copy of the callee,but the data in caller's stack can not be changed.(在被调用者的栈帧里对参数进行修改,只能修改被调用者的栈帧里的数据,不能修改传入的参数的调用者的数据)
However,a condition must be added that the parameters are all basic data types,such as int float double and so on.it's not sure for ordinary Java objects.(但是,必须要加一个前提条件那就是参数必须都是基础数据类型,比如 int float double等等,对于普通的 Java 对象就不成立了)
You can think about it first,assuming that the parameter is a Java object.When the JVM calls the function,copy objects into the caller's stack frame.if the object is large,such as dozens of hundreds of member variables,then this consumption is very impressive.
sometimes the return value can also be a large object. How to solve this problem.In fact from era of C language,there is a solution to this problem,that is heap and pointer.Java inherits this scheme,and the concept of heap still applies in Java,except that the pointer 
becomes a reference.
(大家可以先想一下如果参数是一个对象,JVM 在调用的时候如果把这个对象拷贝一份进入到调用者的栈帧里去,如果对象很大,有几百个变量,那这个消耗就是很可观了,有时候返回值还可能是一个很大的对象这时候.那么怎么解决这个问题呢?其实在C语言的时代针对这个问题就已经有了解决方案,那就是指针和堆.Java 继承了这一方案,堆的概念在
Java 任然是适用的,只不过是指针变成了引用 reference) 

A heap is a separate memory space.When creating an object,we can put the real object into the heap,and only record the address of the object in the stack(堆 heap 是一个独立的内存空间.在创建对象的时候我们可以把真正的对象放到堆里,在栈里记录这个对象的引用地址就可以了,我们可以凭借这个
地址就可以找到这个对象)
```java
public class Main {
	public static void main(String args[]) {
		A a = new A(1);
		A b = new A(2);
		swap(a, b);
		System.out.println("a's value is " + a.value +", b's value is " + b.value);
	}

	public static void swap(A a, A b) {
		int t = a.value;
		a.value = b.value;
		b.value = t;
	}
}

class A {
	public int value;
	public A(int v) {
		this.value = v;
	}
}
```
compared with yesterday's homework,we can see if the parameter type of the swap function is integer,the value of two numbers can not be exchanged.if the parameter type is a normal Java class,the value of the two objects can be exchanged.
(对比昨天的作业就可以知道,当swap函数传入的参数是整数的时候就不能把参数的值进行交换,但是当参数是Java的对象的时候就是可以做交换的) 
As you can see,in the main stack and swap stack,there is only a reference to the real object in the heap,that is an address,if the value in A2 and the value in A1 are exchanged in swap,then swap is finished,the value of A1 and value of A2 are exchanged in main

## Recursive descent for expression evaluation (递归下降做表达式求值)
What is recursion?
The process in which a function calls itself directive or indirectly is called recursion and the cir-responding function is called as recursive function
(递归就是用自己的定义来调用或者定义自己的方式就是递归)
But recursion can not be terminated.To make the definition of recursion complete,these two conditions must be satisfied.(但是递归不能没有终止,要使的递归的定义变的完整,就必须满足这两个条件)
>1.子问题需要和原始问题是同样的事情,且更为简单   
>2.不能无限制的调用本身,必须要有个出口,化简为非递归的情况处理

## Data structure 2 :linked list (数据结构二:链表)
**Array**
Random access is fast,but sequential is slow;(随机存取都很快,但是顺序就会比较慢)
**Big-O notation**(大O记号)
if the steps taken to solve a problem which a scale of n is a constant multiple of N,we will remember that the complexity 
of this method is O(n).For example,to find maximum value of an array.you need to traverse the array.if the length of array 
is n,then the step of traversing the array is n,so this is an O(n) operation;
Similarly,if the steps taken to solve a problem with a scale of n is a constant multiple of n ^ 2,we will remember that 
the complexity of this method is O(n^2).For example,bubble sorting.
if the steps to solve the problem are not related to the scale of the problem.the time complexity is O(1),For example,
random access to arrays(解决一个规模为 n 的问题所花费的步骤如果是 n 的常数倍,我们就记录这个方法的复杂度是 O(n),例如给一个数组去找到这个数组
去求解这个数组中的最大值,就需要遍历这个数组,如果数组的长度为 n,那么遍历数组的步骤就是 n,所以遍历数组的这个行为就是 O(n)的操作.同样的解决一个规模是
n 的问题所花费的步骤如果是 n^2 的常倍数我们记录这个问题的复杂度是 O(n^2).例如冒泡排序方法.)
**Linked list** (链表)
let's we take look linked list
```java
class LinkNode {
    public int data;
    public LinkNode next;
    public LinkNode (int data) {
        this.data = data;
        this.next = null;
    }
}
```
we have defined a link node class,in which there are two member variables,one is integer data,and the other is a reference
to link node type;(我们定义了一个 LinkNode 的类,这个类里有两个成员变量,一个是整形的data,一个是指向 LinkNode 的类型引用)
With this reference,we can string multiple LinkNodes together.example like this code 
```
LinkNode head = new LinkNOde(1);
head.next = new LinkNode(2)
```


 
