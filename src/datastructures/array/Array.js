export class _Array {
    length = 0;
    data = {};

    pop() {
        const value = this.data[this.length - 1];
        delete this.data[this.length-1];
        this.length -= 1;
        return value;
    }

    push(value) {
        this.length++;
        this.data[this.length] = value;
    }

    unshift(value) {
        this.length++;
        this.shiftItemsUp();
        this.data[0] = value;
    }

    get(index) {
        return this.data[index];
    }

    shiftItemsUp() {
        for (let i = 0; i < this.length; i++) {
            this.data[i+1] = this.data[i-1];
        }
        delete this.data[0];
    }

    shiftItems(index = 0) {
        for (let i = index; i < this.length-1; i++) {
            this.data[i] = this.data[i+1];
        }
        delete this.data[this.length-1];
        this.length--;
    }
}
