import { CreateGemGuard } from './craftstore/create-craft.guard';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms'
import { HttpClientModule } from '@angular/common/http'

import { AppComponent } from './app.component';
import { CraftComponent } from './craftstore/craft.component';
import { LkrFormatterPipe } from './shared/lkr-formatter.pipe';
import { ProgressBarComponent } from './shared/progress-bar/progress-bar.component';
import { HomeComponent } from './home/home.component';
import { RouterModule } from '@angular/router';


@NgModule({
  declarations: [
    AppComponent,
    CraftComponent,
    LkrFormatterPipe,
    ProgressBarComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      { path: 'Crafts', component: CraftComponent },
      { path: 'Crafts/:id', component: CraftComponent, canActivate: [CreateGemGuard] },
      {path:'home', component: HomeComponent},
    {path:'', redirectTo:'home', pathMatch:'full'}
    ])

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
