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

## Logs
```
19:19:49,718 INFO  [org.jboss.weld.Version] (MSC service thread 1-1) WELD-000900: 5.1.5 (redhat)
19:19:51,178 INFO  [io.undertow.servlet] (ServerService Thread Pool -- 103) 2 Spring WebApplicationInitializers detected on classpath
Handler java.util.logging.ConsoleHandler is not defined
Handler java.util.logging.ConsoleHandler is not defined
19:25:12,891 INFO  [stdout] (ServerService Thread Pool -- 120)
19:25:12,891 INFO  [stdout] (ServerService Thread Pool -- 120)   .   ____          _            __ _ _
19:25:12,893 INFO  [stdout] (ServerService Thread Pool -- 120)  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
19:25:12,893 INFO  [stdout] (ServerService Thread Pool -- 120) ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
19:25:12,894 INFO  [stdout] (ServerService Thread Pool -- 120)  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
19:25:12,895 INFO  [stdout] (ServerService Thread Pool -- 120)   '  |____| .__|_| |_|_| |_\__, | / / / /
19:25:12,895 INFO  [stdout] (ServerService Thread Pool -- 120)  =========|_|==============|___/=/_/_/_/
19:25:12,896 INFO  [stdout] (ServerService Thread Pool -- 120)
19:25:12,898 INFO  [stdout] (ServerService Thread Pool -- 120)  :: Spring Boot ::                (v3.5.4)
19:25:12,898 INFO  [stdout] (ServerService Thread Pool -- 120)
19:25:13,004 INFO  [com.yusara.ServletInitializer] (ServerService Thread Pool -- 120) Starting ServletInitializer using Java 21.0.3 with PID 9904 (started by EDWIN in /software/jboss-eap-8.1/bin)
19:25:13,006 INFO  [com.yusara.ServletInitializer] (ServerService Thread Pool -- 120) No active profile set, falling back to 1 default profile: "default"
19:25:13,835 INFO  [io.undertow.servlet] (ServerService Thread Pool -- 120) Initializing Spring embedded WebApplicationContext
19:25:13,838 INFO  [org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext] (ServerService Thread Pool -- 120) Root WebApplicationContext: initialization completed in 773 ms
19:25:14,703 INFO  [com.yusara.ServletInitializer] (ServerService Thread Pool -- 120) Started ServletInitializer in 2.312 seconds (process running for 335.686)
19:25:14,719 INFO  [jakarta.enterprise.resource.webcontainer.faces.config] (ServerService Thread Pool -- 120) Initializing Mojarra 4.0.11.redhat-00001 for context '/yusara-0.0.1-SNAPSHOT'
19:25:14,989 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 120) WFLYUT0021: Registered web context: '/yusara-0.0.1-SNAPSHOT' for server 'default-server'
19:25:15,057 INFO  [org.jboss.as.server] (DeploymentScanner-threads - 1) WFLYSRV0016: Replaced deployment "yusara-0.0.1-SNAPSHOT.war" with deployment "yusara-0.0.1-SNAPSHOT.war"
19:25:15,062 INFO  [org.jboss.as.repository] (DeploymentScanner-threads - 1) WFLYDR0002: Content removed from location /software/jboss-eap-8.1/standalone/data\content/a8/e57dc32151f4ecd8e445f093fd275430579e32/content
19:25:18,734 INFO  [io.undertow.servlet] (default task-1) Initializing Spring DispatcherServlet 'dispatcherServlet'
19:25:18,735 INFO  [org.springframework.web.servlet.DispatcherServlet] (default task-1) Initializing Servlet 'dispatcherServlet'
19:25:18,748 INFO  [org.springframework.web.servlet.DispatcherServlet] (default task-1) Completed initialization in 5 ms
19:25:18,785 INFO  [stdout] (default task-1) Hello, edwin
19:25:18,785 INFO  [com.yusara.controller.HelloController] (default task-1) Hello, edwin
```