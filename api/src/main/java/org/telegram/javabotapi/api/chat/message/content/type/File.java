package org.telegram.javabotapi.api.chat.message.content.type;

/**
 * @author Zack Pollard
 */
public interface File {

    /**
     * Gets the Unique Identifier for this file
     *
     * @return The files ID
     */
    int getFileId();

    /**
     * Gets the size of the file
     *
     * @return The file size
     */
    int getSize();
}