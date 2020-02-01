#include<bits/stdc++.h>
using namespace std;

struct College {
  char name[100];
  char city[50];
  int year;
  float per;
};

int main()
{
  int i,j,n;
  cout<<"Enter the number of colleges"<<endl;
  cin>>n;
  char count[n];
  College *clg;
  //clg = (College*) malloc(n * sizeof(College*));
  for(i = 0; i < n; i ++) {
    cout<<"Enter the details of college "<<(i + 1)<<endl;
    cout<<"Enter name"<<endl;
    cin>>clg[i].name;
    count[i] = clg[i].name[0];
    cout<<"Enter city"<<endl;
    cin>>clg[i].city;
    cout<<"Enter year of establishment"<<endl;
    cin>>clg[i].year;
    cout<<"Enter pass percentage"<<endl;
    cin>>clg[i].per;
  }
  //sort(count.begin(), count.end());
  
  for(i = 0; i < n - 1; i ++)
    for(j = 0; j < n - i - 1; j++)
      if(count[j] > count[j + 1]) {
        char t = count[j + 1];
        count[j + 1] = count[j];
        count[j] = t;
      }
  
  cout<<"Details of colleges"<<endl;
  
  for(i = 0; i < n; i ++)
    for(j = 0; j < n; j ++)
      if(count[i] == clg[j].name[0]) {
        cout<<"College:"<<(i + 1)<<endl;
        cout<<"Name:"<<clg[j].name<<endl;
        cout<<"City:"<<clg[j].city<<endl;
        cout<<"Year of establishment:"<<clg[j].year<<endl;
        cout<<"Pass percentage:"<<clg[j].per<<endl;
        break;
      }
  return 0;
}