#include<iostream>
#include<stdlib.h>
using namespace std;

class A {
public:
  
  int** createArray(int m) {
	int i,j;
    int **a;
    a = (int**) malloc(m * sizeof(int*));
    for(i=0;i<m;i++)
      *(a + i) = (int*) malloc(m * sizeof(int));
    for(i=0;i<m;i++)
      for(j=0;j<m;j++)
        cin>>(*(*(a+i) + j));
    return a;
  }
  
  int getelements(int **a,int i, int j) {
	return *(*(a + i) + j);
  }
  
  int calcUpperMatrix(int **a, int m) {
	int i,j;
    for(i=0;i<(m - 1);i++)
      for(j=i+1;j<m;j++)
        if(getelements(a,i,j) == 0) {
			j = 0;
          break;
        }
    if(j)
      return 1;
    else
      return 0;
  }
};

int main()
{
 A obj;
  int m;
  cin>>m;
  int **a = (int**) malloc(m * sizeof(int*));
  for(int i=0;i<m;i++)
    *(a + i) = (int*) malloc(m * sizeof(int));
  a = obj.createArray(m);
  if(obj.calcUpperMatrix(a,m) == 1)
    cout<<"Upper Triangular Matrix"<<endl;
  else
    cout<<"Not an Upper Triangular Matrix"<<endl;
  return 0;
}