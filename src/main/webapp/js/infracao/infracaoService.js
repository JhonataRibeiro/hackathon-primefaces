App.factory('InfracaoService', function($http, API){
	return {
		list: function(){
			return $http.get(API+'agente');
		},
		listLocalInfracoes: function(){
			return $http.get(API+'infracoes/local');
		},

		listTipoInfracoes: function(){
			return $http.get(API+'infracoes/tipo');
		},
		create: function(item){
			console.log("to create: ", item);
			return $http.post(API+'agente', item);
		},
		update: function(item, id){
			return $http.put(API+'agente/'+id, item);	
		},
		delete: function(id){
			return $http.post(API+'agente/'+ id + '/delete');
		}
	}
})