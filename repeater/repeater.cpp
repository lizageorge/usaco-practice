//---------------------------------------------------//

// USACO 2018 December Bronze, Problem 1; Teleportation 
// January 30th, 2021

//---------------------------------------------------//

#include <bits/stdc++.h>

using namespace std;
using ll = long long;
using vi = vector<int>;

void setIO(string s){ //this function is the template that redefines the standard IO
    ios_base::sync_with_stdio(0);cin.tie(0);
    freopen((s+".in").c_str(),"r",stdin);
    freopen((s+".out").c_str(),"w",stdout);
}

int main()
{
    setIO("repeater");
    // setIO("teleport");

    //---------------------BEGIN---------------------//

    int a, b, x, y; cin>>a >> b >> x >> y;
    int ans;

    //ordering x and y, for convenience
    if(x > y){
        int holder = x;
        x = y;
        y = holder;
    }
    if(a > b){
        int holder = a;
        a = b;
        b = holder;
    }


    if (b <= x || y <= a){  //doesn't overlap
        ans = b - a;
        // cout<<"not overlap";
    } else {                //overlaps
        int without = b - a;
        int with = abs(x - a) + abs(y-b);
        if(without > with){
            ans = with;
        } else{
            ans = without;
            // cout<<"still chose without"<<endl;
            // cout<<with<<endl;
        }
    }

    
    cout<<ans<<endl;

    return 0;



    // cout<<a<<endl;
    // cout<<b<<endl;
    // cout<<x<<endl;
    // cout<<y<<endl;

}