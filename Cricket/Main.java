#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
  int no, runs, cruns, nb;
  cin>>no>>runs>>cruns>>nb;
  cout<<"50"<<endl;
  
  double overs = (int) nb / 6;
  
  (nb % 6 != 0) ? overs += ((nb % 6) * 0.1) : 0;
  
  cout<<overs<<endl;
  double t1 = cruns / overs;
  printf("%.1f\n", t1);
  
  overs = (int) no / 6;
  (no % 6 != 0) ? overs += ((no % 6) * 0.1) : 0;
  
  double t2 = runs / overs;
  printf("%.1f\n", t2);
  
  if(t1 >= t2)
    cout<<"Eligible to Win"<<endl;
  else
    cout<<"Not Eligible to Win"<<endl;
  return 0;
}