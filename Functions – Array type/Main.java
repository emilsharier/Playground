#include<iostream>
using namespace std;

class A{
  public:
  
  int fun(int n, int *a) {
	int i,s=0;
    for(i=0;i<n;i++) {
     if( *(a + i) % 2 == 0)
       s++;
      else
        s += 2;
    }
    if(s == n)
      return 1;
    else if(s == (2 * n))
      return 2;
    else
      return 3;
  }
};

int main()
{
  int i,n;
  int *a;
  A obj;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  cout<<"Enter the elements in the array"<<endl;
  for(i=0;i<n;i++)
    cin>>(*(a + i));
  int ch = obj.fun(n,a);
  
  switch(ch) {
    case 1: cout<<"The array is Even"<<endl;
      break;
    case 2: cout<<"The array is Odd"<<endl;
      break;
    case 3: cout<<"The array is Mixed"<<endl;
      break;
    default: break;
  }
  return 0;
}