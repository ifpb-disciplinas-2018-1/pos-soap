var soap = require('soap');
var url = 'http://localhost:8080/Calc/CalculadoraSOAP?WSDL';
var dados = {'c':2, 'd':4};
soap.WSDL.prototype.ignoredNamespaces = [];
soap.createClient(url, function(err, client) {
    client.somar(dados,function(err,result,res){
         console.log('Método somar:',result.resposta);
        //  console.log('Retorno:',result);
        //  console.log('Resposta:',res);
    })
});
