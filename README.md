# For MSA (learn_msa)

## Build
1. Spring Server
    1. config
        1. applicationl.yml
            * make abstract design to datasource url for link with other docker product  
            ex) spring.datasource.url: jdbc:mysql://**mysql**:3306/test?useSSL=false
    2. mvn
        1. clean
            * use clean to clean package
        2. package
            * make jar file (packagename.jar)
        3. spring-boot:run
            * to run, do not need when make just jar file
    3. make docker
        1. Dockerfile location : [Dockerfile](https://github.com/gitJaesik/learn_msa/Dockerfile).
        2. docker build . --tag=image_name (./Dockerfile, ./packagename.jar)
        3. put : docker images to check image is exist in the image
    
2. DB (other docker)
    1. MySQL
        1. user : root, password : 1234, imagename : localmysql
            * docker run -e MYSQL_ROOT_PASSWORD=1234 -p 3306:3306 -d --name=localmysql mysql:5
        2. check db ip address
            * docker inspect localmysql | grep "IPAddress"

3. Link to other container
    1. Server Link with DB
        1. docker run --name web -d -p 8080:8080 --link localmysql:mysql image_name
    2. Check hosts file
        1. cat /etc/hosts
            * localmysql's_ip mysql 8ebcfa1cd0c5 localmysql
            * hosts file means dns

