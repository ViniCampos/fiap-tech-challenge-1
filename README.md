# fiap-tech-challenge-1

##CURL para GET
curl --request GET \
--url http://localhost:8080/pagadores \
--header 'User-Agent: insomnia/10.1.1'

##CURL para POST
curl --request POST \
--url http://localhost:8080/pagadores \
--header 'Content-Type: application/json' \
--header 'User-Agent: insomnia/10.1.1' \
--data '{
"nome": "Vinicius Campos",
"cpf": "44998989898",
"cep": "000000030",
"endereco": "Rua abcde efgh",
"complemento": "ijkl"
}'