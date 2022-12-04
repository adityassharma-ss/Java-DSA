#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=arr[i];
    }
    int leftsum=0;
    for(int i=0;i<n;i++){
        sum-=arr[i];
        if(leftsum==sum){
            cout<<i;
            return 0;
        }
        leftsum+=arr[i];
    }
    cout<<"-1";
    return 0;
}