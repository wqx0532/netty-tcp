package com.souche.datadev;

import com.souche.datadev.server.NettyNioSever;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by chauncy on 2018/5/29.
 */
public class App {


    private final  static int port = 9090;

    public static void main(String[] args) {


        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new NettyNioSever(port));


    }

}
