#include<iostream>
#include<stdio.h>
using namespace std;

class A{
  public:
	int roll, marks;
  	string name;
  	float per;
  
  	void accept() {
	  cout<<"Enter name:"<<endl;
	  cin>>name;
      cout<<"Enter roll number:"<<endl;
      cin>>roll;
      cout<<"Enter total marks outof 500:"<<endl;
      cin>>marks;
      per = (float)marks / 5;
    }
  
  void display() {
    cout<<"Student details:"<<endl;
    cout<<"Name: "<<name<<endl;
    cout<<"Roll Number: "<<roll<<endl;
    cout<<"Total: "<<marks<<endl;
    printf("Percentage: %.1f\n",per);
  }
};
int main(void)
{
  A a;
  a.accept();
  a.display();
  return 0;
}