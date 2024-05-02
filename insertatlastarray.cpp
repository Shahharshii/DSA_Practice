#include <iostream>
using namespace std;
int main()
{
    int array[20], n, x, i ;
    cout<< "Enter the size of the array: ";
    cin>> n ;
    cout<< "Enter the array elements: ";
    for ( i =0; i<n; i++)
    {
        cin>> array[i];
    }
    cout<< "Enter the element to insert at the end : ";
    cin>> x;
    array[i] = x ;
    n++;
    for( i = 0; i<n; i++)
    {
        cout<< "The elements now are: ";
        cout<<  array[i] <<endl;
    }
    return 0;
}