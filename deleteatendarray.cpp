# include <iostream>
using namespace std;
int main()
{
  int array[20], n;
  cout<< "Enter the size of array: ";
  cin>> n ; 
  cout<< "Enter the array elements: ";
  for(int i = 0 ; i<n ; i++){
    cin>> array[i];
  }
  n--;
  cout<<"Number after deletion: ";
  for(int i = 0 ; i<n ; i++){
    cout<< array[i] <<endl;
  }
  return 0 ;
}