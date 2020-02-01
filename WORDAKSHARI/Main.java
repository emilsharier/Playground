#include<bits/stdc++.h>
using namespace std;
int main()
{
  char n[20], m[20];
  string pattern = "####";
  int t, l, i = 0,f = 1;
  string a[10];
  while(f) {
   	cin>>a[i];
    i ++;
    if(a[i] == pattern)
      f = 0;
  }
  l = i - 1;
  char x,y;
  if(l == 1)
    cout<<a[i]<<endl;
  else
    for(i=0;i < l - 1; i++) {
      cout<<a[i]<<endl;
      t = a[i].length();
      if((a[i].at(t - 1) != a[i + 1].at(0)) && (a[i] != a[i + 1]))
        break;
    }
  return 0;
}