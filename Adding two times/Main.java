#include<iostream>
using namespace std;

class A{
  public:
  
  int h1, m1, s1, h2, m2, s2;
  
  int hours, minutes, seconds;
  
  void accept() {
	cin>>h1;
    cin>>m1;
    cin>>s1;
    cin>>h2;
    cin>>m2;
    cin>>s2;
  }
  void calc() {
    
    if((s1 + s2) >= 60) {
      
      int l = (s1 + s2) / 60;
      
      seconds = (s1 + s2) - (60 * l);
      minutes = m1 + m2 + l;
    }
    else {
      seconds = s1 + s2;
      minutes = m1 + m2;
    }
    if(minutes >= 60) {
      
      int x = minutes / 60;
      
	  minutes -= (60 * x);
      hours = h1 + h2 + x;
    }
    else
      hours = h1 + h2;
    if(hours >= 24)
	  hours -= 24;
    cout<<hours<<":"<<minutes<<":"<<seconds<<endl;
  }
};

int main()
{
	A a;
  a.accept();
  a.calc();
  return 0;
}