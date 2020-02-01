#include<iostream>
#include<stdlib.h>
using namespace std;

int distinctElement(int *a, int n) {
	int i,j,c=0;
  for(i=0;i<n;i++)
    if(*(a + i)!=0)
      c++;
  return c;
}
int main()
{
  int c=0,i,j,n;
  cin>>n;
  int *a = (int*) malloc(n * sizeof(int));
  for(i=0;i<n;i++)
    cin>>(*(a + i));
  for(i=0;i<(n-1);i++)
    for(j=i+1;j<n;j++)
      if( *(a + i) == *(a + j))
        *(a + j) = 0;
  c = distinctElement(a,n);
  cout<<"There are "<<c<<" distinct element in the array."<<endl;
  return 0;
}