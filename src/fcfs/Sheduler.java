/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcfs;

import java.util.ArrayList;

/**
 *
 * @author 160514K
 */
public class Sheduler {
    private static ArrayList<Process> runningQueue;
    public Sheduler(){
        runningQueue = new ArrayList();
    }
    public Process getProcess(){
        if(runningQueue.size()==0){
            System.out.println("==================================================\nCPU finished working.................\n=============================================");
            return null;
        }
        else{
        Process tempProcess = runningQueue.get(0);
        runningQueue.remove(0);
        System.out.println("CPU is running process "+tempProcess.getId()+" at "+String.valueOf(tempProcess.getCurrentTime()));
        return tempProcess;
        }
    }
    public void addProcess(Process newProcess){
        System.out.println("CPU is adding process "+newProcess.getId()+" Execution Time :"+ String.valueOf(newProcess.getTime()));
        runningQueue.add(newProcess);
    }
}
