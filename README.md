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

1. 监视ribbon-consumer的日志
1. 重复调用http://127.0.0.1:9000/ribbon-consumer
1. 默认超时为2000ms,ribbon-consumer随机模拟睡眠了0-4000ms



