package BITLAB.Multithreading.first_exercise;

public class Operation extends Thread{

    private String operationName;
    private int operationTime;

    public Operation(){
        operationName = "Unknown";
        operationTime = 0;
    }

    public Operation(String operationName, int operationTime) {
        this.operationName = operationName;
        this.operationTime = operationTime;
    }

    public void run(){
        System.out.println("Operation " + "\"" + operationName + "\"" + ": started");

        for (int i = 1; i <= operationTime; i++) {

            try {

                Thread.sleep(1000);

            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("Operation " + "\"" + operationName + "\"" + ": " + i + " second");
        }
        System.out.println("Operation " + "\"" + operationName + "\"" + ": finished");
    }
}
