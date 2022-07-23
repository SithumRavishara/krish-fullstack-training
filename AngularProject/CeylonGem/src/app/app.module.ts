import { CreateGemGuard } from './gemstone/create-gemstone.guard';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms'
import { HttpClientModule } from '@angular/common/http'

import { AppComponent } from './app.component';
import { GemstoneComponent } from './gemstone/gemstone.component';
import { LkrFormatterPipe } from './shared/lkr-formatter.pipe';
import { ProgressBarComponent } from './shared/progress-bar/progress-bar.component';
import { HomeComponent } from './home/home.component';
import { RouterModule } from '@angular/router';


@NgModule({
  declarations: [
    AppComponent,
    GemstoneComponent,
    LkrFormatterPipe,
    ProgressBarComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      { path: 'gemstone', component: GemstoneComponent },
      { path: 'gemstone/:id', component: GemstoneComponent, canActivate: [CreateGemGuard] },
      {path:'home', component: HomeComponent},
    {path:'', redirectTo:'home', pathMatch:'full'}
    ])

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
