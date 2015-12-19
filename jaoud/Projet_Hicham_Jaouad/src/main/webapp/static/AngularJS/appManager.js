'use strict';
var GestionManager = angular.module('GestionManager',['ngRoute']).config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/GestionManager', {templateUrl: 'static/AngularJS/Templates/Manager/liste-managers.jsp', controller: 'ManagerController'})
    .when('/CreerManager', {templateUrl: 'static/AngularJS/Templates/Manager/manager-creation.jsp', controller: 'ManagerController'})
    .when('/modifierManager', {templateUrl: 'static/AngularJS/Templates/Manager/edit.jsp', controller: 'ManagerController'})
    .when('/DetailsManager', {templateUrl: 'static/AngularJS/Templates/Manager/detailsManager.jsp', controller: 'ManagerController'})
    .otherwise({redirectTo: '/GestionManager'});
}]);

