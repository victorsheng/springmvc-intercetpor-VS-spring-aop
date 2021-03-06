
## 这条命令的意思是用5个线程来模拟1000个并发连接，整个测试持续20秒，连接超时30秒，打印出请求的延迟统计信息。

echo '--------warn up---------------------------start------------------------------'
echo '----------------------------aop------------------------'
wrk -t5 -c1000 -d20s -T30s --script=./wrk.lua --latency http://localhost:8080/i
echo '--------------------interceptor------------------------'
wrk -t5 -c1000 -d30s -T30s --script=./wrk.lua --latency http://localhost:8080/a
echo '--------warn up---------------------------end------------------------------'


echo '--------small---------------------------start------------------------------'
echo '----------------------------aop------------------------'
wrk -t5 -c250 -d30s -T30s --script=./wrk.lua --latency http://localhost:8080/i
echo '--------------------interceptor------------------------'
wrk -t5 -c250 -d30s -T30s --script=./wrk.lua --latency http://localhost:8080/a
echo '--------small---------------------------end------------------------------'



echo '--------middle---------------------------start------------------------------'
echo '----------------------------aop------------------------'
wrk -t5 -c500 -d30s -T30s --script=./wrk.lua --latency http://localhost:8080/i
echo '--------------------interceptor------------------------'
wrk -t5 -c500 -d30s -T30s --script=./wrk.lua --latency http://localhost:8080/a
echo '--------middle---------------------------end------------------------------'



echo '--------large---------------------------start------------------------------'
echo '----------------------------aop------------------------'
wrk -t5 -c1000 -d30s -T30s --script=./wrk.lua --latency http://localhost:8080/i
echo '--------------------interceptor------------------------'
wrk -t5 -c1000 -d30s -T30s --script=./wrk.lua --latency http://localhost:8080/a
echo '--------large---------------------------end------------------------------'
