#!/bin/sh
mvn dependency:go-offline
mvn clean install -o 
