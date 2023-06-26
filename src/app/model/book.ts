export class Book{
    
    bookId:number;
    bookName:string;
    bookAuthor:string;
    bookPrice:number;

    constructor(bookId:number,bookName:string,bookAuthor:string,bookPrice:number){

        this.bookId = bookId;
        this.bookAuthor = bookAuthor;
        this.bookName = bookName;
        this.bookPrice = bookPrice;

    }

}