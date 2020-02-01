#include<cctype>
#include<string.h>
#include<iostream>
using namespace std;
int main()
{
  string s,pat=" the";
  getline(cin,s);
  for(int i=0;i<s.length() - 4;i++) {
    //cout<<s.substr(i, 3)<<endl;
    if(s.substr(i, 4) == pat)
      s.replace(i, 4, "");
  }
  cout<<s<<endl;
  return 0;
}