# Spring 简单插件机制实现

创建一个接口,多个实现类

将多个实现类都注入到Spring Bean容器中

在业务代码里获得Spring Bean容器中所有该接口下的Bean,循环调用接口中的抽象方法.

# 使用spring-plugin实现插件机制

