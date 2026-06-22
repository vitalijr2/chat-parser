package io.github.vitalijr2.textforge.chat.parser;

import io.github.vitalijr2.textforge.chat.ChatMessage;
import java.io.Reader;
import java.util.stream.Stream;

public interface ChatParser {

  Stream<ChatMessage> parse(ChatSource chatSource);

}
