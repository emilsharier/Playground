#include<iostream>
using namespace std;
int main()
{
  int i,t,n,val,loc;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  n++;
  int a[n];
  cout<<"Enter the elements in the array"<<endl;
  for(i=0;i<n - 1;i++)
    cin>>a[i];
  cout<<"Enter the location where you wish to insert an element"<<endl;
  cin>>loc;
  if(loc < n && loc > 0) {
     loc--;
  cout<<"Enter the value to insert"<<endl;
  cin>>val;
  cout<<"Array after insertion is"<<endl;
  for(i=n-1;i>=loc;i--)
	a[i] = a[i - 1];
  a[loc] = val;
  for(i=0;i<n;i++)
    cout<<a[i]<<endl;	 
  }
  else
    cout<<"Invalid Input"<<endl;
  return 0;
}