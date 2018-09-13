import {Injectable} from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class AgesService {

    constructor(private http: HttpClient) { }

    getPruebaAges() {
        return this.http.get('/api/prueba/AgesTable');
    }

}
