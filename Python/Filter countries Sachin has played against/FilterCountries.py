import csv
file=csv.DictReader(open('OneDayInternational.csv'))
teams=[]
for i,j in enumerate(file):
    if j['Versus'] not in teams:
        teams.append(j['Versus'])
for i in sorted(teams):
    print(i)