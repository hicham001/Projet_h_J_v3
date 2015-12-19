'use strict';
var GestionProjet = angular.module('GestionProjet',['ngRoute']).config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/GestionProjet', {templateUrl: 'static/AngularJS/Templates/Projet/liste-projets.jsp', controller: 'ProjetController'})
    .when('/CreerProjet', {templateUrl: 'static/AngularJS/Templates/Projet/projet-creation.jsp', controller: 'ProjetController'})
    .when('/modifierProjet', {templateUrl: 'static/AngularJS/Templates/Projet/edit.jsp', controller: 'ProjetController'})
    .when('/DetailsProjet', {templateUrl: 'static/AngularJS/Templates/Projet/detailsProjet.jsp', controller: 'ProjetController'})
    .when('/CreateObjectif', {templateUrl: 'static/AngularJS/Templates/Projet/objectif-creation.jsp', controller: 'ProjetController'})
    .when('/CreateDescription', {templateUrl: 'static/AngularJS/Templates/Projet/description-creation.jsp', controller: 'ProjetController'})
    .when('/CreateProjet', {templateUrl: 'static/AngularJS/Templates/Projet/createProjet.jsp', controller: 'ProjetController'})
    .when('/CreateProjetEvaluateur', {templateUrl: 'static/AngularJS/Templates/Projet/ProjetEvaluateur.jsp', controller: 'ProjetController'})
    .when('/AffecterObjectEval', {templateUrl: 'static/AngularJS/Templates/Projet/affecterCollaborateur.jsp', controller: 'ProjetController'})
    .when('/AffectationEvaluateur', {templateUrl: 'static/AngularJS/Templates/Projet/AffectationEvaluateur.jsp', controller: 'ProjetController'})
    .otherwise({redirectTo: '/GestionProjet'});
}]);

