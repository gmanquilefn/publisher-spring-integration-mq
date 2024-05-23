# Use the official OpenJDK image as the base image
FROM openjdk:8-jre-alpine

# Set environment variables
ENV ACTIVEMQ_VERSION=5.16.6
ENV ACTIVEMQ_HOME=/opt/activemq
ENV PATH=$ACTIVEMQ_HOME/bin:$PATH

# Download and install ActiveMQ
RUN wget -qO- https://archive.apache.org/dist/activemq/${ACTIVEMQ_VERSION}/apache-activemq-${ACTIVEMQ_VERSION}-bin.tar.gz | tar xvz -C /opt \
    && mv /opt/apache-activemq-${ACTIVEMQ_VERSION} $ACTIVEMQ_HOME

# Expose the ports
EXPOSE 61616 8161

# Set the working directory
WORKDIR $ACTIVEMQ_HOME

# Start ActiveMQ
CMD ["bin/activemq", "console"]
