# include <iostream>
using namespace std;
int main()
{
    int array[20], n ;
    cout<< "Enter size of the array: ";
    cin>> n;
    cout<< "enter array elements: ";
    for (int i=0 ; i<n ; i++)
    {
        cin>> array[i];
    }
    for (int i=0 ; i<n-1 ; i++){
        array[i] = array[i+1];
    }
    n--;
    cout<< "array after deletion: " <<endl;
    for (int i=0 ; i<n; i++ )
    {
        cout<< array[i] <<endl;
    }
    return 0;
}