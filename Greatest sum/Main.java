#include<stdlib.h>
#include<iostream>
using namespace std;

class A {
public: 
  
  void sumRow(int r, int c, int **a) {
    cout<<"Sum of rows is ";
    int z=1,max,i,j,s=0;
    int *b = (int*) malloc(r * sizeof(int));
    for(i=0;i<r;i++) {
      s = 0;
      for(j=0;j<c;j++)
        s += (*(*(a + i) + j));
      cout<<s<<" ";
	  *(b + i) = s;	    
    }
    max = (*(b));
    for(i = 1;i < r;i++)
      if(max < (*(b + i))) {
         max = (*(b + i));
        z = i + 1;
      }
     cout<<"\nRow "<<z<<" has maximum sum"<<endl;
  }
  
  void sumColumn(int r, int c, int**a) {
    cout<<"Sum of columns is ";
    int z=1,max,i,j,s=0;
    int *b = (int*) malloc(r * sizeof(int));
    for(i=0;i<r;i++) {
      s = 0;
      for(j=0;j<c;j++)
        s += (*(*(a + j) + i));
      cout<<s<<" ";
	  *(b + i) = s;	    
    }
    max = (*(b));
    for(i = 1;i < r;i++)
      if(max < (*(b + i))) {
         max = (*(b + i));
        z = i + 1;
      }
     cout<<"\nColumn "<<z<<" has maximum sum"<<endl;
  }
};

int main()
{
  int i,j,r,c;
  cin>>r>>c;
  int **a = (int**) malloc(r * sizeof(int*));
  for(i=0;i<r;i++)
    *(a + i) = (int*) malloc(c * sizeof(int));
  for(i=0;i<r;i++)
    for(j=0;j<r;j++)
  		cin>>(*(*(a + i) + j));
  A obj;
  obj.sumRow(r,c,a);
  obj.sumColumn(r,c,a);
  return 0;
}