/**
 * Created by youfar on 2017/4/8.
 */

class Job{
    int num;
    public Job(int n) {
        num = n;
    }
    public void work() {
        System.out.println(this + " is working.");
        try {
            int n = (int)(Math.random() * 10000);
            Thread.sleep(n);
        } catch (InterruptedException e) {

        }
    }
    public String toString() {
        return "[Job " + num + "]";
    }
}

class RunnableJob extends Job implements Runnable{
    public RunnableJob(int n) {
        super(n);
    }

    @Override
    public void run() {
        while(true) {
            work();
        }
    }
    /*public void workAllJobs() {
        for(int i = 0; i < jobs.length; i++){
            jobs[i].work();
        }
    }*/
}

public class Practice_16_10_ChoOh {
    public Practice_16_10_ChoOh(int jobcount) {
        for(int i = 0; i < jobcount; i++) {
            new Thread(new RunnableJob(i)).start();
        }
    }

    public static void main(String[] args) {
        new Practice_16_10_ChoOh(10);
    }
}


