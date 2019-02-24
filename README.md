# SpringCloudBook

本工程为《Spring Cloud实战》一书的配套示例代码。在原代码基础上加入Docker支持，方便快速启动多个服务。

不同阶段的代码用分支切换，免去了到处都是注释造成的混乱。

## 运行环境

* Maven
* Java
* Docker
* Bash（Windows用git bash也行）

## 分支

本分支对应P48-服务发现与消费

## 启动 

./build.sh

## 运行

1. http://127.0.0.1:9000/ribbon-consumer  多次调用hello-service方法,查看日志轮循
1. 关闭其中一个hello-service服务,重复上述操作,发现循环打印hello world和error



