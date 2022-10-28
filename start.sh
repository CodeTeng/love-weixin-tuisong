#!/bin/bash


kill -9 `netstat -nlp | grep :8081 | awk '{print $7}' | awk -F"/" '{ print $1 }'`
clear
nohup java -Dfile.encoding=utf-8 -jar    -Duser.timezone=GMT+08 weixin.tuisong-1.0-SNAPSHOT.jar &