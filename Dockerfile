
FROM maven:3.8-openjdk-8 as builder

# 复制代码到app目录中
COPY . /app

#指定工作目录
WORKDIR /app

# 修改maven配置文件
COPY ./setting.xml /usr/share/maven/conf/setting.xml

# 执行打包
RUN mvn clean package -q -Dmaven.test.skip=true






