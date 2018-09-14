import { Component, OnInit} from '@angular/core';
import { DemoService } from '../../services/demo.service';

@Component({
  selector: 'app-listas',
  templateUrl: './listas.component.html',
  providers: [DemoService],
  styleUrls: ['./listas.component.css']

})
export class ListasComponent implements OnInit {

  b = [];
  labels = [];
  data:Array<any>;

  constructor(private demoService: DemoService ) { }

  public getLabels(){
    for(let i=0; i<this.b.length; i++) {
      this.labels[i]=this.b[i].identity;
    }
    //console.log('Array[Labels]: ', this.labels);
  }

  public lineChartData: Array<any> = [
    {data: [65, 59, 80, 81, 56, 55, 40], label: 'Series A'},
    {data: [28, 48, 40, 19, 86, 27, 90], label: 'Series B'},
    {data: [18, 48, 77, 9, 100, 27, 40], label: 'Series C'}
  ];

  public lineChartLabels: Array<any> = this.labels;

  public lineChartOptions: any = {
    responsive: true
  };

  public lineChartLegend = true;

  public lineChartType = 'line';

  public arrayDemo: Array<number>;

  ngOnInit() {
    setTimeout(() => {
       this.demoService.getPrueba().subscribe((a: any) => {
        this.b = a;
        this.getLabels();
        console.log("Array identidades",this.b);
      });

    });
  }

  public chartHovered(e: any): void {
    console.log(e);
  }



}
