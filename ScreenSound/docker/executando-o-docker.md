## Remover o container

```bash
    docker rm -f mysql_screensound
```


## Constuir a imagem

```bash
    docker build -t mysql_screensound .
```

## Rodar o container

```bash
    docker run -d --name mysql_local -p 3306:3306 mysql_screensound
```

## Acessando o Mysql

```bash
  mysql -u userss -p
```

```bash
    show databases;
```

```bash
    use screensound;
```

```bash
    show tables;
```