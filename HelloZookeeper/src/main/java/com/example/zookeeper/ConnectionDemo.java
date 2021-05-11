package com.example.zookeeper;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.util.concurrent.CountDownLatch;

public class ConnectionDemo {
    public static void main(String[] args) {
        String zk_ip = "52.130.193.4";
        final CountDownLatch countDownLatch=new CountDownLatch(1);
        try {
            ZooKeeper zk = new ZooKeeper(zk_ip, 4000, new Watcher() {
                @Override
                public void process(WatchedEvent event) {
                    if(Event.KeeperState.SyncConnected==event.getState()){

                        countDownLatch.countDown();
                    }
                }
            });
            countDownLatch.await();
            System.out.println(zk.getState());
        } catch (Exception e){
            System.out.println(e.toString());
        }


    }
}
