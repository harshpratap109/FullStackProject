import { HttpClient, HttpErrorResponse, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, throwError } from 'rxjs';
import { Book } from './model/book';

@Injectable({
  providedIn: 'root'
})
export class BookdaoService {

  baseurl:string;

  httpOptions = {
    headers:new HttpHeaders({
                             'Content-Type':'application/json'
                         })
   }

   constructor(private httpClient: HttpClient) {
    console.log('bookdao service constructor called...');
     this.baseurl = 'http://localhost:8080';
   }

   getAllBooks()
   {
      console.log("All books from Book Dao Service");
      return this.httpClient.get<Book[]>(this.baseurl+'/books',this.httpOptions).pipe(
        catchError(this.errorHandler)
      )
   }

   searchBook(bookName:String)
   {
      console.log("Search Book Method from Book Dao Service");
      return this.httpClient.get<Book>(this.baseurl+'/book/'+bookName,this.httpOptions).pipe(
        catchError(this.errorHandler)
      )
   }
   

   addBook(book:Book){
    console.log('inside addBook method from Book Dao Service');
    this.httpClient.post<Book>(this.baseurl+'/addBook',JSON.stringify(book),this.httpOptions)
    .pipe(
      catchError(this.errorHandler)
      )
   }

   editBook(book:Book){
    console.log('inside Edit Book method from Book Dao Service');
    this.httpClient.put<Book>(this.baseurl+'/editBook',JSON.stringify(book),this.httpOptions)
    .pipe(
      catchError(this.errorHandler)
      )
   }

   deleteBook(bookId : number){
    console.log('inside Delete Book method from Book Dao Service with book id '+bookId);
    return this.httpClient.delete<Book>(this.baseurl+'/rembook/'+bookId).pipe(
      catchError(this.errorHandler)
    )
   }


   errorHandler(httperror:HttpErrorResponse) {
    let errorMessage = '';
    if(httperror.error instanceof ErrorEvent) {
      // Get client-side error
      errorMessage = httperror.error.message;
    } else {
      // Get server-side error
      errorMessage = `Error Code: ${httperror.status}\nMessage: ${httperror.message}`;
    }
    console.log(errorMessage);
    return throwError(() => httperror);
 }


 }
