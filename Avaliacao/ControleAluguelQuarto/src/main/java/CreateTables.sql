CREATE TABLE hospede (
	cpf varchar(20) PRIMARY KEY,
  	nome varchar(200) not null,
  	endereco varchar(200)  not null,
  	celular varchar(14)  not null,
  	email varchar(150)  not null
);

CREATE TABLE residencia (
    cod Serial PRIMARY KEY,
    rua VARCHAR(200) NOT NULL,
    bairro VARCHAR(200) NOT NULL,
    cep INTEGER NOT NULL,
    numero INTEGER NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    email VARCHAR(200)
);

CREATE TABLE quarto (
    cod Serial PRIMARY KEY,
	cod_residencia INTEGER REFERENCES residencia(cod) ON DELETE CASCADE,
    valor_diaria numeric(100,2) NOT NULL,
	capacidade_pessoas integer NOT NULL,
    ar_condicionado boolean NOT NULL,
    banheira_hidromassagem boolean NOT NULL,
	disponivel boolean NOT NULL
);

CREATE TABLE aluguel (
    cod SERIAL PRIMARY KEY,
    cod_quarto INTEGER references quarto(cod) ON DELETE CASCADE,
    cpf_hospede char(20) references hospede(cpf) ON DELETE CASCADE,
    data_entrada timestamp not null,
    data_saida timestamp not null,
	pago boolean not null,
	finalizado boolean not null,
);
