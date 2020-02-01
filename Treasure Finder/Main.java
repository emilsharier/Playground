#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  int i,small,gcd;
  cin>>a>>b>>c;
  int min;
  
  if(a > b && a < c)
    min = a;
  else if(a < b && a > c)
    min = a;
  else if(b > a && b < c)
    min = b;
  else if(b < a && b > c)
    min = b;
  else
    min = c;
  cout<<"The treasure is in box which has number "<<min<<endl;
  
  if(b % a == 0 && c % a == 0)
    cout<<"The code to open the box is "<<a<<endl;
  else if(a % b == 0 && c % b == 0)
    cout<<"The code to open the box is "<<b<<endl;
  else if(a % c == 0 && b % c == 0)
    cout<<"The code to open the box is "<<c<<endl;
  else
    cout<<"The code to open the box is 1"<<endl;
}