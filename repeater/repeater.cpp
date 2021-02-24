//---------------------------------------------------//

// Practicing Using Different Data Structures
// February 23rd, 2021



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

    vi v;

    for(int i =10; i >= 0; i--){
        v.push_back(i);
    }

    sort(v.begin(), v.end());

    for( int i:v){
        cout <<i<<endl;
    }

    return 0;

}
