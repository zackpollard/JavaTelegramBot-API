package pro.zackpollard.telegrambot.api.chat.message.content;

/**
 * @author Zack Pollard
 */
public interface DeleteChatPhotoContent extends Content {

    /**
     * Gets the value relating to this DeleteChatPhotoContent object
     *
     * @return True
     */
    default boolean getContent() {

        return true;
    }

    /**
     * Gets the ContentType relating to this Content object
     *
     * @return The ContentType of this Content object
     */
    @Override
    default ContentType getType() {

        return ContentType.DELETE_CHAT_PHOTO;
    }
}