import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { ChartsModule } from 'ng2-charts';

import { AppComponent } from './app.component';
import { ListasComponent } from './components/listas/listas.component';
import { BarrasComponent } from './components/barras/barras.component';
import { DonaComponent } from './components/dona/dona.component';
import { RadarComponent } from './components/radar/radar.component';
import { BaseComponent } from './components/base/base.component';
import { HorizontalBarComponent } from './components/horizontal-bar/horizontal-bar.component';


import { HttpClientModule } from '@angular/common/http';
import { HeaderComponent } from './components/header/header.component';
import { ActionsComponent } from './components/actions/actions.component';
import { IdentityComponent } from './components/identity/identity.component';
import { FrequencyComponent } from './components/frequency/frequency.component';

@NgModule({
  declarations: [
    AppComponent,
    ListasComponent,
    BarrasComponent,
    DonaComponent,
    RadarComponent,
    BaseComponent,
    HorizontalBarComponent,
    HeaderComponent,
    ActionsComponent,
    IdentityComponent,
    FrequencyComponent
  ],
  imports: [
    BrowserModule,
    ChartsModule,
    HttpClientModule,
    BrowserModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
