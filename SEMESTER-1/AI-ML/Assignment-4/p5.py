s=input("Enter a string: ").lower()
vowels="aeiou"
count=sum(1 for ch in s if ch in vowels)
print("Number of vowels:",count)
