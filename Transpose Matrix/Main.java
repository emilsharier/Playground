#include<iostream>
#include<stdlib.h>
using namespace std;

class A {
public:
 
  int** createArray(int m) {
   	int **a;
    int i,j;
    a = (int**) malloc(m * sizeof(int*));
    for(i=0;i<m;i++)
    *(a + i) = (int*) malloc(m * sizeof(int));
    for(i=0;i<m;i++)
      for(j=0;j<m;j++)
        cin>>(*(*(a + i) + j));
    return a;
  }
  
  int getelements(int **a,int i, int j) {
	return *(*(a + i) + j);
  }
  
  void printMatrix(int **a, int m) {
	int i,j;
    for(i=0;i<m;i++) {
      for(j=0;j<m;j++)
        cout<<*(*(a + i) + j)<<" ";
      cout<<endl;
    }
  }
  
  void transMatrix(int **a, int m) {
	int i,j;
    cout<<"Transpose matrix is:"<<endl;
    for(i=0;i<m;i++) {
      for(j=0;j<m;j++)
        cout<<getelements(a,j,i)<<" ";
      cout<<endl;
    }
  }
};

int main()
{
  int m;
  cin>>m;
  A obj;
  int **a = (int**) malloc(m * sizeof(int*));
  for(int i=0;i<m;i++)
    *(a + i) = (int*) malloc(m * sizeof(int));
  //cout<<"Done"<<endl;
  a = obj.createArray(m);
  //cout<<"Done"<<endl;
  obj.printMatrix(a,m);
  //cout<<"Done"<<endl;
  obj.transMatrix(a,m);
  return 0;
}