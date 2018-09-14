import { Component } from '@angular/core';

@Component({
  selector: 'app-radar',
  templateUrl: './radar.component.html',
  styleUrls: ['./radar.component.css']
})
export class RadarComponent {

  // Radar
  public radarChartLabels: String[] = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'];

  public radarChartData: any = [
    {data: [23.7, 13.5, 13.8, 13.4, 9.7, 10.7, 7.7, 3.9, 3.2], label: 'Mujeres'},
    {data: [20.1, 14.3, 13.5, 13.8, 12.8, 8.8, 8.5, 3.9, 3.8], label: 'Hombres'},

  ];
  public radarChartType: String = 'radar';

  // events
  public chartClicked(e: any): void {
    console.log(e);
  }

  public chartHovered(e: any): void {
    console.log(e);
  }

}
