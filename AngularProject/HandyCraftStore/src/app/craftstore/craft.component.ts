import { GemeeService } from './craft.service';
import { Crafts } from './Craft.model';

import { Component, OnDestroy, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';

@Component({
  selector: 'em-Crafts',
  templateUrl: './craft.component.html',
  styleUrls: ['./craft.component.scss']
})
export class CraftComponent implements OnInit,OnDestroy  {


  title: string = 'Crafts Management System'

Crafts!: Crafts[];
filteredGem!:Crafts[];
substriber!: Subscription;

message: string = '';
showIcon: boolean = false;

  private _designationFilter: string = ''

  set designationFilter(value: string) {
//console.log('setter fired');
    this._designationFilter = value;
    this.filterByDesignation()

  }

  get designationFilter(): string {
    return this._designationFilter;
  }


  constructor(private CraftsService: GemeeService) { }

  ngOnInit(): void {
    this.substriber = this.CraftsService.getCrafts().subscribe({
      next: data => {
        this.filteredGem = data;
        this.Crafts = this.filteredGem
      }
    })

  }

  filterByDesignation() {
    this. filteredGem = this.Crafts.filter(Crafts => Crafts.designation.includes(this.designationFilter))

  }

  onMessageRecived(value: string) {
    this.message = value;
  }

  ngOnDestroy() {
    this.substriber.unsubscribe();
  }

  toggleIcon() {
    this.showIcon = !this.showIcon;
  }


}
