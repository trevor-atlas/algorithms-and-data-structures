// traditional
const mergeSortedArrays = (a, b) => {
    if ((!a && !b) || (a.length === 0 && b.length === 0)) return [];
    if (!a || a.length == 0) return b;
    if (!b || b.length == 0) return a;

    let i = 1;
    let j = 1;
    let first = a[0];
    let second = b[0];
    const result = [];

    while (typeof first === 'number' || typeof second === 'number') {
        if (!(typeof second === 'number') || first < second) {
            result.push(first);
            first = a[i];
            i++;
        } else {
            result.push(second);
            second = b[j];
            j++;
        }
    }
    return result;
}
