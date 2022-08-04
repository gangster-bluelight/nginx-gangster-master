<h1 style="text-align: center">Nginx 可视化应用</h1>

> Nginx:异步框架的网页服务器，也可以用作反向代理、负载平衡器和HTTP缓存。

![image-20220528152047134](https://raw.githubusercontent.com/gangster-bluelight/PictureBed/main/typora/202205281520215.png)

<h2 style="text-align: center">Nginx核心配置文件内容</h2>

```shell
worker_processes  1; # 工作进程数，表示开启n个进程
events {
    worker_connections  1024; # 每隔进程所允许的连接数
}
http {
    include       mime.types; # 引入其他配置文件内容
    default_type  application/octet-stream;
    sendfile        on;
    keepalive_timeout  65; # 保持链接的超时时间
    # 站点
    # localhost:80/
    server {
        listen       80; # 端口号
        server_name  localhost; # 域名
        # 上下文uri
        # # http://localhost:80/
        location / {
            root   html;
            index  index.html index.htm; # 默认显示的页面
        }
        # 错误码转向地址
        # http://localhost:80/50x.html
        error_page   500 502 503 504  /50x.html;
        location = /50x.html {
            root   html;
        }
    }
}
```