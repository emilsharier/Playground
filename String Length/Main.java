#include<iostream>
using namespace std;
int main()
{
  string ch;
  cin>>ch;
  int c=0;
  while(ch[c] != '\0')
    c++;
  cout<<"The length of word "<<ch<<" is "<<c<<endl;
  return 0;
}