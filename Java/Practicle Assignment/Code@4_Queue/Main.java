import java.util.Scanner;

class Queue
{
    int n;
    Queue()
    {
        n=8;
    }
    Queue(int n)
    {
        this.n=n;
    }
    int q_arr[]=new int[n];
    int rear=-1;
    int front=-1;
    void enqueue(int x)
    {
        if(rear==q_arr.length)
        {
            System.out.println("Queue is overflow");
        }
        else
        {
            if(front==-1)
            {
                front=front+1;
            }
            rear=rear+1;
            q_arr[rear]=x;
        }
    }
    void dequeue()
    {
        if(front==rear)
        {
            System.out.println(q_arr[front]);
            front=rear=-1;
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.println(q_arr[front]);
            front=front+1;
        }
    }
    boolean empty()
    {
        if(front==-1)
        {
            return true;
        }
        else{
            return false;
        }
    }
    int getSize()
    {
        return (front+1)*4;
    }
}
class Main
{
    public static void main(String[] args) {
        Queue q=new Queue();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the lemgth of the queue: ");
        int n=sc.nextInt();
        Queue q1=new Queue(n);
       
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
        if(q.empty())
        {
            System.out.println("Queue is empty");
        }
        System.out.println("size of the queue is: "+q.getSize());
    }
}