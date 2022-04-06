class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}

class Queue {
    constructor() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    _print() {
        let node = this.first;
        const result = [node.value];
        while (node.next) {
            node = node.next;
            result.push(node.value);
        }
        console.log(result);
    }

    peek() {
        return this.first.value;
    }

    enqueue(value) {
        if (!this.first) {
            this.first = new Node(value);
            this.last = this.first;
            this.length++;
            this._print();
            return this;
        }

        let node = this.first;
        while (node.next) {
            node = node.next;
        }
        const created = new Node(value);
        node.next = created;
        this.last = created;
        this.length++;
        this._print();
        return this;
    }

    dequeue() {
        if (this.length < 2) {
            const node = this.first;
            this.first = null;
            this.last = null;
            this.length = 0;
            return this;
        }
        const node = this.first;
        this.first = this.first.next;
        this.length--;
        this._print();
        return this;
    }

    isEmpty() {
        return (this.first == null && this.length === 0);
    }
}

const q = new Queue();
console.log({ isEmpty: q.isEmpty() });
q.enqueue(1)
    .enqueue(2)
    .enqueue(3)
    .enqueue(4)
    .enqueue(5)

console.log({ isEmpty: q.isEmpty() });

console.log(q.peek())
q.dequeue()
    .enqueue(6)
    .dequeue()
    .dequeue()
    .dequeue()
    .dequeue()
    .dequeue()

console.log({ isEmpty: q.isEmpty() });
q.enqueue(7);

console.log(q.peek())
