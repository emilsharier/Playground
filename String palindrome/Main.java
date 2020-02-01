#include<iostream>
using namespace std;
int main()
{
  string s;
  cin>>s;
  int i,j,f=0,l;
  l = s.length();
  for(i = 0,j = l - 1; i < j; i++, j--)
    if(s[i] != s[j]) {
      f = 1;
      break;
    }
  if(f)
    cout<<"Not a Palindrome"<<endl;
  else
    cout<<"Palindrome"<<endl;
  return 0;
}