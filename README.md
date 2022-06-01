## Java 知识点

### Java 特点

* java 语言是面向对象的（oop）
* java 语言是健壮的。java的强类型机制、异常处理、垃圾的自动回收
* java 语言是跨平台的（windows、Linux）
* java 语言是解释型语言。还有 JavaScript、php、编译性语言：c/c++。区别：解释性语言，编译后的代码，不能直接被机器执行，需要解释器（jvm）来执行，编译性语言，编译后的代码，可以直接被机器执行。
* 因为有了jvm，同一个java程序在三个不同的操作系统中都可以执行，这样就实现了java程序的跨平台性

### java运行机制及运行过程

* java核心机制-java虚拟机（JVM java virtual machine）
* JVM 是一个虚拟的计算机，具有指令集并使用不同的存储区域。负责执行指令，管理数据、内存、寄存器、包含在JDK（java开发工具包）中
* 对于不同的平台，有不同的虚拟机
* java虚拟机机制屏蔽了底层运行平台的差别，实现了“一次**编译**，到处**运行**”

### 什么是JDK、JRE

* JDK的全称（java Development Kit。 java开发工具包）
* JDK = JRE + java 的开发工具（java、javac、javadoc、javap等）
* JDK是提供给 java 开发人员使用的，其中包含了java的开发工具，也包括了JRE
* JRE（java runtime environment。 java运行环境）
* JRE = JVM + java的核心类库
* 包括java虚拟机（jvm java virtual machine）和java程序所需的核心类库等

### JDK、JRE 和 JVM 的包含关系

* JDK = JRM + 开发工具集（例如：javac、java编译工具等）
* JRE = JVM + javaSE标椎类库（java核心类库）
* JDK = JVM + JavaSE标椎类库 + 开发工具集