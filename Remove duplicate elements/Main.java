#include<iostream>
using namespace std;

class A {
public:
  void removeDuplicate(int n, int *a) {
    int i,j;
    for(i=0;i<n;i++)
      for(j=i + 1;j<n;j++)
        if(*(a + i) == *(a + j))
          *(a + j) = 0;
  }
};

int main()
{
  int i,j,n;
  cin>>n;
  A obj;
  int *a;
  for(i=0;i<n;i++)
    cin>>*(a + i);
  obj.removeDuplicate(n,a);
  for(i=0;i<n;i++)
    if(*(a + i) != 0)
      cout<<*(a + i)<<endl;
  return 0;
}