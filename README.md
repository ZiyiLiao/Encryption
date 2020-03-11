# Encryption
A solution to solve the encryption

## Definition
An English text needs to be encrypted using the following encryption scheme. First, the spaces are removed from the text. Let be the length of this text. Then, characters are written into a grid, whose rows and columns have the following constraints:

![GitHub Logo](encryption.png)
  
  
For example, the sentence

s = if man was meant to stay on the ground god would have given us roots, after removing spaces is 54 characters long. SQRT(54) is between 7 and 8, so it is written in the form of a grid with 7 rows and 8 columns.
```
    ifmanwas  
    meanttos          
    tayonthe  
    groundgo  
    dwouldha  
    vegivenu  
    sroots
```  
the output is 
```
    imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau
```   
## Constraint

<<<<<<< HEAD
- 1 <= s <= 81

- s is comprised only of characters in the range ascii[a-z].
=======
 - 1 <= s <= 81

 - s is comprised only of characters in the range ascii [a-z].
>>>>>>> 5652c353300d536f7b26bbb30e6f5e6e54410549

## Solution
This requires me to place the sentence in the R x C matrix by row, but print out by column. Using math, we can know that it just needs to print out the letters by skipping R letters.

The full solution script is provided **[here](https://github.com/ZiyiLiao/Encryption/blob/master/Solution.java)**

## Sample Case

#### Case 0


