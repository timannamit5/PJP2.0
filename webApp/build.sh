#!/bin/sh
#echo "Enter the build phase"
#read x
mvn clean install | tee build.log
