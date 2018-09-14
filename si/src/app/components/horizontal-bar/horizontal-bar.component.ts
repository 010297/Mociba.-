import { Component, OnInit } from '@angular/core';
import { AgesService } from '../../services/ages.service';

@Component({
  selector: 'app-horizontal-bar',
  templateUrl: './horizontal-bar.component.html',
  providers: [AgesService],
  styleUrls: ['./horizontal-bar.component.css']
})
export class HorizontalBarComponent {

  array = [];
  labels = [];

  arrayT=[];
  arrayM=[];
  arrayF=[];


  constructor(private agesService: AgesService){}

  public barChartOptions: any = {
    scaleShowVerticalLines: false,
    responsive: true
  };

  public getLabels(){
    for(let i=0; i<this.array.length; i++) {
      this.labels[i]=this.array[i].rank;
    }
    //console.log('Array[Labels]: ', this.labels);
  }

  public getData(){
    for(let i=0; i<this.array.length; i++){
      this.arrayT[i]=this.array[i].percTot
      this.arrayM[i]=this.array[i].percM;
      this.arrayF[i]=this.array[i].percF;
    }
  }

  public barChartLabels: string[] = this.labels;
  public barChartType = 'horizontalBar';
  public barChartLegend = true;

  public barChartData: any[] = [
    {data: this.arrayM, label:'Mujeres'},
    {data: this.arrayF, label:'Hombres'},
    {data: this.arrayT, label:'Total'}
  ];

  ngOnInit(){
    setTimeout(() => {
      this.agesService.getPruebaAges().subscribe((a: any) => {
       this.array = a;
        this.getLabels();
        this.getData();
     });

   });
  }

  // events
  public chartClicked(e: any): void {
    console.log(e);
  }

  public chartHovered(e: any): void {
    console.log(e);
  }

}
