#include<stdlib.h>
#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,max;
  cin>>r>>c;
  int **a = (int**) malloc(r * sizeof(int*));
  for(i=0;i<r;i++)
    *(a + i) = (int *) malloc(c * sizeof(int));
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>(*(*(a + i) + j));
  max = **(a);
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      if(max < (*(*(a + i) + j)))
        max = (*(*(a + i) + j));
  cout<<"The maximum element is "<<max<<endl;
  return 0;
}