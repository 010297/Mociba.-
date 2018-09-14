import {Injectable} from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class BaseService {

    constructor(private http: HttpClient) { }

    getPruebaBase() {
        return this.http.get('/api/prueba/BaseTable');
    }

}
