from suds.client import Client
from suds.cache import NoCache
url="http://localhost:8080/NoticiasSOAPService/NoticiasSOAP?WSDL"
client = Client(url, cache=NoCache())
noticia = {
    'id': '0',
    'texto':'Noticia 3',
    'corpo':'Houve um incendio',
    'autor':'Florinda'
}
#invocando os metodos
# client.service.salvar(noticia);
print client.service.todos();
#print client
