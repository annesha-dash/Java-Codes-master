package sample;

import java.util.Scanner;
import java.lang.Thread;

import java.lang.Thread;

 class shoytani2 implements Runnable {

    int arr[];
    int time;
    public shoytani2()
    {
        this.arr[0]=1;
        this.arr[1]=5;
        this.arr[2]=7;
        this.arr[3]=9;

    }
    public shoytani2(int time)
    {

        this.time=time;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        try
        {
            //int i;
            //for(i=0;i<4;i++){
            System.out.println("element :"+this.arr[0]);
            Thread.sleep(this.time);

            //}

        }catch(Exception e){}
    }
}

 class shoytani {



    public static void main(String args[])
    {

        Thread arif=new Thread(new shoytani2(2000));

        System.out.println("arif\n");
        arif.start();
        //System.out.println("arif\n");

    }
}