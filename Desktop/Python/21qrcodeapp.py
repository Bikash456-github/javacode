import  qrcode
name=input("Enter your name:")
img=qrcode.make(name)
type(img)#qrcode.image.pil.pil.image
img.save(f"{name}.png")
temperature=15 # in degrees Celsius