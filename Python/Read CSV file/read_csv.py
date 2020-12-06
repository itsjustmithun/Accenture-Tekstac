import csv
file='OneDayInternational.csv'
reader=csv.DictReader(open(file,'r'))
for row_no,line in enumerate(reader):
    if row_no==10:
        break
    print(line)