#include<iostream>
using namespace std;

class A{
  public:
  string name;
  int a, b;
  
  void accept() {
	cin>>name>>a>>b;
  }
  void display(){
    cout<<name<<"\n"<<a<<"\n"<<b<<"%\n"; 
  }
};
int main()
{
	A a;
  a.accept();
  a.display();
	return 0;
}