#include<stdlib.h>
#include<iostream>
using namespace std;

struct Employee {
 string name, desg;
  int id, age,sal;
};

int main()
{
  struct Employee e;
  cout<<"Enter name:"<<endl;
  cin>>e.name;
  cout<<"Enter ID:"<<endl;
  cin>>e.id;
  cout<<"Enter age:"<<endl;
  cin>>e.age;
  cout<<"Enter designation:"<<endl;
  cin>>e.desg;
  cout<<"Enter Salary:"<<endl;
  cin>>e.sal;
  cout<<"Employee Details"<<endl;
  cout<<"Name of the Employee : "<<e.name<<endl;
  cout<<"ID of the Employee : "<<e.id<<endl;
  cout<<"Age of the Employee : "<<e.age<<endl;
  cout<<"Designation of the Employee : "<<e.desg<<endl;
  cout<<"Salary of the Employee : "<<e.sal<<endl;
  return 0;
}