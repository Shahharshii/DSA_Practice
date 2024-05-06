# include <iostream>
using namespace std;
int stack[5], top = -1, n = 5;
void push(int x)
{
    if (top == n-1)
    {
        cout<< "stack overflow";
    }
    else
    {
        top++;
        stack[top] = x;
    }
}
void display()
{
   if(top >=0)
   {
    cout<< "Stack elements are " <<endl;
    for(int i = top;i>=0; i--)
    {
        cout<< stack[i] <<endl;
    }
   }
   else{
    cout<< "Stack is empty";
   }
}
void pop()
{
    if(top == -1)
    {
        cout<< "Stack is empty";
    }
    else
    {
        cout<< "The popped element is: " <<stack[top] <<endl;
        top--;
    }
}
int peek(){
    return stack[top];
}
int main()
{
    push(1);
    push(2);
    push(3);
    push(4);
    push(5);
    display();
   int y = peek();
   cout<< "Top element of the stack is: " <<y;
    pop();
    pop();
    pop();
    pop();
    pop();
    display();
}