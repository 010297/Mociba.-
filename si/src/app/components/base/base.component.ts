import { Component, OnInit} from '@angular/core';
import { BaseService} from '../../services/base.service';

@Component({
  selector: 'app-base',
  templateUrl: './base.component.html',
  providers: [BaseService],
  styleUrls: ['./base.component.css']
})
export class BaseComponent implements OnInit{

  aBase = [];
  aData = [];
  aLabels = [];

  public getData(){
    for(let i=0; i<this.aBase.length; i++) {
      this.aData[i]=this.aBase[i].percentage;
    }
    //console.log('Resultados de vector de Datos ',this.aData);
  }

  public getLabels(){
    for(let i=0; i<this.aBase.length; i++) {
    (this.aBase[i].gender=='M')?this.aLabels[i]='Mujeres':
      this.aLabels[i]='Hombres';
    }
    //console.log('Recibo labels (Género): ',this.aLabels);

  }

  //Constructor
  constructor(private baseService: BaseService ) { }

  // Pie
  public pieChartLabels: string[] = this.aLabels;
  public pieChartData: number[] = this.aData;
  public pieChartType: String = 'pie';

  ngOnInit() {
    setTimeout(() => {
       this.baseService.getPruebaBase().subscribe((a: any) => {
        this.aBase = a;
        //console.log('base.components:');
        this.getData();
        this.getLabels();
      });

    });
  }

  // events
  public chartHovered(e: any): void {
    console.log(e);
  }

}
