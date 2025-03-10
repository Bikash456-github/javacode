name="harry sharma harry"
names="harry,shyam,rita"
print(name.upper())
print(name.lower())
print(f"{name.split("")[0].capitalalize()}{name.split("")[1].capatalize()}")
print(name.title())
print(name.strip())
print(name.replace("harry","suman"))
lists=name.split(",")
for n in lists:
    print(n)