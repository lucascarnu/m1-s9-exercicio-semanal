CREATE TABLE IF NOT EXISTS bibliotecarios (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255),
    email VARCHAR(255),
    senha VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS livros (
    id SERIAL PRIMARY KEY,
    titulo VARCHAR(255),
    autor VARCHAR(255),
    ano_publicacao INT
);

CREATE TABLE IF NOT EXISTS membros (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255),
    endereco VARCHAR(255),
    fone VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS visitantes (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255),
    fone VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS emprestimos (
    id SERIAL PRIMARY KEY,
    livro_id INT,
    membro_id INT,
    data_emprestimo DATE,
    data_devolucao DATE,
    FOREIGN KEY (livro_id) REFERENCES livros(id),
    FOREIGN KEY (membro_id) REFERENCES membros(id)
);
