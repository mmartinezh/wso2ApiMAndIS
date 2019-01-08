# wso2ApiMAndIS

Se ha creado una bbdd llamada JDBD_user_store en mysql utilizando lo siguiente:

Para descargar mysql 

https://dev.mysql.com/downloads/file/?id=480768


vim ~/.bash_profile


export mysql=/usr/local/mysql
export PATH=$PATH:$M2_HOME/bin:$mysql/bin

mysql -u root -p  (pwd del usuario root facilitada en la instalación 4669MacMMH) 
Creamos la bbdd

create database JDBC_user_store; 

use JDBC_user_store;

Para crear usuarios CREATE USER 'apiuser'@'localhost' IDENTIFIED BY 'apimanager';

Dar permisos.

GRANT ALL PRIVILEGES ON apimgt.* TO 'apiuser'@'localhost'
GRANT ALL PRIVILEGES ON userstore.* TO 'apiuser'@'localhost'
GRANT ALL PRIVILEGES ON registry.* TO 'apiuser'@'localhost'

IS:
source /Library/WSO2/IdentityServer/5.7.0/dbscripts/mysql.sql
APIM:
source /Library/WSO2/wso2am-2.0.0/dbscripts/mysql.sql




