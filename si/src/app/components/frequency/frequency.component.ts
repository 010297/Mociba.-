import { Component, OnInit } from '@angular/core';
import { FrequencyService } from '../../services/frequency';

@Component({
  selector: 'app-frequency',
  templateUrl: './frequency.component.html',
  providers: [FrequencyService],
  styleUrls: ['./frequency.component.css']
})
export class FrequencyComponent implements OnInit {

  array = [];
  labels = [];
  data = [];

  constructor(private frequencyService: FrequencyService) { }

  public getLabels(){
    for(let i=0; i<this.array.length; i++) {
      this.labels[i]=this.array[i].freq;
    }
  }

  public getData(){
    for(let i=0; i<this.array.length; i++){
      this.data[i]=this.array[i].percent;
    }
  }

  // PolarArea
  public polarAreaChartLabels:string[] = this.labels;
  public polarAreaChartData:number[] = this.data;
  public polarAreaLegend:boolean = true;

  public polarAreaChartType:string = 'polarArea';

  // events
  public chartClicked(e:any):void {
    console.log(e);
  }

  public chartHovered(e:any):void {
    console.log(e);
  }

  ngOnInit() {
    setTimeout(() => {
      this.frequencyService.getPruebaFrequency().subscribe((a: any) => {
      this.array = a;
      this.getLabels();
      this.getData();
     });
   });
  }

}
