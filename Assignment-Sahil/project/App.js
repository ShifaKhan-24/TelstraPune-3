class Book {
    constructor(bookName, price) {
        this.bookName = bookName;
        this.price = price;
    }
}

class Author {
    constructor(authorName, address) {
        this.authorName = authorName;
        this.address = address;
        this.bookList = [];
    }

    addBook(book) {
        this.bookList.push(book);
    }

    // toString() {
    //     return `Author{authorName='${this.authorName}', address='${this.address}', bookList=${this.bookList}}`;
    // }

    getBooksWithPriceGreaterThan(threshold) {
        return this.bookList.filter(book => book.price > threshold);
    }
}

const book1 = new Book("Harry Potter and the Sorcerer's Stone", 29.9);
const book2 = new Book("Harry Potter and the Chamber of Secrets", 19.9);
const book6 = new Book("The Great Gatsby", 250.0);
const book7 = new Book("To Kill a Mockingbird", 180.0);
const book3 = new Book("1984", 300.0);
const book4 = new Book("Pride and Prejudice", 150.0);
const book5 = new Book("Moby Dick", 220.0);

const author = new Author("J.K. Rowling", "Edinburgh, Scotland");
const author1 = new Author("F. Scott Fitzgerald", "New York, NY");
const author2 = new Author("Harper Lee", "Monroeville, AL");
const author3 = new Author("George Orwell", "London, UK");

author1.addBook(book6);
author1.addBook(book4);
author2.addBook(book7);
author2.addBook(book3);
author2.addBook(book5);
author3.addBook(book3);
author3.addBook(book6);
author.addBook(book1);
author.addBook(book2);

console.log(`Books published by ${author.authorName}:`);
author.bookList.forEach(book => console.log(book));

const expensiveBooks = author1.getBooksWithPriceGreaterThan(200);
console.log("Books with price greater than 200:");
expensiveBooks.forEach(book => console.log(book));
