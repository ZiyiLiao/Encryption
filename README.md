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


- 1 <= s <= 81

- s is comprised only of characters in the range ascii[a-z].

## Solution
This requires me to place the sentence in the R x C matrix by row, but print out by column. Using math, we can know that it just needs to print out the letters by skipping R letters.

The full solution script is provided **[here](https://github.com/ZiyiLiao/Encryption/blob/master/Solution.java)**

## Sample Case

### Sample Input 1

```
haveaniceday
```

#### Sample Output 1

```
hae and via ecy
```

#### Explanation 1

L = 12, SQRT(12) is between 3 and 4.
Rewritten with 3 rows and 4 columns:

```
have
anic
eday
```

### Sample Input 2

```
feedthedog    
```

#### Sample Output 2

```
fto ehg ee dd
```

#### Explanation 2

L = 10, SQRT(10) is between 3 and 4.
Rewritten with 3 rows and 4 columns:

```
feed
thed
og
```


### Sample Input 3

```
chillout
```

#### Sample Output 3

```
clu hlt io
```

Explanation 3

L = 8, SQRT(8) is between 2 and 3.
Rewritten with 3 columns and 3 rows (2*3 = 6 < 8 so we have to use 3x3)

```
chi
llo
ut
```

### Sample Input 4

```
""
```

#### Sample Output 4

```
""
```

Explanation 4

Empty String



### Sample Input 5

```
aaaaaabbbbbbccccccddddddeeeeee
```

#### Sample Output 5

```
abcde abcde abcde abcde abcde abcde 
```

Explanation 5

L = 30, SQRT(30) is between 5 and 6.
Rewritten with 5 columns and 6 rows

```
abcde 
abcde 
abcde 
abcde 
abcde 
abcde 

```

### Sample Input 6

```
aaaaaabbbbbbccccccddddddeeeee
```

#### Sample Output 6

```
abcde abcde abcde abcde abcde abcd
```

Explanation 6

L = 29, SQRT(29) is between 5 and 6.
Rewritten with 5 columns and 6 rows

```
abcde 
abcde 
abcde 
abcde 
abcde 
abcd

```

### Sample Input 7

```
aaaaaabbbbbbccccccddddddeeeeee
```

#### Sample Output 7

```
abcde abcde abcde abcde abcde abcdef
```

Explanation 7

L = 31, SQRT(30) is between 5 and 6.
Rewritten with 6 columns and 6 rows

```
abcdef
abcde 
abcde 
abcde 
abcde 
abcde 

```