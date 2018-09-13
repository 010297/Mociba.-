import {Injectable} from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class DemoService {

    constructor(private http: HttpClient) { }

    getPrueba() {
        return this.http.get('/api/prueba/IdentityTable');
    }

}
