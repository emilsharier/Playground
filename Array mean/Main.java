#include<iostream>
using namespace std;
int main()
{
  int n,i;
  float s=0;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  int *a;
  cout<<"Enter the elements in the array"<<endl;
  for(i=0;i<n;i++) {
    cin>>*(a + i);
    s = s + (*(a + i));
  }
  cout<<"The mean of the array is "<<(s / n)<<endl;
  return 0;
}