# Projeto desenvolvido

O projeto desenvolvido em sala será um sistema de gestão de mesas de um restaurante que conta com as funcionalidades descritas abaixo.

---

### Requisitos funcionais

---

- RF01 - O sistema deve permitir o a inclusão/exclusão/atualização/listagem de funcionários. As informações referentes a um funcionário são:
    - Nome;
    - Telefone;
    - Data de nascimento;
    - CPF;
    - RG;
    - Estado civil;
    - Escolaridade;
    - Cargo;
    - Numero da carteira de trabalho;
    - Data da admissão;
    - Data de demissão;
    - Disponibilidade (OCUPADO/DISPONIVEL);
    - Status (ATIVO/INATIVO);
- RF02 - O sistema deve permitir o gerenciamento de clientes. As informações referentes a clientes são:
    - Nome;
    - Telefone;
    - Data de nascimento;
    - CPF;
    - Endereço;
    - Observação;
    - Status (ATIVO/INATIVO);
- RF03 - O sistema deve permitir o gerenciamento das mesas (Alocação, Reserva, Liberação). As informações referentes a uma mesa são:
    - Funcionário vinculado a mesa;
    - Nome;
    - Código;
    - Número;
    - Status da Mesa (Livre/Reservada/Ocupada);
    - Quantidade máxima de pessoas;
- RF04 - O sistema deve permitir o gerenciamento de comandas. As informações referentes a uma comanda são:
    - Mesa ao qual a comanda está vinculada;
    - Cliente ao qual a comanda está vinculada;
    - Lista de Produtos vinculados a comanda;
    - Status da comanda (EM ABERTO/PAGA/FECHADA);
    - Código da comanda;
    - Valor total da comanda;
- RF05 - O sistema deve permitir o gerenciamento de produtos. As informações referentes a um produção são:
    - Nome;
    - Descrição;
    - Código;
    - Preço de custo;
    - Preço de venda;
    - Status de preparo (PRONTO/PREPARANDO/AGUARDANDO);
    - Tempo de preparo (Tempo estimado de preparo);
    - Observações;
    - Status (ATIVO/INATIVO);
- RF06 - O sistema deve permitir o gerenciamento dos cardápios. As informações referentes a um cardápio são:
    - Nome;
    - Lista de produtos do Cardápio;
    - Código;
    - Status (Ativo/Inativo)
- RF07 - O sistema deve permitir vincular produtos a um cardápio;
- RF08 - O sistema deve permitir adicionar produtos a uma comada informando a quantidade que foi consumida daquele produtor naquela comanda;

---

### Requisitos não funcionais

---

- RNF01 - O sistema deve ser desenvolvido em Java;
- RNF02 - O sistema deve ser auditável, ou seja deve contar com os campos de auditoria em todas as classes;
- RNF03 - O sistema deve ser desenvolvido utilizando as boas práticas da orientação a objetos;

### Regras de negócio

---

- RN01 - Sempre que uma comanda for fechada e a comanda for pertencente a um cliente que faz aniversário naquele mês deve-se aplicar um desconto de 10%;
- RN02 - Uma comanda não pode ser fechada se ela contiver itens em para serem pagos;
- RN03 - Antes de reservar uma mesa deve-se verificar se não existe nenhuma comanda vinculada a ela;
- RN04 - Antes de mudar o status de uma mesa de ocupada para livre é preciso verificar se não existe nenhuma comanda em aberta naquela mesa;
- RN05 - Sempre que um novo produto for adicionado a uma comanda o valor da comanda já deve ser automaticamente recalculado;
- RN06 - Uma cliente só pode ser atrelado a uma mesa caso o status da Cliente dele não esteja inativo;
- RN07 - O garçom poderá listar os clientes existentes numa mesa;
- RN08 - O gerente poderá verificar as comandas de uma mesa a partir de um status (EM ABERTO/FECHADA/PAGA)
- RN09 - Quando o funcionário for excluído, ele deverá internamente ser marcado como inativo
- Para permitir fazer um pedido o cliente deve estar cadastrado;
- Ao adicionar uma pessoa a uma mesa deve-se verificar a quantidade máxima de pessoas;
- Não pode adicionar funcionarios menores de idade

---