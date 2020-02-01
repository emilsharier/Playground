#include<stdlib.h>
#include<iostream>
using namespace std;

int arr_sum(int n, int *a) {
 if(n == 0)
   return *(a);
  else
    return (*(a + n) + arr_sum(--n,a));
}

int main()
{
  int i,n;
  cin>>n;
  int *a;
  a = (int*) malloc(n * sizeof(int));
  for(i=0;i<n;i++)
    cin>>(*(a + i));
  cout<<arr_sum(--n,a)<<endl;
  return 0;
}