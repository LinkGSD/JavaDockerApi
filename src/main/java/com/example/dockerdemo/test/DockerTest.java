package com.example.dockerdemo.test;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.model.AuthResponse;
import com.github.dockerjava.api.model.Container;
import com.github.dockerjava.api.model.Image;
import com.github.dockerjava.api.model.Info;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.jaxrs.JerseyDockerHttpClient;
import com.github.dockerjava.netty.NettyDockerCmdExecFactory;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class DockerTest {

    @Test
    public void myTest(){
        try {
            JerseyDockerHttpClient httpClient = new JerseyDockerHttpClient.Builder().dockerHost(new URI("tcp://192.168.223.130:2375")).build();
            DockerClient client = DockerClientBuilder.getInstance()
                    .withDockerHttpClient(httpClient).build();
//            List<Image> exec = build.listImagesCmd().exec();
//            List<Container> containerList = build.listContainersCmd().exec();
//            for (Container container : containerList) {
//                System.out.println(container);
//            }
//            for (Image image : exec) {
//                System.out.println(image);
//            }
//            Info info = client.infoCmd().exec();
//            System.out.println(info);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
