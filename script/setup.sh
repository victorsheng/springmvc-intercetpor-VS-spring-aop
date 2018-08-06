java -jar \
        -Xms2G \
        -Xmx2G \
        -ea -verbose:gc -XX:+PrintGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintHeapAtGC -Xloggc:./gc.log \
        ../target/spring-aop-interceptor-0.0.1-SNAPSHOT.jar 
