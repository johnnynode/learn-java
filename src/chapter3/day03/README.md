# 具体內容

- 标识符和关键字
  1. 标识符：由任意顺序的字母、下划线_、美元符号$ 和数字组成，并且第一个字符不能是数字。
     ①标识符不能是java中的保留关键字。
     ②严格区分大小写
     ③java中使用unicode标准字符集，最多可识别65535个字符。
     
  2. 关键字：是Java中已被赋予特定意义的一些单词，不可以把这些字作为标识符来使用。
  java中的关键字如下：
  int　　public　　this　　finally　　boolean　　abstract
  continue　　float　　long　　short　　throw　　throws
  return　　break　　for　　static　　new　　interface
  if　　goto　　default　　byte　　do　　case
  strictfp　　package　　super　　void　　try　　switch
  else　　catch　　implements　　private　　final　　class
  extends　　volatile　　while　　synchronized　　instanceof　　char
  protected　　import　　transient　　default　　double
  
  3. 声明变量
       定义变量就是告诉编译器这个变量的数据类型，这样编译器才知道要配置多少空间给他，以及他能存放什么样的数据。
       在程序运行中，空间内的值是变化的，这个内存空间就成为变量。
       变量的命名必须是合法的标识符。在声明变量时可以没有赋值，也可以直接赋给初值。
       示例：
  ```java
  int age;
  char char1 = 'r';
  
  ```
  4. 变量名命名规范：<br>
  ①. 变量名必须是一个有效的标识符<br>
  ②. 变量名不可以使用Java中的关键字。<br>
  ③. 变量名不能重复<br>
  ④. 应该选择有意义的单词作为变量名<br>
      在Java中可以使用汉字或其他语言文字作为变量名，但不建议这样做！
  
  5. 声明常量
      在程序运行中，一直不会改变的量成为常量(constant),通常也被称为final变量。常量在整个程序中只被赋值一次。
      在为所有对象共享值时，常量是非常有用的。
      在Java语言中除了要指定一个数据类型外，还需要通过final关键字进行限定。声明常量的标准语法如下：
      > final 数据类型 常量名称[=值]
  
      示例：
  ```java
  final double PI = 3.1415926D; // 声明double型常量PI并赋值
  fianl boolean BOOL = true;  // 声明 boolean 型常量BOOL并赋值
  ```
      注意：在定义final变量属于"成员变量"时，必须在定义时就设定它的初值，否则将会产生编译错误。  
  
  
  
  
  
  
  