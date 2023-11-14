# HW_11
## API Робот-пылесос
```plantuml
openapi: 3.0.0
info:
  title: Робот-пылесос
  version: 0.0.1
servers:
  - url: http://localhost:8080/api/v1
    description: Dev server
paths:
  /Robots:
    get:
      summary: Метод получения списка роботов
      tags:
        - Robot
      operationId: getAllRobots
      responses:
        "200":
          description: Успешный ответ со списком Robot-ов
          content:
            adplication/json:
              schema:
                $ref: "#/components/schemas/Robots"
        "default":
          description: Всё остальное
          content:
            adplication/json:
              schema:
                $ref: "#/components/schemas/Error"
    post:
      summary: Метод создания робота
      tags:
        - Robot
      operationId: createRobot
      requestBody:  # Тело запроса, то что передаётся в метод createRobot
        required: true  # Запрос обязательный
        content:
          adplication/json:
            schema:
              $ref: "#/components/schemas/Robot"
      responses:
        "200":
          description: Успешный ответ создания робота
          content:
            adplication/json:
              schema:
                $ref: "#/components/schemas/Robot"
        "default":
          description: Всё остальное
          content:
            adplication/json:
              schema:
                $ref: "#/components/schemas/Error"
  /Robot/findById/{robotId}:
    get:
      tags:
        - Robot
      summary: Найти робота по ID
      description: Вернуть робота по ID
      operationId: getRobotById
      parameters:
        - name: robotId
          in: path
          description: идентификатор робота
          required: true
          schema:
            type: integer
            format: int64
      responses:
        "200":
          description: successful operation
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Robot'
            application/xml:
              schema:
                $ref: '#/components/schemas/Robot'
        "400":
          description: Invalid ID supplied
        "404":
          description: Robot not found
  /Users:
    get:
      summary: Метод получения списка пользователей
      tags:
        - User
      operationId: getAllUsers
      responses:
        "200":
          description: Успешный ответ со списком пользователей
          content:
            adplication/json:
              schema:
                $ref: "#/components/schemas/Users"
        "default":
          description: Всё остальное
          content:
            adplication/json:
              schema:
                $ref: "#/components/schemas/Error"
    post:
      summary: Метод создания пользователя
      tags:
        - User
      operationId: createUser
      requestBody:
        required: true
        content:
          adplication/json:
            schema:
              $ref: "#/components/schemas/User"
      responses:
        "200":
          description: Успешный ответ создания пользователя
          content:
            adplication/json:
              schema:
                $ref: "#/components/schemas/User"
        "default":
          description: Всё остальное
          content:
            adplication/json:
              schema:
                $ref: "#/components/schemas/Error"
  /User/findById/{userId}:
    get:
      tags:
        - User
      summary: Найти пользователя по ID
      description: Вернуть пользователя по ID
      operationId: getUserById
      parameters:
        - name: userId
          in: path
          description: идентификатор пользователя
          required: true
          schema:
            type: integer
            format: int64
      responses:
        "200":
          description: successful operation
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/User'
            application/xml:
              schema:
                $ref: '#/components/schemas/User'
        "400":
          description: Invalid ID supplied
        "404":
          description: User not found
  /Schedule:
    put:
      tags:
        - Schedule
      summary: Обновить расписание
      description: Обновить расписание
      operationId: updateSchedule
      requestBody:
        description: Обновить существующее расписание в базе
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/Schedule'
          application/xml:
            schema:
              $ref: '#/components/schemas/Schedule'
          application/x-www-form-urlencoded:
            schema:
              $ref: '#/components/schemas/Schedule'
        required: true
      responses:
        '200':
          description: Successful operation
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Schedule'
            application/xml:
              schema:
                $ref: '#/components/schemas/Schedule'
        '400':
          description: Invalid ID supplied
        '404':
          description: Schedule not found
        '405':
          description: Validation exception
  /Schedules:
    get:
      summary: Метод получения списка роботов
      tags:
        - Schedule
      operationId: getAllSchedules
      responses:
        "200":
          description: Успешный ответ со списком расписаний
          content:
            adplication/json:
              schema:
                $ref: "#/components/schemas/Schedules"
        "default":
          description: Всё остальное
          content:
            adplication/json:
              schema:
                $ref: "#/components/schemas/Error"
components:
  schemas:
    Robot:
      type: object
      required:
        - id
        - model
        - version
        - status
        - resourse
        - fabric_model
        - ip_adress
      properties:
        id:
          type: integer
          example: 1
        model:
          type: string
          example: AA-dsa45
          description: Модель пылесоса
        version:
          type: string
          example: "v005.2"
        status:
          type: string
          example: "workable"
        resourse:
          type: integer
          example: 75
        fabric_model:
          type: string
          example: 213231-434-33
          description: Заводской номер робота-пылесоса
        id_adress:
          type: string
          example: "192.168.1.1"
    Robots:
      type: array
      items:
        $ref: "#/components/schemas/Robot"
    User:
      type: object
      required:
        - id
        - login
        - hash_password
        - email
      properties:
        id:
          type: integer
          example: 1
          description: Идентификатор пользователя
        login:
          type: string
          example: Vasia
          description: Имя пользователя
        hash_password:
          type: string
          example: 2cf24dba5fb0a30e
          description: Пароль пользователя
        email:
          type: string
          example: vasia@yandex.ru
          description: Почта пользователя
    Users:
      type: array
      items:
        $ref: "#/components/schemas/User"
    Schedule:
      type: object
      required:
        - id
        - dateTime
        - id_robot
      properties:
        id:
          type: integer
          example: 1
          description: Идентификатор расписания
        dateTime:
          type: string
          example:  1908-03-15 10:01:17
          description: Расписание работы робота
        id_robot:
          type: integer
          example: 1
          description: Идентификатор робота в расписании
    Schedules:
      type: array
      items:
        $ref: '#/components/schemas/Schedule'
    Error:
      type: object
      required:
        - code_error
        - message_error
      properties:
        code_error:
          type: integer
          example: -1
        message_error:
          type: string
```
![Снимок экрана 2023-11-07 в 19.50.49.png](API%2F%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202023-11-07%20%D0%B2%2019.50.49.png)

![Снимок экрана 2023-11-07 в 19.50.57.png](API%2F%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202023-11-07%20%D0%B2%2019.50.57.png)
# UML - диаграмма авторизации 
код в hm11.puml
![img.png](img.png)

```plantuml
@startuml

interface IController {
    + generateAuthToken(): string
    + getToken(): string
}

interface IManager {
    + authorizeUser(token: string): boolean
    + validateToken(token: string): boolean
}

interface IRepository {
    + saveToken(token: string): void
    + queryDatabase(): void
}

class Controller implements IController {
    - token: string

    + generateAuthToken(): string
    + getToken(): string
}

class Manager implements IManager {
    - controller: IController

    + authorizeUser(token: string): boolean
    + validateToken(token: string): boolean
}

class Repository implements IRepository {
    + saveToken(token: string): void
    + queryDatabase(): void
}

class User {
    + username: string
    + password: string
}

class Application {
    - controller: IController
    - manager: IManager
    - repository: IRepository

    + run(): void
}

Controller ..> IController
Manager ..> IManager
Repository ..> IRepository
Application --> Controller
Application --> Manager
Application --> Repository
User --> Application

@enduml

```