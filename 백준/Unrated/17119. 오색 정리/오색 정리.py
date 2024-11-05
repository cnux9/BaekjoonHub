o=[*open(0)]
n,m=map(int,o[0].split())
es={}
for i in o[-m:]:
 a,b=map(int,i.split())
 a-=1
 b-=1
 es[a]=es.get(a,set())|{b}
 es[b]=es.get(b,set())|{a}
def cc(x):
  for v1 in t:
    if c[v1]==1:break
  for v2 in t:
    if c[v2]==3:break
  cs={2,4}if dfs(v1,v2,[])else{1,3}
  for i,v in enumerate(c):
    if v in cs:c[i]=sum(cs)-v
  return min(cs)
def dfs(v,v2,h):
  h+=[v]
  for i in {j for j in es[v] if j not in h and c[j] in {1,3}}:
    if i==v2:return True
    if dfs(i,v2,h):return True
  return False
c=[0]*n
for i in range(n):
  t={j for j in es[i] if j<i}
  a=set(range(1,6))-{c[j] for j in t}
  if not a:c[i]=cc(i)
  else:c[i]=a.pop()
print("".join(map(str,c)))