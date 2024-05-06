# include <iostream>
using namespace std;
int array[20], n , x;
int BinarySearch(int low, int high)
{
    if (low > high)
    {
        return -1;
    }
    else{
        int mid = (low +high )/2;
        if (array[mid]==x)
        {
            return mid;
        }
        else if(array[mid]>x)
        {
            return BinarySearch(low, mid-1);
        }
        else
        {
            return BinarySearch(mid+1, high);
        }
    }
}
int main()
{
  
    cout<< "Enter the size of the array: ";
    cin>> n;
    cout<<"Enter the elements in the ascending order: ";
    for(int i = 0; i<n ; i++)
    {
        cin>> array[i];
    }
    cout<<"Enter the element to search: ";
    cin>> x;
     int result = BinarySearch(0, n-1);
     if (result == -1)
     {
         cout<<"Element not found";
     }
     else 
     {
         cout<<"Element found at index: "<<result;
     }
    return 0;
}