//---------------------------------------------------//

// Practicing Using a comparator
// February 27rd, 2021


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

bool compare(int x, int y){
    return x > y;
}

int main()
{
    setIO("repeater");
    // setIO("outofplace");   

    //---------------------BEGIN---------------------//

    vi v = {3, 8, 4, 2, 3, 1, 9};

    sort(v.begin(), v.end(), compare);

    for(int i:v){
        cout<<i<<endl;
    }
        
    return 0;

}
