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
public class CPU {
    private Sheduler sheduler = new Sheduler();
    public CPU(){
        sheduler.addProcess(new Process(10));
        sheduler.addProcess(new Process(20));
        sheduler.addProcess(new Process(30));
        sheduler.addProcess(new Process(15));
        sheduler.addProcess(new Process(12));
        
    }
    public void run() throws InterruptedException{
        while(true){
            Process currentProcess = sheduler.getProcess();
            if (currentProcess != null){
                int time=currentProcess.getTime();
                while(time>0){
                    //System.out.println("    Remaining time "+String.valueOf(time));
                    time-=1;
                    Thread.sleep(200);
                }
                System.out.println("CPU finished Process : "+currentProcess.getId());
            }
            else{
                break;
            }
        }
    }
}
