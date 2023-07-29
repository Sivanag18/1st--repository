class MyQueue {
    final int size = 10;
    int arr[] = new int[size];
    int front = -1;
    int rear = -1;

    boolean isEMpty(){
        return (front == -1 &&  rear == -1);
    }
    int peek(){
        if(this.isEMpty()){
            System.out.println("Empty Queue !! Nothing at front");
            return -1;
        }
        return arr[front];
    }

    void enqueue(int data){
      //  rear = rear -1;
      if(this.isEMpty()){ // when queue is empty
        front++;
      }
    
      if(rear == size-1) // when queue is empty
       {
        System.out.println("Queue is full !! cannot enqueue.");
        return;
       }
   }

   int dequeue(){
    if(this.isEMpty()){
        System.out.println("Empty Queue !! Nothing to dequeue.");
        return -1;
    }
    if(front == rear){ // deleting the only one element in the queue
       int x = arr[front];
       front = -1;
       rear = -1;
       return x;
    }
    return arr[front++];
}
}

public class Lec42{
public static void main(String[] args) {
    MyQueue q = new MyQueue();
    System.out.println(q.isEMpty());
    System.out.println(q.peek());
    System.out.println(q.dequeue());
    q.enqueue(7);
    System.out.println(q.isEMpty());
    System.out.println(q.peek());
    System.out.println(q.dequeue());
    System.out.println(q.isEMpty());
    q.enqueue(8);
    q.enqueue(9);
    q.enqueue(10);
    System.out.println(q.peek());
}
}