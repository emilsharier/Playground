#include<iostream>
using namespace std;
int main()
{
  int count=0,n,flag=1;
  float score = 0.0;
  while(flag) {
    cin>>n;
	if(n < 0) {
     score--;
      flag = 0;
      continue;
    }
    else if(n % 2 == 1) {
	  score ++;
      count ++;
    }
    else
      score -= 0.5;
    if(count == 3) {
	  flag = 0;
      continue;
    }
  }
  cout<<score<<endl;
  return 0;
}