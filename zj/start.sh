#!/usr/bin/env bash

#容器名称
containerName="zj-web"
#查询容器id
ContainersID=`docker ps -a | grep "$containerName" | awk  '{print $1}'`
#如果容器存在 删除容器
if [ -n $"ContainersID" ]; then
    echo "Container is not NULL，So delete Container 。。。"
    docker stop $ContainersID
    docker rm $ContainersID
fi

#镜像名称
ImageName="zj-web-image"
ImageVersion="1.0.1"
#获取镜像名称
ImageID=`docker images | grep "$ImageName" | grep "1.0.1" | awk '{print $3}'`
if [ -n $"ImageID" ]; then
    #发现镜像 删除镜像
    echo "Dockerfile Delete image。。。"
    docker rmi ImageID
fi
#dockerfile创建镜像
docker build -t "$ImageName":"$ImageVersion" /application/zj-web

#创建容器
echo "Create Container 。。。 ContainerName: $containerName"
docker run --name="$containerName" -p 8066:8066 -e TOMCAT_SERVER_ID=tomcat_server_001 -idt "$ImageName":"$ImageVersion"
