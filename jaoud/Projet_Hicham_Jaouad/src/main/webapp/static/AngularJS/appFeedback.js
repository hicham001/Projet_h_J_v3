'use strict';
var GestionFeedback = angular.module('GestionFeedback',['ngRoute']).config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/', {templateUrl: 'static/AngularJS/Templates/FEEDBACKS/liste-feedbacks.jsp', controller: 'feedbackController'})
    .when('/createFeedbak', {templateUrl: 'static/AngularJS/Templates/FEEDBACKS/createFeedbaks.jsp', controller: 'feedbackController'})
    .when('/createQualifications', {templateUrl: 'static/AngularJS/Templates/FEEDBACKS/createQualification.jsp', controller: 'feedbackController'})
    .when('/details', {templateUrl: 'static/AngularJS/Templates/FEEDBACKS/feedbackdetails.jsp', controller: 'feedbackController'})
    .otherwise({redirectTo: '/GestionProjet'});
}]);
