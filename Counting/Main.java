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
  if(f)
    return 1;
  if((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z'))
    return 2;
  if(a == ' ')
    return 3;
  if(a >= '0' && a <= '9')
    return 4;
  else
    return 5;
}

int main()
{
  string n;
  int a[5] = {0};
  getline(cin,n);
  int i;
  for(i = 0; i < n.length(); i++)
    switch(cmp(n[i])) {
      case 1: a[0] ++; break;
      case 2: a[1] ++; break;
      case 3: a[2] ++; break;
      case 4: a[3] ++; break;
      case 5: a[4] ++; break;
      default: break;
    }
  cout<<"Vowels:"<<a[0]<<endl;
  cout<<"Consonants:"<<a[1]<<endl;
  cout<<"White Spaces:"<<a[2]<<endl;
  cout<<"Digits:"<<a[3]<<endl;
  cout<<"Symbols:"<<a[4]<<endl;
  return 0;
}