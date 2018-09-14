import {Injectable} from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class TypesService {

    constructor(private http: HttpClient) { }

    getPruebaTypes() {
        return this.http.get('/api/prueba/TypesTable');
    }

}
