import java.awt.*;
import java.util.Scanner;
public class SinglyQueue {
    int ar[];
    int Front,Rear;

    SinglyQueue(){
        ar=new int[5];
        Front=-1;
        Rear=-1;
    }
    void insert(){ //enque
        if (Rear==ar.length-1){
            System.out.println("Queue full");
        }
        else {
            System.out.println("Enter data : ");
            Scanner sc = new Scanner(System.in);
            int data= sc.nextInt();
            if (Front==-1){
                Front=0;
            }
            Rear=Rear+1;
            ar[Rear]=data;
            System.out.println("Data inserted...");
        }
    }
    void delete(){ //dequeue
        if (Front==-1){
            System.out.println("Queue Empty ");
        }
        else {
            System.out.println("Deleted "+ar[Front]);
            if (Front==Rear){
                Front=-1;
                Rear=-1;

            }
            else if (Front<Rear){
                Front=Front+1;

            }
        }
    }
    void traverse(){
        if (Front==-1 || Rear==-1){
            System.out.println("Singly Queue Empty");
        }
        else {
            for (int i = Front; i <= Rear; i++) {
                System.out.println(" "+ ar[i]);
            }
        }
    }
    void peek(){
        System.out.println(Rear);

    }
    public static void main(String[] args) {
        SinglyQueue obj =new SinglyQueue();
        while (true){
            System.out.println("Press 1 for insert");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for exit");
            System.out.println("Enter your Choice : ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
            obj.peek();
        }
    }
}
