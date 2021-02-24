//---------------------------------------------------//

// Practicing Using Different Data Structures
// February 23rd, 2021

// CSES Problem Set Task 1084: Apartments
// https://cses.fi/problemset/task/1084



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

    int ans = 0;

    int n; cin >> n;
    int m; cin >> m;
    int k; cin >> k;

    vector<int> des;
    for (int i = 0; i < n; i++)
    {
        int x; cin>>x;
        des.push_back(x);
    }

    set<int> act;
    for(int i = 0; i < m; i++)
    {
        int x; cin>>x;
        act.insert(x);
    }

    for(int d:des){
        for(int t = d-k; t < d+k+1; t++){
            if(act.count(t) == 1){
                act.erase(t);
                ans++;
                // cout<<"accepted des = " << d << endl;
                break;
            }
        }
    }
    
    

    cout << ans;
        
    return 0;

}
