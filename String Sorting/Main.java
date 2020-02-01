#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  string str;
  cin>>str;
  char t;
  for(int i = 0 ; i < str.length() - 1; i ++)
    for(int j = 0; j < str.length() - i - 1; j++)
      if(str[j] > str[j + 1]) {
        t = str[j];
        str[j] = str[j + 1];
        str[j + 1] = t;
      }
  
  cout<<"The output string is "<<str<<endl;
  return 0;
}