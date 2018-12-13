#!/usr/bin/env bash

#获取镜像名称
ImageID=`docker images | grep "tomcat_scy" | awk '{print $1}'`
if [ ! -n ${ImageID} ]; then
  echo "Dockerfile create image。。。"
  docker build -t tomcat_scy:1.0.1 /application/dockerfile/tomcat
fi

#容器名称
containerName="ziigeerService"
#查询容器id
ContainersID=`docker ps -a | grep $containerName | awk  '{print $1}'`

if [ -n ${ContainersID} ]; then
  echo "Container is not NULL，So delete Container 。。。"
  docker stop $ContainersID
  docker rm $ContainersID
fi

echo "Create Container 。。。 ContainerId：$containerName"
docker run --name=$containerName -p 8066:8066 -e TOMCAT_SERVER_ID=tomcat_server_001 -idt tomcat_scy:0.0.7
