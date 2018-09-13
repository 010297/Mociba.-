import { Component, OnInit } from '@angular/core';
import { IdentityService } from '../../services/identity.service';

@Component({
  selector: 'app-identity',
  templateUrl: './identity.component.html',
  providers: [IdentityService],
  styleUrls: ['./identity.component.css']
})
export class IdentityComponent implements OnInit {

  array = [];
  labels = [];

  arrayT=[];
  arrayM=[];
  arrayF=[];

  constructor(private identityService: IdentityService) { }

  public barChartOptions: any = {
    scaleShowVerticalLines: false,
    responsive: true
  };

  public getLabels(){
    for(let i=0; i<this.array.length; i++) {
      this.labels[i]=this.array[i].identity;
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
  public barChartType = 'horizontalBar';
  public barChartLegend = true;

  public barChartData: any[] = [
    {data: this.arrayM, label:'Mujeres'},
    {data: this.arrayF, label:'Hombres'},
    {data: this.arrayT, label:'Total'}
  ];

  ngOnInit(){
    setTimeout(() => {
      this.identityService.getPruebaIdentity().subscribe((a: any) => {
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
