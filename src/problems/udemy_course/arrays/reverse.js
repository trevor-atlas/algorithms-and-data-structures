
const reverseStr = (str) => {
    if (!str || typeof str !== 'string') return null;
    const result = [];
    for (let i = str.length-1; i > 0; i--) {
        result.push(str[i]);
    }
    return result.join('');
}
