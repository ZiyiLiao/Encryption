# Encryption
A solution to solve the encryption

## Definition
An English text needs to be encrypted using the following encryption scheme. First, the spaces are removed from the text. Let be the length of this text. Then, characters are written into a grid, whose rows and columns have the following constraints:

  \ceil{\sqrt{L}}
For example, the sentence

s = if man was meant to stay on the ground god would have given us roots, after removing spaces is 54 characters long. SQRT(54) is between 7 and 8, so it is written in the form of a grid with 7 rows and 8 columns.

    ifmanwas  
    meanttos          
    tayonthe  
    groundgo  
    dwouldha  
    vegivenu  
    sroots
    
the output is 

    imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau
    
## Constraint

1 <= s <= 81

s is comprised only of characters in the range ascii[a-z].

## Solution
This requires me to place the sentence in the $R\times C$ matrix by row, but print out by column.
