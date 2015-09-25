Universal Proxy Service: UPS
===  
UPS is a RESTful service that --  
* Provides a proxy layer  
* Provides a mock layer  

Run using Docker

```
docker run -d -p 8081:8082  hshira/ups:latest
```

[Health](http://192.168.59.103:8082/ups-service/health)  

``` 
http://192.168.59.103:8082/ups-service/health
``` 

[Error 401](http://192.168.59.103:8082/ups-service/error/?errorCode=401&endUrl=http://www.google.com) 

```
http://192.168.59.103:8082/ups-service/error/?errorCode=401&endUrl=http://www.google.com
```

[Delay 5000 ms](http://192.168.59.103:8082/ups-service/proxy/?ms=5000&endUrl=http://www.google.com) 

```
http://192.168.59.103:8082/ups-service/proxy/?ms=5000&endUrl=http://www.google.com
```



Future plan
* Make ups capable for service-mutation-testing. Faults (or mutations) will be automatically seeded into your REST calls, then your tests are run. If your tests fail then the mutation is killed, if your tests pass then the mutation lived. This is similar to the Pi Test http://pitest.org/ , the only difference being that PiTest works on the code in same JVM whereas UPS will work as a proxy for external services.


All Set!
