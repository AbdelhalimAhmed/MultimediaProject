#include <iostream>
#include <vector>
#include <string>
struct tag{
int position;
int lenght;
char character;
};
using namespace std;
int main(){
    string s;
    int tempi=0,tempj=0,templ;
    int pos=0;
    tag t;
    vector<tag> v;
    cin>>s;
    t.position=0;
    t.lenght=0;
    for(int i=0;i<s.size();i++)
	{
        t.position=0;
        t.lenght=0;
        for(int j=i-1;j>-1&&((i-j)<32);j--)
		{
            templ=0;
            pos=0;
            if(s[i]==s[j] && j>=0)
			{
                pos=i-j;
                tempi=i;
                tempj=j;
                while(tempi<s.size()-1 && tempj<i)
				{
                    if(s[tempi]!=s[tempj])break;
                    else templ++;
                    tempj++;
                    tempi++;
                }
            }
            if(templ>t.lenght){
                t.lenght=templ;
                t.position=pos;
            }
        }
        i+=t.lenght;
        t.character=s[i];//might be i+1
        v.push_back(t);
    }
    for(int i=0;i<v.size();i++){
        cout<<v[i].position<<" ";
        cout<<v[i].lenght<<" ";
        cout<<v[i].character<<endl;
    }
  
}