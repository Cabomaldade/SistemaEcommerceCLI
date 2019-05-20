import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home/home.component';

const routes: Routes = [
    {
        path: '',
        component: HomeComponent
    },
    {
        path: 'home',
        component: HomeComponent
    },
    { 
        path: 'clientes',
        loadChildren: 'app/clientes/clientes.module#ClientesModule'
    },
    {
        path: 'todo',
        loadChildren: 'app/todo/todo.module#TodoModule'
    },
    {
        path: 'enquete',
        loadChildren: 'app/enquete/enquete.module#EnqueteModule'
    }
];
export const RoutingModule = RouterModule.forRoot(routes);