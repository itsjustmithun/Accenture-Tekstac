sheet=float(input("Cost of A4sheet:\n"))
if(sheet<0):
    print("Invalid input")
    exit()
pen=float(input("Cost of pen:\n"))
if(pen<0):
    print("Invalid input")
    exit()
pencil=float(input("Cost of pencil:\n"))
if(pencil<0):
    print("Invalid input")
    exit()
eraser=float(input("Cost of eraser:\n"))
if(eraser<0):
    print("Invalid input")
    exit()
print("Items Details")
print("A4sheet:%0.2f"%sheet)
print("Pen:%.2f"%pen)
print("Pencil:%.2f"%pencil)
print("Eraser:%.2f"%eraser)