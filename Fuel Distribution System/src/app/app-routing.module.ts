import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DashboardComponent } from './view/dashboard/dashboard.component';
import { OrderLogComponent } from './view/order-log/order-log.component';
import { OrderStatusTrackerComponent } from './view/order-status-tracker/order-status-tracker.component';
import { PlaceAnOrderComponent } from './view/place-an-order/place-an-order.component';


const routes: Routes = [
  {
    path: 'dashboard',
    component: DashboardComponent
  },
  {
    path: 'orderlog',
    component: OrderLogComponent
  },
  {
    path: 'ordertracker',
    component: OrderStatusTrackerComponent
  },
  {
    path: 'placeorder',
    component: PlaceAnOrderComponent
  },
  {
    path: '',
    pathMatch: 'full',
    redirectTo: 'dashboard'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
