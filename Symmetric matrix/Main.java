#include<iostream>
#include<stdlib.h>
using namespace std;
int main()
{
  int r,c,i,j;
  cin>>r>>c;
  int **a=(int**) malloc(r * sizeof(int*));
  for(i=0;i<r;i++)
    *(a + i) = (int*) malloc(c * sizeof(int));
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>(*(*(a + i) + j));
  int f = 1;
  
  for(i=0;i<r;i++) {
    for(j=0;j<c;j++) {
     if( *(*(a + i) + j) != *(*(a + j) + i) && i != j) {
      f = 0;
       break;
     }
    }
    if(f == 0)
      break;
  }
  if(f)
    cout<<"Symmetric"<<endl;
  else
    cout<<"Not Symmetric"<<endl;
  return 0;
}