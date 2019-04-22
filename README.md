# SampleOfKotlin-Basic
Getting started with Kotlin Basics

# 1. 简介

## 1.1. 历史发展

* 2011年7月JetBrains推出Kotlin项目，这是一个面向JVM的新语言，它已被开发一年之久。
* 2012年2月JetBrains以Apache 2许可证开源此项目，Jetbrains希望这个新语言能够推动IntelliJ IDEA的销售。
* 2016年2月15日发布1.0版，被认为是第一个官方稳定版本，并且JetBrains已准备从该版本开始的长期向后兼容性。
* 2017年3月，JetBrains发布Kotlin 1.1版本，Kotlin在全球范围内成长显著。
* 2017年5月18日Google I/O大会上宣布Kotlin正式成为Android的官方一级开发语言，同时AS3.0默认集成Kotlin Plugin。
* 2017年11月，JetBrains发布了Kotlin 1.2版本，推出了多平台项目特性，可以将原始代码编译成多个平台的目标代码，目前支持JVM和JavaScript。
* 2018年2月，Google发布了Android KTX扩展库，目前已属于Android Jetpack系列中的一员，简单的说Android KTX旨在让我们利用Kotlin语言功能（例如扩展函数/属性、lambda、命名参数和参数默认值），以更简洁、更愉悦、更惯用的方式使用Kotlin进行Android开发。甚至可以简单理解为Google为Kotlin准备的适配Android的一系列xxxUtils工具。这个库由[Jake Wharton](https://github.com/JakeWharton)负责维护。
* 2018年10月，JetBrains发布了Kotlin 1.3版本，这个版本最重要的特性就是协程，它使得非阻塞代码易于读写。此外在多平台方面，支持了支持 JVM、Android、JavaScript和Native。这意味着Kotlin能进行前端、移动端以及后端代码的开发了。
* 目前已有非常多的开源库推出Kotlin版本：[RxKotlin](https://github.com/ReactiveX/RxKotlin)、[kotterknife](https://github.com/JakeWharton/kotterknife)、[leakcanary](https://github.com/square/leakcanary)、[material-dialogs](https://github.com/afollestad/material-dialogs)、[kotlin-web-site](https://github.com/JetBrains/kotlin-web-site)、[kotlin-dsl](https://github.com/gradle/kotlin-dsl)、[SwiftKotlin](https://github.com/angelolloqui/SwiftKotlin)、[kotlinconf-app](https://github.com/JetBrains/kotlinconf-app)、[Design-Patterns-In-Kotlin](https://github.com/dbacinski/Design-Patterns-In-Kotlin)、[anko](https://github.com/Kotlin/anko)、[recyclerview-animators](https://github.com/wasabeef/recyclerview-animators)、[glide-transformations](https://github.com/wasabeef/glide-transformations)、[retrofit2-kotlin-coroutines-adapter](https://github.com/JakeWharton/retrofit2-kotlin-coroutines-adapter)

## 1.2. APP集成现状

使用|未使用
:-:|:-:
[Pinterest](https://play.google.com/store/apps/details?id=com.pinterest&_branch_match_id=647609346855862845) <br> [Evernote](https://play.google.com/store/apps/details?id=com.evernote) <br> [Uber](https://play.google.com/store/apps/details?id=com.ubercab) <br> [Facebook](https://www.facebook.com/android_upgrade) <br> [twitter](https://play.google.com/store/apps/details?id=com.twitter.android) <br> [微信读书](https://play.google.com/store/apps/details?id=com.tencent.weread) <br> [豆瓣](https://play.google.com/store/apps/details?id=com.douban.frodo) <br> [钉钉](https://play.google.com/store/apps/details?id=com.alibaba.android.rimet) <br> [京东](https://play.google.com/store/apps/details?id=com.jingdong.app.mall) <br> [百度](https://play.google.com/store/apps/details?id=com.baidu.searchbox) <br> [抖音](https://sj.qq.com/myapp/detail.htm?apkName=com.ss.android.ugc.aweme) <br> [今日头条](https://play.google.com/store/apps/details?id=com.ss.android.article.news) <br> [爱奇艺](https://play.google.com/store/apps/details?id=com.qiyi.video) | YouTube <br> Instagram <br> 迅雷 <br> 微信 <br> 快手 <br> 手机QQ <br> 手机淘宝



## 1.3. 优势

* 改变编程思维

    类似rx的集合操作符、自带的操作符，以及闭包、高阶函数形式跟传统java编程有一些区别。

* 能少则少

  * Kotlin支持类型推断，不像Java那样啰嗦。
  * 用var表示变量，val表示不可变的变量。
  * 定义方法很简单，连function都缩写成了fun。
  * 类的继承和实现很简单，使用:即可。
  * Kotlin每个句子都不需要加分号。

* 完美兼容Java

  * [volley](https://github.com/google/volley)
  * [okhttp](https://github.com/square/okhttp)
  * [retrofit](https://github.com/square/retrofit)
  * [EventBus](https://github.com/greenrobot/EventBus)
  * [glide](https://github.com/bumptech/glide)
  * [picasso](https://github.com/square/picasso)
  * [MPAndroidChart](https://github.com/PhilJay/MPAndroidChart)
  * [lottie-android](https://github.com/airbnb/lottie-android)
  * [ijkplayer](https://github.com/bilibili/ijkplayer)
  * [zxing](https://github.com/zxing/zxing)
  * [fresco](https://github.com/facebook/fresco)
  * [PhotoView](https://github.com/chrisbanes/PhotoView)
  * [tinker](https://github.com/Tencent/tinker)
  * [greenDAO](https://github.com/greenrobot/greenDAO)
  * [android-Ultra-Pull-To-Refresh](https://github.com/liaohuqiu/android-Ultra-Pull-To-Refresh)
  * ...

## 1.4. 学习资料

* Kotlin Github地址：https://github.com/JetBrains/kotlin
* Kotlin官方中文翻译站点：https://www.kotlincn.net/docs/reference/
* 张涛的开源实验室：https://kymjs.com/column/kotlin.html
* 视频资料 [百度网盘]：https://pan.baidu.com/s/1nvGYAfB#list/path=%2F
* 极客时间快速上手Kotlin开发 [付费视频课]：https://time.geekbang.org/course/intro/105

# 2. 基本语法

下面介绍Kotlin的最重要的基础语法，里面的某些示例代码参考github上的仓库：[SampleOfKotlin-Basic](https://github.com/Leeeyou/SampleOfKotlin-Basic)

## 2.1. [Defining functions](https://kotlinlang.org/docs/reference/functions.html#functions)

* 调用的时候可以显式的标示参数名。
* 可以提供默认参数值，减少重载有奇效。
* 【示例见SampleOfKotlin-Basic → com.leeeyou.sampleofkotlin.basic.definingFunctions】

```java
private fun double(x: Int = 100, y: Int = 200): Int {
    return (2 * x) + y
}
```

## 2.2. [Defining variables](http://kotlinlang.org/docs/reference/basic-syntax.html#defining-variables)

* Kotlin具有可推倒特性。
* val：只读变量用val关键字，它仅能被赋值一次。val表示可读的变量（read-only，注意不是immutable）。
* var：可被重复赋值的变量用var关键字。var表示变量，是可变的（mutable）。
  * val与var的区别在于：val是无法提供set函数的，只有get函数。
* const：用于定义常量，准确的说const所定义的常量叫**编译时常量**。
  * 如果它的值无法在编译时确定，则编译不过，这个常量跟Java的static final是有所区别的。这里就是说你定义的const val常量要即时赋值，而不能稍后再赋值。
  * const无法定义局部变量，因为局部变量会存放在栈区，它会随着调用的结束而销毁，这点跟Java的static final一致。
  * 所以const的使用必须满足：1. 顶层属性或者object的成员，2.  String或者基本类型的值，3. 没有自定义 getter。
  * const的使用是一个容易出错的点，我们应该好好理解它的规则。
* 【示例见SampleOfKotlin-Basic → com.leeeyou.sampleofkotlin.basic】

## 2.3. [Using string templates](http://kotlinlang.org/docs/reference/basic-syntax.html#using-string-templates)

* 字符串模版配合表达式可以输出丰富的字符串。
* """中可以包含换行、反斜杠等等特殊字符。
* 【示例见SampleOfKotlin-Basic → com.leeeyou.sampleofkotlin.basic.usingStringTemplates】

```java
val i = 10
println("i = $i") // prints "i = 10"

val s = "abc"
println("$s.length is ${s.length}") // prints "abc.length is 3"

val price = """
            ${'$'}9.99，


            这里展示 / or // or \  or \\
            """
```

## 2.4. Using loop

* [For Loops](https://kotlinlang.org/docs/reference/control-flow.html#for-loops)

```java
//注意这里Followers是集合类型
for (item in Followers) print(item)

for (i in 1..10) println(i)

for (i in 1 until 10) println(i)

for (i in 10 downTo 1) println(i)

for (i in 1..10 step 2) println(i)

repeat(10) {
 println(it)
}

for ((index, str) in list.withIndex()) {
 println("第${index}个元素$str")
}
```

* [While Loops](https://kotlinlang.org/docs/reference/control-flow.html#while-loops)

```java
while (x > 0) {
    x--
}

do {
    val y = retrieveData()
} while (y != null) // y is visible here!
```

## 2.5. [Operations](https://kotlinlang.org/docs/reference/basic-types.html#operations)

* 位运算符只可用在Int和Long类型上
* 左移(in java <<) → shl(bits)
* 右移(in java >>) → shr(bits)
* 无符号右移(in java >>>) → ushr(bits)
* 按位与 → and(bits)
* 按位或 → or(bits)
* 按位异或 → xor(bits)
* 按位取反 → inv()
  * 原码：符号位加上真值的绝对值。
  * 反码：正数的反码是其本身；负数的反码是在其原码的基础上，**符号位不变**，其余各个位取反。
  * 补码：正数的补码就是其本身；负数的补码是在其原码的基础上，**符号位不变**，其余各位取反，最后+1。(即在反码的基础上+1)
  * 求证~8的过程为什么是-9？
  * 求证-8无符号右移2位后为什么是1073741822？

    >~8的求证过程：
    8原码：0000 0000 0000 0000 0000 0000 0000 1000
    8反码：0000 0000 0000 0000 0000 0000 0000 1000
    8补码：0000 0000 0000 0000 0000 0000 0000 1000
    ~后的补码：1111 1111 1111 1111 1111 1111 1111 0111
    -1后转成反码：1111 1111 1111 1111 1111 1111 1111 0110
    再转成原码：1000 0000 0000 0000 0000 0000 0000 1001
    即十进制：-9

    >-8 >>> 2的求证过程：
    -8原码：1000 0000 0000 0000 0000 0000 0000 1000
    -8反码：1111 1111 1111 1111 1111 1111 1111 0111
    -8补码：1111 1111 1111 1111 1111 1111 1111 1000
    右移两位后的补码：0011 1111 1111 1111 1111 1111 1111 1110
    由于是正数，所以补码、反码、原码一直，所以上面的补码就是原码，
    所以00111111111111111111111111111110转成十进制就是1073741822

## 2.6. [Returns and Jumps](https://kotlinlang.org/docs/reference/returns.html#returns-and-jumps)

* return/break/continue。
* 可以根据需求，返回到指定的标签处。
* 【示例展示见官网链接】

## 2.7. [Object Expressions and Declarations](https://kotlinlang.org/docs/reference/object-declarations.html)

* 可用于创建匿名类的对象。
* 如果匿名类中包含构造函数，则必须传递合适的入参给它。
* 可以创建一个临时对象，而不用声明data class（or javabean）。
* 对象声明总是在object关键字后跟一个名称，就像变量声明一样，但对象声明不是一个表达式，不能用在赋值语句的右边。使用的时候直接通过该名称引用其中的函数即可。
* 伴生对象（即著名的companion object），伴生对象的成员可通过只使用类名来调用其中的函数（类似Java中的静态方法）。**尽管伴生对象看起来像静态成员，但实际上在运行时它仍然是真实对象的实例成员。**
* 【示例见SampleOfKotlin-Basic → com.leeeyou.sampleofkotlin.basic.`object`】

```java
//可用于创建匿名类的对象。
window.addMouseListener(object : MouseAdapter() {
    override fun mouseClicked(e: MouseEvent) { …… }

    override fun mouseEntered(e: MouseEvent) { …… }
})

//如果匿名类中包含构造函数，则必须传递合适的入参给它。
open class A(x: Int) {
    public open val y: Int = x
}

interface B { ... }

val ab: A = object : A(1), B {
    override val y = 15
}

//对象声明
object DataProviderManager {
    fun registerDataProvider(provider: String) {
        echo("$provider 注册成功")
    }
}
DataProviderManager.registerDataProvider("1号数据源")
```

## 2.8. [Classes and Inheritance](https://kotlinlang.org/docs/reference/classes.html)

* 类及构造函数
  * 构造函数分主次： primary constructor、Secondary Constructors
* 在Koltin中继承和实现都通过 :
* 静态函数的实现：【示例见SampleOfKotlin-Basic → com.leeeyou.sampleofkotlin.basic.staticMethod】
  * 在Kotlin中没有类似java的静态方法，想要使用可以考虑采用包级函数代替。
  * 还要一种便利的方式就是通过伴生对象：[companion object](https://kotlinlang.org/docs/reference/object-declarations.html#companion-objects)。

```java
//类及构造函数
class Person(val firstName: String, val lastName: String, var age: Int) {
    constructor(parent: Person) {
        parent.children.add(this)
    }
}

//继承的实现
open class Foo {
    open fun f() { println("Foo.f()") }
    open val x: Int get() = 1
}

class Bar : Foo() {
    override fun f() {
        super.f()
        println("Bar.f()")
    }

    override val x: Int get() = super.x + 1
}

//抽象类
open class Base {
    open fun f() {}
}

abstract class Derived : Base() {
    override abstract fun f()
}
```

## 2.9. [Data Classes](https://kotlinlang.org/docs/reference/data-classes.html#data-classes)

类似JavaBean，不过我们不需要再写get/set方法，还有equals()/hashCode()对以及toString()方法都会被自动生成。

```java
data class Customer(val name: String, val email: String)
```

## 2.10. [Interfaces](https://kotlinlang.org/docs/reference/interfaces.html#interfaces)

* 实现多个父类，可以灵活解决方法覆盖的冲突问题。
* 想要实现一个匿名内部类实例，需要通过object关键字。
* 【示例见SampleOfKotlin-Basic → Interface】

```java
//多父类下，方法覆盖冲突问题
interface A {
    fun foo() { print("A") }
    fun bar()
}

interface B {
    fun foo() { print("B") }
    fun bar() { print("bar") }
}

class C : A {
    override fun bar() { print("bar") }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}

//匿名内部类
D().setClickListener(object : ClickListener {
    override fun countClick() {
        Log.d(this@MainActivity.localClassName, "点击回调")
    }
})
```

## 2.11. [Extensions](https://kotlinlang.org/docs/reference/extensions.html#extensions)

* 扩展函数：Kotlin中的扩展函数是静态的给一个类添加方法的，不具备运行时的多态效应。
  * String.lastChar()
  * Activity.hideKeyboard()
* 扩展属性
  * List<T>.lastIndex
* 【示例见SampleOfKotlin-Basic → Extensions】############################

## 2.12. [Generics](https://kotlinlang.org/docs/reference/generics.html#generics)

* 泛型是一个类型安全机制，将运行时期出现的ClassCastException问题转移到编译时期，避免了强制转换的麻烦。
* [Java中泛型的特点](http://leeeyou.xyz/2018/09/20/blog-2018-09-20-Java%E4%B9%8B%E6%B3%9B%E5%9E%8B/)
  * 类型擦除（在编译期间去掉类型信息）
  * 不可具体化的类型（运行时包含的信息比它的编译时包含的信息更少）
  * 泛型类型参数之间没有继承关系（ArrayList&lt;Object> arrayList1=new ArrayList&lt;String>();//编译错误）
  * 通配符以及[PECS原则（PECS stands for Producer-Extends, Consumer-Super）](http://androidxref.com/9.0.0_r3/xref/libcore/ojluni/src/main/java/java/util/Collections.java)
* 对应Kotlin中Consumer in，Producer out
* 【示例见SampleOfKotlin-Basic → com.leeeyou.sampleofkotlin.basic.generic】
* 对比Java与Kotlin中的使用对比

 - |Produce|Consumer
:-:|:-:|:-:
Java| ? extend E <br>（表示包括E在内的任何E的子类） | ? super E <br> （表示包括E在内的任何E的父类）
Kotlin| out E <br>（只能用作输出，可作为返回值类型，无法作为入参类型） | in E <br>（只能用作输入，可作为入参类型，无法作为返回值类型）

## 2.13. [Null Safety](https://kotlinlang.org/docs/reference/null-safety.html#null-safety)

* ? 可为空，不会抛出NPE
* !! 不可为空，会抛出NPE
* String和String?是两种完全不同的数据类型，简单来说就是String?类型包含了String类型，使用的时候务必小心变量是否为空。
* **Java代码与Kotlin代码互调注意点：在Kotlin代码中，接收一个Java对象的时候，如果你不确定是否可能空，务必将其赋值为可空类型的变量，这样才能保证代码是安全的，否则的话极有可能抛出NPE。**
* 【示例见SampleOfKotlin-Basic → com.leeeyou.sampleofkotlin.basic.nullSafe】

## 2.14. Lambda

* 如果Lambda没有参数，可以省略箭头符号
* 如果Lambda是函数的最后一个参数，可以将大括号放在小括号外面
* 如果函数只有一个参数且这个参数是Lambda，则可以省略小括号
* 【示例见SampleOfKotlin-Basic → com.leeeyou.sampleofkotlin.basic.lambda】

```java
//如果Lambda没有参数，可以省略箭头符号
fun main(args: Array<String>){
    val thread = Thread({ })
    thread.start()
}

//如果Lambda是函数的最后一个参数，可以将大括号放在小括号外面
fun main(args: Array<String>){
    val thread = Thread(){ }
    thread.start()
}

//如果函数只有一个参数且这个参数是Lambda，则可以省略小括号
fun main(args: Array<String>){
    val thread = Thread{ }
    thread.start()
}
```

## 2.15. Lambda闭包声明

* Lambda+闭包
* 【示例见SampleOfKotlin-Basic → com.leeeyou.sampleofkotlin.basic.lambda】

```java
val echo = { name: Any -> println(name) }

val lambdaA = { a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int, h: Int,
                i: Int, j: Int, k: Int, l: Int, m: Int, n: Int, o: Int, p: Int,
                q: Int, r: Int, s: Int, t: Int, u: Int, v: Int, w: Int ->
    println("23个入参的闭包")
}
```

## 2.16. [Higher-Order Functions](https://kotlinlang.org/docs/reference/lambdas.html#higher-order-functions)

* 高阶函数指函数或者Lambda的参数又是一个函数或者Lambda。
* 当Lambda作为函数参数的最后一个时，是可以写到小括号外面的。
* 【示例见SampleOfKotlin-Basic → com.leeeyou.sampleofkotlin.basic.lambda】

```java
private fun resultByOpt(num1: Int, num2: Int, result: (Int, Int) -> Int): Int {
    return result(num1, num2)
}
```

## 2.17. [Visibility Modifiers](https://kotlinlang.org/docs/reference/visibility-modifiers.html#visibility-modifiers)

* Kotlin中的访问修饰符internal : 模块内可以调用，跨模块则不行。这里的模块指类似AS中的module。
* 如果不特意声明，默认是public
* classes, objects, interfaces, constructors, functions, properties and their setters can have visibility modifiers。
* 【示例见SampleOfKotlin-Basic → com.leeeyou.sampleofkotlin.basic.visible】

## 2.18. [Delegation](https://kotlinlang.org/docs/reference/delegation.html)

* Kotlin的动态代理本质上是通过静态代理去调用的
* 通过关键字by
* 【示例见SampleOfKotlin-Basic → com.leeeyou.sampleofkotlin.basic.delagation】

## 2.19. [Sealed Classes](https://kotlinlang.org/docs/reference/sealed-classes.html)

* 超级枚举，可提高程序扩展性。
* 【示例见SampleOfKotlin-Basic → com.leeeyou.sampleofkotlin.basic.seal】

# 3. 扩展

## 3.1. 为什么能实现扩展函数和属性这样的特性？

### 3.1.1. 边界

* Kotlin语言最后需要编译为class字节码，Java也是编译为class执行。
* 可以理解为Kotlin需要转成Java一样的语法结构， Kotlin就是一种强大的语法糖而已。
* 在虚拟机规范范围以内提供外界最便利的支持，虚拟机不具备的功能Kotlin也不能越界。

### 3.1.2. Kotlin与Java互转

* Kotlin转Java
  * **Tools ---> Kotlin ---> Show Kotlin Bytecode**
  * Decompile
* Java转Kotlin
  * Java代码 ---> 选择Code ---> Convert Java File to Kotlin File

### 3.1.3. 源码解析

* 对于扩展函数，转化为Java的时候其实就是一个静态的函数，同时这个静态函数的第一个参数就是该类的实例对象。
* 扩展函数和扩展属性内只能访问到类的公有方法和属性，私有的和protected是访问不了的。
* 扩展函数不是真的修改了原来的类，定义一个扩展函数不是将新成员函数插入到类中，扩展函数的类型是"静态的"，不是在运行时决定类型。

## 3.2. kotlin-android-extensions插件原理介绍

* public View _$_findCachedViewById(int var1){}
* private HashMap _$_findViewCache;

## 3.3. Kotlin与Swift的对比

![Kotlin与Swift的对比](https://github.com/Leeeyou/Img/blob/master/KotlinShare/Kotlin-Swift.png?raw=true)

# 4. 总结

## 4.1. Kotlin语法到项目展示

* 语法简单，不啰嗦
* 空指针安全
* 支持方法扩展和属性扩展
* Lambda, 高阶函数，闭包支持，函数式编程支持
* 字符串模板，密闭类，代理模式，函数默认参数，data class
* 与Java交互性好

## 4.2. 原理扩展以及与Swift对比

* 利用好Kotlin与Java互转，掌握工具的使用
* 让你有种可以写swift app的“幻觉”

## 4.3. 关于转向Kotlin

* 对于个人的项目来转向Kotlin，通常不是很难的选择。
* 让团队转用Kotlin，困难可能来自学习成本、历史包袱、编程思维的转变。
* 目前Kotlin已推出稳定版1.3，大公司的许多app中也引入了Kotlin，在2019年04月编程语言排行榜中Kotlin排到35位，加上google的加持，引入Kotlin改写或重构代码，让团队成员自我提升，似乎无需置疑，好处多多。