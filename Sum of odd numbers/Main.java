#include<iostream>
#include<stdlib.h>
using namespace std;

int sum(int *a, int n) {
  if(n >= 0 && *(a + n) % 2 != 0)
      return (*(a + n)  + sum(a,n - 1));
  else if(n >= 0)
    return sum(a,n - 1);
  else
      return 0;
  }

int main()
{
  int i,n;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  int *a = (int*) malloc(n * sizeof(int));
  cout<<"Enter the elements in the array"<<endl;
  for(i=0;i<n;i++)
    cin>>(*(a + i));
  cout<<"The sum of the odd elements in the array is "<<sum(a,n)<<endl;
  return 0;
}