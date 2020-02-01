#include<iostream>
using namespace std;

int cmp(char a) {
  int f = 0;
  switch(a) {
    case 'a':
    case 'A':
       f = 1;
      break;
    case 'e':
    case 'E':
       f = 1;
      break;
    case 'I':
    case 'i':
       f = 1;
      break;
    case 'O':
    case 'o':
       f = 1;
      break;
    case 'U':
    case 'u':
       f = 1;
      break;
    default : break;
  }
  return f;
}
int main()
{
  string n;
  cin>>n;
  int c = 0,i;
  for(i=0;i<n.length();i++)
    c += cmp(n[i]);
  cout<<"Number of vowels: "<<c<<endl;
  return 0;
}