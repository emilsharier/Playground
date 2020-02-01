#include<iostream>
#include<cctype>
using namespace std;
int main()
{
  string s;
  cin>>s;
  int sum = 0;
  for(int i = 0; i < s.length(); i ++)
    if(isdigit(s[i]) && isdigit(s[i + 1])) {
      sum += (((s[i] - 48) * 10) + (s[i + 1] - 48));
      i ++;
    }
  else if(isdigit(s[i]))
    sum += (s[i] - 48);
  cout<<sum<<endl;
  return 0;
}