
const findFirstRepeat = (arr) => {
    const lookup = {};
    for (let i = 0; i < arr.length; i++) {
        if (lookup[arr[i]]) return arr[i];
        lookup[arr[i]] = true;
    }
    return void 0;
}
