var app = angular.module("geektic", ['ngRoute']);

app.controller('Search', function($scope, $http,$location) {
    $scope.search=function(){
        $location.path('geek');
    }

});

app.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/search', {
                templateUrl: '../template/searchView.html',
                controller: 'Search'
            }).
            when('/geek', {
                templateUrl: '../template/listGeek.html',
                controller: 'listGeek'
            }).
            otherwise({
                redirectTo: '/search'
            });
    }]);


app.controller('listGeek', function($scope, $http) {
    $http.get('/getGeek').success(function(listeGeek) {
        $scope.Geeks=listeGeek;
    });

});
