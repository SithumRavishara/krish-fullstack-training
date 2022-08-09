import { Component, OnInit } from '@angular/core';
import {FormControl, Validators} from '@angular/forms';

@Component({
  selector: 'app-place-an-order',
  templateUrl: './place-an-order.component.html',
  styleUrls: ['./place-an-order.component.css']
})
export class PlaceAnOrderComponent implements OnInit {

  nameFormControl = new FormControl('', [Validators.required, Validators.required]);
  idFormControl = new FormControl('', [Validators.required, Validators.email]);
  capacityFormControl = new FormControl('', [Validators.required, Validators.email]);
  typeFormControl = new FormControl('', [Validators.required, Validators.email]);


  constructor() { }

  ngOnInit() {
  }

}
