#include<iostream>
using namespace std;
int main()
{
  int t,i,se=0,so=0,n;
  cin>>n;
  for(i=0;i<n;i++) {
    cin>>t;
    if(t % 2 == 0)
      se += t;
    else
      so += t;
  }
  cout<<"The sum of the even numbers in the array is "<<se<<endl;
  cout<<"The sum of the odd numbers in the array is "<<so<<endl;
  return 0;
}