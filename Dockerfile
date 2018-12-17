FROM java:8
ADD myapp.jar myapp.jar
RUN bash -c 'touch /myapp.jar'
EXPOSE 8084
CMD ["java","-jar","myapp.jar"]