//---------------------------------------------------//

// USACO 2018 December Bronze, Problem 1; Teleportation 
// February 16th, 2021

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
    // setIO("repeater");
    setIO("teleport");

    //---------------------BEGIN---------------------//

    int a, b, x, y; cin>>a >> b >> x >> y;
    int ans;

    //using teleporter
    int d_1 = abs(a -x) + abs(b-y);
    int d_2 = abs(a -y) + abs(b-x);

    //not using teleporter
    int d_3 = abs(a-b);

    // cout<<d_1<<endl;
    // cout<<d_2<<endl;
    // cout<<d_3<<endl;

    ans = d_1;
    if(d_2<ans){
        ans = d_2;
    }
    if(d_3< ans){
        ans = d_3;
    }
    
    
    cout<<ans<<endl;

    return 0;



    // cout<<a<<endl;
    // cout<<b<<endl;
    // cout<<x<<endl;
    // cout<<y<<endl;

}