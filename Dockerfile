
# builder main
FROM maven:3.8-openjdk-8 as builder

# 复制代码到app目录中
COPY . /app

#指定工作目录
WORKDIR /app

# 修改maven配置文件
COPY ./setting.xml /usr/share/maven/conf/setting.xml

# 执行打包
RUN mvn clean package -q -Dmaven.test.skip=true

# run main
FROM openjdk:8-jdk

# 从 builder 阶段复制文件到镜像中
COPY --from=builder /app/target/ems-jsp.jar /app/ems.jar

# 设置工作目录
WORKDIR /app

# 显示声明需要使用的端口
EXPOSE 8989

# 配置镜像运行命令
CMD java -jar ems.jar







