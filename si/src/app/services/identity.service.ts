import {Injectable} from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class IdentityService {

    constructor(private http: HttpClient) { }

    getPruebaIdentity() {
        return this.http.get('/api/prueba/IdentityTable');
    }

}
