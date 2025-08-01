# Testing Log on Wildfly

## How to Test
```
$ curl -kv http://localhost:8080/yusara-0.0.1-SNAPSHOT/api/hello?name=edwin
*   Trying [::1]:8080...
*   Trying 127.0.0.1:8080...
* Connected to localhost (127.0.0.1) port 8080
> GET /yusara-0.0.1-SNAPSHOT/api/hello?name=edwin HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/8.4.0
> Accept: */*
>
< HTTP/1.1 200 OK
< Connection: keep-alive
< Content-Type: text/plain;charset=UTF-8
< Content-Length: 12
< Date: Fri, 01 Aug 2025 12:22:05 GMT
<
* Connection #0 to host localhost left intact

Hello, edwin                                                   
```

## Solution
Adding this on `application.properties` file would solve it,
```properties
logging.level.root=debug
```