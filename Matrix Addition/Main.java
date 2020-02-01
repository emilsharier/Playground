#include<iostream>
#include<stdlib.h>
using namespace std;

class A{
 public:

  int** createArray(int r,int c) {
	int i,j;
    int **a;
    a = (int**) malloc(r * sizeof(int*));
    for(i=0;i<r;i++)
      *(a + i) = (int*) malloc(c * sizeof(int));
    for(i=0;i<r;i++)
      for(j=0;j<c;j++)
        cin>>(*(*(a+i) + j));
    return a;
  }
  
  int getElement(int **a,int i,int j) {
	return *(*(a + i) + j);
  }
  
  int** addMatrix(int **a, int **b, int r, int c) {
	int sum=0,i,j;
    int **v;
    v = (int**) malloc(r * sizeof(int*));
    for(i=0;i<r;i++)
      *(v + i) = (int*) malloc(c * sizeof(int));
    for(i=0;i<r;i++)
      for(j=0;j<c;j++) {
        *(*(v + i) + j) = getElement(a,i,j) + getElement(b,i,j);
      }
    return v;
  }
  void printMatrix(int **a, int r, int c) {
	int i,j;
    for(i=0;i<r;i++) {
      for(j=0;j<c;j++)
        cout<<(*(*(a + i) + j))<<" ";
      cout<<endl;
    }
  }
};

int main()
{
  A obj;
  int r,c,sum=0;
  cin>>r>>c;
  int **a = obj.createArray(r,c);
  int **b = obj.createArray(r,c);
  int **v = obj.addMatrix(a,b,r,c);
  obj.printMatrix(v,r,c);
  return 0;
}