package com.Puneet.Docker.DockerSpringboot.queue;

public interface MessagePublisher {

    void publish(final String message);
}
