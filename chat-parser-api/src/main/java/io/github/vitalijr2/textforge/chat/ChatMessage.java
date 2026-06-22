package io.github.vitalijr2.textforge.chat;

import java.time.LocalDateTime;

public record ChatMessage(String id, LocalDateTime timestamp, String sender, String text) {

}
