package Bitlab.tenth_lesson.Exercise4;

public class ERPSystem {
    User[] memory = new User[1000];
    int sizeOfUsers = 0;

    public void addUser(User u){
        memory[sizeOfUsers] = u;
        sizeOfUsers++;
    }

    public void printAllUsers(){
        for (int i = 0; i < sizeOfUsers; i++) {
            System.out.println(memory[i]);
        }
    }

    public void printUser(int index){
        if(memory[index] == null){
            System.out.println("No such user in this index");
        }else{
            System.out.println(memory[index]);
        }
    }
}
