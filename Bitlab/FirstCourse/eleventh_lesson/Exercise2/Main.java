package Bitlab.eleventh_lesson.Exercise2;

public class Main {
    public static void main(String[] args) {
        Workers[] workers = {new Staff(1,"Olzhas","Zhiengolzhin",130000),
                             new Staff(2,"Oleg","Ivanovich",200000),
                             new Staff(3,"Nurlan","Tureshev",175000),
                             new Staff(4,"Anna","Mikhalkova",120000),
                             new Staff(5,"Ivan","Ivanov",75000),
                             new Programmers(1,"NurikN",560000,29000,0.75),
                             new Programmers(2,"AlikhanN",420000,31000,0.89),
                             new Programmers(3,"JomaJ",300000,10000,0.2),
                             new Programmers(4,"IlyaI",250000,25000,0.1),
                             new Programmers(5,"RohnS",375000,40000,0.6)};

        int maxSalary = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < workers.length; i++) {
            if(workers[i].getSalary() > maxSalary) {
                maxSalary = workers[i].getSalary();
                maxIndex = i;
            }
        }
        System.out.println("Worker with highest salary: " + workers[maxIndex].getWorkerData());

        System.out.println("After sorting: ");

        sortInDecreasingOrder(workers);

    }
    public static void sortInDecreasingOrder(Workers[] workers){
        for (int i = 0; i < workers.length - 1; i++) {
            for (int j = 0; j < workers.length - 1 - i; j++) {
                if(workers[j].getSalary() < workers[j+1].getSalary()){
                    Workers temp = workers[j];
                    workers[j] = workers[j+1];
                    workers[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i].getWorkerData());
        }
    }

}
