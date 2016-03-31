angular.module('dmp', ['ngCookies'])
    .controller('InterCtrl', ['$scope', '$http', '$window', function($scope, $http, $window) {
        $scope.jsonResult = "";
        $scope.doQuery = function() {
            console.debug("do query...");
            $http.get('/queryById/' + $scope.audId + "/" + $scope.idType).success(function(data, status, headers, config) {
                console.debug("data: ", data);
                $scope.jsonResult = JSON.stringify(data);
            });
        };
    }]);
