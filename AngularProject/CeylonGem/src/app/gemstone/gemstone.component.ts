import { GemeeService } from './gemstone.service';
import { Gemstone } from './Gem.model';

import { Component, OnDestroy, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';

@Component({
  selector: 'em-gemstone',
  templateUrl: './gemstone.component.html',
  styleUrls: ['./gemstone.component.scss']
})
export class GemstoneComponent implements OnInit,OnDestroy  {


  title: string = 'Gemstone Management System'

gemstone!: Gemstone[];
filteredGem!:Gemstone[];
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


  constructor(private gemstoneService: GemeeService) { }

  ngOnInit(): void {
    this.substriber = this.gemstoneService.getGemstone().subscribe({
      next: data => {
        this.filteredGem = data;
        this.gemstone = this.filteredGem
      }
    })

  }

  filterByDesignation() {
    this. filteredGem = this.gemstone.filter(gemstone => gemstone.designation.includes(this.designationFilter))

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
