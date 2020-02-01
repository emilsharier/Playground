#include<bits/stdc++.h>
using namespace std;
int main()
{
  int j,i,c = 0;
  string s;
  cin>>s;
  
  sort(s.begin(), s.end());
  //cout<<s<<endl;
  int l = s.length();
  for(i = 0; i < l; i ++) {
    c = 1;
    for(j = i + 1; j < l; j ++)
      if(s[i] == s[j]) {
		s.replace(j, 1, "");
        c ++;
        l --;
      }
    cout<<s[i]<<" "<<c<<endl;
}
  return 0;
}