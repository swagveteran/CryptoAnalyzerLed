package com.javarush.chesnokov.command;

public enum CommandType {
    ENCRYPT(1, "Encrypt"),
    DECRYPT(2, "Decrypt"),
    BRUTE_FORCE(3, "Brute force"),
    EXIT(4, "Exit");

    private final int code;
    private final String commandName;

    CommandType(int code, String commandName) {
        this.code = code;
        this.commandName = commandName;
    }

    public int getCode() {
        return code;
    }

    public String getCommandName() {
        return commandName;
    }

    public static CommandType fromCode(int code) {
        for (CommandType commandType : values()) {
            if (commandType.code == code) {
                return commandType;
            }
        }
        return null;
    }
}