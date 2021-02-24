//---------------------------------------------------//

// Practicing Using Different Data Structures
// February 23rd, 2021

// CSES Problem Set Task 1621: Distinct Numbers
// https://cses.fi/problemset/task/1621



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

    int n; cin >> n;

    set<int> s;

    for (int i = 0; i < n; i++)
    {
        int insert; cin >> insert;
        s.insert(insert);
    }

    int ans = 0;
    for(int i:s){
        ans++;
    }
    
    cout << ans;
    
    
    return 0;

}
