import { Component, OnInit } from '@angular/core';
import {FormControl, Validators} from '@angular/forms';

export interface PeriodicElement {
  id: string;
  capacity: number;
  type: string;
  status: string;
}

const ELEMENT_DATA: PeriodicElement[] = [
  {id: 'OD0001', capacity: 13000, type: 'Petrol', status: 'Pending'},
];

@Component({
  selector: 'app-order-status-tracker',
  templateUrl: './order-status-tracker.component.html',
  styleUrls: ['./order-status-tracker.component.css']
})
export class OrderStatusTrackerComponent implements OnInit {

  nameFormControl = new FormControl('', [Validators.required, Validators.required]);

  displayedColumns: string[] = ['id', 'capacity', 'type', 'status'];
  dataSource = ELEMENT_DATA;

  constructor() { }

  ngOnInit() {
  }

}
