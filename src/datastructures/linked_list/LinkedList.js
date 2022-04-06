class LinkedList {
    constructor(value) {
        this.value = value;
        this.next = null;
        this.length = 1;
        this.head = this;
        this.tail = this.head;
    }

    _print() {
        let node = this.head;
        const result = [];
        while (node) {
            result.push(node.value);
            node = node.next;
        }
        console.log(result);
    }

    append(value) {
        const created = new Node(value);
        this.length++;
        this.tail.next = created;
        this.tail = created;
        return this;
    }

    prepend(value) {
        const created = new Node(value);
        created.next = this.head;
        this.head = created;
        this.length++;
        return this;
    }

    lookup(i) {
        let node = this.head;
        if (i === 0) return node;
        if (i === this.length) return this.tail.value;
        if (i > this.length) return null;
        let count = 0;
        while (count < i) {
            node = node.next;
            count++;
        }
        this._print();
        return node.value;
    }

    insert(index, value) {
        let node = this;
        if (index === 0) return this.prepend(value);
        if (index >= this.length) this.append(value);

        while (index) {
            node = node.next;
            index--;
        }
        const created = new Node(value);
        created.next = node.next;
        node.next = created;
        if (created.next == null) this.tail = created;
        this.length++;
        this._print();
        return this;
    }

    delete() {

    }
}

class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}

const list = new LinkedList(10)
    .append(5)
    .append(16)
    .prepend(1)
    .insert(2, 99)

console.log(list.lookup(5))
