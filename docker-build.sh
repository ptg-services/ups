# boot2docker up
mvn clean package
docker stop ups
docker rm ups
docker rmi  hshira/ups:latest
docker build  -t hshira/ups:latest .

