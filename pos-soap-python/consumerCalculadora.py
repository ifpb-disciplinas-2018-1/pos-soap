from suds.client import Client
from suds.cache import NoCache
url = "http://localhost:8080/Calc/CalculadoraSOAP?WSDL"
client = Client(url, cache=NoCache())
#invocando os metodos
print client.service.somar(3,2);
# print client.service.SomarNumeros(3,2);
#exibindo os servicos
# print client
