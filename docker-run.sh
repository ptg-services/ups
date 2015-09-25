rm -rf ~/docker/ups/logs/*
docker stop ups &>/dev/null
#docker rm $(docker ps -a -q)
#docker rmi $(docker images -q --filter "dangling=true")
docker rm ups &>/dev/null
docker run -d --name ups -p 8081:8081  -v ~/docker/ups-service/logs:/opt/mule/logs hshira/ups:latest
docker ps
