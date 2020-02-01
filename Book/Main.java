#include<iostream>
using namespace std;

union Book {
  char name[50];
  int price;
};
int main()
{
  cout<<"Enter the Book details"<<endl;
  cout<<"Enter the Book name"<<endl;
  Book bk;
  cin>>bk.name;
  cout<<"Enter the Book price"<<endl;
  cin>>bk.price;
  cout<<"Book Details"<<endl;
  cout<<(sizeof(int) - 2)<<" "<<bk.price<<endl;
  cout<<"Enter the Book name"<<endl;
  string str;
  cin>>str;
  cout<<"Book Name : "<<str<<endl;
  return 0;
}