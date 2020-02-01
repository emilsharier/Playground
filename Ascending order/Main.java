#include<iostream>
using namespace std;
class A {
  public:
void sort(int n, int *p) {
int i,j,t;	
  for(i=0;i< n -1;i++)
    for(j=0;j < n - i- 1; j++)
      if(*(p + j) > *(p + j + 1)) {
		t = *(p + j);
        *(p + j) = *(p + j + 1);
        *(p + j +1) = t;
      }
}
};

int main()
{
  int n,i,j;
  int *a;
  A obj;
  cin>>n;
  for(i=0;i<n;i++)
    cin>>(*(a + i));
  obj.sort(n,a);
  cout<<"Sorted array is:"<<endl;
  for(i=0;i<n;i++)
    cout<<(*(a + i))<<endl;
        return 0;
}
