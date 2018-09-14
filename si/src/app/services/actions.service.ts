import {Injectable} from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class ActionsService {

    constructor(private http: HttpClient) { }

    getPruebaActions() {
        return this.http.get('/api/prueba/ActionsTable');
    }

}
