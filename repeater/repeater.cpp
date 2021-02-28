//---------------------------------------------------//

// Practicing creating comparators and structs 
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

struct Person {
    char initial;
    int age;
};

bool compare(Person p, Person q){ //sorts by age, then alphabetically
    if(p.age == q.age){
        return p.initial < q.initial;
    }
    return p.age<q.age;
}

int main()
{
    setIO("repeater");
    // setIO("outofplace");   

    //---------------------BEGIN---------------------//

    vector<Person> students;
    
    struct Person s = {'l', 18};
    students.push_back(s);
    s = {'r', 17};
    students.push_back(s);
    s = {'m', 17};
    students.push_back(s);
    s = {'m', 19};
    students.push_back(s);

    sort(students.begin(), students.end(), compare);

    for(Person p:students){
        cout<< '{' << p.initial << ',' << p.age << '}' <<endl;
    }
        
    return 0;

}
