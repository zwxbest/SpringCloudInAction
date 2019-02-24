# SpringCloudBook

本工程为《Spring Cloud实战》一书的配套示例代码。在原代码基础上加入Docker支持，方便快速启动多个服务。

不同阶段的代码用分支切换，免去了到处都是注释造成的混乱。

## 运行环境

* Maven
* Java
* Docker
* Bash（Windows用git bash也行）

## 分支

本分支对应P192-Turbine集群监控

## 启动 

./build.sh

## 运行

1. 访问http://127.0.0.1:9000/hystrix
1. 总上面一框中输入http://127.0.0.1:9000/turbine.stream,一开始会一直loading
1. 多次访问http://127.0.0.1:9000/ribbon-consumer
1. [ ] 一直是loading,这个找原因


