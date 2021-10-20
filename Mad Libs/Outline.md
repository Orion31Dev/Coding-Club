1. Write prompt

> He is &a <br/>
> He went to the &n <br/>
> He likes &n

2. **Take in user input**
    1. Create List
    2. For each amersand in the prompt:
        1. Ask user for adjective if 
        `&a` or noun if `&n` or `&v` for verb
        2. Append to the list
3. **Replace blank with user input**
    1. Find corresponding element in list
    2. Replace the blank in the prompt with that element
        1. Split prompt on ampersand
        2. Concatonate strings
        3. Set output to first piece of split array
        4. Use blanks to add onto output
            1. for every blank in the prompt:
                1. add corresponding user input
                2. Add next piece of prompt without first letter 
4. **Print out!**