# include <iostream>
using namespace std;
int Queue[5], front = -1, rear = -1, n =5, x , y;
void insert()
{
    if (rear == n-1)
    {
        cout << "Queue is full" ;
    }
    else
    {
        if(front == -1)
        {
            front = 0;
        }
        cout<< "Insert the element in queue: ";
        cin>> x ;
        rear++;
        Queue[rear] = x ;
    }
}
void Delete()
{
  if (front == -1)
  {
    cout << "Queue is empty" ;
  }
  else
  { 
      cout<< "Element deleted from queue is : "<< Queue[front] <<endl;
    if(front == rear)
    {
        front = -1;
        rear = -1;
    } 
    else 
    {
        front++;
    }
  }
}
int peek()
{
    if (front == -1)
    {
        return 0;
    }
    else
    {
        cout<< "Element at front is : "<< Queue[front] <<endl ;
    }
}
void display()
{
    if (front == -1)
    {
        cout << "Queue is empty" ;
    }
    else
    {
       cout<<"Queue elements are: ";
      for (int i =front ; i<=rear ; i++)
      {
        cout<< Queue[i] <<endl;
      }
       
    }
}
int main()
{
  insert();
  insert();
  insert();
  insert();
  insert(); 
  y =  peek();
if (y ==0)
{
    cout<< "Queue is empty";
}
else{
    cout<< "front element of the queue is : "<<y <<endl;
}
 display();
  Delete();
  return 0;
}