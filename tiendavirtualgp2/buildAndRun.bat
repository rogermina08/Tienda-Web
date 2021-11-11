@echo off
call mvn clean package
call docker build -t com.mycompany/TiendaVirtual_GP8 .
call docker rm -f TiendaVirtual_GP8
call docker run -d -p 9080:9080 -p 9443:9443 --name TiendaVirtual_GP8 com.mycompany/TiendaVirtual_GP8