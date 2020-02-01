#include<stdlib.h>
#include<iostream>
using namespace std;
int main()
{
  int n,i,j,f=0;
  cin>>n;
  int **a = (int**) malloc( n * sizeof(int*));
  
  for(i=0;i<n;i++)
    *(a + i) = (int*) malloc(n * sizeof(int));
  
  for(i=0;i<n;i++)
    for(j=0;j<n;j++)
      cin>>(*(*(a + i) + j));
  
  for(i=0;i<n;i++)
    for(j=0;j<n;j++) {
     if(*(*(a + i) + j) != 0 && i != j) {
       f = 1;
       break;
     }
      if(f)
        break;
    }
  
  if(f)
    cout<<"No"<<endl;
  else
    cout<<"Yes"<<endl;
  return 0;
}