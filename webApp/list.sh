#!/bin/sh
echo "enter the goal"
read x
#echo $x
mvn help:describe -Dcmd=$x