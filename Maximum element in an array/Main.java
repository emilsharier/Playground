#include<iostream>
#include<stdlib.h>
using namespace std;

int maxFun(int *a, int n, int max){
 if(n == 1)
   return max;
  else 
    if(max < *(a + n - 1))
       max =  *(a + n - 1);
  maxFun(a,n-1,max);
}
int main()
{
  int n,i;
  cin>>n;
  int *a = (int*) malloc(n * sizeof(int));
  cout<<"Enter the size of the array"<<endl;
  cout<<"Enter "<<n<<" elements of an array"<<endl;
  for(i=0;i<n;i++)
    cin>>(*(a + i));
  cout<<"Maximum element in the array is "<<maxFun(a,n,*a)<<endl;
  return 0;
}