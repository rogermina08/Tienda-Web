#!/bin/sh
mvn clean package && docker build -t com.mycompany/TiendaVirtual_GP8 .
docker rm -f TiendaVirtual_GP8 || true && docker run -d -p 9080:9080 -p 9443:9443 --name TiendaVirtual_GP8 com.mycompany/TiendaVirtual_GP8