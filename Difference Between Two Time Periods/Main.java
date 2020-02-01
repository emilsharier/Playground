#include<iostream>
using namespace std;

struct Time {
int hours, minutes, seconds;
};

int main()
{
  Time t1, t2, result;
  cin>>t1.hours>>t1.minutes>>t1.seconds;
  cin>>t2.hours>>t2.minutes>>t2.seconds;
  int s,m,h,temp;
  if(t1.hours == t2.hours && t1.minutes == t2.minutes && t1.seconds == t2.seconds)
    cout<<"0:0:0"<<endl;
  else {
    if(t1.seconds == t2.seconds)
      result.seconds = 0;
    else {
      temp = (60 - t2.seconds) + t1.seconds;
      if(temp % 60 == temp)
        result.seconds = temp;
      else
        result.seconds = temp % 60;
      //cout<<"t1 seconds : "<<t1.seconds<<endl;
      //cout<<"t2 seconds : "<<t2.seconds<<endl;
      if(t1.seconds < t2.seconds)
        t2.minutes ++;
    }
    if(t1.minutes == t2.minutes)
      result.minutes = 0;
    else {
      temp = (60 - t2.minutes) + t1.minutes;
      if(temp % 60 == temp)
        result.minutes = temp;
      else
        result.minutes = temp % 60;
      if(t1.minutes < t2.minutes)
        t2.hours ++;
    }
    if(t1.hours == t2.hours)
      result.hours = 0;
    else
      result.hours = t1.hours - t2.hours;
    }
  
  cout<<result.hours<<":"<<result.minutes<<":"<<result.seconds<<endl;
  return 0;
  }