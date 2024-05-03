# include <iostream>
using namespace std;
int array[20], n, x;
int BinarySearch(int low, int high)
{
    while(low<=high)
    {
       int mid = (low + high )/2;
       if (array[mid] == x)
       {
        return mid;
       }
       else if (array[mid]> x)
       {
        high = mid-1;
       }
       else
       {
          low = mid+1;
       }
    }
    return -1;
}
int main()
{

   cout<< "Enter the size of array: ";
   cin>> n;
   cout<< "Enter the elements in ascending order: ";
   for(int i=0; i<n; i++)
   {
     cin>> array[i];
   }
   cout<< "Enter the number to search in array: ";
   cin >> x ;
  int result =  BinarySearch(0, n-1);
  if (result == -1)
  {
    cout<< "Element not found";
  }
  else {
    cout<< "Element found at index: " << result;
  }
   return 0 ;

}