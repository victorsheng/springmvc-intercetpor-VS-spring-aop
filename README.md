# springmvc-intercetpor-VS-spring-aop
springmvc-intercetpor和spring-aop的性能比较

## aop结果
```

--------warn up---------------------------start------------------------------
Running 20s test @ http://localhost:8080/a
  5 threads and 1000 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   750.90ms  277.13ms   1.09s    64.25%
    Req/Sec   194.03     59.34   366.00     67.46%
  Latency Distribution
     50%  872.79ms
     75%  960.51ms
     90%    1.04s 
     99%    1.07s 
  18950 requests in 20.07s, 2.71MB read
  Socket errors: connect 0, read 1157, write 0, timeout 0
Requests/sec:    944.04
Transfer/sec:    138.29KB
--------------------------
Durations:       20.07s
Requests:        18950
Avg RT:          750.90ms
Max RT:          1090.846ms
Min RT:          200.318ms
Error requests:  0
Valid requests:  18950
QPS:             944.04
--------------------------
--------warn up---------------------------end------------------------------
--------small---------------------------start------------------------------
Running 30s test @ http://localhost:8080/a
  5 threads and 250 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   269.48ms   97.80ms   1.20s    97.34%
    Req/Sec   195.93     57.34   430.00     71.16%
  Latency Distribution
     50%  257.67ms
     75%  278.46ms
     90%  288.60ms
     99%  880.94ms
  28466 requests in 30.03s, 4.08MB read
  Socket errors: connect 0, read 129, write 0, timeout 0
Requests/sec:    947.89
Transfer/sec:    139.00KB
--------------------------
Durations:       30.03s
Requests:        28466
Avg RT:          269.48ms
Max RT:          1195.834ms
Min RT:          200.371ms
Error requests:  0
Valid requests:  28466
QPS:             947.89
--------------------------
--------small---------------------------end------------------------------
--------middle---------------------------start------------------------------
Running 30s test @ http://localhost:8080/a
  5 threads and 500 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   488.79ms   82.40ms 574.06ms   91.68%
    Req/Sec   196.34     57.09   380.00     67.41%
  Latency Distribution
     50%  513.74ms
     75%  531.70ms
     90%  545.50ms
     99%  564.09ms
  29243 requests in 30.06s, 4.18MB read
  Socket errors: connect 0, read 460, write 0, timeout 0
Requests/sec:    972.86
Transfer/sec:    142.51KB
--------------------------
Durations:       30.06s
Requests:        29243
Avg RT:          488.79ms
Max RT:          574.064ms
Min RT:          200.473ms
Error requests:  0
Valid requests:  29243
QPS:             972.86
--------------------------
--------middle---------------------------end------------------------------
--------large---------------------------start------------------------------
Running 30s test @ http://localhost:8080/a
  5 threads and 1000 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   855.91ms  271.29ms   1.13s    81.22%
    Req/Sec   196.20     69.22   435.00     66.28%
  Latency Distribution
     50%    1.02s 
     75%    1.05s 
     90%    1.07s 
     99%    1.10s 
  28999 requests in 30.10s, 4.15MB read
  Socket errors: connect 0, read 1128, write 0, timeout 0
Requests/sec:    963.44
Transfer/sec:    141.13KB
--------------------------
Durations:       30.10s
Requests:        28999
Avg RT:          855.91ms
Max RT:          1134.847ms
Min RT:          200.32ms
Error requests:  0
Valid requests:  28999
QPS:             963.44
--------------------------
--------large---------------------------end------------------------------
```

## interceptor结果
```
--------warn up---------------------------start------------------------------
Running 20s test @ http://localhost:8080/i
  5 threads and 1000 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   804.87ms  931.57ms   3.26s    79.52%
    Req/Sec   193.61     86.59   435.00     61.45%
  Latency Distribution
     50%  205.67ms
     75%    1.49s 
     90%    2.52s 
     99%    3.12s 
  18963 requests in 20.09s, 2.71MB read
  Socket errors: connect 0, read 1239, write 0, timeout 0
Requests/sec:    943.90
Transfer/sec:    138.27KB
--------------------------
Durations:       20.09s
Requests:        18963
Avg RT:          804.87ms
Max RT:          3259.383ms
Min RT:          200.249ms
Error requests:  0
Valid requests:  18963
QPS:             943.90
--------------------------
--------warn up---------------------------end------------------------------
--------small---------------------------start------------------------------
Running 30s test @ http://localhost:8080/i
  5 threads and 250 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   267.83ms  123.07ms   1.27s    82.67%
    Req/Sec   196.05     78.79   434.00     70.34%
  Latency Distribution
     50%  205.35ms
     75%  346.99ms
     90%  407.11ms
     99%  820.24ms
  28491 requests in 30.06s, 4.08MB read
  Socket errors: connect 0, read 148, write 0, timeout 0
Requests/sec:    947.91
Transfer/sec:    139.01KB
--------------------------
Durations:       30.06s
Requests:        28491
Avg RT:          267.83ms
Max RT:          1274.574ms
Min RT:          200.189ms
Error requests:  0
Valid requests:  28491
QPS:             947.91
--------------------------
--------small---------------------------end------------------------------
--------middle---------------------------start------------------------------
Running 30s test @ http://localhost:8080/i
  5 threads and 500 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency   532.39ms  427.80ms   1.62s    78.09%
    Req/Sec   196.78     58.69   425.00     68.07%
  Latency Distribution
     50%  205.77ms
     75%  854.21ms
     90%    1.25s 
     99%    1.48s 
  29293 requests in 30.09s, 4.19MB read
  Socket errors: connect 0, read 455, write 0, timeout 0
Requests/sec:    973.36
Transfer/sec:    142.58KB
--------------------------
Durations:       30.09s
Requests:        29293
Avg RT:          532.39ms
Max RT:          1622.189ms
Min RT:          200.178ms
Error requests:  0
Valid requests:  29293
QPS:             973.36
--------------------------
--------middle---------------------------end------------------------------
--------large---------------------------start------------------------------
Running 30s test @ http://localhost:8080/i
  5 threads and 1000 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.00s     1.10s    3.67s    79.70%
    Req/Sec   196.26     94.30   515.00     59.04%
  Latency Distribution
     50%  205.74ms
     75%    1.79s 
     90%    2.82s 
     99%    3.56s 
  29001 requests in 30.08s, 4.15MB read
  Socket errors: connect 0, read 1111, write 0, timeout 0
Requests/sec:    964.08
Transfer/sec:    141.22KB
--------------------------
Durations:       30.08s
Requests:        29001
Avg RT:          1000.59ms
Max RT:          3666.872ms
Min RT:          200.222ms
Error requests:  0
Valid requests:  29001
QPS:             964.08
--------------------------
--------large---------------------------end------------------------------
```

# 结论:无明显性能差异
