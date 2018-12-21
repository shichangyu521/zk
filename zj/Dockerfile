FROM wuxian/tomcat7_jdk8:latest
MAINTAINER 455514253@qq.com

#定义工作目录 conf
ENV WORK_PATH /var/lib/tomcat7/conf
#定义工作目录
ENV TOMCAT_HOME /var/lib/tomcat7
#定义要替换的文件名
ENV USER_CONF_FILE_NAME tomcat-users.xml
#定义要替换的server.xml文件名
ENV SERVER_CONF_FILE_NAME server.xml
#删除原文件tomcat-users.xml
RUN rm $WORK_PATH/$USER_CONF_FILE_NAME
#复制文件tomcat-users.xml
COPY  ./$USER_CONF_FILE_NAME $WORK_PATH/
#删除原文件server.xml
RUN rm $WORK_PATH/$SERVER_CONF_FILE_NAME
#复制文件server.xml
COPY  ./$SERVER_CONF_FILE_NAME $WORK_PATH/
#复制war包
ADD ./target/zj-web.war $TOMCAT_HOME/webapps/app.war

ENTRYPOINT $TOMCAT_HOME/bin/startup.sh && tail -F $TOMCAT_HOME/logs/catalina.out