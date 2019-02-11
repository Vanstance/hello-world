#include<iostream>
#include<cstdio>
#include<cmath>
#include<cstdlib>
#include<algorithm>
#include<map>
using namespace std;
map<int,int> rec;
int n,k;//ss
bool check(int x){
 int tmp = 0;
 map<int,int>::iterator iter;
 for (iter = rec.begin(); iter != rec.end(); iter++){
   tmp += (iter->second/x);
   if (tmp>=k) return true;
 }
 return false;
}
int main(){
 //freopen("in.txt","r",stdin);
  rec.clear();
  scanf("%d %d",&n,&k);
  for (int i = 0 ; i< n; i++){
    int x;
    scanf("%d",&x);
    rec[x]++;
  }
  int l = 1;
  int r = n;
  while (l!=r){
    int mid = (l+r+1)>>1;
    if (check(mid)) l = mid;
    else r = mid - 1;
  }
 //cout<<l<<endl;
  bool flag = false;
  int tmp = 0;
  map<int,int>::iterator iter;
  for (iter = rec.begin(); iter != rec.end(); iter++){
    int ci = (iter->second/l);
  //cout<<"~~~~~"<<tmp<<" "<<iter->first<<" "<<iter->second<<endl;
    for (int i = 0; i< min(ci,k-tmp); i++)
    {
     if (flag == true) printf(" ");
     else flag = true;
     printf("%d",iter->first);
   }
   tmp += (iter->second/l);
   if (tmp>=k) return 0;
 }
 return 0;
}
