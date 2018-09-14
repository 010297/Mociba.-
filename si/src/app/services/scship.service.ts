import {Injectable} from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class ScshipService {

    constructor(private http: HttpClient) { }

    getPruebaScship() {
        return this.http.get('/api/prueba/ScshipTable');
    }

}
