import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddbookComponent } from './addbook/addbook.component';
import { AppComponent } from './app.component';
import { BooklistComponent } from './booklist/booklist.component';

const routes: Routes = [
   {
    path:'addbook',
    component:AddbookComponent
  },
  {
    path:'listbooks',
    component:BooklistComponent
  },
  {
    path:'home',
    redirectTo:'',
    pathMatch:'full'
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
