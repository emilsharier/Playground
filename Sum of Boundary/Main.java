#include<iostream>
#include<stdlib.h>
using namespace std;

int sumBoundary(int r, int c, int **a) {
	int i,j,s=0;
  for(i = 0;i < r;i++) {
    s += (*(*(a + i)));
    //cout<<"s -> "<<s<<endl;
  }
  //cout<<"s 1st "<<s<<endl;
  for(i=0;i < r;i++) {
    s += (*(*(a + i) + c - 1));
   	//cout<<"s -> "<<s<<endl; 
  }
  //cout<<"s 2st "<<s<<endl;
  
  for(i = 0;i <= r - 1;i += (r - 1))
   for(j = 1; j <= (c - 2); j++) {
		s += (*(*(a + i) + j));
     //cout<<"s = "<<s<<endl;
   }
  
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
  cout<<"Sum of boundaries is "<<sumBoundary(r,c,a)<<endl;
  return 0;
}