import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListtComponent} from './shared/listt/listt.component';

const routes: Routes = [
  {
    path: '',
    component: ListtComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
