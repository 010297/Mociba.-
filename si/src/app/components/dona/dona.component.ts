import { Component, OnInit} from '@angular/core';
import { TypesService} from '../../services/types.service';
import { THROW_IF_NOT_FOUND } from '@angular/core/src/di/injector';

@Component({
  selector: 'app-dona',
  templateUrl: './dona.component.html',
  providers: [TypesService],
  styleUrls: ['./dona.component.css']
})
export class DonaComponent {

  array = [];
  labels = [];
  data = [];

  constructor(private typeService: TypesService){}

  public getLabels(){
    for(let i=0; i<this.array.length; i++) {
      this.labels[i]=this.array[i].idType;
    }
    //console.log("Array[Labels]: ", this.labels);
  }

  public getData(){
    for(let i=0; i<this.array.length; i++){
      this.data[i]=this.array[i].percent;
    }
    //console.log("Porcentajes",this.data);
  }

  // Doughnutdata
  public doughnutChartLabels = this.labels;
  public doughnutChartData = this.data;
  public doughnutChartType = 'doughnut';

  ngOnInit(){
    setTimeout(() => {
      this.typeService.getPruebaTypes().subscribe((a: any) => {
       this.array = a;
       this.getLabels();
       this.getData();
     });

   });

  }

  // events
  public chartHovered(e: any): void {
    console.log(e);
  }

}
