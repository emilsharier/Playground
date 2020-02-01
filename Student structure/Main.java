#include<stdlib.h>
#include<iostream>
using namespace std;

struct Student {
 int rn,avg, g;
 int m[5];
};

int main()
{
  int sum=0,j,i,n,av=0;
  cin>>n;
  Student *s;
  s = (struct Student*) malloc(n * sizeof(struct Student));
  for(i = 0; i < n; i ++) {
    sum = 0;
    cin>>s[i].rn;
    for(j = 0; j < 5; j++) {
      cin>>s[i].m[j];
      sum += s[i].m[j]; 
    }
   	s[i].avg = sum / 5;
    if(s[i].avg > 70)
      s[i].g = 1;
    else if(s[i].avg > 50 && s[i].avg <= 70)
      s[i].g = 2;
    else
      s[i].g = 3;
  }
  cout<<"STUDENT MARKSHEET USING STRUCTURES"<<endl;
  cout<<"Enter the no of students"<<endl;
  cout<<"rn s1 s2 s3 s4 s5 avg grade"<<endl;
  for(i = 0; i < n; i ++) {
    cout<<s[i].rn<<" ";
    for(j = 0; j < 5; j++)
    cout<<s[i].m[j]<<" ";
    cout<<s[i].avg<<" ";
    cout<<s[i].g<<endl;
  }
  return 0;
}