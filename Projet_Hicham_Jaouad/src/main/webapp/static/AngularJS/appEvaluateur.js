'use strict';
var GestionEvaluateur = angular.module('GestionEvaluateur',['ngRoute']).config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/', {templateUrl: 'static/AngularJS/Templates/Evaluateur/liste-evaluateurs.jsp', controller: 'EvaluateurController'})
    .when('/CreerEvaluateur', {templateUrl: 'static/AngularJS/Templates/Evaluateur/evaluateur-creation.jsp', controller: 'EvaluateurController'})
    .when('/modifierEvaluateur', {templateUrl: 'static/AngularJS/Templates/Evaluateur/edit.jsp', controller: 'EvaluateurController'})
    .otherwise({redirectTo: '/'});
}]);

