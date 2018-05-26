/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcfs;

/**
 *
 * @author 160514K
 */
public class Process {
    
    private int processTime;
    private int id;
    private long startTime;
    private static int counter =0;
    public Process(int time){
        startTime = System.currentTimeMillis();
        this.processTime=time;
        this.id=counter;
        counter++;
    }
    public String getId(){
        return String.valueOf(id);
    }
    public int getTime(){
        return processTime;
    }
    public long getCurrentTime(){
        return System.currentTimeMillis();
    }
    public long getStartTime(){
        return this.startTime;
    }
}
