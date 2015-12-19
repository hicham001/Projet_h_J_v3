'use strict';
var profilCollab = angular.module('profilCollab',['ngRoute']).config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/', {templateUrl: 'static/AngularJS/Templates/profilCollab/objectifsCollab.jsp', controller: 'profilCollabController'})
    .otherwise({redirectTo: '/'});
}]);
