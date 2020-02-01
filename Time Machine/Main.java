#include<iostream>
using namespace std;

class A{
  public:
  
  int h1, m1, s1, h2, m2, s2;
  
  int hours, minutes, seconds;
  
  void accept() {
	cout<<"Enter time:"<<endl;
    cout<<"Hours :"<<endl;
    cin>>h1;
    cout<<"Minutes :"<<endl;
    cin>>m1;
    cout<<"Seconds :"<<endl;
    cin>>s1;
    cout<<"Enter time:"<<endl;
    cout<<"Hours :"<<endl;
    cin>>h2;
    cout<<"Minutes :"<<endl;
    cin>>m2;
    cout<<"Seconds :"<<endl;
    cin>>s2;
  }
  void calc() {
    
    if((s1 + s2) >= 60) {
      seconds = (s1 + s2) - 60;
      minutes = m1 + m2 + 1;
    }
    else {
      seconds = s1 + s2;
      minutes = m1 + m2;
    }
    if(minutes >= 60) {
	  minutes -= 60;
      hours = h1 + h2 + 1;
    }
    else
      hours = h1 + h2;
    if(hours >= 24)
	  hours -= 24;
    cout<<"Time after add: "<<hours<<":"<<minutes<<":"<<seconds<<endl;
  }
};

int main()
{
	A a;
  a.accept();
  a.calc();
  return 0;
}