#include<iostream>
#include<stdlib.h>
using namespace std;

int search(int *a, int l, int r, int el) {
if(r >= l) {
int mid = l + (r - l) / 2;
  if(*(a + mid) == el)
    return *(a + mid);
  else if(*(a + mid) > el)
    return search(a, 1,mid - 1,el);
  return search(a,mid + 1,r,el);
}
  return -1;
}
int main()
{
  int n,el,i,j,temp;
  cin>>n;
  int *a = (int*) malloc(n * sizeof(int));
  for(i=0;i<n;i++)
    cin>>(*(a + i));
  cin>>el;
  for(i=0;i<n-1;i++)
    for(j=0;j<n-i-1;j++)
      if(*(a + j) > *(a + j + 1)) {
       	temp = *(a + j);
        *(a + j) = *(a + j + 1);
        *(a + j + 1) = temp;
      }
  int t = search(a, 0, n - 1, el);
  if(t == -1)
    cout<<"The number is not present in the list"<<endl;
  else 
    cout<<t<<endl;
  return 0;
}