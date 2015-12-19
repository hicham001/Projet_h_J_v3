'use strict';
var App = angular.module('myApp',['ngRoute']).config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/GestionCollaborateur', {templateUrl: 'static/AngularJS/Templates/Collaborateur/Liste-Collaborateurs.jsp', controller: 'CollabController'})
    .when('/CreerCollab', {templateUrl: 'static/AngularJS/Templates/Collaborateur/Collab-creation.jsp', controller: 'CollabController'})
    .when('/modifierCollab', {templateUrl: 'static/AngularJS/Templates/Collaborateur/edit.jsp', controller: 'CollabController'})
    .when('/DetailsCollab', {templateUrl: 'static/AngularJS/Templates/Collaborateur/detailsCollab.jsp', controller: 'CollabController'})
    .otherwise({redirectTo: '/GestionCollaborateur'});
}]);

