/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcfs;

import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author 160514K
 */
public class ShortestTimeSheduler {
    private static ArrayList<Process> runningQueue;
    public ShortestTimeSheduler(){
        runningQueue = new ArrayList();
    }
    public Process getProcess(){
        if(runningQueue.size()==0){
            System.out.println("==================================================\nCPU finished working.................\n==================================================");
            return null;
        }
        else{
            Iterator<Process> processIterator = runningQueue.iterator();
            Process tempProcess = runningQueue.get(0);
            while(processIterator.hasNext()){
                Process newProcess = processIterator.next();
                if(newProcess.getTime()<tempProcess.getTime()){
                    tempProcess = newProcess;
                }
            }
            runningQueue.remove(tempProcess);
            System.out.println("CPU is running process "+tempProcess.getId());
            return tempProcess;
        }
    }
    public void addProcess(Process newProcess){
        System.out.println("CPU is adding process "+newProcess.getId()+" Execution Time :"+ String.valueOf(newProcess.getTime()));
        runningQueue.add(newProcess);
    }
}
