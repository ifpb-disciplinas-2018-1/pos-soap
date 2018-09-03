var soap = require('soap');
var url = 'http://localhost:8080/NoticiasSOAPService/NoticiasSOAP?WSDL';
var noticia = {
    'arg0':{
        'id': '0',
        'texto':'Noticia 5',
        'corpo':'Mensagem enviado pelo Node',
        'autor':'Girafales'
     }
};
soap.WSDL.prototype.ignoredNamespaces = ['http://ws.pos.ifpb.edu.br/'];
soap.createClient(url, function(err, client) {
    // client.salvar(noticia,function(err,result,res){
    //     //  console.log('Retorno:',result);
    //      client.todos(function(err,result,res){
    //           console.log(result);
    //           console.log(res);
    //      })
    // })
    client.todos(function(err,result,res){
         console.log(result.noticia);
        //  console.log('Retorno:',result);
    })
});
