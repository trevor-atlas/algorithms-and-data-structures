# Product Sum
​
Write a function that takes in a "special" array and returns its product sum.
A "special" array is a non-empty array that contains either integers or other "special" arrays.

The product sum of a "special" array is the sum of its elements, where "special" arrays inside it should be summed themselves and then multiplied by their level of depth.

For example, the product sum of [x, y] is x + y;
The product sum of [x, [y, z]] is x + 2y + 2z.

​
Sample input: [5, 2, [7, -1], 3, [6, [-13, 8], 4]]
Sample output: 12 (calculated as: (5 + 2 + 2 * (7 - 1) + 3 + 2 * (6 + 3 * (-13 + 8) + 4)))

This is a classic recursion problem. we need to loop through each element in the input array and
1. check if it is a number, and add it to the sum
2. check if it is an array, recursively call ourselves with the sub array, a zeroed sum and an incremented depth (increment sum by the return value of the recursive call)

finally we return the sum!


pseudocode:

```javascript
const solve = (array, depth) => {
    let sum = 0;
    array.forEach((value) => {
        if (typeof value === 'number') sum += value;
        if (Array.isArray(value)) sum += solve(value, depth + 1);
    });

    return sum * depth;
}

```
