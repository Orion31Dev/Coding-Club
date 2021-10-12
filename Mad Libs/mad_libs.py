import re

prompt = """
Peter is a(n) &a &n. He &v to the &a &n.
"""

num_blanks = prompt.count('&')

def find_nth(string, substring, n):
    start = string.find(substring)
    while start >= 0 and n > 0:
        start = string.find(substring, start + len(substring))
        n -= 1
    return start

inputs = []

for i in range(num_blanks):
  type = prompt[find_nth(prompt, '&', i) + 1]
  
  if type == 'a':
    inputs.append(input("Enter an adjective: "))
  if type == 'n':
    inputs.append(input("Enter a noun: "))
  if type == 'v':
    inputs.append(input("Enter a verb: "))

spl = prompt.split('&')
output = spl[0]

for i in range(num_blanks):
  output += inputs[i] + spl[i + 1][1:]

print(output)

"""
Regex method (more advanced)

for i in range(len(inputs)):
  prompt = re.sub(r'(&\S)', inputs[i], prompt, 1)

print(prompt)
"""

