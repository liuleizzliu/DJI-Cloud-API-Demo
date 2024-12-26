# 指定基础镜像
FROM amazoncorretto:17.0.13-al2023-headless
# 作者
# 将容器的时区设置为"Asia/Shanghai"
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \&& echo 'Asia/Shanghai' >/etc/timezone
# 复制主机文件至镜像内，复制的目录需放置在 Dockerfile 文件同级目录下
ADD  dj.jar dj.jar
# (和项目端口号等同)
EXPOSE 6789
# 在容器启动时执行该应用程序
ENTRYPOINT ["java", "-Dspring.profiles.active=prod","-jar", "/dj.jar"]