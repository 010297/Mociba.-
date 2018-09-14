import {Injectable} from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class FrequencyService {

    constructor(private http: HttpClient) { }

    getPruebaFrequency() {
        return this.http.get('/api/prueba/TecUseTable');
    }

}
