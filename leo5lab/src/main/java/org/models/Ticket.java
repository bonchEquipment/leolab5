package org.models;

public class Ticket {
    private Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.util.Date creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private long price; //Значение поля должно быть больше 0
    private Long discount; //Поле не может быть null, Значение поля должно быть больше 0, Максимальное значение поля: 100
    private TicketType type; //Поле не может быть null
    private Event event; //Поле не может быть null
}