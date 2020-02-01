#include<stdlib.h>
#include<iostream>
using namespace std;

int sumZigZag(int r, int c, int **a) {
	int i,j,s=0;
  	for(i=0;i<c;i++)
      s += (*(*a + i));
  //cout<<"sum "<<s<<endl;
    for(i=0;i<c;i++)
      s += (*(*(a + (r - 1)) + i));
    //cout<<"sum "<<s<<endl;
  for(i=1,j=(c-2);i < (r - 1);j--,i++)
    s += (*(*(a + i) + j));
  return s;
}

int main()
{
	int r,c,i,j;
  cin>>r>>c;
  int **a = (int**) malloc(r * sizeof(int*));
  
  for(i=0;i<r;i++)
    *(a + i) = (int*) malloc(c * sizeof(int));
  
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>(*(*(a + i) + j));
  cout<<"Sum of Zig-Zag pattern is "<<sumZigZag(r,c,a)<<endl;
  return 0;
}