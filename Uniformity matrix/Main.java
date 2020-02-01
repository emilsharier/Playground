#include<iostream>
#include<stdlib.h>
using namespace std;
int main()
{
  int e=0,o=0,n,i,j;
  cin>>n;
  int **a = (int**) malloc(n * sizeof(int*));
  for(i=0;i<n;i++)
    *(a + i) = (int*) malloc(n * sizeof(int));
  for(i=0;i<n;i++)
    for(j=0;j<n;j++)
      cin>>(*(*(a + i) + j));
  for(i=0;i<n;i++) {
    for(j=0;j<n;j++) {
      if( *(*(a + i) + j) % 2 == 0)
       	e++;
     else
       o++;
    }
  }
  if((e != 0 && o == 0) || (e == 0 && o != 0))
    cout<<"Yes"<<endl;
  else
    cout<<"No"<<endl;
  return 0;
}