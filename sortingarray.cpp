# include <iostream>
using namespace std;
int main()
{
    int array[20],n , temp;
    cout<< "Enter size of an array: ";
    cin>> n;
    cout<<"Enter the elements: ";
    for(int i = 0; i<n; i++){
        cin>> array[i];
    }
    for(int i = 0; i<n; i++)
    {
        for(int j = i+1;j<n;j++)
        {
            if(array[i]>array[j])
            {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }
    cout<<"sorter array : " <<endl;
    for(int i =0;i<n ; i++)
    {
        cout<< array[i] << endl;
        
    }
}