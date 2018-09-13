import { Component, OnInit } from '@angular/core';
import { ActionsService } from '../../services/actions.service';

@Component({
  selector: 'app-actions',
  templateUrl: './actions.component.html',
  providers: [ActionsService],
  styleUrls: ['./actions.component.css']
})
export class ActionsComponent implements OnInit {

  array = [];
  labels= [];
  data = [];

  constructor(private actionsService: ActionsService) { }

  public getLabels(){
    for(let i=0; i<this.array.length; i++) {
      this.labels[i]=this.array[i].action;
    }
  }

  public getData(){
    for(let i=0; i<this.array.length; i++) {
      this.data[i]=this.array[i].percTot;
    }
  }

  public barChartOptions:any = {
    scaleShowVerticalLines: false,
    responsive: true
  };
  public barChartLabels:string[] = this.labels;
  public barChartType:string = 'horizontalBar';
  public barChartLegend:boolean = true;

  public barChartData:any[] = [
    {data: this.data, label: 'Porcentajes'}

  ];

  // events
  public chartClicked(e:any):void {
    console.log(e);
  }

  public chartHovered(e:any):void {
    console.log(e);
  }

  ngOnInit(){
    setTimeout(() => {
      this.actionsService.getPruebaActions().subscribe((a: any) => {
       this.array = a;
        this.getLabels();
        this.getData();
     });

   });
  }



}
