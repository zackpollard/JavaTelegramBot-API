package org.telegram.javabotapi.api.chat.message.content.type;

/**
 * @author Zack Pollard
 */
public interface Sticker extends DimensionableFile {

    PhotoSize getThumbnail();
}
