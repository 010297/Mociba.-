import { Component} from '@angular/core';
import { ScshipService } from '../../services/scship.service';

@Component({
  selector: 'app-barras',
  templateUrl: './barras.component.html',
  providers: [ScshipService],
  styleUrls: ['./barras.component.css']
})
export class BarrasComponent {

  array = [];
  labels = [];

  arrayT=[];
  arrayM=[];
  arrayF=[];

  constructor(private scshipService: ScshipService){}

  public barChartOptions: any = {
    scaleShowVerticalLines: false,
    responsive: true
  };

  public getLabels(){
    for(let i=0; i<this.array.length; i++) {
      this.labels[i]=this.array[i].level;
    }

  }

  public getData(){
    for(let i=0; i<this.array.length; i++){
      this.arrayT[i]=this.array[i].percTot
      this.arrayM[i]=this.array[i].percM;
      this.arrayF[i]=this.array[i].percF;
    }
  }

  public barChartLabels: string[] = this.labels;
  public barChartType = 'bar';
  public barChartLegend = true;

  public barChartData: any[] = [
    {data: this.arrayM, label: 'Mujeres'},
    {data: this.arrayF, label: 'Hombres'},
    {data: this.arrayT, label: 'Total'}
  ];

  ngOnInit(){
    setTimeout(() => {
      this.scshipService.getPruebaScship().subscribe((a: any) => {
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
