
class _Map {
    constructor(size = 100) {
        this.data = new Array(size);
    }

    _hash(key) {
        let hash = 0;
        for (let i = 0; i < key.length; i++) {
            hash = (hash + key.charCodeAt(i) * i) % this.data.length;
        }
        return hash;
    }

    set(key, value) {
        const h = this._hash(key);
        if (!this.data.hasOwnProperty(h)) {
            this.data[h] = [];
        }
        this.data[h].push([key, value])
    }

    get(key) {
        const h = this._hash(key);
        const entry = this.data[h];
        if (!Array.isArray(entry)) return void 0;

        return entry.find(([k]) => k === key)[1];
    }

    keys() {
        return this.data
            .filter((e) => Array.isArray(e))
            .map((e) => e[0][0]);
    }

    has(key) {
        const h = this._hash(key);
        return this.data.hasOwnProperty(h);
    }
}
