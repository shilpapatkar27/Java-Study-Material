package com.Multi.Threading;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingBufferQueue implements Buffer {
	
    private final ArrayBlockingQueue<Integer> buffer;
    
    public BlockingBufferQueue(){
        buffer = new ArrayBlockingQueue<Integer>(1);
    }
   
    public void blockingPut(int value) throws InterruptedException{
        buffer.put(value);
        System.out.printf("%s%2d\t%s%d%n","Producer writes ",value,
           "Buffer cell occupied: ", buffer.size());    
    }

    @Override
    public int blockingGet() throws InterruptedException {
        int v= buffer.take();
        System.out.printf("%s%2d\t%s%d%n","Consumer reads  ",v,
               "Buffer cell occupied: ", buffer.size());
        return v;
    }
}

