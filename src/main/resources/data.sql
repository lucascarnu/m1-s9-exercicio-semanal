-- Inserir dados para a tabela de bibliotecários
INSERT INTO bibliotecarios (nome, email, senha) VALUES
('João', 'joao@example.com', 'senha123'),
('Maria', 'maria@example.com', 'senha456');

-- Inserir dados para a tabela de livros
INSERT INTO livros (titulo, autor, ano_publicacao) VALUES
('O Hobbit', 'J.R.R. Tolkien', 1937),
('A Metamorfose', 'Franz Kafka', 1915),
('Fahrenheit 451', 'Ray Bradbury', 1953);


-- Inserir dados para a tabela de membros
INSERT INTO membros (nome, endereco, fone) VALUES
('Lucas', 'Rua Dos Corais, 18', '48988855555'),
('Ana', 'Rua das Pescadas, 45', '48988888888');

-- Inserir dados para a tabela de visitantes
INSERT INTO visitantes (nome, fone) VALUES
('Regina', '48984912233'),
('Grazia', '48996877425');

-- Inserir dados para a tabela de empréstimos
INSERT INTO emprestimos (livro_id, membro_id, data_emprestimo, data_devolucao) VALUES
(1, 1, '2024-03-29', '2024-04-05'),
(2, 2, '2024-03-29', '2024-04-06');


