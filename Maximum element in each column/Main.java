#include<iostream>
#include<stdlib.h>
using namespace std;
int main()
{
  int r,c,i,j,max;
  cin>>r>>c;
  int **a = (int**) malloc(r * sizeof(int*));
  for(i=0;i<r;i++)
    *(a + i) = (int*) malloc(c * sizeof(int));
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
   		cin>>(*(*(a + i) + j));
    for(i=0;i<c;i++) {
      max = *(*a + i);
      for(j=1;j<r;j++)
        if(max < (*(*(a + j) + i)))
          max = (*(*(a + j) + i));
      cout<<max<<endl;
    }
}