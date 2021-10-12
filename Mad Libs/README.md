# Helpful Functions and Operations for Mad Libs

## General
`# Comment`: The `#` symbol in Python marks the start of a comment. Comments are ignored by the computer, and can be used to write anything. They are often used to explain what the code is doing.

> For example
> ```python
> # This is ignored by the computer
> print("This part is not ignored") # This part is ignored.
> ```

`"`: Using single quotes, you can write a string, which is a sequence of characters. A character is like a single letter, number, or symbol (`a`, `b`, `c`, `1`, `2`, `3`, `$`, `%`, etc).

> For example
> ```python
> string = "This is a string of characters"
> ```

`"""`: Multiline string. Using triple quotes, you can write a string that spans multiple lines.

> For example
> ```python
> multi = "This is an
> error and does not work"
> ```
> ```python
> multi = """This is the correct
> way to define a multi-
> line string."""

**Note**: Multiline strings are also used to make comments that span multiple lines:

> For example
> ```python
> # This line is commented
> This line is not commented
> Neither is this line
> ```
> ```python
> """This is the correct way
> to write a multiline comment.
> All three lines are ignored by the computer."""
> ```

`print(str)`: Displays text in the console

`a = input(msg)`: Asks for user input with the message `msg` and stores it in the variable `a`

`range(num)`: Returns a list of numbers from 0 to `num` (inclusive of 0, exclusive of `num`)
> For example
> ```python
> for i in range(10):
>   print(i)
> 
> # Prints: 
> # 0
> # 1
> # 2
> # ...
> # 9
> ```

## String Manipulation
`str_a += str_b`: Adds `str_b` to the end of `str_a` (this is called string **concatenation**)
> For example 
> ```python
> a = "abc"
> a += "d"
> # a is now "abcd"
> ```

`str.count(exp)`: Returns the number of times `exp` appears in `str`
> For example 
> ```python
> "abcabcabc".count("a")
> # Prints 3
> ```

`str.find(exp)`: Returns the first index that `exp` appears in `str` (returns `-1` if `exp` does not appear at all)
> For example
> ```python
> "abcabcabc".find("c")
> # Returns 2
> # Remember (indicies) indexes start at 0
> # So, the first character of a string has an index of 0, 
> # the second character has an index of 1, and so on. 

`str.split(exp)`: Cuts `str` into different pieces on `exp`, and returns the list of pieces
> For example
> ```python
> "a&b&c&d".split("&")
> # Returns ["a", "b", "c", "d"]
> # Remember:  [] Square Brackets represent an array
> ```

## Array Functions
`len(arr)`: Returns the length of `arr`
> For example
> ```python
> len([0, 1, 2])
> # Returns 3
> ```

**Note**: `len()` can also be used on strings to find the length of the string.

`arr.append(ele)`: Adds `ele` to the end of the array `arr` (this is known as appending)
> For example
> ```python
> arr = [0, 1, 2, 3]
> arr.append(4)
> print(arr)
> # Prints [0, 1, 2, 3, 4]
> ```



