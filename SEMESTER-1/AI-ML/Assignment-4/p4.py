s = input("Enter a string: ")

punctuations = '`~!@#$%^&*()-_=+[]{}:;<>,.?/'
result = ""
for ch in s:
    if ch not in punctuations:
        result+=ch

print("String without punctuations:",result)
