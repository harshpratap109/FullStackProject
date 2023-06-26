import { Component,OnInit } from '@angular/core';
import { BookdaoService } from '../bookdao.service';
import { Book } from '../model/book';

@Component({
  selector: 'app-booklist',
  templateUrl: './booklist.component.html',
  styleUrls: ['./booklist.component.css']
})
export class BooklistComponent implements OnInit{

  bookarr:Book[];

  constructor(private bookdao:BookdaoService){
    this.bookarr = [];
  }
  ngOnInit(): void {
    console.log("booklist component initialized");
    this.bookdao.getAllBooks().subscribe(
      data => {
        this.bookarr = data;
      }
    )
  }

  getAllBooks(){
    this.bookdao.getAllBooks().subscribe(
      (data)=>{
        this.bookarr = data;
      }
    )
  }

  deleteBook(bookid : number){
    console.log('inside Delete Book method from Book List');
    this.bookdao.deleteBook(bookid);
    //this.getAllBooks();
  }

  editBook(bookid : number){
    
  }

}
