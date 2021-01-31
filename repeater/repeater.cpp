//---------------------------------------------------//

// USACO 2015 December Bronze, Problem 1; Fence Painting 
// January 30th, 2021

//---------------------------------------------------//

#include <bits/stdc++.h>

using namespace std;

void setIO(string s){ //this function is the template that redefines the standard IO
    ios_base::sync_with_stdio(0);cin.tie(0);
    freopen((s+".in").c_str(),"r",stdin);
    freopen((s+".out").c_str(),"w",stdout);
}

int main()
{
    // setIO("repeater");
    setIO("paint");

    //---------------------BEGIN---------------------//

    int a, b, c, d; cin>>a >> b >> c >> d;
    int ans;

    ans = b - a;

    
    if(b <= c || a >= d){ //doesn't overlap
        ans += d-c;
    }else{              // does overlap
        if(c < a && a<d){
            ans+= a-c;
        }
        if(b < d && c<b){
            ans+= d-b;
        }
    }
    
    cout<<ans<<endl;

    return 0;
}