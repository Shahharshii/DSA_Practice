# include <iostream>
using namespace std;
int main()
{
    int array[20], n, x, i;
    cout<< "Enter the size of the array: ";
    cin>> n;
    cout<< "Enter the elements: ";
    for(i=0; i<n ; i++)
    {
        cin>> array[i];
    }
    cout<< "Enter the number to search in array : ";
    cin>> x;
    for(i=0; i<n; i++)
    {
        if(array[i] == x)
        {
            cout<< "Element found at index: "<< i;
            break;
        }
    }
    if(i==n)
    {
        cout<< "Element not fount in array: ";
    }
    return 0;
}