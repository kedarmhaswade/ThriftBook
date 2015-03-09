FROM ubuntu:14.04 
MAINTAINER Bob Smith "bob@example.com" 
RUN apt-get update 
RUN apt-get install -y git 
RUN echo 'thrift dev image v1.0.0' > /README.md 
EXPOSE 9418

