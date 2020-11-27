import csv
f="OneDayInternational.csv"
reader=csv.DictReader(open(f,'r'))
mydict={}
for row in reader:
    for i in range(1990,1999):
        if((row['MatchDate']).endswith(str(i))):
            if i in mydict:
                mydict[i]=mydict[i]+int(row['Runs'])
            else:
                mydict[i]=int(row['Runs'])

for key,values in mydict.items():
    print(key,values)