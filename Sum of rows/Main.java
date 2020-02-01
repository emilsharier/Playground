#include<iostream>
#include<stdlib.h>
using namespace std;

class A{
public:
  
  void sumRow(int r, int c, int **a) {
   	int i,j,s;
    for(i=0;i<r;i++) {
		s = 0;
      for(j=0;j<c;j++)
        s += (*(*(a + i) + j));
      cout<<s<<endl;
    }
  }
};

int main()
{
  int r,c;
  cin>>r>>c;
  int i,j;
  int **a = (int**) malloc(r * sizeof(int*));
  for(i=0;i<r;i++)
    *(a + i) = (int*) malloc(c * sizeof(int));
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>(*(*(a + i) + j));
  A obj;
  obj.sumRow(r,c,a);
  return 0;
}