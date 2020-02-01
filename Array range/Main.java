#include<stdlib.h>
#include<iostream>
using namespace std;
int main()
{
  int n,i,min,max;
  int *a;
  a = (int*)malloc(n * sizeof(int));
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  cout<<"Enter the elements in the array"<<endl;
  for(i=0;i<n;i++)
    cin>>*(a + i);
  min = *(a);
  max = *(a);
  //cout<<min<<endl;
  //cout<<max<<endl;
  for(i=0;i<n;i++) {
    if(min > (*(a + i)))
      min = (*(a + i));
    if(max < *(a + i))
      max = (*(a + i));
  }
  cout<<"The range of the array is "<<(max - min)<<endl;
  return 0;
}