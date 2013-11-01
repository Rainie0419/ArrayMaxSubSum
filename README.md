## Problem Description ##
One **int array** is given, with positive, negative integer and zero in it. Among **sub array**s of it, find the **largest sum** of elements in the sub array.

## Solution ##
Two variables are set at the beginning. One is to store the **max sum** while the other one stores **current sum** in this turn. Each time when the current sum is updated, it will be compared with the max sum, and replace the max one if it is larger.  
The sum will increase when a positive integer is added. It will decrease when a negative integer is added. Therefore, **if the current sum is negative, current sum will be discarded and start to sum for a new turn**, or it will decrease the sum of following elements.