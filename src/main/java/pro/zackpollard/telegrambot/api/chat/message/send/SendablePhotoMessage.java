package pro.zackpollard.telegrambot.api.chat.message.send;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import pro.zackpollard.telegrambot.api.chat.message.Message;
import pro.zackpollard.telegrambot.api.chat.message.ReplyMarkup;

/**
 * @author Zack Pollard
 */

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class SendablePhotoMessage implements SendableMessage, ReplyingOptions, NotificationOptions {

    @NonNull
    @Getter
    private final InputFile photo;
    @Getter
    private final String caption;
    @Getter
    private final long replyTo;
    @Getter
    private final ReplyMarkup replyMarkup;
    @Getter
    private final boolean disableNotification;

    public static SendablePhotoMessageBuilder builder() {
        return new SendablePhotoMessageBuilder();
    }

    @Override
    public MessageType getType() {
        return MessageType.PHOTO;
    }

    public static class SendablePhotoMessageBuilder {

        private InputFile photo;
        private String caption;
        private long replyTo;
        private ReplyMarkup replyMarkup;
        private boolean disableNotification;

        SendablePhotoMessageBuilder() {
        }

        public SendablePhotoMessage.SendablePhotoMessageBuilder photo(InputFile photo) {
            this.photo = photo;
            return this;
        }

        public SendablePhotoMessage.SendablePhotoMessageBuilder caption(String caption) {
            this.caption = caption;
            return this;
        }

        public SendablePhotoMessage.SendablePhotoMessageBuilder replyTo(Message replyTo) {
            this.replyTo = replyTo != null ? replyTo.getMessageId() : 0;
            return this;
        }

        public SendablePhotoMessage.SendablePhotoMessageBuilder replyTo(long replyTo) {
            this.replyTo = replyTo;
            return this;
        }

        public SendablePhotoMessage.SendablePhotoMessageBuilder replyMarkup(ReplyMarkup replyMarkup) {
            this.replyMarkup = replyMarkup;
            return this;
        }

        public SendablePhotoMessage.SendablePhotoMessageBuilder disableNotification(boolean disableNotification) {

            this.disableNotification = disableNotification;
            return this;
        }

        public SendablePhotoMessage build() {
            return new SendablePhotoMessage(photo, caption, replyTo, replyMarkup, disableNotification);
        }

        public String toString() {
            return "pro.zackpollard.telegrambot.api.chat.message.send.SendablePhotoMessage.SendablePhotoMessageBuilder(photo=" + this.photo + ", caption=" + this.caption + ", replyTo=" + this.replyTo + ", replyMarkup=" + this.replyMarkup + ")";
        }
    }
}